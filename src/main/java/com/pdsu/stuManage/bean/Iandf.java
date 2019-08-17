package com.pdsu.stuManage.bean;

public class Iandf {
    private String reid;

    private String fid;

    private Integer identity;

    public String getReid() {
        return reid;
    }

    public void setReid(String reid) {
        this.reid = reid == null ? null : reid.trim();
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid == null ? null : fid.trim();
    }

    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }
}