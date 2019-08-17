package com.pdsu.stuManage.bean;

import java.util.ArrayList;
import java.util.List;

public class ClazzExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClazzExample() {
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

        public Criteria andCscoreIsNull() {
            addCriterion("cscore is null");
            return (Criteria) this;
        }

        public Criteria andCscoreIsNotNull() {
            addCriterion("cscore is not null");
            return (Criteria) this;
        }

        public Criteria andCscoreEqualTo(Float value) {
            addCriterion("cscore =", value, "cscore");
            return (Criteria) this;
        }

        public Criteria andCscoreNotEqualTo(Float value) {
            addCriterion("cscore <>", value, "cscore");
            return (Criteria) this;
        }

        public Criteria andCscoreGreaterThan(Float value) {
            addCriterion("cscore >", value, "cscore");
            return (Criteria) this;
        }

        public Criteria andCscoreGreaterThanOrEqualTo(Float value) {
            addCriterion("cscore >=", value, "cscore");
            return (Criteria) this;
        }

        public Criteria andCscoreLessThan(Float value) {
            addCriterion("cscore <", value, "cscore");
            return (Criteria) this;
        }

        public Criteria andCscoreLessThanOrEqualTo(Float value) {
            addCriterion("cscore <=", value, "cscore");
            return (Criteria) this;
        }

        public Criteria andCscoreIn(List<Float> values) {
            addCriterion("cscore in", values, "cscore");
            return (Criteria) this;
        }

        public Criteria andCscoreNotIn(List<Float> values) {
            addCriterion("cscore not in", values, "cscore");
            return (Criteria) this;
        }

        public Criteria andCscoreBetween(Float value1, Float value2) {
            addCriterion("cscore between", value1, value2, "cscore");
            return (Criteria) this;
        }

        public Criteria andCscoreNotBetween(Float value1, Float value2) {
            addCriterion("cscore not between", value1, value2, "cscore");
            return (Criteria) this;
        }

        public Criteria andStunumIsNull() {
            addCriterion("stunum is null");
            return (Criteria) this;
        }

        public Criteria andStunumIsNotNull() {
            addCriterion("stunum is not null");
            return (Criteria) this;
        }

        public Criteria andStunumEqualTo(Integer value) {
            addCriterion("stunum =", value, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumNotEqualTo(Integer value) {
            addCriterion("stunum <>", value, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumGreaterThan(Integer value) {
            addCriterion("stunum >", value, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumGreaterThanOrEqualTo(Integer value) {
            addCriterion("stunum >=", value, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumLessThan(Integer value) {
            addCriterion("stunum <", value, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumLessThanOrEqualTo(Integer value) {
            addCriterion("stunum <=", value, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumIn(List<Integer> values) {
            addCriterion("stunum in", values, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumNotIn(List<Integer> values) {
            addCriterion("stunum not in", values, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumBetween(Integer value1, Integer value2) {
            addCriterion("stunum between", value1, value2, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumNotBetween(Integer value1, Integer value2) {
            addCriterion("stunum not between", value1, value2, "stunum");
            return (Criteria) this;
        }

        public Criteria andIntroduceIsNull() {
            addCriterion("introduce is null");
            return (Criteria) this;
        }

        public Criteria andIntroduceIsNotNull() {
            addCriterion("introduce is not null");
            return (Criteria) this;
        }

        public Criteria andIntroduceEqualTo(String value) {
            addCriterion("introduce =", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotEqualTo(String value) {
            addCriterion("introduce <>", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceGreaterThan(String value) {
            addCriterion("introduce >", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("introduce >=", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLessThan(String value) {
            addCriterion("introduce <", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLessThanOrEqualTo(String value) {
            addCriterion("introduce <=", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLike(String value) {
            addCriterion("introduce like", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotLike(String value) {
            addCriterion("introduce not like", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceIn(List<String> values) {
            addCriterion("introduce in", values, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotIn(List<String> values) {
            addCriterion("introduce not in", values, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceBetween(String value1, String value2) {
            addCriterion("introduce between", value1, value2, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotBetween(String value1, String value2) {
            addCriterion("introduce not between", value1, value2, "introduce");
            return (Criteria) this;
        }

        public Criteria andCstatueIsNull() {
            addCriterion("cstatue is null");
            return (Criteria) this;
        }

        public Criteria andCstatueIsNotNull() {
            addCriterion("cstatue is not null");
            return (Criteria) this;
        }

        public Criteria andCstatueEqualTo(String value) {
            addCriterion("cstatue =", value, "cstatue");
            return (Criteria) this;
        }

        public Criteria andCstatueNotEqualTo(String value) {
            addCriterion("cstatue <>", value, "cstatue");
            return (Criteria) this;
        }

        public Criteria andCstatueGreaterThan(String value) {
            addCriterion("cstatue >", value, "cstatue");
            return (Criteria) this;
        }

        public Criteria andCstatueGreaterThanOrEqualTo(String value) {
            addCriterion("cstatue >=", value, "cstatue");
            return (Criteria) this;
        }

        public Criteria andCstatueLessThan(String value) {
            addCriterion("cstatue <", value, "cstatue");
            return (Criteria) this;
        }

        public Criteria andCstatueLessThanOrEqualTo(String value) {
            addCriterion("cstatue <=", value, "cstatue");
            return (Criteria) this;
        }

        public Criteria andCstatueLike(String value) {
            addCriterion("cstatue like", value, "cstatue");
            return (Criteria) this;
        }

        public Criteria andCstatueNotLike(String value) {
            addCriterion("cstatue not like", value, "cstatue");
            return (Criteria) this;
        }

        public Criteria andCstatueIn(List<String> values) {
            addCriterion("cstatue in", values, "cstatue");
            return (Criteria) this;
        }

        public Criteria andCstatueNotIn(List<String> values) {
            addCriterion("cstatue not in", values, "cstatue");
            return (Criteria) this;
        }

        public Criteria andCstatueBetween(String value1, String value2) {
            addCriterion("cstatue between", value1, value2, "cstatue");
            return (Criteria) this;
        }

        public Criteria andCstatueNotBetween(String value1, String value2) {
            addCriterion("cstatue not between", value1, value2, "cstatue");
            return (Criteria) this;
        }

        public Criteria andOtherIsNull() {
            addCriterion("other is null");
            return (Criteria) this;
        }

        public Criteria andOtherIsNotNull() {
            addCriterion("other is not null");
            return (Criteria) this;
        }

        public Criteria andOtherEqualTo(String value) {
            addCriterion("other =", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotEqualTo(String value) {
            addCriterion("other <>", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThan(String value) {
            addCriterion("other >", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThanOrEqualTo(String value) {
            addCriterion("other >=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThan(String value) {
            addCriterion("other <", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThanOrEqualTo(String value) {
            addCriterion("other <=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLike(String value) {
            addCriterion("other like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotLike(String value) {
            addCriterion("other not like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherIn(List<String> values) {
            addCriterion("other in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotIn(List<String> values) {
            addCriterion("other not in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherBetween(String value1, String value2) {
            addCriterion("other between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotBetween(String value1, String value2) {
            addCriterion("other not between", value1, value2, "other");
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