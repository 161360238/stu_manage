package com.pdsu.stuManage.bean;

import java.util.ArrayList;
import java.util.List;

public class MandcExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MandcExample() {
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

        public Criteria andReidEqualTo(Integer value) {
            addCriterion("reid =", value, "reid");
            return (Criteria) this;
        }

        public Criteria andReidNotEqualTo(Integer value) {
            addCriterion("reid <>", value, "reid");
            return (Criteria) this;
        }

        public Criteria andReidGreaterThan(Integer value) {
            addCriterion("reid >", value, "reid");
            return (Criteria) this;
        }

        public Criteria andReidGreaterThanOrEqualTo(Integer value) {
            addCriterion("reid >=", value, "reid");
            return (Criteria) this;
        }

        public Criteria andReidLessThan(Integer value) {
            addCriterion("reid <", value, "reid");
            return (Criteria) this;
        }

        public Criteria andReidLessThanOrEqualTo(Integer value) {
            addCriterion("reid <=", value, "reid");
            return (Criteria) this;
        }

        public Criteria andReidIn(List<Integer> values) {
            addCriterion("reid in", values, "reid");
            return (Criteria) this;
        }

        public Criteria andReidNotIn(List<Integer> values) {
            addCriterion("reid not in", values, "reid");
            return (Criteria) this;
        }

        public Criteria andReidBetween(Integer value1, Integer value2) {
            addCriterion("reid between", value1, value2, "reid");
            return (Criteria) this;
        }

        public Criteria andReidNotBetween(Integer value1, Integer value2) {
            addCriterion("reid not between", value1, value2, "reid");
            return (Criteria) this;
        }

        public Criteria andCgradeIsNull() {
            addCriterion("cgrade is null");
            return (Criteria) this;
        }

        public Criteria andCgradeIsNotNull() {
            addCriterion("cgrade is not null");
            return (Criteria) this;
        }

        public Criteria andCgradeEqualTo(Integer value) {
            addCriterion("cgrade =", value, "cgrade");
            return (Criteria) this;
        }

        public Criteria andCgradeNotEqualTo(Integer value) {
            addCriterion("cgrade <>", value, "cgrade");
            return (Criteria) this;
        }

        public Criteria andCgradeGreaterThan(Integer value) {
            addCriterion("cgrade >", value, "cgrade");
            return (Criteria) this;
        }

        public Criteria andCgradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cgrade >=", value, "cgrade");
            return (Criteria) this;
        }

        public Criteria andCgradeLessThan(Integer value) {
            addCriterion("cgrade <", value, "cgrade");
            return (Criteria) this;
        }

        public Criteria andCgradeLessThanOrEqualTo(Integer value) {
            addCriterion("cgrade <=", value, "cgrade");
            return (Criteria) this;
        }

        public Criteria andCgradeIn(List<Integer> values) {
            addCriterion("cgrade in", values, "cgrade");
            return (Criteria) this;
        }

        public Criteria andCgradeNotIn(List<Integer> values) {
            addCriterion("cgrade not in", values, "cgrade");
            return (Criteria) this;
        }

        public Criteria andCgradeBetween(Integer value1, Integer value2) {
            addCriterion("cgrade between", value1, value2, "cgrade");
            return (Criteria) this;
        }

        public Criteria andCgradeNotBetween(Integer value1, Integer value2) {
            addCriterion("cgrade not between", value1, value2, "cgrade");
            return (Criteria) this;
        }

        public Criteria andCmajorIsNull() {
            addCriterion("cmajor is null");
            return (Criteria) this;
        }

        public Criteria andCmajorIsNotNull() {
            addCriterion("cmajor is not null");
            return (Criteria) this;
        }

        public Criteria andCmajorEqualTo(String value) {
            addCriterion("cmajor =", value, "cmajor");
            return (Criteria) this;
        }

        public Criteria andCmajorNotEqualTo(String value) {
            addCriterion("cmajor <>", value, "cmajor");
            return (Criteria) this;
        }

        public Criteria andCmajorGreaterThan(String value) {
            addCriterion("cmajor >", value, "cmajor");
            return (Criteria) this;
        }

        public Criteria andCmajorGreaterThanOrEqualTo(String value) {
            addCriterion("cmajor >=", value, "cmajor");
            return (Criteria) this;
        }

        public Criteria andCmajorLessThan(String value) {
            addCriterion("cmajor <", value, "cmajor");
            return (Criteria) this;
        }

        public Criteria andCmajorLessThanOrEqualTo(String value) {
            addCriterion("cmajor <=", value, "cmajor");
            return (Criteria) this;
        }

        public Criteria andCmajorLike(String value) {
            addCriterion("cmajor like", value, "cmajor");
            return (Criteria) this;
        }

        public Criteria andCmajorNotLike(String value) {
            addCriterion("cmajor not like", value, "cmajor");
            return (Criteria) this;
        }

        public Criteria andCmajorIn(List<String> values) {
            addCriterion("cmajor in", values, "cmajor");
            return (Criteria) this;
        }

        public Criteria andCmajorNotIn(List<String> values) {
            addCriterion("cmajor not in", values, "cmajor");
            return (Criteria) this;
        }

        public Criteria andCmajorBetween(String value1, String value2) {
            addCriterion("cmajor between", value1, value2, "cmajor");
            return (Criteria) this;
        }

        public Criteria andCmajorNotBetween(String value1, String value2) {
            addCriterion("cmajor not between", value1, value2, "cmajor");
            return (Criteria) this;
        }

        public Criteria andCnameIsNull() {
            addCriterion("cname is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("cname is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("cname =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("cname <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("cname >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("cname >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("cname <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("cname <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("cname like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("cname not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("cname in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("cname not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("cname between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("cname not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(String value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(String value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(String value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(String value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(String value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(String value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLike(String value) {
            addCriterion("cid like", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotLike(String value) {
            addCriterion("cid not like", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<String> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<String> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(String value1, String value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(String value1, String value2) {
            addCriterion("cid not between", value1, value2, "cid");
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

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
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