package com.iteamcn.baichengnews.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
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
    public UserExample() {
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

        public Criteria andU_idIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andU_idIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andU_idEqualTo(Integer value) {
            addCriterion("u_id =", value, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_idNotEqualTo(Integer value) {
            addCriterion("u_id <>", value, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_idGreaterThan(Integer value) {
            addCriterion("u_id >", value, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_id >=", value, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_idLessThan(Integer value) {
            addCriterion("u_id <", value, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_idLessThanOrEqualTo(Integer value) {
            addCriterion("u_id <=", value, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_idIn(List<Integer> values) {
            addCriterion("u_id in", values, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_idNotIn(List<Integer> values) {
            addCriterion("u_id not in", values, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_idBetween(Integer value1, Integer value2) {
            addCriterion("u_id between", value1, value2, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_idNotBetween(Integer value1, Integer value2) {
            addCriterion("u_id not between", value1, value2, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_nameIsNull() {
            addCriterion("u_name is null");
            return (Criteria) this;
        }

        public Criteria andU_nameIsNotNull() {
            addCriterion("u_name is not null");
            return (Criteria) this;
        }

        public Criteria andU_nameEqualTo(String value) {
            addCriterion("u_name =", value, "u_name");
            return (Criteria) this;
        }

        public Criteria andU_nameNotEqualTo(String value) {
            addCriterion("u_name <>", value, "u_name");
            return (Criteria) this;
        }

        public Criteria andU_nameGreaterThan(String value) {
            addCriterion("u_name >", value, "u_name");
            return (Criteria) this;
        }

        public Criteria andU_nameGreaterThanOrEqualTo(String value) {
            addCriterion("u_name >=", value, "u_name");
            return (Criteria) this;
        }

        public Criteria andU_nameLessThan(String value) {
            addCriterion("u_name <", value, "u_name");
            return (Criteria) this;
        }

        public Criteria andU_nameLessThanOrEqualTo(String value) {
            addCriterion("u_name <=", value, "u_name");
            return (Criteria) this;
        }

        public Criteria andU_nameLike(String value) {
            addCriterion("u_name like", value, "u_name");
            return (Criteria) this;
        }

        public Criteria andU_nameNotLike(String value) {
            addCriterion("u_name not like", value, "u_name");
            return (Criteria) this;
        }

        public Criteria andU_nameIn(List<String> values) {
            addCriterion("u_name in", values, "u_name");
            return (Criteria) this;
        }

        public Criteria andU_nameNotIn(List<String> values) {
            addCriterion("u_name not in", values, "u_name");
            return (Criteria) this;
        }

        public Criteria andU_nameBetween(String value1, String value2) {
            addCriterion("u_name between", value1, value2, "u_name");
            return (Criteria) this;
        }

        public Criteria andU_nameNotBetween(String value1, String value2) {
            addCriterion("u_name not between", value1, value2, "u_name");
            return (Criteria) this;
        }

        public Criteria andU_nickIsNull() {
            addCriterion("u_nick is null");
            return (Criteria) this;
        }

        public Criteria andU_nickIsNotNull() {
            addCriterion("u_nick is not null");
            return (Criteria) this;
        }

        public Criteria andU_nickEqualTo(String value) {
            addCriterion("u_nick =", value, "u_nick");
            return (Criteria) this;
        }

        public Criteria andU_nickNotEqualTo(String value) {
            addCriterion("u_nick <>", value, "u_nick");
            return (Criteria) this;
        }

        public Criteria andU_nickGreaterThan(String value) {
            addCriterion("u_nick >", value, "u_nick");
            return (Criteria) this;
        }

        public Criteria andU_nickGreaterThanOrEqualTo(String value) {
            addCriterion("u_nick >=", value, "u_nick");
            return (Criteria) this;
        }

        public Criteria andU_nickLessThan(String value) {
            addCriterion("u_nick <", value, "u_nick");
            return (Criteria) this;
        }

        public Criteria andU_nickLessThanOrEqualTo(String value) {
            addCriterion("u_nick <=", value, "u_nick");
            return (Criteria) this;
        }

        public Criteria andU_nickLike(String value) {
            addCriterion("u_nick like", value, "u_nick");
            return (Criteria) this;
        }

        public Criteria andU_nickNotLike(String value) {
            addCriterion("u_nick not like", value, "u_nick");
            return (Criteria) this;
        }

        public Criteria andU_nickIn(List<String> values) {
            addCriterion("u_nick in", values, "u_nick");
            return (Criteria) this;
        }

        public Criteria andU_nickNotIn(List<String> values) {
            addCriterion("u_nick not in", values, "u_nick");
            return (Criteria) this;
        }

        public Criteria andU_nickBetween(String value1, String value2) {
            addCriterion("u_nick between", value1, value2, "u_nick");
            return (Criteria) this;
        }

        public Criteria andU_nickNotBetween(String value1, String value2) {
            addCriterion("u_nick not between", value1, value2, "u_nick");
            return (Criteria) this;
        }

        public Criteria andU_groupIsNull() {
            addCriterion("u_group is null");
            return (Criteria) this;
        }

        public Criteria andU_groupIsNotNull() {
            addCriterion("u_group is not null");
            return (Criteria) this;
        }

        public Criteria andU_groupEqualTo(Integer value) {
            addCriterion("u_group =", value, "u_group");
            return (Criteria) this;
        }

        public Criteria andU_groupNotEqualTo(Integer value) {
            addCriterion("u_group <>", value, "u_group");
            return (Criteria) this;
        }

        public Criteria andU_groupGreaterThan(Integer value) {
            addCriterion("u_group >", value, "u_group");
            return (Criteria) this;
        }

        public Criteria andU_groupGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_group >=", value, "u_group");
            return (Criteria) this;
        }

        public Criteria andU_groupLessThan(Integer value) {
            addCriterion("u_group <", value, "u_group");
            return (Criteria) this;
        }

        public Criteria andU_groupLessThanOrEqualTo(Integer value) {
            addCriterion("u_group <=", value, "u_group");
            return (Criteria) this;
        }

        public Criteria andU_groupIn(List<Integer> values) {
            addCriterion("u_group in", values, "u_group");
            return (Criteria) this;
        }

        public Criteria andU_groupNotIn(List<Integer> values) {
            addCriterion("u_group not in", values, "u_group");
            return (Criteria) this;
        }

        public Criteria andU_groupBetween(Integer value1, Integer value2) {
            addCriterion("u_group between", value1, value2, "u_group");
            return (Criteria) this;
        }

        public Criteria andU_groupNotBetween(Integer value1, Integer value2) {
            addCriterion("u_group not between", value1, value2, "u_group");
            return (Criteria) this;
        }

        public Criteria andU_passwordIsNull() {
            addCriterion("u_password is null");
            return (Criteria) this;
        }

        public Criteria andU_passwordIsNotNull() {
            addCriterion("u_password is not null");
            return (Criteria) this;
        }

        public Criteria andU_passwordEqualTo(String value) {
            addCriterion("u_password =", value, "u_password");
            return (Criteria) this;
        }

        public Criteria andU_passwordNotEqualTo(String value) {
            addCriterion("u_password <>", value, "u_password");
            return (Criteria) this;
        }

        public Criteria andU_passwordGreaterThan(String value) {
            addCriterion("u_password >", value, "u_password");
            return (Criteria) this;
        }

        public Criteria andU_passwordGreaterThanOrEqualTo(String value) {
            addCriterion("u_password >=", value, "u_password");
            return (Criteria) this;
        }

        public Criteria andU_passwordLessThan(String value) {
            addCriterion("u_password <", value, "u_password");
            return (Criteria) this;
        }

        public Criteria andU_passwordLessThanOrEqualTo(String value) {
            addCriterion("u_password <=", value, "u_password");
            return (Criteria) this;
        }

        public Criteria andU_passwordLike(String value) {
            addCriterion("u_password like", value, "u_password");
            return (Criteria) this;
        }

        public Criteria andU_passwordNotLike(String value) {
            addCriterion("u_password not like", value, "u_password");
            return (Criteria) this;
        }

        public Criteria andU_passwordIn(List<String> values) {
            addCriterion("u_password in", values, "u_password");
            return (Criteria) this;
        }

        public Criteria andU_passwordNotIn(List<String> values) {
            addCriterion("u_password not in", values, "u_password");
            return (Criteria) this;
        }

        public Criteria andU_passwordBetween(String value1, String value2) {
            addCriterion("u_password between", value1, value2, "u_password");
            return (Criteria) this;
        }

        public Criteria andU_passwordNotBetween(String value1, String value2) {
            addCriterion("u_password not between", value1, value2, "u_password");
            return (Criteria) this;
        }

        public Criteria andU_reg_dateIsNull() {
            addCriterion("u_reg_date is null");
            return (Criteria) this;
        }

        public Criteria andU_reg_dateIsNotNull() {
            addCriterion("u_reg_date is not null");
            return (Criteria) this;
        }

        public Criteria andU_reg_dateEqualTo(Date value) {
            addCriterion("u_reg_date =", value, "u_reg_date");
            return (Criteria) this;
        }

        public Criteria andU_reg_dateNotEqualTo(Date value) {
            addCriterion("u_reg_date <>", value, "u_reg_date");
            return (Criteria) this;
        }

        public Criteria andU_reg_dateGreaterThan(Date value) {
            addCriterion("u_reg_date >", value, "u_reg_date");
            return (Criteria) this;
        }

        public Criteria andU_reg_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("u_reg_date >=", value, "u_reg_date");
            return (Criteria) this;
        }

        public Criteria andU_reg_dateLessThan(Date value) {
            addCriterion("u_reg_date <", value, "u_reg_date");
            return (Criteria) this;
        }

        public Criteria andU_reg_dateLessThanOrEqualTo(Date value) {
            addCriterion("u_reg_date <=", value, "u_reg_date");
            return (Criteria) this;
        }

        public Criteria andU_reg_dateIn(List<Date> values) {
            addCriterion("u_reg_date in", values, "u_reg_date");
            return (Criteria) this;
        }

        public Criteria andU_reg_dateNotIn(List<Date> values) {
            addCriterion("u_reg_date not in", values, "u_reg_date");
            return (Criteria) this;
        }

        public Criteria andU_reg_dateBetween(Date value1, Date value2) {
            addCriterion("u_reg_date between", value1, value2, "u_reg_date");
            return (Criteria) this;
        }

        public Criteria andU_reg_dateNotBetween(Date value1, Date value2) {
            addCriterion("u_reg_date not between", value1, value2, "u_reg_date");
            return (Criteria) this;
        }

        public Criteria andU_bannedIsNull() {
            addCriterion("u_banned is null");
            return (Criteria) this;
        }

        public Criteria andU_bannedIsNotNull() {
            addCriterion("u_banned is not null");
            return (Criteria) this;
        }

        public Criteria andU_bannedEqualTo(Boolean value) {
            addCriterion("u_banned =", value, "u_banned");
            return (Criteria) this;
        }

        public Criteria andU_bannedNotEqualTo(Boolean value) {
            addCriterion("u_banned <>", value, "u_banned");
            return (Criteria) this;
        }

        public Criteria andU_bannedGreaterThan(Boolean value) {
            addCriterion("u_banned >", value, "u_banned");
            return (Criteria) this;
        }

        public Criteria andU_bannedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("u_banned >=", value, "u_banned");
            return (Criteria) this;
        }

        public Criteria andU_bannedLessThan(Boolean value) {
            addCriterion("u_banned <", value, "u_banned");
            return (Criteria) this;
        }

        public Criteria andU_bannedLessThanOrEqualTo(Boolean value) {
            addCriterion("u_banned <=", value, "u_banned");
            return (Criteria) this;
        }

        public Criteria andU_bannedIn(List<Boolean> values) {
            addCriterion("u_banned in", values, "u_banned");
            return (Criteria) this;
        }

        public Criteria andU_bannedNotIn(List<Boolean> values) {
            addCriterion("u_banned not in", values, "u_banned");
            return (Criteria) this;
        }

        public Criteria andU_bannedBetween(Boolean value1, Boolean value2) {
            addCriterion("u_banned between", value1, value2, "u_banned");
            return (Criteria) this;
        }

        public Criteria andU_bannedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("u_banned not between", value1, value2, "u_banned");
            return (Criteria) this;
        }

        public Criteria andU_nameLikeInsensitive(String value) {
            addCriterion("upper(u_name) like", value.toUpperCase(), "u_name");
            return (Criteria) this;
        }

        public Criteria andU_nickLikeInsensitive(String value) {
            addCriterion("upper(u_nick) like", value.toUpperCase(), "u_nick");
            return (Criteria) this;
        }

        public Criteria andU_passwordLikeInsensitive(String value) {
            addCriterion("upper(u_password) like", value.toUpperCase(), "u_password");
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