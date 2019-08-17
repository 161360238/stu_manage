package com.pdsu.stuManage.bean;

import java.util.ArrayList;
import java.util.List;

public class Student2Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Student2Example() {
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

        public Criteria andIspoorIsNull() {
            addCriterion("ispoor is null");
            return (Criteria) this;
        }

        public Criteria andIspoorIsNotNull() {
            addCriterion("ispoor is not null");
            return (Criteria) this;
        }

        public Criteria andIspoorEqualTo(Integer value) {
            addCriterion("ispoor =", value, "ispoor");
            return (Criteria) this;
        }

        public Criteria andIspoorNotEqualTo(Integer value) {
            addCriterion("ispoor <>", value, "ispoor");
            return (Criteria) this;
        }

        public Criteria andIspoorGreaterThan(Integer value) {
            addCriterion("ispoor >", value, "ispoor");
            return (Criteria) this;
        }

        public Criteria andIspoorGreaterThanOrEqualTo(Integer value) {
            addCriterion("ispoor >=", value, "ispoor");
            return (Criteria) this;
        }

        public Criteria andIspoorLessThan(Integer value) {
            addCriterion("ispoor <", value, "ispoor");
            return (Criteria) this;
        }

        public Criteria andIspoorLessThanOrEqualTo(Integer value) {
            addCriterion("ispoor <=", value, "ispoor");
            return (Criteria) this;
        }

        public Criteria andIspoorIn(List<Integer> values) {
            addCriterion("ispoor in", values, "ispoor");
            return (Criteria) this;
        }

        public Criteria andIspoorNotIn(List<Integer> values) {
            addCriterion("ispoor not in", values, "ispoor");
            return (Criteria) this;
        }

        public Criteria andIspoorBetween(Integer value1, Integer value2) {
            addCriterion("ispoor between", value1, value2, "ispoor");
            return (Criteria) this;
        }

        public Criteria andIspoorNotBetween(Integer value1, Integer value2) {
            addCriterion("ispoor not between", value1, value2, "ispoor");
            return (Criteria) this;
        }

        public Criteria andPartyIsNull() {
            addCriterion("party is null");
            return (Criteria) this;
        }

        public Criteria andPartyIsNotNull() {
            addCriterion("party is not null");
            return (Criteria) this;
        }

        public Criteria andPartyEqualTo(String value) {
            addCriterion("party =", value, "party");
            return (Criteria) this;
        }

        public Criteria andPartyNotEqualTo(String value) {
            addCriterion("party <>", value, "party");
            return (Criteria) this;
        }

        public Criteria andPartyGreaterThan(String value) {
            addCriterion("party >", value, "party");
            return (Criteria) this;
        }

        public Criteria andPartyGreaterThanOrEqualTo(String value) {
            addCriterion("party >=", value, "party");
            return (Criteria) this;
        }

        public Criteria andPartyLessThan(String value) {
            addCriterion("party <", value, "party");
            return (Criteria) this;
        }

        public Criteria andPartyLessThanOrEqualTo(String value) {
            addCriterion("party <=", value, "party");
            return (Criteria) this;
        }

        public Criteria andPartyLike(String value) {
            addCriterion("party like", value, "party");
            return (Criteria) this;
        }

        public Criteria andPartyNotLike(String value) {
            addCriterion("party not like", value, "party");
            return (Criteria) this;
        }

        public Criteria andPartyIn(List<String> values) {
            addCriterion("party in", values, "party");
            return (Criteria) this;
        }

        public Criteria andPartyNotIn(List<String> values) {
            addCriterion("party not in", values, "party");
            return (Criteria) this;
        }

        public Criteria andPartyBetween(String value1, String value2) {
            addCriterion("party between", value1, value2, "party");
            return (Criteria) this;
        }

        public Criteria andPartyNotBetween(String value1, String value2) {
            addCriterion("party not between", value1, value2, "party");
            return (Criteria) this;
        }

        public Criteria andFammlyIsNull() {
            addCriterion("fammly is null");
            return (Criteria) this;
        }

        public Criteria andFammlyIsNotNull() {
            addCriterion("fammly is not null");
            return (Criteria) this;
        }

        public Criteria andFammlyEqualTo(String value) {
            addCriterion("fammly =", value, "fammly");
            return (Criteria) this;
        }

        public Criteria andFammlyNotEqualTo(String value) {
            addCriterion("fammly <>", value, "fammly");
            return (Criteria) this;
        }

        public Criteria andFammlyGreaterThan(String value) {
            addCriterion("fammly >", value, "fammly");
            return (Criteria) this;
        }

        public Criteria andFammlyGreaterThanOrEqualTo(String value) {
            addCriterion("fammly >=", value, "fammly");
            return (Criteria) this;
        }

        public Criteria andFammlyLessThan(String value) {
            addCriterion("fammly <", value, "fammly");
            return (Criteria) this;
        }

        public Criteria andFammlyLessThanOrEqualTo(String value) {
            addCriterion("fammly <=", value, "fammly");
            return (Criteria) this;
        }

        public Criteria andFammlyLike(String value) {
            addCriterion("fammly like", value, "fammly");
            return (Criteria) this;
        }

        public Criteria andFammlyNotLike(String value) {
            addCriterion("fammly not like", value, "fammly");
            return (Criteria) this;
        }

        public Criteria andFammlyIn(List<String> values) {
            addCriterion("fammly in", values, "fammly");
            return (Criteria) this;
        }

        public Criteria andFammlyNotIn(List<String> values) {
            addCriterion("fammly not in", values, "fammly");
            return (Criteria) this;
        }

