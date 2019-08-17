package com.pdsu.stuManage.bean;

public class Xandc {
    private String reid;

    private Integer restatue;

    private String zcid;

    private String cid;

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

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }
}