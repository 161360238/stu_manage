package com.pdsu.stuManage.bean;

public class Mandc {
    private Integer reid;

    private Integer cgrade;

    private String cmajor;

    private String cname;

    private String cid;

    private Integer restatue;

    private Integer pid;

    public Integer getReid() {
        return reid;
    }

    public void setReid(Integer reid) {
        this.reid = reid;
    }

    public Integer getCgrade() {
        return cgrade;
    }

    public void setCgrade(Integer cgrade) {
        this.cgrade = cgrade;
    }

    public String getCmajor() {
        return cmajor;
    }

    public void setCmajor(String cmajor) {
        this.cmajor = cmajor == null ? null : cmajor.trim();
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public Integer getRestatue() {
        return restatue;
    }

    public void setRestatue(Integer restatue) {
        this.restatue = restatue;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}