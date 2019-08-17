package com.pdsu.stuManage.bean;

import java.util.ArrayList;
import java.util.List;

public class CurriculumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CurriculumExample() {
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

        public Criteria andCunatureIsNull() {
            addCriterion("cunature is null");
            return (Criteria) this;
        }

        public Criteria andCunatureIsNotNull() {
            addCriterion("cunature is not null");
            return (Criteria) this;
        }

        public Criteria andCunatureEqualTo(Integer value) {
            addCriterion("cunature =", value, "cunature");
            return (Criteria) this;
        }

        public Criteria andCunatureNotEqualTo(Integer value) {
            addCriterion("cunature <>", value, "cunature");
            return (Criteria) this;
        }

        public Criteria andCunatureGreaterThan(Integer value) {
            addCriterion("cunature >", value, "cunature");
            return (Criteria) this;
        }

        public Criteria andCunatureGreaterThanOrEqualTo(Integer value) {
            addCriterion("cunature >=", value, "cunature");
            return (Criteria) this;
        }

        public Criteria andCunatureLessThan(Integer value) {
            addCriterion("cunature <", value, "cunature");
            return (Criteria) this;
        }

        public Criteria andCunatureLessThanOrEqualTo(Integer value) {
            addCriterion("cunature <=", value, "cunature");
            return (Criteria) this;
        }

        public Criteria andCunatureIn(List<Integer> values) {
            addCriterion("cunature in", values, "cunature");
            return (Criteria) this;
        }

        public Criteria andCunatureNotIn(List<Integer> values) {
            addCriterion("cunature not in", values, "cunature");
            return (Criteria) this;
        }

        public Criteria andCunatureBetween(Integer value1, Integer value2) {
            addCriterion("cunature between", value1, value2, "cunature");
            return (Criteria) this;
        }

        public Criteria andCunatureNotBetween(Integer value1, Integer value2) {
            addCriterion("cunature not between", value1, value2, "cunature");
            return (Criteria) this;
        }

        public Criteria andCunameIsNull() {
            addCriterion("cuname is null");
            return (Criteria) this;
        }

        public Criteria andCunameIsNotNull() {
            addCriterion("cuname is not null");
            return (Criteria) this;
        }

        public Criteria andCunameEqualTo(String value) {
            addCriterion("cuname =", value, "cuname");
            return (Criteria) this;
        }

        public Criteria andCunameNotEqualTo(String value) {
            addCriterion("cuname <>", value, "cuname");
            return (Criteria) this;
        }

        public Criteria andCunameGreaterThan(String value) {
            addCriterion("cuname >", value, "cuname");
            return (Criteria) this;
        }

        public Criteria andCunameGreaterThanOrEqualTo(String value) {
            addCriterion("cuname >=", value, "cuname");
            return (Criteria) this;
        }

        public Criteria andCunameLessThan(String value) {
            addCriterion("cuname <", value, "cuname");
            return (Criteria) this;
        }

        public Criteria andCunameLessThanOrEqualTo(String value) {
            addCriterion("cuname <=", value, "cuname");
            return (Criteria) this;
        }

        public Criteria andCunameLike(String value) {
            addCriterion("cuname like", value, "cuname");
            return (Criteria) this;
        }

        public Criteria andCunameNotLike(String value) {
            addCriterion("cuname not like", value, "cuname");
            return (Criteria) this;
        }

        public Criteria andCunameIn(List<String> values) {
            addCriterion("cuname in", values, "cuname");
            return (Criteria) this;
        }

        public Criteria andCunameNotIn(List<String> values) {
            addCriterion("cuname not in", values, "cuname");
            return (Criteria) this;
        }

        public Criteria andCunameBetween(String value1, String value2) {
            addCriterion("cuname between", value1, value2, "cuname");
            return (Criteria) this;
        }

        public Criteria andCunameNotBetween(String value1, String value2) {
            addCriterion("cuname not between", value1, value2, "cuname");
            return (Criteria) this;
        }

        public Criteria andCuscoreIsNull() {
            addCriterion("cuscore is null");
            return (Criteria) this;
        }

        public Criteria andCuscoreIsNotNull() {
            addCriterion("cuscore is not null");
            return (Criteria) this;
        }

        public Criteria andCuscoreEqualTo(Integer value) {
            addCriterion("cuscore =", value, "cuscore");
            return (Criteria) this;
        }

        public Criteria andCuscoreNotEqualTo(Integer value) {
            addCriterion("cuscore <>", value, "cuscore");
            return (Criteria) this;
        }

        public Criteria andCuscoreGreaterThan(Integer value) {
            addCriterion("cuscore >", value, "cuscore");
            return (Criteria) this;
        }

        public Criteria andCuscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("cuscore >=", value, "cuscore");
            return (Criteria) this;
        }

        public Criteria andCuscoreLessThan(Integer value) {
            addCriterion("cuscore <", value, "cuscore");
            return (Criteria) this;
        }

        public Criteria andCuscoreLessThanOrEqualTo(Integer value) {
            addCriterion("cuscore <=", value, "cuscore");
            return (Criteria) this;
        }

        public Criteria andCuscoreIn(List<Integer> values) {
            addCriterion("cuscore in", values, "cuscore");
            return (Criteria) this;
        }

        public Criteria andCuscoreNotIn(List<Integer> values) {
            addCriterion("cuscore not in", values, "cuscore");
            return (Criteria) this;
        }

        public Criteria andCuscoreBetween(Integer value1, Integer value2) {
            addCriterion("cuscore between", value1, value2, "cuscore");
            return (Criteria) this;
        }

        public Criteria andCuscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("cuscore not between", value1, value2, "cuscore");
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