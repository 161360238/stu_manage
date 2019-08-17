package com.pdsu.stuManage.bean;

import java.util.Date;

public class Notice {
    private String nid;

    private String oid;

    private Date btime;

    private Date etime;

    private Integer nrange;

    private String nimage;

    private Integer nstatue;

    private String ntext;

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid == null ? null : nid.trim();
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid == null ? null : oid.trim();
    }

    public Date getBtime() {
        return btime;
    }

    public void setBtime(Date btime) {
        this.btime = btime;
    }

    public Date getEtime() {
        return etime;
    }

    public void setEtime(Date etime) {
        this.etime = etime;
    }

    public Integer getNrange() {
        return nrange;
    }

    public void setNrange(Integer nrange) {
        this.nrange = nrange;
    }

    public String getNimage() {
        return nimage;
    }

    public void setNimage(String nimage) {
        this.nimage = nimage == null ? null : nimage.trim();
    }

    public Integer getNstatue() {
        return nstatue;
    }

    public void setNstatue(Integer nstatue) {
        this.nstatue = nstatue;
    }

    public String getNtext() {
        return ntext;
    }

    public void setNtext(String ntext) {
        this.ntext = ntext == null ? null : ntext.trim();
    }
}