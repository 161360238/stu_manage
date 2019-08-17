package com.pdsu.stuManage.bean;

public class Zands {
    private String reid;

    private Integer restatue;

    private String zcid;

    private String sid;

    public String getReid() {
        return reid;
    }

    public void setReid(String reid) {
        this.reid = reid == null ? null : reid.trim();
    }

    public Integer getRestatue() {
        return restatue;
    }

    public void setRestatue(Integer restatue) {
        this.restatue = restatue;
    }

    public String getZcid() {
        return zcid;
    }

    public void setZcid(String zcid) {
        this.zcid = zcid == null ? null : zcid.trim();
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }
}