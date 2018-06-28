package com.iteamcn.baichengnews.entity;

import java.util.ArrayList;
import java.util.List;

public class LikeExample {
    /**
     *
     * @mbg.generated Wed Jun 13 10:28:03 CST 2018
     */
    protected String orderByClause;

    /**
     *
     * @mbg.generated Wed Jun 13 10:28:03 CST 2018
     */
    protected boolean distinct;

    /**
     *
     * @mbg.generated Wed Jun 13 10:28:03 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated Wed Jun 13 10:28:03 CST 2018
     */
    public LikeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated Wed Jun 13 10:28:03 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 10:28:03 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 10:28:03 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 10:28:03 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 10:28:03 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 10:28:03 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated Wed Jun 13 10:28:03 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 10:28:03 CST 2018
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
     * @mbg.generated Wed Jun 13 10:28:03 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 10:28:03 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 10:28:03 CST 2018
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

        public Criteria andL_userIsNull() {
            addCriterion("l_user is null");
            return (Criteria) this;
        }

        public Criteria andL_userIsNotNull() {
            addCriterion("l_user is not null");
            return (Criteria) this;
        }

        public Criteria andL_userEqualTo(Integer value) {
            addCriterion("l_user =", value, "l_user");
            return (Criteria) this;
        }

        public Criteria andL_userNotEqualTo(Integer value) {
            addCriterion("l_user <>", value, "l_user");
            return (Criteria) this;
        }

        public Criteria andL_userGreaterThan(Integer value) {
            addCriterion("l_user >", value, "l_user");
            return (Criteria) this;
        }

        public Criteria andL_userGreaterThanOrEqualTo(Integer value) {
            addCriterion("l_user >=", value, "l_user");
            return (Criteria) this;
        }

        public Criteria andL_userLessThan(Integer value) {
            addCriterion("l_user <", value, "l_user");
            return (Criteria) this;
        }

        public Criteria andL_userLessThanOrEqualTo(Integer value) {
            addCriterion("l_user <=", value, "l_user");
            return (Criteria) this;
        }

        public Criteria andL_userIn(List<Integer> values) {
            addCriterion("l_user in", values, "l_user");
            return (Criteria) this;
        }

        public Criteria andL_userNotIn(List<Integer> values) {
            addCriterion("l_user not in", values, "l_user");
            return (Criteria) this;
        }

        public Criteria andL_userBetween(Integer value1, Integer value2) {
            addCriterion("l_user between", value1, value2, "l_user");
            return (Criteria) this;
        }

        public Criteria andL_userNotBetween(Integer value1, Integer value2) {
            addCriterion("l_user not between", value1, value2, "l_user");
            return (Criteria) this;
        }

        public Criteria andL_commentIsNull() {
            addCriterion("l_comment is null");
            return (Criteria) this;
        }

        public Criteria andL_commentIsNotNull() {
            addCriterion("l_comment is not null");
            return (Criteria) this;
        }

        public Criteria andL_commentEqualTo(Integer value) {
            addCriterion("l_comment =", value, "l_comment");
            return (Criteria) this;
        }

        public Criteria andL_commentNotEqualTo(Integer value) {
            addCriterion("l_comment <>", value, "l_comment");
            return (Criteria) this;
        }

        public Criteria andL_commentGreaterThan(Integer value) {
            addCriterion("l_comment >", value, "l_comment");
            return (Criteria) this;
        }

        public Criteria andL_commentGreaterThanOrEqualTo(Integer value) {
            addCriterion("l_comment >=", value, "l_comment");
            return (Criteria) this;
        }

        public Criteria andL_commentLessThan(Integer value) {
            addCriterion("l_comment <", value, "l_comment");
            return (Criteria) this;
        }

        public Criteria andL_commentLessThanOrEqualTo(Integer value) {
            addCriterion("l_comment <=", value, "l_comment");
            return (Criteria) this;
        }

        public Criteria andL_commentIn(List<Integer> values) {
            addCriterion("l_comment in", values, "l_comment");
            return (Criteria) this;
        }

        public Criteria andL_commentNotIn(List<Integer> values) {
            addCriterion("l_comment not in", values, "l_comment");
            return (Criteria) this;
        }

        public Criteria andL_commentBetween(Integer value1, Integer value2) {
            addCriterion("l_comment between", value1, value2, "l_comment");
            return (Criteria) this;
        }

        public Criteria andL_commentNotBetween(Integer value1, Integer value2) {
            addCriterion("l_comment not between", value1, value2, "l_comment");
            return (Criteria) this;
        }
    }

    /**
     *
     * @mbg.generated do_not_delete_during_merge Wed Jun 13 10:28:03 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *
     * @mbg.generated Wed Jun 13 10:28:03 CST 2018
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