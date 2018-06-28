package com.iteamcn.baichengnews.entity;

import java.util.ArrayList;
import java.util.List;

public class GroupExample {
    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    protected String orderByClause;

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    protected boolean distinct;

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public GroupExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
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

        public Criteria andG_codeIsNull() {
            addCriterion("g_code is null");
            return (Criteria) this;
        }

        public Criteria andG_codeIsNotNull() {
            addCriterion("g_code is not null");
            return (Criteria) this;
        }

        public Criteria andG_codeEqualTo(String value) {
            addCriterion("g_code =", value, "g_code");
            return (Criteria) this;
        }

        public Criteria andG_codeNotEqualTo(String value) {
            addCriterion("g_code <>", value, "g_code");
            return (Criteria) this;
        }

        public Criteria andG_codeGreaterThan(String value) {
            addCriterion("g_code >", value, "g_code");
            return (Criteria) this;
        }

        public Criteria andG_codeGreaterThanOrEqualTo(String value) {
            addCriterion("g_code >=", value, "g_code");
            return (Criteria) this;
        }

        public Criteria andG_codeLessThan(String value) {
            addCriterion("g_code <", value, "g_code");
            return (Criteria) this;
        }

        public Criteria andG_codeLessThanOrEqualTo(String value) {
            addCriterion("g_code <=", value, "g_code");
            return (Criteria) this;
        }

        public Criteria andG_codeLike(String value) {
            addCriterion("g_code like", value, "g_code");
            return (Criteria) this;
        }

        public Criteria andG_codeNotLike(String value) {
            addCriterion("g_code not like", value, "g_code");
            return (Criteria) this;
        }

        public Criteria andG_codeIn(List<String> values) {
            addCriterion("g_code in", values, "g_code");
            return (Criteria) this;
        }

        public Criteria andG_codeNotIn(List<String> values) {
            addCriterion("g_code not in", values, "g_code");
            return (Criteria) this;
        }

        public Criteria andG_codeBetween(String value1, String value2) {
            addCriterion("g_code between", value1, value2, "g_code");
            return (Criteria) this;
        }

        public Criteria andG_codeNotBetween(String value1, String value2) {
            addCriterion("g_code not between", value1, value2, "g_code");
            return (Criteria) this;
        }

        public Criteria andG_nameIsNull() {
            addCriterion("g_name is null");
            return (Criteria) this;
        }

        public Criteria andG_nameIsNotNull() {
            addCriterion("g_name is not null");
            return (Criteria) this;
        }

        public Criteria andG_nameEqualTo(String value) {
            addCriterion("g_name =", value, "g_name");
            return (Criteria) this;
        }

        public Criteria andG_nameNotEqualTo(String value) {
            addCriterion("g_name <>", value, "g_name");
            return (Criteria) this;
        }

        public Criteria andG_nameGreaterThan(String value) {
            addCriterion("g_name >", value, "g_name");
            return (Criteria) this;
        }

        public Criteria andG_nameGreaterThanOrEqualTo(String value) {
            addCriterion("g_name >=", value, "g_name");
            return (Criteria) this;
        }

        public Criteria andG_nameLessThan(String value) {
            addCriterion("g_name <", value, "g_name");
            return (Criteria) this;
        }

        public Criteria andG_nameLessThanOrEqualTo(String value) {
            addCriterion("g_name <=", value, "g_name");
            return (Criteria) this;
        }

        public Criteria andG_nameLike(String value) {
            addCriterion("g_name like", value, "g_name");
            return (Criteria) this;
        }

        public Criteria andG_nameNotLike(String value) {
            addCriterion("g_name not like", value, "g_name");
            return (Criteria) this;
        }

        public Criteria andG_nameIn(List<String> values) {
            addCriterion("g_name in", values, "g_name");
            return (Criteria) this;
        }

        public Criteria andG_nameNotIn(List<String> values) {
            addCriterion("g_name not in", values, "g_name");
            return (Criteria) this;
        }

        public Criteria andG_nameBetween(String value1, String value2) {
            addCriterion("g_name between", value1, value2, "g_name");
            return (Criteria) this;
        }

        public Criteria andG_nameNotBetween(String value1, String value2) {
            addCriterion("g_name not between", value1, value2, "g_name");
            return (Criteria) this;
        }

        public Criteria andG_codeLikeInsensitive(String value) {
            addCriterion("upper(g_code) like", value.toUpperCase(), "g_code");
            return (Criteria) this;
        }

        public Criteria andG_nameLikeInsensitive(String value) {
            addCriterion("upper(g_name) like", value.toUpperCase(), "g_name");
            return (Criteria) this;
        }
    }

    /**
     *
     * @mbg.generated do_not_delete_during_merge Wed Jun 13 09:45:52 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
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