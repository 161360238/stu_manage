package com.pdsu.stuManage.bean;

public class Candt {
    private String csid;

    private String tid;

    private String cid;

    public String getCsid() {
        return csid;
    }

    public void setCsid(String csid) {
        this.csid = csid == null ? null : csid.trim();
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid == null ? null : tid.trim();
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }
}