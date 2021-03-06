package com.ximuyi.demo.mybatis.mapper;

import com.ximuyi.demo.mybatis.model.Goods;
import com.ximuyi.demo.mybatis.model.GoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Goods
     *
     * @mbg.generated Wed Apr 18 16:08:01 CST 2018
     */
    long countByExample(GoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Goods
     *
     * @mbg.generated Wed Apr 18 16:08:01 CST 2018
     */
    int deleteByExample(GoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Goods
     *
     * @mbg.generated Wed Apr 18 16:08:01 CST 2018
     */
    int insert(Goods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Goods
     *
     * @mbg.generated Wed Apr 18 16:08:01 CST 2018
     */
    int insertSelective(Goods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Goods
     *
     * @mbg.generated Wed Apr 18 16:08:01 CST 2018
     */
    List<Goods> selectByExample(GoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Goods
     *
     * @mbg.generated Wed Apr 18 16:08:01 CST 2018
     */
    int updateByExampleSelective(@Param("record") Goods record, @Param("example") GoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Goods
     *
     * @mbg.generated Wed Apr 18 16:08:01 CST 2018
     */
    int updateByExample(@Param("record") Goods record, @Param("example") GoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Goods
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    Goods selectOneByExample(GoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Goods
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsert(@Param("list") List<Goods> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Goods
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsertSelective(@Param("list") List<Goods> list, @Param("selective") Goods.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Goods
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int upsert(Goods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Goods
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int upsertSelective(Goods record);
}