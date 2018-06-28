package com.iteamcn.baichengnews.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewsExample {
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
    public NewsExample() {
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

        public Criteria andN_idIsNull() {
            addCriterion("n_id is null");
            return (Criteria) this;
        }

        public Criteria andN_idIsNotNull() {
            addCriterion("n_id is not null");
            return (Criteria) this;
        }

        public Criteria andN_idEqualTo(Integer value) {
            addCriterion("n_id =", value, "n_id");
            return (Criteria) this;
        }

        public Criteria andN_idNotEqualTo(Integer value) {
            addCriterion("n_id <>", value, "n_id");
            return (Criteria) this;
        }

        public Criteria andN_idGreaterThan(Integer value) {
            addCriterion("n_id >", value, "n_id");
            return (Criteria) this;
        }

        public Criteria andN_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_id >=", value, "n_id");
            return (Criteria) this;
        }

        public Criteria andN_idLessThan(Integer value) {
            addCriterion("n_id <", value, "n_id");
            return (Criteria) this;
        }

        public Criteria andN_idLessThanOrEqualTo(Integer value) {
            addCriterion("n_id <=", value, "n_id");
            return (Criteria) this;
        }

        public Criteria andN_idIn(List<Integer> values) {
            addCriterion("n_id in", values, "n_id");
            return (Criteria) this;
        }

        public Criteria andN_idNotIn(List<Integer> values) {
            addCriterion("n_id not in", values, "n_id");
            return (Criteria) this;
        }

        public Criteria andN_idBetween(Integer value1, Integer value2) {
            addCriterion("n_id between", value1, value2, "n_id");
            return (Criteria) this;
        }

        public Criteria andN_idNotBetween(Integer value1, Integer value2) {
            addCriterion("n_id not between", value1, value2, "n_id");
            return (Criteria) this;
        }

        public Criteria andN_channelIsNull() {
            addCriterion("n_channel is null");
            return (Criteria) this;
        }

        public Criteria andN_channelIsNotNull() {
            addCriterion("n_channel is not null");
            return (Criteria) this;
        }

        public Criteria andN_channelEqualTo(Integer value) {
            addCriterion("n_channel =", value, "n_channel");
            return (Criteria) this;
        }

        public Criteria andN_channelNotEqualTo(Integer value) {
            addCriterion("n_channel <>", value, "n_channel");
            return (Criteria) this;
        }

        public Criteria andN_channelGreaterThan(Integer value) {
            addCriterion("n_channel >", value, "n_channel");
            return (Criteria) this;
        }

        public Criteria andN_channelGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_channel >=", value, "n_channel");
            return (Criteria) this;
        }

        public Criteria andN_channelLessThan(Integer value) {
            addCriterion("n_channel <", value, "n_channel");
            return (Criteria) this;
        }

        public Criteria andN_channelLessThanOrEqualTo(Integer value) {
            addCriterion("n_channel <=", value, "n_channel");
            return (Criteria) this;
        }

        public Criteria andN_channelIn(List<Integer> values) {
            addCriterion("n_channel in", values, "n_channel");
            return (Criteria) this;
        }

        public Criteria andN_channelNotIn(List<Integer> values) {
            addCriterion("n_channel not in", values, "n_channel");
            return (Criteria) this;
        }

        public Criteria andN_channelBetween(Integer value1, Integer value2) {
            addCriterion("n_channel between", value1, value2, "n_channel");
            return (Criteria) this;
        }

        public Criteria andN_channelNotBetween(Integer value1, Integer value2) {
            addCriterion("n_channel not between", value1, value2, "n_channel");
            return (Criteria) this;
        }

        public Criteria andN_titleIsNull() {
            addCriterion("n_title is null");
            return (Criteria) this;
        }

        public Criteria andN_titleIsNotNull() {
            addCriterion("n_title is not null");
            return (Criteria) this;
        }

        public Criteria andN_titleEqualTo(String value) {
            addCriterion("n_title =", value, "n_title");
            return (Criteria) this;
        }

        public Criteria andN_titleNotEqualTo(String value) {
            addCriterion("n_title <>", value, "n_title");
            return (Criteria) this;
        }

        public Criteria andN_titleGreaterThan(String value) {
            addCriterion("n_title >", value, "n_title");
            return (Criteria) this;
        }

        public Criteria andN_titleGreaterThanOrEqualTo(String value) {
            addCriterion("n_title >=", value, "n_title");
            return (Criteria) this;
        }

        public Criteria andN_titleLessThan(String value) {
            addCriterion("n_title <", value, "n_title");
            return (Criteria) this;
        }

        public Criteria andN_titleLessThanOrEqualTo(String value) {
            addCriterion("n_title <=", value, "n_title");
            return (Criteria) this;
        }

        public Criteria andN_titleLike(String value) {
            addCriterion("n_title like", value, "n_title");
            return (Criteria) this;
        }

        public Criteria andN_titleNotLike(String value) {
            addCriterion("n_title not like", value, "n_title");
            return (Criteria) this;
        }

        public Criteria andN_titleIn(List<String> values) {
            addCriterion("n_title in", values, "n_title");
            return (Criteria) this;
        }

        public Criteria andN_titleNotIn(List<String> values) {
            addCriterion("n_title not in", values, "n_title");
            return (Criteria) this;
        }

        public Criteria andN_titleBetween(String value1, String value2) {
            addCriterion("n_title between", value1, value2, "n_title");
            return (Criteria) this;
        }

        public Criteria andN_titleNotBetween(String value1, String value2) {
            addCriterion("n_title not between", value1, value2, "n_title");
            return (Criteria) this;
        }

        public Criteria andN_picIsNull() {
            addCriterion("n_pic is null");
            return (Criteria) this;
        }

        public Criteria andN_picIsNotNull() {
            addCriterion("n_pic is not null");
            return (Criteria) this;
        }

        public Criteria andN_picEqualTo(String value) {
            addCriterion("n_pic =", value, "n_pic");
            return (Criteria) this;
        }

        public Criteria andN_picNotEqualTo(String value) {
            addCriterion("n_pic <>", value, "n_pic");
            return (Criteria) this;
        }

        public Criteria andN_picGreaterThan(String value) {
            addCriterion("n_pic >", value, "n_pic");
            return (Criteria) this;
        }

        public Criteria andN_picGreaterThanOrEqualTo(String value) {
            addCriterion("n_pic >=", value, "n_pic");
            return (Criteria) this;
        }

        public Criteria andN_picLessThan(String value) {
            addCriterion("n_pic <", value, "n_pic");
            return (Criteria) this;
        }

        public Criteria andN_picLessThanOrEqualTo(String value) {
            addCriterion("n_pic <=", value, "n_pic");
            return (Criteria) this;
        }

        public Criteria andN_picLike(String value) {
            addCriterion("n_pic like", value, "n_pic");
            return (Criteria) this;
        }

        public Criteria andN_picNotLike(String value) {
            addCriterion("n_pic not like", value, "n_pic");
            return (Criteria) this;
        }

        public Criteria andN_picIn(List<String> values) {
            addCriterion("n_pic in", values, "n_pic");
            return (Criteria) this;
        }

        public Criteria andN_picNotIn(List<String> values) {
            addCriterion("n_pic not in", values, "n_pic");
            return (Criteria) this;
        }

        public Criteria andN_picBetween(String value1, String value2) {
            addCriterion("n_pic between", value1, value2, "n_pic");
            return (Criteria) this;
        }

        public Criteria andN_picNotBetween(String value1, String value2) {
            addCriterion("n_pic not between", value1, value2, "n_pic");
            return (Criteria) this;
        }

        public Criteria andN_dateIsNull() {
            addCriterion("n_date is null");
            return (Criteria) this;
        }

        public Criteria andN_dateIsNotNull() {
            addCriterion("n_date is not null");
            return (Criteria) this;
        }

        public Criteria andN_dateEqualTo(Date value) {
            addCriterion("n_date =", value, "n_date");
            return (Criteria) this;
        }

        public Criteria andN_dateNotEqualTo(Date value) {
            addCriterion("n_date <>", value, "n_date");
            return (Criteria) this;
        }

        public Criteria andN_dateGreaterThan(Date value) {
            addCriterion("n_date >", value, "n_date");
            return (Criteria) this;
        }

        public Criteria andN_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("n_date >=", value, "n_date");
            return (Criteria) this;
        }

        public Criteria andN_dateLessThan(Date value) {
            addCriterion("n_date <", value, "n_date");
            return (Criteria) this;
        }

        public Criteria andN_dateLessThanOrEqualTo(Date value) {
            addCriterion("n_date <=", value, "n_date");
            return (Criteria) this;
        }

        public Criteria andN_dateIn(List<Date> values) {
            addCriterion("n_date in", values, "n_date");
            return (Criteria) this;
        }

        public Criteria andN_dateNotIn(List<Date> values) {
            addCriterion("n_date not in", values, "n_date");
            return (Criteria) this;
        }

        public Criteria andN_dateBetween(Date value1, Date value2) {
            addCriterion("n_date between", value1, value2, "n_date");
            return (Criteria) this;
        }

        public Criteria andN_dateNotBetween(Date value1, Date value2) {
            addCriterion("n_date not between", value1, value2, "n_date");
            return (Criteria) this;
        }

        public Criteria andN_priorityIsNull() {
            addCriterion("n_priority is null");
            return (Criteria) this;
        }

        public Criteria andN_priorityIsNotNull() {
            addCriterion("n_priority is not null");
            return (Criteria) this;
        }

        public Criteria andN_priorityEqualTo(Integer value) {
            addCriterion("n_priority =", value, "n_priority");
            return (Criteria) this;
        }

        public Criteria andN_priorityNotEqualTo(Integer value) {
            addCriterion("n_priority <>", value, "n_priority");
            return (Criteria) this;
        }

        public Criteria andN_priorityGreaterThan(Integer value) {
            addCriterion("n_priority >", value, "n_priority");
            return (Criteria) this;
        }

        public Criteria andN_priorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_priority >=", value, "n_priority");
            return (Criteria) this;
        }

        public Criteria andN_priorityLessThan(Integer value) {
            addCriterion("n_priority <", value, "n_priority");
            return (Criteria) this;
        }

        public Criteria andN_priorityLessThanOrEqualTo(Integer value) {
            addCriterion("n_priority <=", value, "n_priority");
            return (Criteria) this;
        }

        public Criteria andN_priorityIn(List<Integer> values) {
            addCriterion("n_priority in", values, "n_priority");
            return (Criteria) this;
        }

        public Criteria andN_priorityNotIn(List<Integer> values) {
            addCriterion("n_priority not in", values, "n_priority");
            return (Criteria) this;
        }

        public Criteria andN_priorityBetween(Integer value1, Integer value2) {
            addCriterion("n_priority between", value1, value2, "n_priority");
            return (Criteria) this;
        }

        public Criteria andN_priorityNotBetween(Integer value1, Integer value2) {
            addCriterion("n_priority not between", value1, value2, "n_priority");
            return (Criteria) this;
        }

        public Criteria andN_authorIsNull() {
            addCriterion("n_author is null");
            return (Criteria) this;
        }

        public Criteria andN_authorIsNotNull() {
            addCriterion("n_author is not null");
            return (Criteria) this;
        }

        public Criteria andN_authorEqualTo(Integer value) {
            addCriterion("n_author =", value, "n_author");
            return (Criteria) this;
        }

        public Criteria andN_authorNotEqualTo(Integer value) {
            addCriterion("n_author <>", value, "n_author");
            return (Criteria) this;
        }

        public Criteria andN_authorGreaterThan(Integer value) {
            addCriterion("n_author >", value, "n_author");
            return (Criteria) this;
        }

        public Criteria andN_authorGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_author >=", value, "n_author");
            return (Criteria) this;
        }

        public Criteria andN_authorLessThan(Integer value) {
            addCriterion("n_author <", value, "n_author");
            return (Criteria) this;
        }

        public Criteria andN_authorLessThanOrEqualTo(Integer value) {
            addCriterion("n_author <=", value, "n_author");
            return (Criteria) this;
        }

        public Criteria andN_authorIn(List<Integer> values) {
            addCriterion("n_author in", values, "n_author");
            return (Criteria) this;
        }

        public Criteria andN_authorNotIn(List<Integer> values) {
            addCriterion("n_author not in", values, "n_author");
            return (Criteria) this;
        }

        public Criteria andN_authorBetween(Integer value1, Integer value2) {
            addCriterion("n_author between", value1, value2, "n_author");
            return (Criteria) this;
        }

        public Criteria andN_authorNotBetween(Integer value1, Integer value2) {
            addCriterion("n_author not between", value1, value2, "n_author");
            return (Criteria) this;
        }

        public Criteria andN_can_commentIsNull() {
            addCriterion("n_can_comment is null");
            return (Criteria) this;
        }

        public Criteria andN_can_commentIsNotNull() {
            addCriterion("n_can_comment is not null");
            return (Criteria) this;
        }

        public Criteria andN_can_commentEqualTo(Boolean value) {
            addCriterion("n_can_comment =", value, "n_can_comment");
            return (Criteria) this;
        }

        public Criteria andN_can_commentNotEqualTo(Boolean value) {
            addCriterion("n_can_comment <>", value, "n_can_comment");
            return (Criteria) this;
        }

        public Criteria andN_can_commentGreaterThan(Boolean value) {
            addCriterion("n_can_comment >", value, "n_can_comment");
            return (Criteria) this;
        }

        public Criteria andN_can_commentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("n_can_comment >=", value, "n_can_comment");
            return (Criteria) this;
        }

        public Criteria andN_can_commentLessThan(Boolean value) {
            addCriterion("n_can_comment <", value, "n_can_comment");
            return (Criteria) this;
        }

        public Criteria andN_can_commentLessThanOrEqualTo(Boolean value) {
            addCriterion("n_can_comment <=", value, "n_can_comment");
            return (Criteria) this;
        }

        public Criteria andN_can_commentIn(List<Boolean> values) {
            addCriterion("n_can_comment in", values, "n_can_comment");
            return (Criteria) this;
        }

        public Criteria andN_can_commentNotIn(List<Boolean> values) {
            addCriterion("n_can_comment not in", values, "n_can_comment");
            return (Criteria) this;
        }

        public Criteria andN_can_commentBetween(Boolean value1, Boolean value2) {
            addCriterion("n_can_comment between", value1, value2, "n_can_comment");
            return (Criteria) this;
        }

        public Criteria andN_can_commentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("n_can_comment not between", value1, value2, "n_can_comment");
            return (Criteria) this;
        }

        public Criteria andN_titleLikeInsensitive(String value) {
            addCriterion("upper(n_title) like", value.toUpperCase(), "n_title");
            return (Criteria) this;
        }

        public Criteria andN_picLikeInsensitive(String value) {
            addCriterion("upper(n_pic) like", value.toUpperCase(), "n_pic");
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