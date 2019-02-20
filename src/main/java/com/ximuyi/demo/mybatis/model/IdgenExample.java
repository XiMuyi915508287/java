package com.ximuyi.demo.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class IdgenExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table IdGen
     *
     * @mbg.generated Wed Apr 18 16:08:01 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table IdGen
     *
     * @mbg.generated Wed Apr 18 16:08:01 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table IdGen
     *
     * @mbg.generated Wed Apr 18 16:08:01 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table IdGen
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    protected Integer offset;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table IdGen
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    protected Integer rows;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IdGen
     *
     * @mbg.generated Wed Apr 18 16:08:01 CST 2018
     */
    public IdgenExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IdGen
     *
     * @mbg.generated Wed Apr 18 16:08:01 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IdGen
     *
     * @mbg.generated Wed Apr 18 16:08:01 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IdGen
     *
     * @mbg.generated Wed Apr 18 16:08:01 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IdGen
     *
     * @mbg.generated Wed Apr 18 16:08:01 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IdGen
     *
     * @mbg.generated Wed Apr 18 16:08:01 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IdGen
     *
     * @mbg.generated Wed Apr 18 16:08:01 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IdGen
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
     * This method corresponds to the database table IdGen
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
     * This method corresponds to the database table IdGen
     *
     * @mbg.generated Wed Apr 18 16:08:01 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IdGen
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
     * This method corresponds to the database table IdGen
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IdGen
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IdGen
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public void setRows(Integer rows) {
        this.rows = rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IdGen
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public Integer getRows() {
        return this.rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IdGen
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public IdgenExample limit(Integer rows) {
        this.rows = rows;
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IdGen
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public IdgenExample limit(Integer offset, Integer rows) {
        this.offset = offset;
        this.rows = rows;
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IdGen
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public IdgenExample page(Integer page, Integer pageSize) {
        this.offset = page * pageSize;
        this.rows = pageSize;
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IdGen
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public IdgenExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IdGen
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public IdgenExample orderBy(String ... orderByClauses) {
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
     * This class corresponds to the database table IdGen
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

        public Criteria andIdtypeIsNull() {
            addCriterion("`IdType` is null");
            return (Criteria) this;
        }

        public Criteria andIdtypeIsNotNull() {
            addCriterion("`IdType` is not null");
            return (Criteria) this;
        }

        public Criteria andIdtypeEqualTo(Integer value) {
            addCriterion("`IdType` =", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeNotEqualTo(Integer value) {
            addCriterion("`IdType` <>", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeGreaterThan(Integer value) {
            addCriterion("`IdType` >", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("`IdType` >=", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeLessThan(Integer value) {
            addCriterion("`IdType` <", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeLessThanOrEqualTo(Integer value) {
            addCriterion("`IdType` <=", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeIn(List<Integer> values) {
            addCriterion("`IdType` in", values, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeNotIn(List<Integer> values) {
            addCriterion("`IdType` not in", values, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeBetween(Integer value1, Integer value2) {
            addCriterion("`IdType` between", value1, value2, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("`IdType` not between", value1, value2, "idtype");
            return (Criteria) this;
        }

        public Criteria andCurrentidIsNull() {
            addCriterion("`CurrentId` is null");
            return (Criteria) this;
        }

        public Criteria andCurrentidIsNotNull() {
            addCriterion("`CurrentId` is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentidEqualTo(Long value) {
            addCriterion("`CurrentId` =", value, "currentid");
            return (Criteria) this;
        }

        public Criteria andCurrentidNotEqualTo(Long value) {
            addCriterion("`CurrentId` <>", value, "currentid");
            return (Criteria) this;
        }

        public Criteria andCurrentidGreaterThan(Long value) {
            addCriterion("`CurrentId` >", value, "currentid");
            return (Criteria) this;
        }

        public Criteria andCurrentidGreaterThanOrEqualTo(Long value) {
            addCriterion("`CurrentId` >=", value, "currentid");
            return (Criteria) this;
        }

        public Criteria andCurrentidLessThan(Long value) {
            addCriterion("`CurrentId` <", value, "currentid");
            return (Criteria) this;
        }

        public Criteria andCurrentidLessThanOrEqualTo(Long value) {
            addCriterion("`CurrentId` <=", value, "currentid");
            return (Criteria) this;
        }

        public Criteria andCurrentidIn(List<Long> values) {
            addCriterion("`CurrentId` in", values, "currentid");
            return (Criteria) this;
        }

        public Criteria andCurrentidNotIn(List<Long> values) {
            addCriterion("`CurrentId` not in", values, "currentid");
            return (Criteria) this;
        }

        public Criteria andCurrentidBetween(Long value1, Long value2) {
            addCriterion("`CurrentId` between", value1, value2, "currentid");
            return (Criteria) this;
        }

        public Criteria andCurrentidNotBetween(Long value1, Long value2) {
            addCriterion("`CurrentId` not between", value1, value2, "currentid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table IdGen
     *
     * @mbg.generated do_not_delete_during_merge Wed Apr 18 16:08:01 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {
        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table IdGen
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private IdgenExample example;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table IdGen
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        protected Criteria(IdgenExample example) {
            super();
            this.example = example;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table IdGen
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public IdgenExample example() {
            return this.example;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table IdGen
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
         * This interface corresponds to the database table IdGen
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public interface ICriteriaAdd {
            /**
             * This method was generated by MyBatis Generator.
             * This method corresponds to the database table IdGen
             *
             * @mbg.generated
             * @project https://github.com/itfsw/mybatis-generator-plugin
             */
            Criteria add(Criteria add);
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table IdGen
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