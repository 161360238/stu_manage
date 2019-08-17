package com.pdsu.stuManage.bean;

import java.util.Date;

public class Attendcode {
    private Integer acode;

    private Integer dtime;

    private String cid;

    private String tid;

    private Date btime;

    private Integer num;

    public Integer getAcode() {
        return acode;
    }

    public void setAcode(Integer acode) {
        this.acode = acode;
    }

    public Integer getDtime() {
        return dtime;
    }

    public void setDtime(Integer dtime) {
        this.dtime = dtime;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid == null ? null : tid.trim();
    }

    public Date getBtime() {
        return btime;
    }

    public void setBtime(Date btime) {
        this.btime = btime;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}