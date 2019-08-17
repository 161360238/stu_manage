package com.pdsu.stuManage.bean;

import java.util.Date;

public class Zclass {
    private String zcid;

    private String tid;

    private String zcode;

    private String zcname;

    private Date zctime;

    private Integer zcstatue;

    public String getZcid() {
        return zcid;
    }

    public void setZcid(String zcid) {
        this.zcid = zcid == null ? null : zcid.trim();
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid == null ? null : tid.trim();
    }

    public String getZcode() {
        return zcode;
    }

    public void setZcode(String zcode) {
        this.zcode = zcode == null ? null : zcode.trim();
    }

    public String getZcname() {
        return zcname;
    }

    public void setZcname(String zcname) {
        this.zcname = zcname == null ? null : zcname.trim();
    }

    public Date getZctime() {
        return zctime;
    }

    public void setZctime(Date zctime) {
        this.zctime = zctime;
    }

    public Integer getZcstatue() {
        return zcstatue;
    }

    public void setZcstatue(Integer zcstatue) {
        this.zcstatue = zcstatue;
    }
}