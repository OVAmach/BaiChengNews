package com.iteamcn.baichengnews.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentExample {
    /**
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    protected String orderByClause;

    /**
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    protected boolean distinct;

    /**
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    public CommentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
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
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
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

        public Criteria andC_idIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andC_idIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andC_idEqualTo(Integer value) {
            addCriterion("c_id =", value, "c_id");
            return (Criteria) this;
        }

        public Criteria andC_idNotEqualTo(Integer value) {
            addCriterion("c_id <>", value, "c_id");
            return (Criteria) this;
        }

        public Criteria andC_idGreaterThan(Integer value) {
            addCriterion("c_id >", value, "c_id");
            return (Criteria) this;
        }

        public Criteria andC_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_id >=", value, "c_id");
            return (Criteria) this;
        }

        public Criteria andC_idLessThan(Integer value) {
            addCriterion("c_id <", value, "c_id");
            return (Criteria) this;
        }

        public Criteria andC_idLessThanOrEqualTo(Integer value) {
            addCriterion("c_id <=", value, "c_id");
            return (Criteria) this;
        }

        public Criteria andC_idIn(List<Integer> values) {
            addCriterion("c_id in", values, "c_id");
            return (Criteria) this;
        }

        public Criteria andC_idNotIn(List<Integer> values) {
            addCriterion("c_id not in", values, "c_id");
            return (Criteria) this;
        }

        public Criteria andC_idBetween(Integer value1, Integer value2) {
            addCriterion("c_id between", value1, value2, "c_id");
            return (Criteria) this;
        }

        public Criteria andC_idNotBetween(Integer value1, Integer value2) {
            addCriterion("c_id not between", value1, value2, "c_id");
            return (Criteria) this;
        }

        public Criteria andC_userIsNull() {
            addCriterion("c_user is null");
            return (Criteria) this;
        }

        public Criteria andC_userIsNotNull() {
            addCriterion("c_user is not null");
            return (Criteria) this;
        }

        public Criteria andC_userEqualTo(Integer value) {
            addCriterion("c_user =", value, "c_user");
            return (Criteria) this;
        }

        public Criteria andC_userNotEqualTo(Integer value) {
            addCriterion("c_user <>", value, "c_user");
            return (Criteria) this;
        }

        public Criteria andC_userGreaterThan(Integer value) {
            addCriterion("c_user >", value, "c_user");
            return (Criteria) this;
        }

        public Criteria andC_userGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_user >=", value, "c_user");
            return (Criteria) this;
        }

        public Criteria andC_userLessThan(Integer value) {
            addCriterion("c_user <", value, "c_user");
            return (Criteria) this;
        }

        public Criteria andC_userLessThanOrEqualTo(Integer value) {
            addCriterion("c_user <=", value, "c_user");
            return (Criteria) this;
        }

        public Criteria andC_userIn(List<Integer> values) {
            addCriterion("c_user in", values, "c_user");
            return (Criteria) this;
        }

        public Criteria andC_userNotIn(List<Integer> values) {
            addCriterion("c_user not in", values, "c_user");
            return (Criteria) this;
        }

        public Criteria andC_userBetween(Integer value1, Integer value2) {
            addCriterion("c_user between", value1, value2, "c_user");
            return (Criteria) this;
        }

        public Criteria andC_userNotBetween(Integer value1, Integer value2) {
            addCriterion("c_user not between", value1, value2, "c_user");
            return (Criteria) this;
        }

        public Criteria andC_newsIsNull() {
            addCriterion("c_news is null");
            return (Criteria) this;
        }

        public Criteria andC_newsIsNotNull() {
            addCriterion("c_news is not null");
            return (Criteria) this;
        }

        public Criteria andC_newsEqualTo(Integer value) {
            addCriterion("c_news =", value, "c_news");
            return (Criteria) this;
        }

        public Criteria andC_newsNotEqualTo(Integer value) {
            addCriterion("c_news <>", value, "c_news");
            return (Criteria) this;
        }

        public Criteria andC_newsGreaterThan(Integer value) {
            addCriterion("c_news >", value, "c_news");
            return (Criteria) this;
        }

        public Criteria andC_newsGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_news >=", value, "c_news");
            return (Criteria) this;
        }

        public Criteria andC_newsLessThan(Integer value) {
            addCriterion("c_news <", value, "c_news");
            return (Criteria) this;
        }

        public Criteria andC_newsLessThanOrEqualTo(Integer value) {
            addCriterion("c_news <=", value, "c_news");
            return (Criteria) this;
        }

        public Criteria andC_newsIn(List<Integer> values) {
            addCriterion("c_news in", values, "c_news");
            return (Criteria) this;
        }

        public Criteria andC_newsNotIn(List<Integer> values) {
            addCriterion("c_news not in", values, "c_news");
            return (Criteria) this;
        }

        public Criteria andC_newsBetween(Integer value1, Integer value2) {
            addCriterion("c_news between", value1, value2, "c_news");
            return (Criteria) this;
        }

        public Criteria andC_newsNotBetween(Integer value1, Integer value2) {
            addCriterion("c_news not between", value1, value2, "c_news");
            return (Criteria) this;
        }

        public Criteria andC_checkIsNull() {
            addCriterion("c_check is null");
            return (Criteria) this;
        }

        public Criteria andC_checkIsNotNull() {
            addCriterion("c_check is not null");
            return (Criteria) this;
        }

        public Criteria andC_checkEqualTo(Boolean value) {
            addCriterion("c_check =", value, "c_check");
            return (Criteria) this;
        }

        public Criteria andC_checkNotEqualTo(Boolean value) {
            addCriterion("c_check <>", value, "c_check");
            return (Criteria) this;
        }

        public Criteria andC_checkGreaterThan(Boolean value) {
            addCriterion("c_check >", value, "c_check");
            return (Criteria) this;
        }

        public Criteria andC_checkGreaterThanOrEqualTo(Boolean value) {
            addCriterion("c_check >=", value, "c_check");
            return (Criteria) this;
        }

        public Criteria andC_checkLessThan(Boolean value) {
            addCriterion("c_check <", value, "c_check");
            return (Criteria) this;
        }

        public Criteria andC_checkLessThanOrEqualTo(Boolean value) {
            addCriterion("c_check <=", value, "c_check");
            return (Criteria) this;
        }

        public Criteria andC_checkIn(List<Boolean> values) {
            addCriterion("c_check in", values, "c_check");
            return (Criteria) this;
        }

        public Criteria andC_checkNotIn(List<Boolean> values) {
            addCriterion("c_check not in", values, "c_check");
            return (Criteria) this;
        }

        public Criteria andC_checkBetween(Boolean value1, Boolean value2) {
            addCriterion("c_check between", value1, value2, "c_check");
            return (Criteria) this;
        }

        public Criteria andC_checkNotBetween(Boolean value1, Boolean value2) {
            addCriterion("c_check not between", value1, value2, "c_check");
            return (Criteria) this;
        }

        public Criteria andC_dateIsNull() {
            addCriterion("c_date is null");
            return (Criteria) this;
        }

        public Criteria andC_dateIsNotNull() {
            addCriterion("c_date is not null");
            return (Criteria) this;
        }

        public Criteria andC_dateEqualTo(Date value) {
            addCriterion("c_date =", value, "c_date");
            return (Criteria) this;
        }

        public Criteria andC_dateNotEqualTo(Date value) {
            addCriterion("c_date <>", value, "c_date");
            return (Criteria) this;
        }

        public Criteria andC_dateGreaterThan(Date value) {
            addCriterion("c_date >", value, "c_date");
            return (Criteria) this;
        }

        public Criteria andC_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("c_date >=", value, "c_date");
            return (Criteria) this;
        }

        public Criteria andC_dateLessThan(Date value) {
            addCriterion("c_date <", value, "c_date");
            return (Criteria) this;
        }

        public Criteria andC_dateLessThanOrEqualTo(Date value) {
            addCriterion("c_date <=", value, "c_date");
            return (Criteria) this;
        }

        public Criteria andC_dateIn(List<Date> values) {
            addCriterion("c_date in", values, "c_date");
            return (Criteria) this;
        }

        public Criteria andC_dateNotIn(List<Date> values) {
            addCriterion("c_date not in", values, "c_date");
            return (Criteria) this;
        }

        public Criteria andC_dateBetween(Date value1, Date value2) {
            addCriterion("c_date between", value1, value2, "c_date");
            return (Criteria) this;
        }

        public Criteria andC_dateNotBetween(Date value1, Date value2) {
            addCriterion("c_date not between", value1, value2, "c_date");
            return (Criteria) this;
        }

        public Criteria andC_enableIsNull() {
            addCriterion("c_enable is null");
            return (Criteria) this;
        }

        public Criteria andC_enableIsNotNull() {
            addCriterion("c_enable is not null");
            return (Criteria) this;
        }

        public Criteria andC_enableEqualTo(Boolean value) {
            addCriterion("c_enable =", value, "c_enable");
            return (Criteria) this;
        }

        public Criteria andC_enableNotEqualTo(Boolean value) {
            addCriterion("c_enable <>", value, "c_enable");
            return (Criteria) this;
        }

        public Criteria andC_enableGreaterThan(Boolean value) {
            addCriterion("c_enable >", value, "c_enable");
            return (Criteria) this;
        }

        public Criteria andC_enableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("c_enable >=", value, "c_enable");
            return (Criteria) this;
        }

        public Criteria andC_enableLessThan(Boolean value) {
            addCriterion("c_enable <", value, "c_enable");
            return (Criteria) this;
        }

        public Criteria andC_enableLessThanOrEqualTo(Boolean value) {
            addCriterion("c_enable <=", value, "c_enable");
            return (Criteria) this;
        }

        public Criteria andC_enableIn(List<Boolean> values) {
            addCriterion("c_enable in", values, "c_enable");
            return (Criteria) this;
        }

        public Criteria andC_enableNotIn(List<Boolean> values) {
            addCriterion("c_enable not in", values, "c_enable");
            return (Criteria) this;
        }

        public Criteria andC_enableBetween(Boolean value1, Boolean value2) {
            addCriterion("c_enable between", value1, value2, "c_enable");
            return (Criteria) this;
        }

        public Criteria andC_enableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("c_enable not between", value1, value2, "c_enable");
            return (Criteria) this;
        }
    }

    /**
     *
     * @mbg.generated do_not_delete_during_merge Wed Jun 13 10:31:51 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
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