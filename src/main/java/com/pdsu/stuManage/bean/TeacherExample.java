package com.pdsu.stuManage.bean;

import java.util.ArrayList;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andTnameIsNull() {
            addCriterion("tname is null");
            return (Criteria) this;
        }

        public Criteria andTnameIsNotNull() {
            addCriterion("tname is not null");
            return (Criteria) this;
        }

        public Criteria andTnameEqualTo(String value) {
            addCriterion("tname =", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotEqualTo(String value) {
            addCriterion("tname <>", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameGreaterThan(String value) {
            addCriterion("tname >", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameGreaterThanOrEqualTo(String value) {
            addCriterion("tname >=", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLessThan(String value) {
            addCriterion("tname <", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLessThanOrEqualTo(String value) {
            addCriterion("tname <=", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLike(String value) {
            addCriterion("tname like", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotLike(String value) {
            addCriterion("tname not like", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameIn(List<String> values) {
            addCriterion("tname in", values, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotIn(List<String> values) {
            addCriterion("tname not in", values, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameBetween(String value1, String value2) {
            addCriterion("tname between", value1, value2, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotBetween(String value1, String value2) {
            addCriterion("tname not between", value1, value2, "tname");
            return (Criteria) this;
        }

        public Criteria andIdentityIsNull() {
            addCriterion("identity is null");
            return (Criteria) this;
        }

        public Criteria andIdentityIsNotNull() {
            addCriterion("identity is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityEqualTo(Integer value) {
            addCriterion("identity =", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotEqualTo(Integer value) {
            addCriterion("identity <>", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityGreaterThan(Integer value) {
            addCriterion("identity >", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityGreaterThanOrEqualTo(Integer value) {
            addCriterion("identity >=", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLessThan(Integer value) {
            addCriterion("identity <", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLessThanOrEqualTo(Integer value) {
            addCriterion("identity <=", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityIn(List<Integer> values) {
            addCriterion("identity in", values, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotIn(List<Integer> values) {
            addCriterion("identity not in", values, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityBetween(Integer value1, Integer value2) {
            addCriterion("identity between", value1, value2, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotBetween(Integer value1, Integer value2) {
            addCriterion("identity not between", value1, value2, "identity");
            return (Criteria) this;
        }

        public Criteria andTsexIsNull() {
            addCriterion("tsex is null");
            return (Criteria) this;
        }

        public Criteria andTsexIsNotNull() {
            addCriterion("tsex is not null");
            return (Criteria) this;
        }

        public Criteria andTsexEqualTo(Integer value) {
            addCriterion("tsex =", value, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexNotEqualTo(Integer value) {
            addCriterion("tsex <>", value, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexGreaterThan(Integer value) {
            addCriterion("tsex >", value, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexGreaterThanOrEqualTo(Integer value) {
            addCriterion("tsex >=", value, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexLessThan(Integer value) {
            addCriterion("tsex <", value, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexLessThanOrEqualTo(Integer value) {
            addCriterion("tsex <=", value, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexIn(List<Integer> values) {
            addCriterion("tsex in", values, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexNotIn(List<Integer> values) {
            addCriterion("tsex not in", values, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexBetween(Integer value1, Integer value2) {
            addCriterion("tsex between", value1, value2, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexNotBetween(Integer value1, Integer value2) {
            addCriterion("tsex not between", value1, value2, "tsex");
            return (Criteria) this;
        }

        public Criteria andTimageIsNull() {
            addCriterion("timage is null");
            return (Criteria) this;
        }

        public Criteria andTimageIsNotNull() {
            addCriterion("timage is not null");
            return (Criteria) this;
        }

        public Criteria andTimageEqualTo(String value) {
            addCriterion("timage =", value, "timage");
            return (Criteria) this;
        }

        public Criteria andTimageNotEqualTo(String value) {
            addCriterion("timage <>", value, "timage");
            return (Criteria) this;
        }

        public Criteria andTimageGreaterThan(String value) {
            addCriterion("timage >", value, "timage");
            return (Criteria) this;
        }

        public Criteria andTimageGreaterThanOrEqualTo(String value) {
            addCriterion("timage >=", value, "timage");
            return (Criteria) this;
        }

        public Criteria andTimageLessThan(String value) {
            addCriterion("timage <", value, "timage");
            return (Criteria) this;
        }

        public Criteria andTimageLessThanOrEqualTo(String value) {
            addCriterion("timage <=", value, "timage");
            return (Criteria) this;
        }

        public Criteria andTimageLike(String value) {
            addCriterion("timage like", value, "timage");
            return (Criteria) this;
        }

        public Criteria andTimageNotLike(String value) {
            addCriterion("timage not like", value, "timage");
            return (Criteria) this;
        }

        public Criteria andTimageIn(List<String> values) {
            addCriterion("timage in", values, "timage");
            return (Criteria) this;
        }

        public Criteria andTimageNotIn(List<String> values) {
            addCriterion("timage not in", values, "timage");
            return (Criteria) this;
        }

        public Criteria andTimageBetween(String value1, String value2) {
            addCriterion("timage between", value1, value2, "timage");
            return (Criteria) this;
        }

        public Criteria andTimageNotBetween(String value1, String value2) {
            addCriterion("timage not between", value1, value2, "timage");
            return (Criteria) this;
        }

        public Criteria andTphoneIsNull() {
            addCriterion("tphone is null");
            return (Criteria) this;
        }

        public Criteria andTphoneIsNotNull() {
            addCriterion("tphone is not null");
            return (Criteria) this;
        }

        public Criteria andTphoneEqualTo(String value) {
            addCriterion("tphone =", value, "tphone");
            return (Criteria) this;
        }

        public Criteria andTphoneNotEqualTo(String value) {
            addCriterion("tphone <>", value, "tphone");
            return (Criteria) this;
        }

        public Criteria andTphoneGreaterThan(String value) {
            addCriterion("tphone >", value, "tphone");
            return (Criteria) this;
        }

        public Criteria andTphoneGreaterThanOrEqualTo(String value) {
            addCriterion("tphone >=", value, "tphone");
            return (Criteria) this;
        }

        public Criteria andTphoneLessThan(String value) {
            addCriterion("tphone <", value, "tphone");
            return (Criteria) this;
        }

        public Criteria andTphoneLessThanOrEqualTo(String value) {
            addCriterion("tphone <=", value, "tphone");
            return (Criteria) this;
        }

        public Criteria andTphoneLike(String value) {
            addCriterion("tphone like", value, "tphone");
            return (Criteria) this;
        }

        public Criteria andTphoneNotLike(String value) {
            addCriterion("tphone not like", value, "tphone");
            return (Criteria) this;
        }

        public Criteria andTphoneIn(List<String> values) {
            addCriterion("tphone in", values, "tphone");
            return (Criteria) this;
        }

        public Criteria andTphoneNotIn(List<String> values) {
            addCriterion("tphone not in", values, "tphone");
            return (Criteria) this;
        }

        public Criteria andTphoneBetween(String value1, String value2) {
            addCriterion("tphone between", value1, value2, "tphone");
            return (Criteria) this;
        }

        public Criteria andTphoneNotBetween(String value1, String value2) {
            addCriterion("tphone not between", value1, value2, "tphone");
            return (Criteria) this;
        }

        public Criteria andTpwdIsNull() {
            addCriterion("tpwd is null");
            return (Criteria) this;
        }

        public Criteria andTpwdIsNotNull() {
            addCriterion("tpwd is not null");
            return (Criteria) this;
        }

        public Criteria andTpwdEqualTo(String value) {
            addCriterion("tpwd =", value, "tpwd");
            return (Criteria) this;
        }

        public Criteria andTpwdNotEqualTo(String value) {
            addCriterion("tpwd <>", value, "tpwd");
            return (Criteria) this;
        }

        public Criteria andTpwdGreaterThan(String value) {
            addCriterion("tpwd >", value, "tpwd");
            return (Criteria) this;
        }

        public Criteria andTpwdGreaterThanOrEqualTo(String value) {
            addCriterion("tpwd >=", value, "tpwd");
            return (Criteria) this;
        }

        public Criteria andTpwdLessThan(String value) {
            addCriterion("tpwd <", value, "tpwd");
            return (Criteria) this;
        }

        public Criteria andTpwdLessThanOrEqualTo(String value) {
            addCriterion("tpwd <=", value, "tpwd");
            return (Criteria) this;
        }

        public Criteria andTpwdLike(String value) {
            addCriterion("tpwd like", value, "tpwd");
            return (Criteria) this;
        }

        public Criteria andTpwdNotLike(String value) {
            addCriterion("tpwd not like", value, "tpwd");
            return (Criteria) this;
        }

        public Criteria andTpwdIn(List<String> values) {
            addCriterion("tpwd in", values, "tpwd");
            return (Criteria) this;
        }

        public Criteria andTpwdNotIn(List<String> values) {
            addCriterion("tpwd not in", values, "tpwd");
            return (Criteria) this;
        }

        public Criteria andTpwdBetween(String value1, String value2) {
            addCriterion("tpwd between", value1, value2, "tpwd");
            return (Criteria) this;
        }

        public Criteria andTpwdNotBetween(String value1, String value2) {
            addCriterion("tpwd not between", value1, value2, "tpwd");
            return (Criteria) this;
        }

        public Criteria andTscoreIsNull() {
            addCriterion("tscore is null");
            return (Criteria) this;
        }

        public Criteria andTscoreIsNotNull() {
            addCriterion("tscore is not null");
            return (Criteria) this;
        }

        public Criteria andTscoreEqualTo(Integer value) {
            addCriterion("tscore =", value, "tscore");
            return (Criteria) this;
        }

        public Criteria andTscoreNotEqualTo(Integer value) {
            addCriterion("tscore <>", value, "tscore");
            return (Criteria) this;
        }

        public Criteria andTscoreGreaterThan(Integer value) {
            addCriterion("tscore >", value, "tscore");
            return (Criteria) this;
        }

        public Criteria andTscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("tscore >=", value, "tscore");
            return (Criteria) this;
        }

        public Criteria andTscoreLessThan(Integer value) {
            addCriterion("tscore <", value, "tscore");
            return (Criteria) this;
        }

        public Criteria andTscoreLessThanOrEqualTo(Integer value) {
            addCriterion("tscore <=", value, "tscore");
            return (Criteria) this;
        }

        public Criteria andTscoreIn(List<Integer> values) {
            addCriterion("tscore in", values, "tscore");
            return (Criteria) this;
        }

        public Criteria andTscoreNotIn(List<Integer> values) {
            addCriterion("tscore not in", values, "tscore");
            return (Criteria) this;
        }

        public Criteria andTscoreBetween(Integer value1, Integer value2) {
            addCriterion("tscore between", value1, value2, "tscore");
            return (Criteria) this;
        }

        public Criteria andTscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("tscore not between", value1, value2, "tscore");
            return (Criteria) this;
        }

        public Criteria andSaltIsNull() {
            addCriterion("salt is null");
            return (Criteria) this;
        }

        public Criteria andSaltIsNotNull() {
            addCriterion("salt is not null");
            return (Criteria) this;
        }

        public Criteria andSaltEqualTo(String value) {
            addCriterion("salt =", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotEqualTo(String value) {
            addCriterion("salt <>", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThan(String value) {
            addCriterion("salt >", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThanOrEqualTo(String value) {
            addCriterion("salt >=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThan(String value) {
            addCriterion("salt <", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThanOrEqualTo(String value) {
            addCriterion("salt <=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLike(String value) {
            addCriterion("salt like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotLike(String value) {
            addCriterion("salt not like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltIn(List<String> values) {
            addCriterion("salt in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotIn(List<String> values) {
            addCriterion("salt not in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltBetween(String value1, String value2) {
            addCriterion("salt between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotBetween(String value1, String value2) {
            addCriterion("salt not between", value1, value2, "salt");
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