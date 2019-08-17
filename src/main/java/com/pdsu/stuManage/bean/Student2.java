package com.pdsu.stuManage.bean;

public class Student2 {
    private String sid;

    private Integer ispoor;

    private String party;

    private String fammly;

    private String role;

    private Float totalnum;

    private Float dynum;

    private Float fammlynum;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public Integer getIspoor() {
        return ispoor;
    }

    public void setIspoor(Integer ispoor) {
        this.ispoor = ispoor;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party == null ? null : party.trim();
    }

    public String getFammly() {
        return fammly;
    }

    public void setFammly(String fammly) {
        this.fammly = fammly == null ? null : fammly.trim();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public Float getTotalnum() {
        return totalnum;
    }

    public void setTotalnum(Float totalnum) {
        this.totalnum = totalnum;
    }

    public Float getDynum() {
        return dynum;
    }

    public void setDynum(Float dynum) {
        this.dynum = dynum;
    }

    public Float getFammlynum() {
        return fammlynum;
    }

    public void setFammlynum(Float fammlynum) {
        this.fammlynum = fammlynum;
    }
}