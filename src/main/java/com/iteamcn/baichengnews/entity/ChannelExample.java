package com.iteamcn.baichengnews.entity;

import java.util.ArrayList;
import java.util.List;

public class ChannelExample {
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
    public ChannelExample() {
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

        public Criteria andCh_idIsNull() {
            addCriterion("ch_id is null");
            return (Criteria) this;
        }

        public Criteria andCh_idIsNotNull() {
            addCriterion("ch_id is not null");
            return (Criteria) this;
        }

        public Criteria andCh_idEqualTo(Integer value) {
            addCriterion("ch_id =", value, "ch_id");
            return (Criteria) this;
        }

        public Criteria andCh_idNotEqualTo(Integer value) {
            addCriterion("ch_id <>", value, "ch_id");
            return (Criteria) this;
        }

        public Criteria andCh_idGreaterThan(Integer value) {
            addCriterion("ch_id >", value, "ch_id");
            return (Criteria) this;
        }

        public Criteria andCh_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("ch_id >=", value, "ch_id");
            return (Criteria) this;
        }

        public Criteria andCh_idLessThan(Integer value) {
            addCriterion("ch_id <", value, "ch_id");
            return (Criteria) this;
        }

        public Criteria andCh_idLessThanOrEqualTo(Integer value) {
            addCriterion("ch_id <=", value, "ch_id");
            return (Criteria) this;
        }

        public Criteria andCh_idIn(List<Integer> values) {
            addCriterion("ch_id in", values, "ch_id");
            return (Criteria) this;
        }

        public Criteria andCh_idNotIn(List<Integer> values) {
            addCriterion("ch_id not in", values, "ch_id");
            return (Criteria) this;
        }

        public Criteria andCh_idBetween(Integer value1, Integer value2) {
            addCriterion("ch_id between", value1, value2, "ch_id");
            return (Criteria) this;
        }

        public Criteria andCh_idNotBetween(Integer value1, Integer value2) {
            addCriterion("ch_id not between", value1, value2, "ch_id");
            return (Criteria) this;
        }

        public Criteria andCh_codeIsNull() {
            addCriterion("ch_code is null");
            return (Criteria) this;
        }

        public Criteria andCh_codeIsNotNull() {
            addCriterion("ch_code is not null");
            return (Criteria) this;
        }

        public Criteria andCh_codeEqualTo(String value) {
            addCriterion("ch_code =", value, "ch_code");
            return (Criteria) this;
        }

        public Criteria andCh_codeNotEqualTo(String value) {
            addCriterion("ch_code <>", value, "ch_code");
            return (Criteria) this;
        }

        public Criteria andCh_codeGreaterThan(String value) {
            addCriterion("ch_code >", value, "ch_code");
            return (Criteria) this;
        }

        public Criteria andCh_codeGreaterThanOrEqualTo(String value) {
            addCriterion("ch_code >=", value, "ch_code");
            return (Criteria) this;
        }

        public Criteria andCh_codeLessThan(String value) {
            addCriterion("ch_code <", value, "ch_code");
            return (Criteria) this;
        }

        public Criteria andCh_codeLessThanOrEqualTo(String value) {
            addCriterion("ch_code <=", value, "ch_code");
            return (Criteria) this;
        }

        public Criteria andCh_codeLike(String value) {
            addCriterion("ch_code like", value, "ch_code");
            return (Criteria) this;
        }

        public Criteria andCh_codeNotLike(String value) {
            addCriterion("ch_code not like", value, "ch_code");
            return (Criteria) this;
        }

        public Criteria andCh_codeIn(List<String> values) {
            addCriterion("ch_code in", values, "ch_code");
            return (Criteria) this;
        }

        public Criteria andCh_codeNotIn(List<String> values) {
            addCriterion("ch_code not in", values, "ch_code");
            return (Criteria) this;
        }

        public Criteria andCh_codeBetween(String value1, String value2) {
            addCriterion("ch_code between", value1, value2, "ch_code");
            return (Criteria) this;
        }

        public Criteria andCh_codeNotBetween(String value1, String value2) {
            addCriterion("ch_code not between", value1, value2, "ch_code");
            return (Criteria) this;
        }

        public Criteria andCh_nameIsNull() {
            addCriterion("ch_name is null");
            return (Criteria) this;
        }

