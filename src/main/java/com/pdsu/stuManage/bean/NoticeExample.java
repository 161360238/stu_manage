package com.pdsu.stuManage.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NoticeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NoticeExample() {
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

        public Criteria andNidIsNull() {
            addCriterion("nid is null");
            return (Criteria) this;
        }

        public Criteria andNidIsNotNull() {
            addCriterion("nid is not null");
            return (Criteria) this;
        }

        public Criteria andNidEqualTo(String value) {
            addCriterion("nid =", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotEqualTo(String value) {
            addCriterion("nid <>", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThan(String value) {
            addCriterion("nid >", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThanOrEqualTo(String value) {
            addCriterion("nid >=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThan(String value) {
            addCriterion("nid <", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThanOrEqualTo(String value) {
            addCriterion("nid <=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLike(String value) {
            addCriterion("nid like", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotLike(String value) {
            addCriterion("nid not like", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidIn(List<String> values) {
            addCriterion("nid in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotIn(List<String> values) {
            addCriterion("nid not in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidBetween(String value1, String value2) {
            addCriterion("nid between", value1, value2, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotBetween(String value1, String value2) {
            addCriterion("nid not between", value1, value2, "nid");
            return (Criteria) this;
        }

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(String value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(String value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(String value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(String value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(String value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(String value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLike(String value) {
            addCriterion("oid like", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotLike(String value) {
            addCriterion("oid not like", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<String> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<String> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(String value1, String value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(String value1, String value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andBtimeIsNull() {
            addCriterion("btime is null");
            return (Criteria) this;
        }

        public Criteria andBtimeIsNotNull() {
            addCriterion("btime is not null");
            return (Criteria) this;
        }

        public Criteria andBtimeEqualTo(Date value) {
            addCriterion("btime =", value, "btime");
            return (Criteria) this;
        }

        public Criteria andBtimeNotEqualTo(Date value) {
            addCriterion("btime <>", value, "btime");
            return (Criteria) this;
        }

        public Criteria andBtimeGreaterThan(Date value) {
            addCriterion("btime >", value, "btime");
            return (Criteria) this;
        }

        public Criteria andBtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("btime >=", value, "btime");
            return (Criteria) this;
        }

        public Criteria andBtimeLessThan(Date value) {
            addCriterion("btime <", value, "btime");
            return (Criteria) this;
        }

        public Criteria andBtimeLessThanOrEqualTo(Date value) {
            addCriterion("btime <=", value, "btime");
            return (Criteria) this;
        }

        public Criteria andBtimeIn(List<Date> values) {
            addCriterion("btime in", values, "btime");
            return (Criteria) this;
        }

        public Criteria andBtimeNotIn(List<Date> values) {
            addCriterion("btime not in", values, "btime");
            return (Criteria) this;
        }

        public Criteria andBtimeBetween(Date value1, Date value2) {
            addCriterion("btime between", value1, value2, "btime");
            return (Criteria) this;
        }

        public Criteria andBtimeNotBetween(Date value1, Date value2) {
            addCriterion("btime not between", value1, value2, "btime");
            return (Criteria) this;
        }

        public Criteria andEtimeIsNull() {
            addCriterion("etime is null");
            return (Criteria) this;
        }

        public Criteria andEtimeIsNotNull() {
            addCriterion("etime is not null");
            return (Criteria) this;
        }

        public Criteria andEtimeEqualTo(Date value) {
            addCriterion("etime =", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeNotEqualTo(Date value) {
            addCriterion("etime <>", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeGreaterThan(Date value) {
            addCriterion("etime >", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("etime >=", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeLessThan(Date value) {
            addCriterion("etime <", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeLessThanOrEqualTo(Date value) {
            addCriterion("etime <=", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeIn(List<Date> values) {
            addCriterion("etime in", values, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeNotIn(List<Date> values) {
            addCriterion("etime not in", values, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeBetween(Date value1, Date value2) {
            addCriterion("etime between", value1, value2, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeNotBetween(Date value1, Date value2) {
            addCriterion("etime not between", value1, value2, "etime");
            return (Criteria) this;
        }

        public Criteria andNrangeIsNull() {
            addCriterion("nrange is null");
            return (Criteria) this;
        }

        public Criteria andNrangeIsNotNull() {
            addCriterion("nrange is not null");
            return (Criteria) this;
        }

        public Criteria andNrangeEqualTo(Integer value) {
            addCriterion("nrange =", value, "nrange");
            return (Criteria) this;
        }

        public Criteria andNrangeNotEqualTo(Integer value) {
            addCriterion("nrange <>", value, "nrange");
            return (Criteria) this;
        }

        public Criteria andNrangeGreaterThan(Integer value) {
            addCriterion("nrange >", value, "nrange");
            return (Criteria) this;
        }

        public Criteria andNrangeGreaterThanOrEqualTo(Integer value) {
            addCriterion("nrange >=", value, "nrange");
            return (Criteria) this;
        }

        public Criteria andNrangeLessThan(Integer value) {
            addCriterion("nrange <", value, "nrange");
            return (Criteria) this;
        }

        public Criteria andNrangeLessThanOrEqualTo(Integer value) {
            addCriterion("nrange <=", value, "nrange");
            return (Criteria) this;
        }

        public Criteria andNrangeIn(List<Integer> values) {
            addCriterion("nrange in", values, "nrange");
            return (Criteria) this;
        }

        public Criteria andNrangeNotIn(List<Integer> values) {
            addCriterion("nrange not in", values, "nrange");
            return (Criteria) this;
        }

        public Criteria andNrangeBetween(Integer value1, Integer value2) {
            addCriterion("nrange between", value1, value2, "nrange");
            return (Criteria) this;
        }

        public Criteria andNrangeNotBetween(Integer value1, Integer value2) {
            addCriterion("nrange not between", value1, value2, "nrange");
            return (Criteria) this;
        }

        public Criteria andNimageIsNull() {
            addCriterion("nimage is null");
            return (Criteria) this;
        }

        public Criteria andNimageIsNotNull() {
            addCriterion("nimage is not null");
            return (Criteria) this;
        }

        public Criteria andNimageEqualTo(String value) {
            addCriterion("nimage =", value, "nimage");
            return (Criteria) this;
        }

        public Criteria andNimageNotEqualTo(String value) {
            addCriterion("nimage <>", value, "nimage");
            return (Criteria) this;
        }

        public Criteria andNimageGreaterThan(String value) {
            addCriterion("nimage >", value, "nimage");
            return (Criteria) this;
        }

        public Criteria andNimageGreaterThanOrEqualTo(String value) {
            addCriterion("nimage >=", value, "nimage");
            return (Criteria) this;
        }

        public Criteria andNimageLessThan(String value) {
            addCriterion("nimage <", value, "nimage");
            return (Criteria) this;
        }

        public Criteria andNimageLessThanOrEqualTo(String value) {
            addCriterion("nimage <=", value, "nimage");
            return (Criteria) this;
        }

        public Criteria andNimageLike(String value) {
            addCriterion("nimage like", value, "nimage");
            return (Criteria) this;
        }

        public Criteria andNimageNotLike(String value) {
            addCriterion("nimage not like", value, "nimage");
            return (Criteria) this;
        }

        public Criteria andNimageIn(List<String> values) {
            addCriterion("nimage in", values, "nimage");
            return (Criteria) this;
        }

        public Criteria andNimageNotIn(List<String> values) {
            addCriterion("nimage not in", values, "nimage");
            return (Criteria) this;
        }

        public Criteria andNimageBetween(String value1, String value2) {
            addCriterion("nimage between", value1, value2, "nimage");
            return (Criteria) this;
        }

        public Criteria andNimageNotBetween(String value1, String value2) {
            addCriterion("nimage not between", value1, value2, "nimage");
            return (Criteria) this;
        }

        public Criteria andNstatueIsNull() {
            addCriterion("nstatue is null");
            return (Criteria) this;
        }

        public Criteria andNstatueIsNotNull() {
            addCriterion("nstatue is not null");
            return (Criteria) this;
        }

        public Criteria andNstatueEqualTo(Integer value) {
            addCriterion("nstatue =", value, "nstatue");
            return (Criteria) this;
        }

        public Criteria andNstatueNotEqualTo(Integer value) {
            addCriterion("nstatue <>", value, "nstatue");
            return (Criteria) this;
        }

        public Criteria andNstatueGreaterThan(Integer value) {
            addCriterion("nstatue >", value, "nstatue");
            return (Criteria) this;
        }

        public Criteria andNstatueGreaterThanOrEqualTo(Integer value) {
            addCriterion("nstatue >=", value, "nstatue");
            return (Criteria) this;
        }

        public Criteria andNstatueLessThan(Integer value) {
            addCriterion("nstatue <", value, "nstatue");
            return (Criteria) this;
        }

        public Criteria andNstatueLessThanOrEqualTo(Integer value) {
            addCriterion("nstatue <=", value, "nstatue");
            return (Criteria) this;
        }

        public Criteria andNstatueIn(List<Integer> values) {
            addCriterion("nstatue in", values, "nstatue");
            return (Criteria) this;
        }

        public Criteria andNstatueNotIn(List<Integer> values) {
            addCriterion("nstatue not in", values, "nstatue");
            return (Criteria) this;
        }

        public Criteria andNstatueBetween(Integer value1, Integer value2) {
            addCriterion("nstatue between", value1, value2, "nstatue");
            return (Criteria) this;
        }

        public Criteria andNstatueNotBetween(Integer value1, Integer value2) {
            addCriterion("nstatue not between", value1, value2, "nstatue");
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