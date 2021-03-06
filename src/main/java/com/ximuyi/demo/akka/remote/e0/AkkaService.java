package com.ximuyi.demo.akka.remote.e0;

import akka.actor.ActorRef;
import akka.actor.ActorSelection;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.pattern.Patterns;
import akka.util.Timeout;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import scala.concurrent.Await;
import scala.concurrent.Future;
import scala.concurrent.duration.Duration;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.*;

public class AkkaService {

    private static final Logger logger = LoggerFactory.getLogger(AkkaService.class);

    private String serverName;
    private String actorName;
    private String host;
    private int port;

    private ActorSystem actorSystem;

    private AkkaService(int port, String serverName, String actorName) throws SocketException {
        this.host = getAddress();
        this.port = port;
        this.serverName = serverName;
        this.actorName = actorName;
    }

    public String getServerName() {
        return serverName;
    }
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }
    public String getActorName() {
        return actorName;
    }
    public void setActorName(String actorName) {
        this.actorName = actorName;
    }
    public String getHost() {
        return host;
    }
    public void setHost(String host) {
        this.host = host;
    }
    public int getPort() {
        return port;
    }
    public void setPort(int port) {
        this.port = port;
    }

    /**
     * 获取akka系统服务对象
     * @param port  绑定端口
     * @param serverName    服务名称
     * @param actorName 接收消息Actor名称
     * @return
     */
    public static AkkaService getInstance(int port, String serverName, String actorName) throws SocketException {
        return new AkkaService(port, serverName, actorName);
    }

    public void init(boolean serverMode) {
        logger.info("Start ActorSystem...");
        actorSystem = ActorSystem.create(serverName, createConfig(serverMode));
        logger.info("Start ActorSystem...OK");
        ActorRef act = actorSystem.actorOf(Props.create(ReceiveActor.class), actorName);
        act.tell(actorName + "已监听成功.", ActorRef.noSender());
    }

    private Config createConfig(boolean serverMode) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("akka.loglevel", "DEBUG");
        map.put("akka.stdout-loglevel", "DEBUG");

        //开启akka远程调用
        map.put("akka.actor.provider", "akka.remote.RemoteActorRefProvider");

        if (serverMode){
            List<String> remoteTransports = new ArrayList<String>();
            remoteTransports.add("akka.remote.netty.tcp");
            map.put("akka.remote.enabled-transports", remoteTransports);

            map.put("akka.remote.netty.tcp.hostname", host);
            map.put("akka.remote.netty.tcp.port", port);
        }
        map.put("akka.remote.netty.tcp.maximum-frame-size", 100 * 1024 * 1024);

        //forkjoinpool默认线程数 max(min(cpu线程数 * parallelism-factor, parallelism-max), 8)
        map.put("akka.actor.default-dispatcher.fork-join-executor.parallelism-factor", "50");
        map.put("akka.actor.default-dispatcher.fork-join-executor.parallelism-max", "50");

        return ConfigFactory.parseMap(map);
    }

    /**
     * 获取本机ip
     * @return
     */
    private String getAddress() throws SocketException {
        try {
            Enumeration<NetworkInterface> allNetInterfaces = NetworkInterface.getNetworkInterfaces();
            while (allNetInterfaces.hasMoreElements()) {
                NetworkInterface netInterface = (NetworkInterface) allNetInterfaces.nextElement();
                if (netInterface.isLoopback() || netInterface.isVirtual() || !netInterface.isUp()) {
                    continue;
                }
                Enumeration<InetAddress> addresses = netInterface.getInetAddresses();
                while (addresses.hasMoreElements()) {
                    InetAddress ip = addresses.nextElement();
                    if (ip != null && ip instanceof Inet4Address) {
                        return ip.getHostAddress();
                    }
                }
            }
            return null;
        } catch (SocketException e) {
            logger.error("Error when getting host ip address", e.getMessage());
            return null;
        }
    }

    public void dispose() throws InterruptedException {
        logger.info("Shutdown ActorSystem...");
        actorSystem.terminate();
        actorSystem.wait(10000L);
        logger.info("Shutdown ActorSystem...OK");
    }

    public ActorSystem getActorSystem(){
        return actorSystem;
    }

    /**
     * 访问远程Actor
     * @return
     */
    public String visitService(String serverName, String host, int port, String actorName, String msg) {
        try {
            ActorSelection selection = actorSystem.actorSelection(toAkkaUrl(serverName, host, port, actorName));
            Timeout timeout = new Timeout(Duration.create(45, "seconds"));
            Future<Object> future = Patterns.ask(selection, msg, timeout);
            Object result = Await.result(future, timeout.duration());
            return result.toString();
        } catch (Exception e) {
            logger.error("", e);
            return "出错啦";
        }
    }


    public String toAkkaUrl(String serviceName, String host, int port, String actorName) {
        return "akka.tcp://" + serviceName + "@" + host + ":" + port + "/user/"
                + actorName;
    }
}
