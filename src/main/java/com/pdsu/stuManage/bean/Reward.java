package com.pdsu.stuManage.bean;

import java.util.Date;

public class Reward {
    private String rid;

    private String sid;

    private String rdesc;

    private Integer rclassify;

    private Date rtime;

    private String rscore;

    private String rother;

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

    public String getRdesc() {
        return rdesc;
    }

    public void setRdesc(String rdesc) {
        this.rdesc = rdesc == null ? null : rdesc.trim();
    }

    public Integer getRclassify() {
        return rclassify;
    }

    public void setRclassify(Integer rclassify) {
        this.rclassify = rclassify;
    }

    public Date getRtime() {
        return rtime;
    }

    public void setRtime(Date rtime) {
        this.rtime = rtime;
    }

    public String getRscore() {
        return rscore;
    }

    public void setRscore(String rscore) {
        this.rscore = rscore == null ? null : rscore.trim();
    }

    public String getRother() {
        return rother;
    }

    public void setRother(String rother) {
        this.rother = rother == null ? null : rother.trim();
    }
}