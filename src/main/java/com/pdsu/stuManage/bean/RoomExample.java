package com.pdsu.stuManage.bean;

import java.util.ArrayList;
import java.util.List;

public class RoomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoomExample() {
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

        public Criteria andRnumIsNull() {
            addCriterion("rnum is null");
            return (Criteria) this;
        }

        public Criteria andRnumIsNotNull() {
            addCriterion("rnum is not null");
            return (Criteria) this;
        }

        public Criteria andRnumEqualTo(Integer value) {
            addCriterion("rnum =", value, "rnum");
            return (Criteria) this;
        }

        public Criteria andRnumNotEqualTo(Integer value) {
            addCriterion("rnum <>", value, "rnum");
            return (Criteria) this;
        }

        public Criteria andRnumGreaterThan(Integer value) {
            addCriterion("rnum >", value, "rnum");
            return (Criteria) this;
        }

        public Criteria andRnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("rnum >=", value, "rnum");
            return (Criteria) this;
        }

        public Criteria andRnumLessThan(Integer value) {
            addCriterion("rnum <", value, "rnum");
            return (Criteria) this;
        }

        public Criteria andRnumLessThanOrEqualTo(Integer value) {
            addCriterion("rnum <=", value, "rnum");
            return (Criteria) this;
        }

        public Criteria andRnumIn(List<Integer> values) {
            addCriterion("rnum in", values, "rnum");
            return (Criteria) this;
        }

        public Criteria andRnumNotIn(List<Integer> values) {
            addCriterion("rnum not in", values, "rnum");
            return (Criteria) this;
        }

        public Criteria andRnumBetween(Integer value1, Integer value2) {
            addCriterion("rnum between", value1, value2, "rnum");
            return (Criteria) this;
        }

        public Criteria andRnumNotBetween(Integer value1, Integer value2) {
            addCriterion("rnum not between", value1, value2, "rnum");
            return (Criteria) this;
        }

        public Criteria andRpnumIsNull() {
            addCriterion("rpnum is null");
            return (Criteria) this;
        }

        public Criteria andRpnumIsNotNull() {
            addCriterion("rpnum is not null");
            return (Criteria) this;
        }

        public Criteria andRpnumEqualTo(Integer value) {
            addCriterion("rpnum =", value, "rpnum");
            return (Criteria) this;
        }

        public Criteria andRpnumNotEqualTo(Integer value) {
            addCriterion("rpnum <>", value, "rpnum");
            return (Criteria) this;
        }

        public Criteria andRpnumGreaterThan(Integer value) {
            addCriterion("rpnum >", value, "rpnum");
            return (Criteria) this;
        }

        public Criteria andRpnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("rpnum >=", value, "rpnum");
            return (Criteria) this;
        }

        public Criteria andRpnumLessThan(Integer value) {
            addCriterion("rpnum <", value, "rpnum");
            return (Criteria) this;
        }

        public Criteria andRpnumLessThanOrEqualTo(Integer value) {
            addCriterion("rpnum <=", value, "rpnum");
            return (Criteria) this;
        }

        public Criteria andRpnumIn(List<Integer> values) {
            addCriterion("rpnum in", values, "rpnum");
            return (Criteria) this;
        }

        public Criteria andRpnumNotIn(List<Integer> values) {
            addCriterion("rpnum not in", values, "rpnum");
            return (Criteria) this;
        }

        public Criteria andRpnumBetween(Integer value1, Integer value2) {
            addCriterion("rpnum between", value1, value2, "rpnum");
            return (Criteria) this;
        }

        public Criteria andRpnumNotBetween(Integer value1, Integer value2) {
            addCriterion("rpnum not between", value1, value2, "rpnum");
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

        public Criteria andRscoreEqualTo(Integer value) {
            addCriterion("rscore =", value, "rscore");
            return (Criteria) this;
        }

        public Criteria andRscoreNotEqualTo(Integer value) {
            addCriterion("rscore <>", value, "rscore");
            return (Criteria) this;
        }

        public Criteria andRscoreGreaterThan(Integer value) {
            addCriterion("rscore >", value, "rscore");
            return (Criteria) this;
        }

        public Criteria andRscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("rscore >=", value, "rscore");
            return (Criteria) this;
        }

        public Criteria andRscoreLessThan(Integer value) {
            addCriterion("rscore <", value, "rscore");
            return (Criteria) this;
        }

        public Criteria andRscoreLessThanOrEqualTo(Integer value) {
            addCriterion("rscore <=", value, "rscore");
            return (Criteria) this;
        }

        public Criteria andRscoreIn(List<Integer> values) {
            addCriterion("rscore in", values, "rscore");
            return (Criteria) this;
        }

        public Criteria andRscoreNotIn(List<Integer> values) {
            addCriterion("rscore not in", values, "rscore");
            return (Criteria) this;
        }

        public Criteria andRscoreBetween(Integer value1, Integer value2) {
            addCriterion("rscore between", value1, value2, "rscore");
            return (Criteria) this;
        }

        public Criteria andRscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("rscore not between", value1, value2, "rscore");
            return (Criteria) this;
        }

        public Criteria andIsmixIsNull() {
            addCriterion("ismix is null");
            return (Criteria) this;
        }

        public Criteria andIsmixIsNotNull() {
            addCriterion("ismix is not null");
            return (Criteria) this;
        }

        public Criteria andIsmixEqualTo(Integer value) {
            addCriterion("ismix =", value, "ismix");
            return (Criteria) this;
        }

        public Criteria andIsmixNotEqualTo(Integer value) {
            addCriterion("ismix <>", value, "ismix");
            return (Criteria) this;
        }

        public Criteria andIsmixGreaterThan(Integer value) {
            addCriterion("ismix >", value, "ismix");
            return (Criteria) this;
        }

        public Criteria andIsmixGreaterThanOrEqualTo(Integer value) {
            addCriterion("ismix >=", value, "ismix");
            return (Criteria) this;
        }

        public Criteria andIsmixLessThan(Integer value) {
            addCriterion("ismix <", value, "ismix");
            return (Criteria) this;
        }

        public Criteria andIsmixLessThanOrEqualTo(Integer value) {
            addCriterion("ismix <=", value, "ismix");
            return (Criteria) this;
        }

        public Criteria andIsmixIn(List<Integer> values) {
            addCriterion("ismix in", values, "ismix");
            return (Criteria) this;
        }

        public Criteria andIsmixNotIn(List<Integer> values) {
            addCriterion("ismix not in", values, "ismix");
            return (Criteria) this;
        }

        public Criteria andIsmixBetween(Integer value1, Integer value2) {
            addCriterion("ismix between", value1, value2, "ismix");
            return (Criteria) this;
        }

        public Criteria andIsmixNotBetween(Integer value1, Integer value2) {
            addCriterion("ismix not between", value1, value2, "ismix");
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

        public Criteria andRsignIsNull() {
            addCriterion("rsign is null");
            return (Criteria) this;
        }

        public Criteria andRsignIsNotNull() {
            addCriterion("rsign is not null");
            return (Criteria) this;
        }

        public Criteria andRsignEqualTo(String value) {
            addCriterion("rsign =", value, "rsign");
            return (Criteria) this;
        }

        public Criteria andRsignNotEqualTo(String value) {
            addCriterion("rsign <>", value, "rsign");
            return (Criteria) this;
        }

        public Criteria andRsignGreaterThan(String value) {
            addCriterion("rsign >", value, "rsign");
            return (Criteria) this;
        }

        public Criteria andRsignGreaterThanOrEqualTo(String value) {
            addCriterion("rsign >=", value, "rsign");
            return (Criteria) this;
        }

        public Criteria andRsignLessThan(String value) {
            addCriterion("rsign <", value, "rsign");
            return (Criteria) this;
        }

        public Criteria andRsignLessThanOrEqualTo(String value) {
            addCriterion("rsign <=", value, "rsign");
            return (Criteria) this;
        }

        public Criteria andRsignLike(String value) {
            addCriterion("rsign like", value, "rsign");
            return (Criteria) this;
        }

        public Criteria andRsignNotLike(String value) {
            addCriterion("rsign not like", value, "rsign");
            return (Criteria) this;
        }

        public Criteria andRsignIn(List<String> values) {
            addCriterion("rsign in", values, "rsign");
            return (Criteria) this;
        }

        public Criteria andRsignNotIn(List<String> values) {
            addCriterion("rsign not in", values, "rsign");
            return (Criteria) this;
        }

        public Criteria andRsignBetween(String value1, String value2) {
            addCriterion("rsign between", value1, value2, "rsign");
            return (Criteria) this;
        }

        public Criteria andRsignNotBetween(String value1, String value2) {
            addCriterion("rsign not between", value1, value2, "rsign");
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