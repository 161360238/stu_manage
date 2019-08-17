package com.pdsu.stuManage.bean;

import java.util.ArrayList;
import java.util.List;

public class ZandsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZandsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andReidIsNull() {
            addCriterion("reid is null");
            return (Criteria) this;
        }

        public Criteria andReidIsNotNull() {
            addCriterion("reid is not null");
            return (Criteria) this;
        }

        public Criteria andReidEqualTo(String value) {
            addCriterion("reid =", value, "reid");
            return (Criteria) this;
        }

        public Criteria andReidNotEqualTo(String value) {
            addCriterion("reid <>", value, "reid");
            return (Criteria) this;
        }

        public Criteria andReidGreaterThan(String value) {
            addCriterion("reid >", value, "reid");
            return (Criteria) this;
        }

        public Criteria andReidGreaterThanOrEqualTo(String value) {
            addCriterion("reid >=", value, "reid");
            return (Criteria) this;
        }

        public Criteria andReidLessThan(String value) {
            addCriterion("reid <", value, "reid");
            return (Criteria) this;
        }

        public Criteria andReidLessThanOrEqualTo(String value) {
            addCriterion("reid <=", value, "reid");
            return (Criteria) this;
        }

        public Criteria andReidLike(String value) {
            addCriterion("reid like", value, "reid");
            return (Criteria) this;
        }

        public Criteria andReidNotLike(String value) {
            addCriterion("reid not like", value, "reid");
            return (Criteria) this;
        }

        public Criteria andReidIn(List<String> values) {
            addCriterion("reid in", values, "reid");
            return (Criteria) this;
        }

        public Criteria andReidNotIn(List<String> values) {
            addCriterion("reid not in", values, "reid");
            return (Criteria) this;
        }

        public Criteria andReidBetween(String value1, String value2) {
            addCriterion("reid between", value1, value2, "reid");
            return (Criteria) this;
        }

        public Criteria andReidNotBetween(String value1, String value2) {
            addCriterion("reid not between", value1, value2, "reid");
            return (Criteria) this;
        }

        public Criteria andRestatueIsNull() {
            addCriterion("restatue is null");
            return (Criteria) this;
        }

        public Criteria andRestatueIsNotNull() {
            addCriterion("restatue is not null");
            return (Criteria) this;
        }

        public Criteria andRestatueEqualTo(Integer value) {
            addCriterion("restatue =", value, "restatue");
            return (Criteria) this;
        }

        public Criteria andRestatueNotEqualTo(Integer value) {
            addCriterion("restatue <>", value, "restatue");
            return (Criteria) this;
        }

        public Criteria andRestatueGreaterThan(Integer value) {
            addCriterion("restatue >", value, "restatue");
            return (Criteria) this;
        }

        public Criteria andRestatueGreaterThanOrEqualTo(Integer value) {
            addCriterion("restatue >=", value, "restatue");
            return (Criteria) this;
        }

        public Criteria andRestatueLessThan(Integer value) {
            addCriterion("restatue <", value, "restatue");
            return (Criteria) this;
        }

        public Criteria andRestatueLessThanOrEqualTo(Integer value) {
            addCriterion("restatue <=", value, "restatue");
            return (Criteria) this;
        }

        public Criteria andRestatueIn(List<Integer> values) {
            addCriterion("restatue in", values, "restatue");
            return (Criteria) this;
        }

        public Criteria andRestatueNotIn(List<Integer> values) {
            addCriterion("restatue not in", values, "restatue");
            return (Criteria) this;
        }

        public Criteria andRestatueBetween(Integer value1, Integer value2) {
            addCriterion("restatue between", value1, value2, "restatue");
            return (Criteria) this;
        }

        public Criteria andRestatueNotBetween(Integer value1, Integer value2) {
            addCriterion("restatue not between", value1, value2, "restatue");
            return (Criteria) this;
        }

        public Criteria andZcidIsNull() {
            addCriterion("zcid is null");
            return (Criteria) this;
        }

        public Criteria andZcidIsNotNull() {
            addCriterion("zcid is not null");
            return (Criteria) this;
        }

        public Criteria andZcidEqualTo(String value) {
            addCriterion("zcid =", value, "zcid");
            return (Criteria) this;
        }

        public Criteria andZcidNotEqualTo(String value) {
            addCriterion("zcid <>", value, "zcid");
            return (Criteria) this;
        }

        public Criteria andZcidGreaterThan(String value) {
            addCriterion("zcid >", value, "zcid");
            return (Criteria) this;
        }

        public Criteria andZcidGreaterThanOrEqualTo(String value) {
            addCriterion("zcid >=", value, "zcid");
            return (Criteria) this;
        }

        public Criteria andZcidLessThan(String value) {
            addCriterion("zcid <", value, "zcid");
            return (Criteria) this;
        }

        public Criteria andZcidLessThanOrEqualTo(String value) {
            addCriterion("zcid <=", value, "zcid");
            return (Criteria) this;
        }

        public Criteria andZcidLike(String value) {
            addCriterion("zcid like", value, "zcid");
            return (Criteria) this;
        }

        public Criteria andZcidNotLike(String value) {
            addCriterion("zcid not like", value, "zcid");
            return (Criteria) this;
        }

        public Criteria andZcidIn(List<String> values) {
            addCriterion("zcid in", values, "zcid");
            return (Criteria) this;
        }

        public Criteria andZcidNotIn(List<String> values) {
            addCriterion("zcid not in", values, "zcid");
            return (Criteria) this;
        }

        public Criteria andZcidBetween(String value1, String value2) {
            addCriterion("zcid between", value1, value2, "zcid");
            return (Criteria) this;
        }

        public Criteria andZcidNotBetween(String value1, String value2) {
            addCriterion("zcid not between", value1, value2, "zcid");
            return (Criteria) this;
        }

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(String value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(String value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(String value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(String value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(String value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(String value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLike(String value) {
            addCriterion("sid like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotLike(String value) {
            addCriterion("sid not like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<String> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<String> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(String value1, String value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(String value1, String value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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