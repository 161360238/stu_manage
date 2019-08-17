package com.pdsu.stuManage.bean;

public class Teacher {
    private String tid;

    private String tname;

    private Integer identity;

    private Integer tsex;

    private String timage;

    private String tphone;

    private String tpwd;

    private Integer tscore;

    private String salt;

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid == null ? null : tid.trim();
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }

    public Integer getTsex() {
        return tsex;
    }

    public void setTsex(Integer tsex) {
        this.tsex = tsex;
    }

    public String getTimage() {
        return timage;
    }

    public void setTimage(String timage) {
        this.timage = timage == null ? null : timage.trim();
    }

    public String getTphone() {
        return tphone;
    }

    public void setTphone(String tphone) {
        this.tphone = tphone == null ? null : tphone.trim();
    }

    public String getTpwd() {
        return tpwd;
    }

    public void setTpwd(String tpwd) {
        this.tpwd = tpwd == null ? null : tpwd.trim();
    }

    public Integer getTscore() {
        return tscore;
    }

    public void setTscore(Integer tscore) {
        this.tscore = tscore;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }
}