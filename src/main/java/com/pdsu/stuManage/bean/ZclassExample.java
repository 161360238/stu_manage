package com.pdsu.stuManage.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZclassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZclassExample() {
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

        public Criteria andZcodeIsNull() {
            addCriterion("zcode is null");
            return (Criteria) this;
        }

        public Criteria andZcodeIsNotNull() {
            addCriterion("zcode is not null");
            return (Criteria) this;
        }

        public Criteria andZcodeEqualTo(String value) {
            addCriterion("zcode =", value, "zcode");
            return (Criteria) this;
        }

        public Criteria andZcodeNotEqualTo(String value) {
            addCriterion("zcode <>", value, "zcode");
            return (Criteria) this;
        }

        public Criteria andZcodeGreaterThan(String value) {
            addCriterion("zcode >", value, "zcode");
            return (Criteria) this;
        }

        public Criteria andZcodeGreaterThanOrEqualTo(String value) {
            addCriterion("zcode >=", value, "zcode");
            return (Criteria) this;
        }

        public Criteria andZcodeLessThan(String value) {
            addCriterion("zcode <", value, "zcode");
            return (Criteria) this;
        }

        public Criteria andZcodeLessThanOrEqualTo(String value) {
            addCriterion("zcode <=", value, "zcode");
            return (Criteria) this;
        }

        public Criteria andZcodeLike(String value) {
            addCriterion("zcode like", value, "zcode");
            return (Criteria) this;
        }

        public Criteria andZcodeNotLike(String value) {
            addCriterion("zcode not like", value, "zcode");
            return (Criteria) this;
        }

        public Criteria andZcodeIn(List<String> values) {
            addCriterion("zcode in", values, "zcode");
            return (Criteria) this;
        }

        public Criteria andZcodeNotIn(List<String> values) {
            addCriterion("zcode not in", values, "zcode");
            return (Criteria) this;
        }

        public Criteria andZcodeBetween(String value1, String value2) {
            addCriterion("zcode between", value1, value2, "zcode");
            return (Criteria) this;
        }

        public Criteria andZcodeNotBetween(String value1, String value2) {
            addCriterion("zcode not between", value1, value2, "zcode");
            return (Criteria) this;
        }

        public Criteria andZcnameIsNull() {
            addCriterion("zcname is null");
            return (Criteria) this;
        }

        public Criteria andZcnameIsNotNull() {
            addCriterion("zcname is not null");
            return (Criteria) this;
        }

        public Criteria andZcnameEqualTo(String value) {
            addCriterion("zcname =", value, "zcname");
            return (Criteria) this;
        }

        public Criteria andZcnameNotEqualTo(String value) {
            addCriterion("zcname <>", value, "zcname");
            return (Criteria) this;
        }

        public Criteria andZcnameGreaterThan(String value) {
            addCriterion("zcname >", value, "zcname");
            return (Criteria) this;
        }

        public Criteria andZcnameGreaterThanOrEqualTo(String value) {
            addCriterion("zcname >=", value, "zcname");
            return (Criteria) this;
        }

        public Criteria andZcnameLessThan(String value) {
            addCriterion("zcname <", value, "zcname");
            return (Criteria) this;
        }

        public Criteria andZcnameLessThanOrEqualTo(String value) {
            addCriterion("zcname <=", value, "zcname");
            return (Criteria) this;
        }

        public Criteria andZcnameLike(String value) {
            addCriterion("zcname like", value, "zcname");
            return (Criteria) this;
        }

        public Criteria andZcnameNotLike(String value) {
            addCriterion("zcname not like", value, "zcname");
            return (Criteria) this;
        }

        public Criteria andZcnameIn(List<String> values) {
            addCriterion("zcname in", values, "zcname");
            return (Criteria) this;
        }

        public Criteria andZcnameNotIn(List<String> values) {
            addCriterion("zcname not in", values, "zcname");
            return (Criteria) this;
        }

        public Criteria andZcnameBetween(String value1, String value2) {
            addCriterion("zcname between", value1, value2, "zcname");
            return (Criteria) this;
        }

        public Criteria andZcnameNotBetween(String value1, String value2) {
            addCriterion("zcname not between", value1, value2, "zcname");
            return (Criteria) this;
        }

        public Criteria andZctimeIsNull() {
            addCriterion("zctime is null");
            return (Criteria) this;
        }

        public Criteria andZctimeIsNotNull() {
            addCriterion("zctime is not null");
            return (Criteria) this;
        }

        public Criteria andZctimeEqualTo(Date value) {
            addCriterion("zctime =", value, "zctime");
            return (Criteria) this;
        }

        public Criteria andZctimeNotEqualTo(Date value) {
            addCriterion("zctime <>", value, "zctime");
            return (Criteria) this;
        }

        public Criteria andZctimeGreaterThan(Date value) {
            addCriterion("zctime >", value, "zctime");
            return (Criteria) this;
        }

        public Criteria andZctimeGreaterThanOrEqualTo(Date value) {
            addCriterion("zctime >=", value, "zctime");
            return (Criteria) this;
        }

        public Criteria andZctimeLessThan(Date value) {
            addCriterion("zctime <", value, "zctime");
            return (Criteria) this;
        }

        public Criteria andZctimeLessThanOrEqualTo(Date value) {
            addCriterion("zctime <=", value, "zctime");
            return (Criteria) this;
        }

        public Criteria andZctimeIn(List<Date> values) {
            addCriterion("zctime in", values, "zctime");
            return (Criteria) this;
        }

        public Criteria andZctimeNotIn(List<Date> values) {
            addCriterion("zctime not in", values, "zctime");
            return (Criteria) this;
        }

        public Criteria andZctimeBetween(Date value1, Date value2) {
            addCriterion("zctime between", value1, value2, "zctime");
            return (Criteria) this;
        }

        public Criteria andZctimeNotBetween(Date value1, Date value2) {
            addCriterion("zctime not between", value1, value2, "zctime");
            return (Criteria) this;
        }

        public Criteria andZcstatueIsNull() {
            addCriterion("zcstatue is null");
            return (Criteria) this;
        }

        public Criteria andZcstatueIsNotNull() {
            addCriterion("zcstatue is not null");
            return (Criteria) this;
        }

        public Criteria andZcstatueEqualTo(Integer value) {
            addCriterion("zcstatue =", value, "zcstatue");
            return (Criteria) this;
        }

        public Criteria andZcstatueNotEqualTo(Integer value) {
            addCriterion("zcstatue <>", value, "zcstatue");
            return (Criteria) this;
        }

        public Criteria andZcstatueGreaterThan(Integer value) {
            addCriterion("zcstatue >", value, "zcstatue");
            return (Criteria) this;
        }

        public Criteria andZcstatueGreaterThanOrEqualTo(Integer value) {
            addCriterion("zcstatue >=", value, "zcstatue");
            return (Criteria) this;
        }

        public Criteria andZcstatueLessThan(Integer value) {
            addCriterion("zcstatue <", value, "zcstatue");
            return (Criteria) this;
        }

        public Criteria andZcstatueLessThanOrEqualTo(Integer value) {
            addCriterion("zcstatue <=", value, "zcstatue");
            return (Criteria) this;
        }

        public Criteria andZcstatueIn(List<Integer> values) {
            addCriterion("zcstatue in", values, "zcstatue");
            return (Criteria) this;
        }

        public Criteria andZcstatueNotIn(List<Integer> values) {
            addCriterion("zcstatue not in", values, "zcstatue");
            return (Criteria) this;
        }

        public Criteria andZcstatueBetween(Integer value1, Integer value2) {
            addCriterion("zcstatue between", value1, value2, "zcstatue");
            return (Criteria) this;
        }

        public Criteria andZcstatueNotBetween(Integer value1, Integer value2) {
            addCriterion("zcstatue not between", value1, value2, "zcstatue");
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