        public Criteria andCh_nameIsNotNull() {
            addCriterion("ch_name is not null");
            return (Criteria) this;
        }

        public Criteria andCh_nameEqualTo(String value) {
            addCriterion("ch_name =", value, "ch_name");
            return (Criteria) this;
        }

        public Criteria andCh_nameNotEqualTo(String value) {
            addCriterion("ch_name <>", value, "ch_name");
            return (Criteria) this;
        }

        public Criteria andCh_nameGreaterThan(String value) {
            addCriterion("ch_name >", value, "ch_name");
            return (Criteria) this;
        }

        public Criteria andCh_nameGreaterThanOrEqualTo(String value) {
            addCriterion("ch_name >=", value, "ch_name");
            return (Criteria) this;
        }

        public Criteria andCh_nameLessThan(String value) {
            addCriterion("ch_name <", value, "ch_name");
            return (Criteria) this;
        }

        public Criteria andCh_nameLessThanOrEqualTo(String value) {
            addCriterion("ch_name <=", value, "ch_name");
            return (Criteria) this;
        }

        public Criteria andCh_nameLike(String value) {
            addCriterion("ch_name like", value, "ch_name");
            return (Criteria) this;
        }

        public Criteria andCh_nameNotLike(String value) {
            addCriterion("ch_name not like", value, "ch_name");
            return (Criteria) this;
        }

        public Criteria andCh_nameIn(List<String> values) {
            addCriterion("ch_name in", values, "ch_name");
            return (Criteria) this;
        }

        public Criteria andCh_nameNotIn(List<String> values) {
            addCriterion("ch_name not in", values, "ch_name");
            return (Criteria) this;
        }

        public Criteria andCh_nameBetween(String value1, String value2) {
            addCriterion("ch_name between", value1, value2, "ch_name");
            return (Criteria) this;
        }

        public Criteria andCh_nameNotBetween(String value1, String value2) {
            addCriterion("ch_name not between", value1, value2, "ch_name");
            return (Criteria) this;
        }

        public Criteria andCh_priorityIsNull() {
            addCriterion("ch_priority is null");
            return (Criteria) this;
        }

        public Criteria andCh_priorityIsNotNull() {
            addCriterion("ch_priority is not null");
            return (Criteria) this;
        }

        public Criteria andCh_priorityEqualTo(Integer value) {
            addCriterion("ch_priority =", value, "ch_priority");
            return (Criteria) this;
        }

        public Criteria andCh_priorityNotEqualTo(Integer value) {
            addCriterion("ch_priority <>", value, "ch_priority");
            return (Criteria) this;
        }

        public Criteria andCh_priorityGreaterThan(Integer value) {
            addCriterion("ch_priority >", value, "ch_priority");
            return (Criteria) this;
        }

        public Criteria andCh_priorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("ch_priority >=", value, "ch_priority");
            return (Criteria) this;
        }

        public Criteria andCh_priorityLessThan(Integer value) {
            addCriterion("ch_priority <", value, "ch_priority");
            return (Criteria) this;
        }

        public Criteria andCh_priorityLessThanOrEqualTo(Integer value) {
            addCriterion("ch_priority <=", value, "ch_priority");
            return (Criteria) this;
        }

        public Criteria andCh_priorityIn(List<Integer> values) {
            addCriterion("ch_priority in", values, "ch_priority");
            return (Criteria) this;
        }

        public Criteria andCh_priorityNotIn(List<Integer> values) {
            addCriterion("ch_priority not in", values, "ch_priority");
            return (Criteria) this;
        }

        public Criteria andCh_priorityBetween(Integer value1, Integer value2) {
            addCriterion("ch_priority between", value1, value2, "ch_priority");
            return (Criteria) this;
        }

        public Criteria andCh_priorityNotBetween(Integer value1, Integer value2) {
            addCriterion("ch_priority not between", value1, value2, "ch_priority");
            return (Criteria) this;
        }

        public Criteria andCh_codeLikeInsensitive(String value) {
            addCriterion("upper(ch_code) like", value.toUpperCase(), "ch_code");
            return (Criteria) this;
        }

        public Criteria andCh_nameLikeInsensitive(String value) {
            addCriterion("upper(ch_name) like", value.toUpperCase(), "ch_name");
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