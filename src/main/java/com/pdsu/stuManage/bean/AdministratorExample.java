package com.pdsu.stuManage.bean;

import java.util.ArrayList;
import java.util.List;

public class AdministratorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdministratorExample() {
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

        public Criteria andAidIsNull() {
            addCriterion("aid is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("aid is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(String value) {
            addCriterion("aid =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(String value) {
            addCriterion("aid <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(String value) {
            addCriterion("aid >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(String value) {
            addCriterion("aid >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(String value) {
            addCriterion("aid <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(String value) {
            addCriterion("aid <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLike(String value) {
            addCriterion("aid like", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotLike(String value) {
            addCriterion("aid not like", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<String> values) {
            addCriterion("aid in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<String> values) {
            addCriterion("aid not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(String value1, String value2) {
            addCriterion("aid between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(String value1, String value2) {
            addCriterion("aid not between", value1, value2, "aid");
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

        public Criteria andAnumIsNull() {
            addCriterion("anum is null");
            return (Criteria) this;
        }

        public Criteria andAnumIsNotNull() {
            addCriterion("anum is not null");
            return (Criteria) this;
        }

        public Criteria andAnumEqualTo(Integer value) {
            addCriterion("anum =", value, "anum");
            return (Criteria) this;
        }

        public Criteria andAnumNotEqualTo(Integer value) {
            addCriterion("anum <>", value, "anum");
            return (Criteria) this;
        }

        public Criteria andAnumGreaterThan(Integer value) {
            addCriterion("anum >", value, "anum");
            return (Criteria) this;
        }

        public Criteria andAnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("anum >=", value, "anum");
            return (Criteria) this;
        }

        public Criteria andAnumLessThan(Integer value) {
            addCriterion("anum <", value, "anum");
            return (Criteria) this;
        }

        public Criteria andAnumLessThanOrEqualTo(Integer value) {
            addCriterion("anum <=", value, "anum");
            return (Criteria) this;
        }

        public Criteria andAnumIn(List<Integer> values) {
            addCriterion("anum in", values, "anum");
            return (Criteria) this;
        }

        public Criteria andAnumNotIn(List<Integer> values) {
            addCriterion("anum not in", values, "anum");
            return (Criteria) this;
        }

        public Criteria andAnumBetween(Integer value1, Integer value2) {
            addCriterion("anum between", value1, value2, "anum");
            return (Criteria) this;
        }

        public Criteria andAnumNotBetween(Integer value1, Integer value2) {
            addCriterion("anum not between", value1, value2, "anum");
            return (Criteria) this;
        }

        public Criteria andAimageIsNull() {
            addCriterion("aimage is null");
            return (Criteria) this;
        }

        public Criteria andAimageIsNotNull() {
            addCriterion("aimage is not null");
            return (Criteria) this;
        }

        public Criteria andAimageEqualTo(String value) {
            addCriterion("aimage =", value, "aimage");
            return (Criteria) this;
        }

        public Criteria andAimageNotEqualTo(String value) {
            addCriterion("aimage <>", value, "aimage");
            return (Criteria) this;
        }

        public Criteria andAimageGreaterThan(String value) {
            addCriterion("aimage >", value, "aimage");
            return (Criteria) this;
        }

        public Criteria andAimageGreaterThanOrEqualTo(String value) {
            addCriterion("aimage >=", value, "aimage");
            return (Criteria) this;
        }

        public Criteria andAimageLessThan(String value) {
            addCriterion("aimage <", value, "aimage");
            return (Criteria) this;
        }

        public Criteria andAimageLessThanOrEqualTo(String value) {
            addCriterion("aimage <=", value, "aimage");
            return (Criteria) this;
        }

        public Criteria andAimageLike(String value) {
            addCriterion("aimage like", value, "aimage");
            return (Criteria) this;
        }

        public Criteria andAimageNotLike(String value) {
            addCriterion("aimage not like", value, "aimage");
            return (Criteria) this;
        }

        public Criteria andAimageIn(List<String> values) {
            addCriterion("aimage in", values, "aimage");
            return (Criteria) this;
        }

        public Criteria andAimageNotIn(List<String> values) {
            addCriterion("aimage not in", values, "aimage");
            return (Criteria) this;
        }

        public Criteria andAimageBetween(String value1, String value2) {
            addCriterion("aimage between", value1, value2, "aimage");
            return (Criteria) this;
        }

        public Criteria andAimageNotBetween(String value1, String value2) {
            addCriterion("aimage not between", value1, value2, "aimage");
            return (Criteria) this;
        }

        public Criteria andAcollageIsNull() {
            addCriterion("acollage is null");
            return (Criteria) this;
        }

        public Criteria andAcollageIsNotNull() {
            addCriterion("acollage is not null");
            return (Criteria) this;
        }

        public Criteria andAcollageEqualTo(String value) {
            addCriterion("acollage =", value, "acollage");
            return (Criteria) this;
        }

        public Criteria andAcollageNotEqualTo(String value) {
            addCriterion("acollage <>", value, "acollage");
            return (Criteria) this;
        }

        public Criteria andAcollageGreaterThan(String value) {
            addCriterion("acollage >", value, "acollage");
            return (Criteria) this;
        }

        public Criteria andAcollageGreaterThanOrEqualTo(String value) {
            addCriterion("acollage >=", value, "acollage");
            return (Criteria) this;
        }

        public Criteria andAcollageLessThan(String value) {
            addCriterion("acollage <", value, "acollage");
            return (Criteria) this;
        }

        public Criteria andAcollageLessThanOrEqualTo(String value) {
            addCriterion("acollage <=", value, "acollage");
            return (Criteria) this;
        }

        public Criteria andAcollageLike(String value) {
            addCriterion("acollage like", value, "acollage");
            return (Criteria) this;
        }

        public Criteria andAcollageNotLike(String value) {
            addCriterion("acollage not like", value, "acollage");
            return (Criteria) this;
        }

        public Criteria andAcollageIn(List<String> values) {
            addCriterion("acollage in", values, "acollage");
            return (Criteria) this;
        }

        public Criteria andAcollageNotIn(List<String> values) {
            addCriterion("acollage not in", values, "acollage");
            return (Criteria) this;
        }

        public Criteria andAcollageBetween(String value1, String value2) {
            addCriterion("acollage between", value1, value2, "acollage");
            return (Criteria) this;
        }

        public Criteria andAcollageNotBetween(String value1, String value2) {
            addCriterion("acollage not between", value1, value2, "acollage");
            return (Criteria) this;
        }

        public Criteria andApwdIsNull() {
            addCriterion("apwd is null");
            return (Criteria) this;
        }

        public Criteria andApwdIsNotNull() {
            addCriterion("apwd is not null");
            return (Criteria) this;
        }

        public Criteria andApwdEqualTo(String value) {
            addCriterion("apwd =", value, "apwd");
            return (Criteria) this;
        }

        public Criteria andApwdNotEqualTo(String value) {
            addCriterion("apwd <>", value, "apwd");
            return (Criteria) this;
        }

        public Criteria andApwdGreaterThan(String value) {
            addCriterion("apwd >", value, "apwd");
            return (Criteria) this;
        }

        public Criteria andApwdGreaterThanOrEqualTo(String value) {
            addCriterion("apwd >=", value, "apwd");
            return (Criteria) this;
        }

        public Criteria andApwdLessThan(String value) {
            addCriterion("apwd <", value, "apwd");
            return (Criteria) this;
        }

        public Criteria andApwdLessThanOrEqualTo(String value) {
            addCriterion("apwd <=", value, "apwd");
            return (Criteria) this;
        }

        public Criteria andApwdLike(String value) {
            addCriterion("apwd like", value, "apwd");
            return (Criteria) this;
        }

        public Criteria andApwdNotLike(String value) {
            addCriterion("apwd not like", value, "apwd");
            return (Criteria) this;
        }

        public Criteria andApwdIn(List<String> values) {
            addCriterion("apwd in", values, "apwd");
            return (Criteria) this;
        }

        public Criteria andApwdNotIn(List<String> values) {
            addCriterion("apwd not in", values, "apwd");
            return (Criteria) this;
        }

        public Criteria andApwdBetween(String value1, String value2) {
            addCriterion("apwd between", value1, value2, "apwd");
            return (Criteria) this;
        }

        public Criteria andApwdNotBetween(String value1, String value2) {
            addCriterion("apwd not between", value1, value2, "apwd");
            return (Criteria) this;
        }

        public Criteria andAnameIsNull() {
            addCriterion("aname is null");
            return (Criteria) this;
        }

        public Criteria andAnameIsNotNull() {
            addCriterion("aname is not null");
            return (Criteria) this;
        }

        public Criteria andAnameEqualTo(String value) {
            addCriterion("aname =", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotEqualTo(String value) {
            addCriterion("aname <>", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameGreaterThan(String value) {
            addCriterion("aname >", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameGreaterThanOrEqualTo(String value) {
            addCriterion("aname >=", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLessThan(String value) {
            addCriterion("aname <", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLessThanOrEqualTo(String value) {
            addCriterion("aname <=", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLike(String value) {
            addCriterion("aname like", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotLike(String value) {
            addCriterion("aname not like", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameIn(List<String> values) {
            addCriterion("aname in", values, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotIn(List<String> values) {
            addCriterion("aname not in", values, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameBetween(String value1, String value2) {
            addCriterion("aname between", value1, value2, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotBetween(String value1, String value2) {
            addCriterion("aname not between", value1, value2, "aname");
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