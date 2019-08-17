package com.pdsu.stuManage.bean;

public class Achievement {
    private String rid;

    private String sid;

    private String term;

    private Float point;

    private Integer falilnum;

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid == null ? null : rid.trim();
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term == null ? null : term.trim();
    }

    public Float getPoint() {
        return point;
    }

    public void setPoint(Float point) {
        this.point = point;
    }

    public Integer getFalilnum() {
        return falilnum;
    }

    public void setFalilnum(Integer falilnum) {
        this.falilnum = falilnum;
    }
}