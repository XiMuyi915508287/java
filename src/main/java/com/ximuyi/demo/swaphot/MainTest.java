package com.ximuyi.demo.swaphot;

/**
 * Created by chenjingjun on 2018-04-02.
 */
public class MainTest {
    private final int id;

    public MainTest(int id) {
        this.id = id;
    }

    public void print(){
        System.out.println("TRRR:" + id);
    }

    public static int add = 6;
    public static int value = 5;
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(value + "AAAAAA");
    }

    /**
     * @param args
     */
    public static void add(String[] args) {
        System.out.println(value + "AAAAAA");
    }
}
