package com.ximuyi.demo.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class StockExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Stock
     *
     * @mbg.generated Wed Apr 18 16:08:01 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Stock
     *
     * @mbg.generated Wed Apr 18 16:08:01 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Stock
     *
     * @mbg.generated Wed Apr 18 16:08:01 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Stock
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    protected Integer offset;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Stock
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    protected Integer rows;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Stock
     *
     * @mbg.generated Wed Apr 18 16:08:01 CST 2018
     */
    public StockExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Stock
     *
     * @mbg.generated Wed Apr 18 16:08:01 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Stock
     *
     * @mbg.generated Wed Apr 18 16:08:01 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Stock
     *
     * @mbg.generated Wed Apr 18 16:08:01 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Stock
     *
     * @mbg.generated Wed Apr 18 16:08:01 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Stock
     *
     * @mbg.generated Wed Apr 18 16:08:01 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Stock
     *
     * @mbg.generated Wed Apr 18 16:08:01 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Stock
     *
     * @mbg.generated Wed Apr 18 16:08:01 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Stock
     *
     * @mbg.generated Wed Apr 18 16:08:01 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Stock
     *
     * @mbg.generated Wed Apr 18 16:08:01 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Stock
     *
     * @mbg.generated Wed Apr 18 16:08:01 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
        rows = null;
        offset = null;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Stock
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Stock
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Stock
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public void setRows(Integer rows) {
        this.rows = rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Stock
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public Integer getRows() {
        return this.rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Stock
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public StockExample limit(Integer rows) {
        this.rows = rows;
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Stock
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public StockExample limit(Integer offset, Integer rows) {
        this.offset = offset;
        this.rows = rows;
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Stock
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public StockExample page(Integer page, Integer pageSize) {
        this.offset = page * pageSize;
        this.rows = pageSize;
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Stock
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public StockExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Stock
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public StockExample orderBy(String ... orderByClauses) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < orderByClauses.length; i++) {
            sb.append(orderByClauses[i]);
            if (i < orderByClauses.length - 1) {
                sb.append(" , ");
            }
        }
        this.setOrderByClause(sb.toString());
        return this;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table Stock
     *
     * @mbg.generated Wed Apr 18 16:08:01 CST 2018
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("`Id` is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("`Id` is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("`Id` =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("`Id` <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("`Id` >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("`Id` >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("`Id` <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("`Id` <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("`Id` in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("`Id` not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("`Id` between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("`Id` not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`Name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`Name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`Name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`Name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`Name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`Name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`Name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`Name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`Name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`Name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`Name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`Name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`Name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`Name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("`Type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`Type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("`Type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("`Type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("`Type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("`Type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("`Type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("`Type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("`Type` like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("`Type` not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("`Type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("`Type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("`Type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("`Type` not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("`Num` is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("`Num` is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("`Num` =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("`Num` <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("`Num` >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("`Num` >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("`Num` <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("`Num` <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("`Num` in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("`Num` not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("`Num` between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("`Num` not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("`Unit` is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("`Unit` is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("`Unit` =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("`Unit` <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("`Unit` >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("`Unit` >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("`Unit` <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("`Unit` <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("`Unit` like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("`Unit` not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("`Unit` in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("`Unit` not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("`Unit` between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("`Unit` not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andGetpriceIsNull() {
            addCriterion("`GetPrice` is null");
            return (Criteria) this;
        }

        public Criteria andGetpriceIsNotNull() {
            addCriterion("`GetPrice` is not null");
            return (Criteria) this;
        }

        public Criteria andGetpriceEqualTo(Double value) {
            addCriterion("`GetPrice` =", value, "getprice");
            return (Criteria) this;
        }

        public Criteria andGetpriceNotEqualTo(Double value) {
            addCriterion("`GetPrice` <>", value, "getprice");
            return (Criteria) this;
        }

        public Criteria andGetpriceGreaterThan(Double value) {
            addCriterion("`GetPrice` >", value, "getprice");
            return (Criteria) this;
        }

        public Criteria andGetpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("`GetPrice` >=", value, "getprice");
            return (Criteria) this;
        }

        public Criteria andGetpriceLessThan(Double value) {
            addCriterion("`GetPrice` <", value, "getprice");
            return (Criteria) this;
        }

        public Criteria andGetpriceLessThanOrEqualTo(Double value) {
            addCriterion("`GetPrice` <=", value, "getprice");
            return (Criteria) this;
        }

        public Criteria andGetpriceIn(List<Double> values) {
            addCriterion("`GetPrice` in", values, "getprice");
            return (Criteria) this;
        }

        public Criteria andGetpriceNotIn(List<Double> values) {
            addCriterion("`GetPrice` not in", values, "getprice");
            return (Criteria) this;
        }

        public Criteria andGetpriceBetween(Double value1, Double value2) {
            addCriterion("`GetPrice` between", value1, value2, "getprice");
            return (Criteria) this;
        }

        public Criteria andGetpriceNotBetween(Double value1, Double value2) {
            addCriterion("`GetPrice` not between", value1, value2, "getprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceIsNull() {
            addCriterion("`SalePrice` is null");
            return (Criteria) this;
        }

        public Criteria andSalepriceIsNotNull() {
            addCriterion("`SalePrice` is not null");
            return (Criteria) this;
        }

        public Criteria andSalepriceEqualTo(Double value) {
            addCriterion("`SalePrice` =", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceNotEqualTo(Double value) {
            addCriterion("`SalePrice` <>", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceGreaterThan(Double value) {
            addCriterion("`SalePrice` >", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceGreaterThanOrEqualTo(Double value) {
            addCriterion("`SalePrice` >=", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceLessThan(Double value) {
            addCriterion("`SalePrice` <", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceLessThanOrEqualTo(Double value) {
            addCriterion("`SalePrice` <=", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceIn(List<Double> values) {
            addCriterion("`SalePrice` in", values, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceNotIn(List<Double> values) {
            addCriterion("`SalePrice` not in", values, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceBetween(Double value1, Double value2) {
            addCriterion("`SalePrice` between", value1, value2, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceNotBetween(Double value1, Double value2) {
            addCriterion("`SalePrice` not between", value1, value2, "saleprice");
            return (Criteria) this;
        }

        public Criteria andNoticenumIsNull() {
            addCriterion("`NoticeNum` is null");
            return (Criteria) this;
        }

        public Criteria andNoticenumIsNotNull() {
            addCriterion("`NoticeNum` is not null");
            return (Criteria) this;
        }

        public Criteria andNoticenumEqualTo(Integer value) {
            addCriterion("`NoticeNum` =", value, "noticenum");
            return (Criteria) this;
        }

        public Criteria andNoticenumNotEqualTo(Integer value) {
            addCriterion("`NoticeNum` <>", value, "noticenum");
            return (Criteria) this;
        }

        public Criteria andNoticenumGreaterThan(Integer value) {
            addCriterion("`NoticeNum` >", value, "noticenum");
            return (Criteria) this;
        }

        public Criteria andNoticenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("`NoticeNum` >=", value, "noticenum");
            return (Criteria) this;
        }

        public Criteria andNoticenumLessThan(Integer value) {
            addCriterion("`NoticeNum` <", value, "noticenum");
            return (Criteria) this;
        }

        public Criteria andNoticenumLessThanOrEqualTo(Integer value) {
            addCriterion("`NoticeNum` <=", value, "noticenum");
            return (Criteria) this;
        }

        public Criteria andNoticenumIn(List<Integer> values) {
            addCriterion("`NoticeNum` in", values, "noticenum");
            return (Criteria) this;
        }

        public Criteria andNoticenumNotIn(List<Integer> values) {
            addCriterion("`NoticeNum` not in", values, "noticenum");
            return (Criteria) this;
        }

        public Criteria andNoticenumBetween(Integer value1, Integer value2) {
            addCriterion("`NoticeNum` between", value1, value2, "noticenum");
            return (Criteria) this;
        }

        public Criteria andNoticenumNotBetween(Integer value1, Integer value2) {
            addCriterion("`NoticeNum` not between", value1, value2, "noticenum");
            return (Criteria) this;
        }

        public Criteria andVenderIsNull() {
            addCriterion("`Vender` is null");
            return (Criteria) this;
        }

        public Criteria andVenderIsNotNull() {
            addCriterion("`Vender` is not null");
            return (Criteria) this;
        }

        public Criteria andVenderEqualTo(String value) {
            addCriterion("`Vender` =", value, "vender");
            return (Criteria) this;
        }

        public Criteria andVenderNotEqualTo(String value) {
            addCriterion("`Vender` <>", value, "vender");
            return (Criteria) this;
        }

        public Criteria andVenderGreaterThan(String value) {
            addCriterion("`Vender` >", value, "vender");
            return (Criteria) this;
        }

        public Criteria andVenderGreaterThanOrEqualTo(String value) {
            addCriterion("`Vender` >=", value, "vender");
            return (Criteria) this;
        }

        public Criteria andVenderLessThan(String value) {
            addCriterion("`Vender` <", value, "vender");
            return (Criteria) this;
        }

        public Criteria andVenderLessThanOrEqualTo(String value) {
            addCriterion("`Vender` <=", value, "vender");
            return (Criteria) this;
        }

        public Criteria andVenderLike(String value) {
            addCriterion("`Vender` like", value, "vender");
            return (Criteria) this;
        }

        public Criteria andVenderNotLike(String value) {
            addCriterion("`Vender` not like", value, "vender");
            return (Criteria) this;
        }

        public Criteria andVenderIn(List<String> values) {
            addCriterion("`Vender` in", values, "vender");
            return (Criteria) this;
        }

        public Criteria andVenderNotIn(List<String> values) {
            addCriterion("`Vender` not in", values, "vender");
            return (Criteria) this;
        }

        public Criteria andVenderBetween(String value1, String value2) {
            addCriterion("`Vender` between", value1, value2, "vender");
            return (Criteria) this;
        }

        public Criteria andVenderNotBetween(String value1, String value2) {
            addCriterion("`Vender` not between", value1, value2, "vender");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("`Comment` is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("`Comment` is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("`Comment` =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("`Comment` <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("`Comment` >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("`Comment` >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("`Comment` <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("`Comment` <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("`Comment` like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("`Comment` not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("`Comment` in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("`Comment` not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("`Comment` between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("`Comment` not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andDeleteIsNull() {
            addCriterion("`Delete` is null");
            return (Criteria) this;
        }

        public Criteria andDeleteIsNotNull() {
            addCriterion("`Delete` is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteEqualTo(Integer value) {
            addCriterion("`Delete` =", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteNotEqualTo(Integer value) {
            addCriterion("`Delete` <>", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteGreaterThan(Integer value) {
            addCriterion("`Delete` >", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("`Delete` >=", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteLessThan(Integer value) {
            addCriterion("`Delete` <", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("`Delete` <=", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteIn(List<Integer> values) {
            addCriterion("`Delete` in", values, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteNotIn(List<Integer> values) {
            addCriterion("`Delete` not in", values, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteBetween(Integer value1, Integer value2) {
            addCriterion("`Delete` between", value1, value2, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("`Delete` not between", value1, value2, "delete");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table Stock
     *
     * @mbg.generated do_not_delete_during_merge Wed Apr 18 16:08:01 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {
        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table Stock
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private StockExample example;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table Stock
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        protected Criteria(StockExample example) {
            super();
            this.example = example;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table Stock
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public StockExample example() {
            return this.example;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table Stock
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andIf(boolean ifAdd, ICriteriaAdd add) {
            if (ifAdd) {
                add.add(this);
            }
            return this;
        }

        /**
         * This interface was generated by MyBatis Generator.
         * This interface corresponds to the database table Stock
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public interface ICriteriaAdd {
            /**
             * This method was generated by MyBatis Generator.
             * This method corresponds to the database table Stock
             *
             * @mbg.generated
             * @project https://github.com/itfsw/mybatis-generator-plugin
             */
            Criteria add(Criteria add);
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table Stock
     *
     * @mbg.generated Wed Apr 18 16:08:01 CST 2018
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}