package com.pdsu.stuManage.bean;

public class Room extends RoomKey {
    private Integer rpnum;

    private Integer rscore;

    private Integer ismix;

    private String cid;

    private String rsign;

    public Integer getRpnum() {
        return rpnum;
    }

    public void setRpnum(Integer rpnum) {
        this.rpnum = rpnum;
    }

    public Integer getRscore() {
        return rscore;
    }

    public void setRscore(Integer rscore) {
        this.rscore = rscore;
    }

    public Integer getIsmix() {
        return ismix;
    }

    public void setIsmix(Integer ismix) {
        this.ismix = ismix;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public String getRsign() {
        return rsign;
    }

    public void setRsign(String rsign) {
        this.rsign = rsign == null ? null : rsign.trim();
    }
}