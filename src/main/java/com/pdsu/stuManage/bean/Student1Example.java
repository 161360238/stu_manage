package com.pdsu.stuManage.bean;

import java.util.ArrayList;
import java.util.List;

public class Student1Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Student1Example() {
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

        public Criteria andSnameIsNull() {
            addCriterion("sname is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("sname is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("sname =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("sname <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("sname >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("sname >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("sname <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("sname <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("sname like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("sname not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("sname in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("sname not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("sname between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("sname not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSimageIsNull() {
            addCriterion("simage is null");
            return (Criteria) this;
        }

        public Criteria andSimageIsNotNull() {
            addCriterion("simage is not null");
            return (Criteria) this;
        }

        public Criteria andSimageEqualTo(String value) {
            addCriterion("simage =", value, "simage");
            return (Criteria) this;
        }

        public Criteria andSimageNotEqualTo(String value) {
            addCriterion("simage <>", value, "simage");
            return (Criteria) this;
        }

        public Criteria andSimageGreaterThan(String value) {
            addCriterion("simage >", value, "simage");
            return (Criteria) this;
        }

        public Criteria andSimageGreaterThanOrEqualTo(String value) {
            addCriterion("simage >=", value, "simage");
            return (Criteria) this;
        }

        public Criteria andSimageLessThan(String value) {
            addCriterion("simage <", value, "simage");
            return (Criteria) this;
        }

        public Criteria andSimageLessThanOrEqualTo(String value) {
            addCriterion("simage <=", value, "simage");
            return (Criteria) this;
        }

        public Criteria andSimageLike(String value) {
            addCriterion("simage like", value, "simage");
            return (Criteria) this;
        }

        public Criteria andSimageNotLike(String value) {
            addCriterion("simage not like", value, "simage");
            return (Criteria) this;
        }

        public Criteria andSimageIn(List<String> values) {
            addCriterion("simage in", values, "simage");
            return (Criteria) this;
        }

        public Criteria andSimageNotIn(List<String> values) {
            addCriterion("simage not in", values, "simage");
            return (Criteria) this;
        }

        public Criteria andSimageBetween(String value1, String value2) {
            addCriterion("simage between", value1, value2, "simage");
            return (Criteria) this;
        }

        public Criteria andSimageNotBetween(String value1, String value2) {
            addCriterion("simage not between", value1, value2, "simage");
            return (Criteria) this;
        }

        public Criteria andSnumIsNull() {
            addCriterion("snum is null");
            return (Criteria) this;
        }

        public Criteria andSnumIsNotNull() {
            addCriterion("snum is not null");
            return (Criteria) this;
        }

        public Criteria andSnumEqualTo(String value) {
            addCriterion("snum =", value, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumNotEqualTo(String value) {
            addCriterion("snum <>", value, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumGreaterThan(String value) {
            addCriterion("snum >", value, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumGreaterThanOrEqualTo(String value) {
            addCriterion("snum >=", value, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumLessThan(String value) {
            addCriterion("snum <", value, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumLessThanOrEqualTo(String value) {
            addCriterion("snum <=", value, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumLike(String value) {
            addCriterion("snum like", value, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumNotLike(String value) {
            addCriterion("snum not like", value, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumIn(List<String> values) {
            addCriterion("snum in", values, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumNotIn(List<String> values) {
            addCriterion("snum not in", values, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumBetween(String value1, String value2) {
            addCriterion("snum between", value1, value2, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumNotBetween(String value1, String value2) {
            addCriterion("snum not between", value1, value2, "snum");
            return (Criteria) this;
        }

        public Criteria andExnumIsNull() {
            addCriterion("exnum is null");
            return (Criteria) this;
        }

        public Criteria andExnumIsNotNull() {
            addCriterion("exnum is not null");
            return (Criteria) this;
        }

        public Criteria andExnumEqualTo(String value) {
            addCriterion("exnum =", value, "exnum");
            return (Criteria) this;
        }

        public Criteria andExnumNotEqualTo(String value) {
            addCriterion("exnum <>", value, "exnum");
            return (Criteria) this;
        }

        public Criteria andExnumGreaterThan(String value) {
            addCriterion("exnum >", value, "exnum");
            return (Criteria) this;
        }

        public Criteria andExnumGreaterThanOrEqualTo(String value) {
            addCriterion("exnum >=", value, "exnum");
            return (Criteria) this;
        }

        public Criteria andExnumLessThan(String value) {
            addCriterion("exnum <", value, "exnum");
            return (Criteria) this;
        }

        public Criteria andExnumLessThanOrEqualTo(String value) {
            addCriterion("exnum <=", value, "exnum");
            return (Criteria) this;
        }

        public Criteria andExnumLike(String value) {
            addCriterion("exnum like", value, "exnum");
            return (Criteria) this;
        }

        public Criteria andExnumNotLike(String value) {
            addCriterion("exnum not like", value, "exnum");
            return (Criteria) this;
        }

        public Criteria andExnumIn(List<String> values) {
            addCriterion("exnum in", values, "exnum");
            return (Criteria) this;
        }

        public Criteria andExnumNotIn(List<String> values) {
            addCriterion("exnum not in", values, "exnum");
            return (Criteria) this;
        }

        public Criteria andExnumBetween(String value1, String value2) {
            addCriterion("exnum between", value1, value2, "exnum");
            return (Criteria) this;
        }

        public Criteria andExnumNotBetween(String value1, String value2) {
            addCriterion("exnum not between", value1, value2, "exnum");
            return (Criteria) this;
        }

        public Criteria andColnameIsNull() {
            addCriterion("colname is null");
            return (Criteria) this;
        }

        public Criteria andColnameIsNotNull() {
            addCriterion("colname is not null");
            return (Criteria) this;
        }

        public Criteria andColnameEqualTo(String value) {
            addCriterion("colname =", value, "colname");
            return (Criteria) this;
        }

        public Criteria andColnameNotEqualTo(String value) {
            addCriterion("colname <>", value, "colname");
            return (Criteria) this;
        }

        public Criteria andColnameGreaterThan(String value) {
            addCriterion("colname >", value, "colname");
            return (Criteria) this;
        }

        public Criteria andColnameGreaterThanOrEqualTo(String value) {
            addCriterion("colname >=", value, "colname");
            return (Criteria) this;
        }

        public Criteria andColnameLessThan(String value) {
            addCriterion("colname <", value, "colname");
            return (Criteria) this;
        }

        public Criteria andColnameLessThanOrEqualTo(String value) {
            addCriterion("colname <=", value, "colname");
            return (Criteria) this;
        }

        public Criteria andColnameLike(String value) {
            addCriterion("colname like", value, "colname");
            return (Criteria) this;
        }

        public Criteria andColnameNotLike(String value) {
            addCriterion("colname not like", value, "colname");
            return (Criteria) this;
        }

        public Criteria andColnameIn(List<String> values) {
            addCriterion("colname in", values, "colname");
            return (Criteria) this;
        }

        public Criteria andColnameNotIn(List<String> values) {
            addCriterion("colname not in", values, "colname");
            return (Criteria) this;
        }

        public Criteria andColnameBetween(String value1, String value2) {
            addCriterion("colname between", value1, value2, "colname");
            return (Criteria) this;
        }

        public Criteria andColnameNotBetween(String value1, String value2) {
            addCriterion("colname not between", value1, value2, "colname");
            return (Criteria) this;
        }

        public Criteria andSpwdIsNull() {
            addCriterion("spwd is null");
            return (Criteria) this;
        }

        public Criteria andSpwdIsNotNull() {
            addCriterion("spwd is not null");
            return (Criteria) this;
        }

        public Criteria andSpwdEqualTo(String value) {
            addCriterion("spwd =", value, "spwd");
            return (Criteria) this;
        }

        public Criteria andSpwdNotEqualTo(String value) {
            addCriterion("spwd <>", value, "spwd");
            return (Criteria) this;
        }

        public Criteria andSpwdGreaterThan(String value) {
            addCriterion("spwd >", value, "spwd");
            return (Criteria) this;
        }

        public Criteria andSpwdGreaterThanOrEqualTo(String value) {
            addCriterion("spwd >=", value, "spwd");
            return (Criteria) this;
        }

        public Criteria andSpwdLessThan(String value) {
            addCriterion("spwd <", value, "spwd");
            return (Criteria) this;
        }

        public Criteria andSpwdLessThanOrEqualTo(String value) {
            addCriterion("spwd <=", value, "spwd");
            return (Criteria) this;
        }

        public Criteria andSpwdLike(String value) {
            addCriterion("spwd like", value, "spwd");
            return (Criteria) this;
        }

        public Criteria andSpwdNotLike(String value) {
            addCriterion("spwd not like", value, "spwd");
            return (Criteria) this;
        }

        public Criteria andSpwdIn(List<String> values) {
            addCriterion("spwd in", values, "spwd");
            return (Criteria) this;
        }

        public Criteria andSpwdNotIn(List<String> values) {
            addCriterion("spwd not in", values, "spwd");
            return (Criteria) this;
        }

        public Criteria andSpwdBetween(String value1, String value2) {
            addCriterion("spwd between", value1, value2, "spwd");
            return (Criteria) this;
        }

        public Criteria andSpwdNotBetween(String value1, String value2) {
            addCriterion("spwd not between", value1, value2, "spwd");
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

        public Criteria andSphoneIsNull() {
            addCriterion("sphone is null");
            return (Criteria) this;
        }

        public Criteria andSphoneIsNotNull() {
            addCriterion("sphone is not null");
            return (Criteria) this;
        }

        public Criteria andSphoneEqualTo(String value) {
            addCriterion("sphone =", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneNotEqualTo(String value) {
            addCriterion("sphone <>", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneGreaterThan(String value) {
            addCriterion("sphone >", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneGreaterThanOrEqualTo(String value) {
            addCriterion("sphone >=", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneLessThan(String value) {
            addCriterion("sphone <", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneLessThanOrEqualTo(String value) {
            addCriterion("sphone <=", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneLike(String value) {
            addCriterion("sphone like", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneNotLike(String value) {
            addCriterion("sphone not like", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneIn(List<String> values) {
            addCriterion("sphone in", values, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneNotIn(List<String> values) {
            addCriterion("sphone not in", values, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneBetween(String value1, String value2) {
            addCriterion("sphone between", value1, value2, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneNotBetween(String value1, String value2) {
            addCriterion("sphone not between", value1, value2, "sphone");
            return (Criteria) this;
        }

        public Criteria andSgradeIsNull() {
            addCriterion("sgrade is null");
            return (Criteria) this;
        }

        public Criteria andSgradeIsNotNull() {
            addCriterion("sgrade is not null");
            return (Criteria) this;
        }

        public Criteria andSgradeEqualTo(Integer value) {
            addCriterion("sgrade =", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeNotEqualTo(Integer value) {
            addCriterion("sgrade <>", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeGreaterThan(Integer value) {
            addCriterion("sgrade >", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sgrade >=", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeLessThan(Integer value) {
            addCriterion("sgrade <", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeLessThanOrEqualTo(Integer value) {
            addCriterion("sgrade <=", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeIn(List<Integer> values) {
            addCriterion("sgrade in", values, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeNotIn(List<Integer> values) {
            addCriterion("sgrade not in", values, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeBetween(Integer value1, Integer value2) {
            addCriterion("sgrade between", value1, value2, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeNotBetween(Integer value1, Integer value2) {
            addCriterion("sgrade not between", value1, value2, "sgrade");
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

        public Criteria andSsexIsNull() {
            addCriterion("ssex is null");
            return (Criteria) this;
        }

        public Criteria andSsexIsNotNull() {
            addCriterion("ssex is not null");
            return (Criteria) this;
        }

        public Criteria andSsexEqualTo(Integer value) {
            addCriterion("ssex =", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotEqualTo(Integer value) {
            addCriterion("ssex <>", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexGreaterThan(Integer value) {
            addCriterion("ssex >", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexGreaterThanOrEqualTo(Integer value) {
            addCriterion("ssex >=", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexLessThan(Integer value) {
            addCriterion("ssex <", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexLessThanOrEqualTo(Integer value) {
            addCriterion("ssex <=", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexIn(List<Integer> values) {
            addCriterion("ssex in", values, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotIn(List<Integer> values) {
            addCriterion("ssex not in", values, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexBetween(Integer value1, Integer value2) {
            addCriterion("ssex between", value1, value2, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotBetween(Integer value1, Integer value2) {
            addCriterion("ssex not between", value1, value2, "ssex");
            return (Criteria) this;
        }

        public Criteria andSmajorIsNull() {
            addCriterion("smajor is null");
            return (Criteria) this;
        }

        public Criteria andSmajorIsNotNull() {
            addCriterion("smajor is not null");
            return (Criteria) this;
        }

        public Criteria andSmajorEqualTo(String value) {
            addCriterion("smajor =", value, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorNotEqualTo(String value) {
            addCriterion("smajor <>", value, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorGreaterThan(String value) {
            addCriterion("smajor >", value, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorGreaterThanOrEqualTo(String value) {
            addCriterion("smajor >=", value, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorLessThan(String value) {
            addCriterion("smajor <", value, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorLessThanOrEqualTo(String value) {
            addCriterion("smajor <=", value, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorLike(String value) {
            addCriterion("smajor like", value, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorNotLike(String value) {
            addCriterion("smajor not like", value, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorIn(List<String> values) {
            addCriterion("smajor in", values, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorNotIn(List<String> values) {
            addCriterion("smajor not in", values, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorBetween(String value1, String value2) {
            addCriterion("smajor between", value1, value2, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorNotBetween(String value1, String value2) {
            addCriterion("smajor not between", value1, value2, "smajor");
            return (Criteria) this;
        }

        public Criteria andSstatueIsNull() {
            addCriterion("sstatue is null");
            return (Criteria) this;
        }

        public Criteria andSstatueIsNotNull() {
            addCriterion("sstatue is not null");
            return (Criteria) this;
        }

        public Criteria andSstatueEqualTo(Integer value) {
            addCriterion("sstatue =", value, "sstatue");
            return (Criteria) this;
        }

        public Criteria andSstatueNotEqualTo(Integer value) {
            addCriterion("sstatue <>", value, "sstatue");
            return (Criteria) this;
        }

        public Criteria andSstatueGreaterThan(Integer value) {
            addCriterion("sstatue >", value, "sstatue");
            return (Criteria) this;
        }

        public Criteria andSstatueGreaterThanOrEqualTo(Integer value) {
            addCriterion("sstatue >=", value, "sstatue");
            return (Criteria) this;
        }

        public Criteria andSstatueLessThan(Integer value) {
            addCriterion("sstatue <", value, "sstatue");
            return (Criteria) this;
        }

        public Criteria andSstatueLessThanOrEqualTo(Integer value) {
            addCriterion("sstatue <=", value, "sstatue");
            return (Criteria) this;
        }

        public Criteria andSstatueIn(List<Integer> values) {
            addCriterion("sstatue in", values, "sstatue");
            return (Criteria) this;
        }

        public Criteria andSstatueNotIn(List<Integer> values) {
            addCriterion("sstatue not in", values, "sstatue");
            return (Criteria) this;
        }

        public Criteria andSstatueBetween(Integer value1, Integer value2) {
            addCriterion("sstatue between", value1, value2, "sstatue");
            return (Criteria) this;
        }

        public Criteria andSstatueNotBetween(Integer value1, Integer value2) {
            addCriterion("sstatue not between", value1, value2, "sstatue");
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