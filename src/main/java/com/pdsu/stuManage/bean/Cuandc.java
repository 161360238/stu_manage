package com.pdsu.stuManage.bean;

public class Cuandc {
    private String reid;

    private String cuid;

    private String cid;

    public String getReid() {
        return reid;
    }

    public void setReid(String reid) {
        this.reid = reid == null ? null : reid.trim();
    }

    public String getCuid() {
        return cuid;
    }

    public void setCuid(String cuid) {
        this.cuid = cuid == null ? null : cuid.trim();
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }
}