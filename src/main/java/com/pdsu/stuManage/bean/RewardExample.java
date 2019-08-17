package com.pdsu.stuManage.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RewardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RewardExample() {
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

        public Criteria andRidIsNull() {
            addCriterion("rid is null");
            return (Criteria) this;
        }

        public Criteria andRidIsNotNull() {
            addCriterion("rid is not null");
            return (Criteria) this;
        }

        public Criteria andRidEqualTo(String value) {
            addCriterion("rid =", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotEqualTo(String value) {
            addCriterion("rid <>", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThan(String value) {
            addCriterion("rid >", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThanOrEqualTo(String value) {
            addCriterion("rid >=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThan(String value) {
            addCriterion("rid <", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThanOrEqualTo(String value) {
            addCriterion("rid <=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLike(String value) {
            addCriterion("rid like", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotLike(String value) {
            addCriterion("rid not like", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidIn(List<String> values) {
            addCriterion("rid in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotIn(List<String> values) {
            addCriterion("rid not in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidBetween(String value1, String value2) {
            addCriterion("rid between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotBetween(String value1, String value2) {
            addCriterion("rid not between", value1, value2, "rid");
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

        public Criteria andRdescIsNull() {
            addCriterion("rdesc is null");
            return (Criteria) this;
        }

        public Criteria andRdescIsNotNull() {
            addCriterion("rdesc is not null");
            return (Criteria) this;
        }

        public Criteria andRdescEqualTo(String value) {
            addCriterion("rdesc =", value, "rdesc");
            return (Criteria) this;
        }

        public Criteria andRdescNotEqualTo(String value) {
            addCriterion("rdesc <>", value, "rdesc");
            return (Criteria) this;
        }

        public Criteria andRdescGreaterThan(String value) {
            addCriterion("rdesc >", value, "rdesc");
            return (Criteria) this;
        }

        public Criteria andRdescGreaterThanOrEqualTo(String value) {
            addCriterion("rdesc >=", value, "rdesc");
            return (Criteria) this;
        }

        public Criteria andRdescLessThan(String value) {
            addCriterion("rdesc <", value, "rdesc");
            return (Criteria) this;
        }

        public Criteria andRdescLessThanOrEqualTo(String value) {
            addCriterion("rdesc <=", value, "rdesc");
            return (Criteria) this;
        }

        public Criteria andRdescLike(String value) {
            addCriterion("rdesc like", value, "rdesc");
            return (Criteria) this;
        }

        public Criteria andRdescNotLike(String value) {
            addCriterion("rdesc not like", value, "rdesc");
            return (Criteria) this;
        }

        public Criteria andRdescIn(List<String> values) {
            addCriterion("rdesc in", values, "rdesc");
            return (Criteria) this;
        }

        public Criteria andRdescNotIn(List<String> values) {
            addCriterion("rdesc not in", values, "rdesc");
            return (Criteria) this;
        }

        public Criteria andRdescBetween(String value1, String value2) {
            addCriterion("rdesc between", value1, value2, "rdesc");
            return (Criteria) this;
        }

        public Criteria andRdescNotBetween(String value1, String value2) {
            addCriterion("rdesc not between", value1, value2, "rdesc");
            return (Criteria) this;
        }

        public Criteria andRclassifyIsNull() {
            addCriterion("rclassify is null");
            return (Criteria) this;
        }

        public Criteria andRclassifyIsNotNull() {
            addCriterion("rclassify is not null");
            return (Criteria) this;
        }

        public Criteria andRclassifyEqualTo(Integer value) {
            addCriterion("rclassify =", value, "rclassify");
            return (Criteria) this;
        }

        public Criteria andRclassifyNotEqualTo(Integer value) {
            addCriterion("rclassify <>", value, "rclassify");
            return (Criteria) this;
        }

        public Criteria andRclassifyGreaterThan(Integer value) {
            addCriterion("rclassify >", value, "rclassify");
            return (Criteria) this;
        }

        public Criteria andRclassifyGreaterThanOrEqualTo(Integer value) {
            addCriterion("rclassify >=", value, "rclassify");
            return (Criteria) this;
        }

        public Criteria andRclassifyLessThan(Integer value) {
            addCriterion("rclassify <", value, "rclassify");
            return (Criteria) this;
        }

        public Criteria andRclassifyLessThanOrEqualTo(Integer value) {
            addCriterion("rclassify <=", value, "rclassify");
            return (Criteria) this;
        }

        public Criteria andRclassifyIn(List<Integer> values) {
            addCriterion("rclassify in", values, "rclassify");
            return (Criteria) this;
        }

        public Criteria andRclassifyNotIn(List<Integer> values) {
            addCriterion("rclassify not in", values, "rclassify");
            return (Criteria) this;
        }

        public Criteria andRclassifyBetween(Integer value1, Integer value2) {
            addCriterion("rclassify between", value1, value2, "rclassify");
            return (Criteria) this;
        }

        public Criteria andRclassifyNotBetween(Integer value1, Integer value2) {
            addCriterion("rclassify not between", value1, value2, "rclassify");
            return (Criteria) this;
        }

        public Criteria andRtimeIsNull() {
            addCriterion("rtime is null");
            return (Criteria) this;
        }

        public Criteria andRtimeIsNotNull() {
            addCriterion("rtime is not null");
            return (Criteria) this;
        }

        public Criteria andRtimeEqualTo(Date value) {
            addCriterion("rtime =", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeNotEqualTo(Date value) {
            addCriterion("rtime <>", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeGreaterThan(Date value) {
            addCriterion("rtime >", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("rtime >=", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeLessThan(Date value) {
            addCriterion("rtime <", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeLessThanOrEqualTo(Date value) {
            addCriterion("rtime <=", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeIn(List<Date> values) {
            addCriterion("rtime in", values, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeNotIn(List<Date> values) {
            addCriterion("rtime not in", values, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeBetween(Date value1, Date value2) {
            addCriterion("rtime between", value1, value2, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeNotBetween(Date value1, Date value2) {
            addCriterion("rtime not between", value1, value2, "rtime");
            return (Criteria) this;
        }

        public Criteria andRscoreIsNull() {
            addCriterion("rscore is null");
            return (Criteria) this;
        }

        public Criteria andRscoreIsNotNull() {
            addCriterion("rscore is not null");
            return (Criteria) this;
        }

        public Criteria andRscoreEqualTo(String value) {
            addCriterion("rscore =", value, "rscore");
            return (Criteria) this;
        }

        public Criteria andRscoreNotEqualTo(String value) {
            addCriterion("rscore <>", value, "rscore");
            return (Criteria) this;
        }

        public Criteria andRscoreGreaterThan(String value) {
            addCriterion("rscore >", value, "rscore");
            return (Criteria) this;
        }

        public Criteria andRscoreGreaterThanOrEqualTo(String value) {
            addCriterion("rscore >=", value, "rscore");
            return (Criteria) this;
        }

        public Criteria andRscoreLessThan(String value) {
            addCriterion("rscore <", value, "rscore");
            return (Criteria) this;
        }

        public Criteria andRscoreLessThanOrEqualTo(String value) {
            addCriterion("rscore <=", value, "rscore");
            return (Criteria) this;
        }

        public Criteria andRscoreLike(String value) {
            addCriterion("rscore like", value, "rscore");
            return (Criteria) this;
        }

        public Criteria andRscoreNotLike(String value) {
            addCriterion("rscore not like", value, "rscore");
            return (Criteria) this;
        }

        public Criteria andRscoreIn(List<String> values) {
            addCriterion("rscore in", values, "rscore");
            return (Criteria) this;
        }

        public Criteria andRscoreNotIn(List<String> values) {
            addCriterion("rscore not in", values, "rscore");
            return (Criteria) this;
        }

        public Criteria andRscoreBetween(String value1, String value2) {
            addCriterion("rscore between", value1, value2, "rscore");
            return (Criteria) this;
        }

        public Criteria andRscoreNotBetween(String value1, String value2) {
            addCriterion("rscore not between", value1, value2, "rscore");
            return (Criteria) this;
        }

        public Criteria andRotherIsNull() {
            addCriterion("rother is null");
            return (Criteria) this;
        }

        public Criteria andRotherIsNotNull() {
            addCriterion("rother is not null");
            return (Criteria) this;
        }

        public Criteria andRotherEqualTo(String value) {
            addCriterion("rother =", value, "rother");
            return (Criteria) this;
        }

        public Criteria andRotherNotEqualTo(String value) {
            addCriterion("rother <>", value, "rother");
            return (Criteria) this;
        }

        public Criteria andRotherGreaterThan(String value) {
            addCriterion("rother >", value, "rother");
            return (Criteria) this;
        }

        public Criteria andRotherGreaterThanOrEqualTo(String value) {
            addCriterion("rother >=", value, "rother");
            return (Criteria) this;
        }

        public Criteria andRotherLessThan(String value) {
            addCriterion("rother <", value, "rother");
            return (Criteria) this;
        }

        public Criteria andRotherLessThanOrEqualTo(String value) {
            addCriterion("rother <=", value, "rother");
            return (Criteria) this;
        }

        public Criteria andRotherLike(String value) {
            addCriterion("rother like", value, "rother");
            return (Criteria) this;
        }

        public Criteria andRotherNotLike(String value) {
            addCriterion("rother not like", value, "rother");
            return (Criteria) this;
        }

        public Criteria andRotherIn(List<String> values) {
            addCriterion("rother in", values, "rother");
            return (Criteria) this;
        }

        public Criteria andRotherNotIn(List<String> values) {
            addCriterion("rother not in", values, "rother");
            return (Criteria) this;
        }

        public Criteria andRotherBetween(String value1, String value2) {
            addCriterion("rother between", value1, value2, "rother");
            return (Criteria) this;
        }

        public Criteria andRotherNotBetween(String value1, String value2) {
            addCriterion("rother not between", value1, value2, "rother");
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