        public Criteria andFammlyBetween(String value1, String value2) {
            addCriterion("fammly between", value1, value2, "fammly");
            return (Criteria) this;
        }

        public Criteria andFammlyNotBetween(String value1, String value2) {
            addCriterion("fammly not between", value1, value2, "fammly");
            return (Criteria) this;
        }

        public Criteria andRoleIsNull() {
            addCriterion("role is null");
            return (Criteria) this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion("role is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEqualTo(String value) {
            addCriterion("role =", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(String value) {
            addCriterion("role <>", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(String value) {
            addCriterion("role >", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(String value) {
            addCriterion("role >=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(String value) {
            addCriterion("role <", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(String value) {
            addCriterion("role <=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLike(String value) {
            addCriterion("role like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotLike(String value) {
            addCriterion("role not like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<String> values) {
            addCriterion("role in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<String> values) {
            addCriterion("role not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(String value1, String value2) {
            addCriterion("role between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(String value1, String value2) {
            addCriterion("role not between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andTotalnumIsNull() {
            addCriterion("totalnum is null");
            return (Criteria) this;
        }

        public Criteria andTotalnumIsNotNull() {
            addCriterion("totalnum is not null");
            return (Criteria) this;
        }

        public Criteria andTotalnumEqualTo(Float value) {
            addCriterion("totalnum =", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumNotEqualTo(Float value) {
            addCriterion("totalnum <>", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumGreaterThan(Float value) {
            addCriterion("totalnum >", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumGreaterThanOrEqualTo(Float value) {
            addCriterion("totalnum >=", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumLessThan(Float value) {
            addCriterion("totalnum <", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumLessThanOrEqualTo(Float value) {
            addCriterion("totalnum <=", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumIn(List<Float> values) {
            addCriterion("totalnum in", values, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumNotIn(List<Float> values) {
            addCriterion("totalnum not in", values, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumBetween(Float value1, Float value2) {
            addCriterion("totalnum between", value1, value2, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumNotBetween(Float value1, Float value2) {
            addCriterion("totalnum not between", value1, value2, "totalnum");
            return (Criteria) this;
        }

        public Criteria andDynumIsNull() {
            addCriterion("dynum is null");
            return (Criteria) this;
        }

        public Criteria andDynumIsNotNull() {
            addCriterion("dynum is not null");
            return (Criteria) this;
        }

        public Criteria andDynumEqualTo(Float value) {
            addCriterion("dynum =", value, "dynum");
            return (Criteria) this;
        }

        public Criteria andDynumNotEqualTo(Float value) {
            addCriterion("dynum <>", value, "dynum");
            return (Criteria) this;
        }

        public Criteria andDynumGreaterThan(Float value) {
            addCriterion("dynum >", value, "dynum");
            return (Criteria) this;
        }

        public Criteria andDynumGreaterThanOrEqualTo(Float value) {
            addCriterion("dynum >=", value, "dynum");
            return (Criteria) this;
        }

        public Criteria andDynumLessThan(Float value) {
            addCriterion("dynum <", value, "dynum");
            return (Criteria) this;
        }

        public Criteria andDynumLessThanOrEqualTo(Float value) {
            addCriterion("dynum <=", value, "dynum");
            return (Criteria) this;
        }

        public Criteria andDynumIn(List<Float> values) {
            addCriterion("dynum in", values, "dynum");
            return (Criteria) this;
        }

        public Criteria andDynumNotIn(List<Float> values) {
            addCriterion("dynum not in", values, "dynum");
            return (Criteria) this;
        }

        public Criteria andDynumBetween(Float value1, Float value2) {
            addCriterion("dynum between", value1, value2, "dynum");
            return (Criteria) this;
        }

        public Criteria andDynumNotBetween(Float value1, Float value2) {
            addCriterion("dynum not between", value1, value2, "dynum");
            return (Criteria) this;
        }

        public Criteria andFammlynumIsNull() {
            addCriterion("fammlynum is null");
            return (Criteria) this;
        }

        public Criteria andFammlynumIsNotNull() {
            addCriterion("fammlynum is not null");
            return (Criteria) this;
        }

        public Criteria andFammlynumEqualTo(Float value) {
            addCriterion("fammlynum =", value, "fammlynum");
            return (Criteria) this;
        }

        public Criteria andFammlynumNotEqualTo(Float value) {
            addCriterion("fammlynum <>", value, "fammlynum");
            return (Criteria) this;
        }

        public Criteria andFammlynumGreaterThan(Float value) {
            addCriterion("fammlynum >", value, "fammlynum");
            return (Criteria) this;
        }

        public Criteria andFammlynumGreaterThanOrEqualTo(Float value) {
            addCriterion("fammlynum >=", value, "fammlynum");
            return (Criteria) this;
        }

        public Criteria andFammlynumLessThan(Float value) {
            addCriterion("fammlynum <", value, "fammlynum");
            return (Criteria) this;
        }

        public Criteria andFammlynumLessThanOrEqualTo(Float value) {
            addCriterion("fammlynum <=", value, "fammlynum");
            return (Criteria) this;
        }

        public Criteria andFammlynumIn(List<Float> values) {
            addCriterion("fammlynum in", values, "fammlynum");
            return (Criteria) this;
        }

        public Criteria andFammlynumNotIn(List<Float> values) {
            addCriterion("fammlynum not in", values, "fammlynum");
            return (Criteria) this;
        }

        public Criteria andFammlynumBetween(Float value1, Float value2) {
            addCriterion("fammlynum between", value1, value2, "fammlynum");
            return (Criteria) this;
        }

        public Criteria andFammlynumNotBetween(Float value1, Float value2) {
            addCriterion("fammlynum not between", value1, value2, "fammlynum");
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