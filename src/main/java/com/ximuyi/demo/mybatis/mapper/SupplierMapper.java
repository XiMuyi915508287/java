package com.ximuyi.demo.mybatis.mapper;

import com.ximuyi.demo.mybatis.model.Supplier;
import com.ximuyi.demo.mybatis.model.SupplierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Supplier
     *
     * @mbg.generated Wed Apr 18 16:08:01 CST 2018
     */
    long countByExample(SupplierExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Supplier
     *
     * @mbg.generated Wed Apr 18 16:08:01 CST 2018
     */
    int deleteByExample(SupplierExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Supplier
     *
     * @mbg.generated Wed Apr 18 16:08:01 CST 2018
     */
    int insert(Supplier record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Supplier
     *
     * @mbg.generated Wed Apr 18 16:08:01 CST 2018
     */
    int insertSelective(Supplier record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Supplier
     *
     * @mbg.generated Wed Apr 18 16:08:01 CST 2018
     */
    List<Supplier> selectByExample(SupplierExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Supplier
     *
     * @mbg.generated Wed Apr 18 16:08:01 CST 2018
     */
    int updateByExampleSelective(@Param("record") Supplier record, @Param("example") SupplierExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Supplier
     *
     * @mbg.generated Wed Apr 18 16:08:01 CST 2018
     */
    int updateByExample(@Param("record") Supplier record, @Param("example") SupplierExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Supplier
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    Supplier selectOneByExample(SupplierExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Supplier
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsert(@Param("list") List<Supplier> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Supplier
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsertSelective(@Param("list") List<Supplier> list, @Param("selective") Supplier.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Supplier
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int upsert(Supplier record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Supplier
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int upsertSelective(Supplier record);
}