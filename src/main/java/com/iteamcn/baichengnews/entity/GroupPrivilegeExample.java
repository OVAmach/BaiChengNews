package com.iteamcn.baichengnews.entity;

import java.util.ArrayList;
import java.util.List;

public class GroupPrivilegeExample {
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
    public GroupPrivilegeExample() {
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

        public Criteria andGp_groupIsNull() {
            addCriterion("gp_group is null");
            return (Criteria) this;
        }

        public Criteria andGp_groupIsNotNull() {
            addCriterion("gp_group is not null");
            return (Criteria) this;
        }

        public Criteria andGp_groupEqualTo(String value) {
            addCriterion("gp_group =", value, "gp_group");
            return (Criteria) this;
        }

        public Criteria andGp_groupNotEqualTo(String value) {
            addCriterion("gp_group <>", value, "gp_group");
            return (Criteria) this;
        }

        public Criteria andGp_groupGreaterThan(String value) {
            addCriterion("gp_group >", value, "gp_group");
            return (Criteria) this;
        }

        public Criteria andGp_groupGreaterThanOrEqualTo(String value) {
            addCriterion("gp_group >=", value, "gp_group");
            return (Criteria) this;
        }

        public Criteria andGp_groupLessThan(String value) {
            addCriterion("gp_group <", value, "gp_group");
            return (Criteria) this;
        }

        public Criteria andGp_groupLessThanOrEqualTo(String value) {
            addCriterion("gp_group <=", value, "gp_group");
            return (Criteria) this;
        }

        public Criteria andGp_groupLike(String value) {
            addCriterion("gp_group like", value, "gp_group");
            return (Criteria) this;
        }

        public Criteria andGp_groupNotLike(String value) {
            addCriterion("gp_group not like", value, "gp_group");
            return (Criteria) this;
        }

        public Criteria andGp_groupIn(List<String> values) {
            addCriterion("gp_group in", values, "gp_group");
            return (Criteria) this;
        }

        public Criteria andGp_groupNotIn(List<String> values) {
            addCriterion("gp_group not in", values, "gp_group");
            return (Criteria) this;
        }

        public Criteria andGp_groupBetween(String value1, String value2) {
            addCriterion("gp_group between", value1, value2, "gp_group");
            return (Criteria) this;
        }

        public Criteria andGp_groupNotBetween(String value1, String value2) {
            addCriterion("gp_group not between", value1, value2, "gp_group");
            return (Criteria) this;
        }

        public Criteria andGp_privilegeIsNull() {
            addCriterion("gp_privilege is null");
            return (Criteria) this;
        }

        public Criteria andGp_privilegeIsNotNull() {
            addCriterion("gp_privilege is not null");
            return (Criteria) this;
        }

        public Criteria andGp_privilegeEqualTo(String value) {
            addCriterion("gp_privilege =", value, "gp_privilege");
            return (Criteria) this;
        }

        public Criteria andGp_privilegeNotEqualTo(String value) {
            addCriterion("gp_privilege <>", value, "gp_privilege");
            return (Criteria) this;
        }

        public Criteria andGp_privilegeGreaterThan(String value) {
            addCriterion("gp_privilege >", value, "gp_privilege");
            return (Criteria) this;
        }

        public Criteria andGp_privilegeGreaterThanOrEqualTo(String value) {
            addCriterion("gp_privilege >=", value, "gp_privilege");
            return (Criteria) this;
        }

        public Criteria andGp_privilegeLessThan(String value) {
            addCriterion("gp_privilege <", value, "gp_privilege");
            return (Criteria) this;
        }

        public Criteria andGp_privilegeLessThanOrEqualTo(String value) {
            addCriterion("gp_privilege <=", value, "gp_privilege");
            return (Criteria) this;
        }

        public Criteria andGp_privilegeLike(String value) {
            addCriterion("gp_privilege like", value, "gp_privilege");
            return (Criteria) this;
        }

        public Criteria andGp_privilegeNotLike(String value) {
            addCriterion("gp_privilege not like", value, "gp_privilege");
            return (Criteria) this;
        }

        public Criteria andGp_privilegeIn(List<String> values) {
            addCriterion("gp_privilege in", values, "gp_privilege");
            return (Criteria) this;
        }

        public Criteria andGp_privilegeNotIn(List<String> values) {
            addCriterion("gp_privilege not in", values, "gp_privilege");
            return (Criteria) this;
        }

        public Criteria andGp_privilegeBetween(String value1, String value2) {
            addCriterion("gp_privilege between", value1, value2, "gp_privilege");
            return (Criteria) this;
        }

        public Criteria andGp_privilegeNotBetween(String value1, String value2) {
            addCriterion("gp_privilege not between", value1, value2, "gp_privilege");
            return (Criteria) this;
        }

        public Criteria andGp_groupLikeInsensitive(String value) {
            addCriterion("upper(gp_group) like", value.toUpperCase(), "gp_group");
            return (Criteria) this;
        }

        public Criteria andGp_privilegeLikeInsensitive(String value) {
            addCriterion("upper(gp_privilege) like", value.toUpperCase(), "gp_privilege");
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