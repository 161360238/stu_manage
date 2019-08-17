package com.pdsu.stuManage.bean;

public class Administrator {
    private String aid;

    private Integer identity;

    private Integer anum;

    private String aimage;

    private String acollage;

    private String apwd;

    private String aname;

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid == null ? null : aid.trim();
    }

    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }

    public Integer getAnum() {
        return anum;
    }

    public void setAnum(Integer anum) {
        this.anum = anum;
    }

    public String getAimage() {
        return aimage;
    }

    public void setAimage(String aimage) {
        this.aimage = aimage == null ? null : aimage.trim();
    }

    public String getAcollage() {
        return acollage;
    }

    public void setAcollage(String acollage) {
        this.acollage = acollage == null ? null : acollage.trim();
    }

    public String getApwd() {
        return apwd;
    }

    public void setApwd(String apwd) {
        this.apwd = apwd == null ? null : apwd.trim();
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname == null ? null : aname.trim();
    }
}