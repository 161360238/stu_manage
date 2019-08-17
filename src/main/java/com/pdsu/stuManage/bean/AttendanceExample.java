package com.pdsu.stuManage.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AttendanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttendanceExample() {
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

        public Criteria andKidIsNull() {
            addCriterion("kid is null");
            return (Criteria) this;
        }

        public Criteria andKidIsNotNull() {
            addCriterion("kid is not null");
            return (Criteria) this;
        }

        public Criteria andKidEqualTo(String value) {
            addCriterion("kid =", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidNotEqualTo(String value) {
            addCriterion("kid <>", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidGreaterThan(String value) {
            addCriterion("kid >", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidGreaterThanOrEqualTo(String value) {
            addCriterion("kid >=", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidLessThan(String value) {
            addCriterion("kid <", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidLessThanOrEqualTo(String value) {
            addCriterion("kid <=", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidLike(String value) {
            addCriterion("kid like", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidNotLike(String value) {
            addCriterion("kid not like", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidIn(List<String> values) {
            addCriterion("kid in", values, "kid");
            return (Criteria) this;
        }

        public Criteria andKidNotIn(List<String> values) {
            addCriterion("kid not in", values, "kid");
            return (Criteria) this;
        }

        public Criteria andKidBetween(String value1, String value2) {
            addCriterion("kid between", value1, value2, "kid");
            return (Criteria) this;
        }

        public Criteria andKidNotBetween(String value1, String value2) {
            addCriterion("kid not between", value1, value2, "kid");
            return (Criteria) this;
        }

        public Criteria andKtimeIsNull() {
            addCriterion("ktime is null");
            return (Criteria) this;
        }

        public Criteria andKtimeIsNotNull() {
            addCriterion("ktime is not null");
            return (Criteria) this;
        }

        public Criteria andKtimeEqualTo(Date value) {
            addCriterion("ktime =", value, "ktime");
            return (Criteria) this;
        }

        public Criteria andKtimeNotEqualTo(Date value) {
            addCriterion("ktime <>", value, "ktime");
            return (Criteria) this;
        }

        public Criteria andKtimeGreaterThan(Date value) {
            addCriterion("ktime >", value, "ktime");
            return (Criteria) this;
        }

        public Criteria andKtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ktime >=", value, "ktime");
            return (Criteria) this;
        }

        public Criteria andKtimeLessThan(Date value) {
            addCriterion("ktime <", value, "ktime");
            return (Criteria) this;
        }

        public Criteria andKtimeLessThanOrEqualTo(Date value) {
            addCriterion("ktime <=", value, "ktime");
            return (Criteria) this;
        }

        public Criteria andKtimeIn(List<Date> values) {
            addCriterion("ktime in", values, "ktime");
            return (Criteria) this;
        }

        public Criteria andKtimeNotIn(List<Date> values) {
            addCriterion("ktime not in", values, "ktime");
            return (Criteria) this;
        }

        public Criteria andKtimeBetween(Date value1, Date value2) {
            addCriterion("ktime between", value1, value2, "ktime");
            return (Criteria) this;
        }

        public Criteria andKtimeNotBetween(Date value1, Date value2) {
            addCriterion("ktime not between", value1, value2, "ktime");
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

        public Criteria andStatueIsNull() {
            addCriterion("statue is null");
            return (Criteria) this;
        }

        public Criteria andStatueIsNotNull() {
            addCriterion("statue is not null");
            return (Criteria) this;
        }

        public Criteria andStatueEqualTo(String value) {
            addCriterion("statue =", value, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueNotEqualTo(String value) {
            addCriterion("statue <>", value, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueGreaterThan(String value) {
            addCriterion("statue >", value, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueGreaterThanOrEqualTo(String value) {
            addCriterion("statue >=", value, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueLessThan(String value) {
            addCriterion("statue <", value, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueLessThanOrEqualTo(String value) {
            addCriterion("statue <=", value, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueLike(String value) {
            addCriterion("statue like", value, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueNotLike(String value) {
            addCriterion("statue not like", value, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueIn(List<String> values) {
            addCriterion("statue in", values, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueNotIn(List<String> values) {
            addCriterion("statue not in", values, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueBetween(String value1, String value2) {
            addCriterion("statue between", value1, value2, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueNotBetween(String value1, String value2) {
            addCriterion("statue not between", value1, value2, "statue");
            return (Criteria) this;
        }

        public Criteria andCuidIsNull() {
            addCriterion("cuid is null");
            return (Criteria) this;
        }

        public Criteria andCuidIsNotNull() {
            addCriterion("cuid is not null");
            return (Criteria) this;
        }

        public Criteria andCuidEqualTo(String value) {
            addCriterion("cuid =", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidNotEqualTo(String value) {
            addCriterion("cuid <>", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidGreaterThan(String value) {
            addCriterion("cuid >", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidGreaterThanOrEqualTo(String value) {
            addCriterion("cuid >=", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidLessThan(String value) {
            addCriterion("cuid <", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidLessThanOrEqualTo(String value) {
            addCriterion("cuid <=", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidLike(String value) {
            addCriterion("cuid like", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidNotLike(String value) {
            addCriterion("cuid not like", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidIn(List<String> values) {
            addCriterion("cuid in", values, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidNotIn(List<String> values) {
            addCriterion("cuid not in", values, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidBetween(String value1, String value2) {
            addCriterion("cuid between", value1, value2, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidNotBetween(String value1, String value2) {
            addCriterion("cuid not between", value1, value2, "cuid");
            return (Criteria) this;
        }

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(String value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(String value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(String value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(String value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(String value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(String value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLike(String value) {
            addCriterion("tid like", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotLike(String value) {
            addCriterion("tid not like", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<String> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<String> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(String value1, String value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(String value1, String value2) {
            addCriterion("tid not between", value1, value2, "tid");
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