package com.pdsu.stuManage.bean;

public class Clazz {
    private String cid;

    private Integer cgrade;

    private String cmajor;

    private String cname;

    private Float cscore;

    private Integer stunum;

    private String introduce;

    private String cstatue;

    private String other;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
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

    public Float getCscore() {
        return cscore;
    }

    public void setCscore(Float cscore) {
        this.cscore = cscore;
    }

    public Integer getStunum() {
        return stunum;
    }

    public void setStunum(Integer stunum) {
        this.stunum = stunum;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public String getCstatue() {
        return cstatue;
    }

    public void setCstatue(String cstatue) {
        this.cstatue = cstatue == null ? null : cstatue.trim();
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }
}