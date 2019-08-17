package com.pdsu.stuManage.bean;

import java.util.Date;

public class Punishment {
    private String pid;

    private String sid;

    private String pdesc;

    private Date ptime;

    private String pscore;

    private String pother;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getPdesc() {
        return pdesc;
    }

    public void setPdesc(String pdesc) {
        this.pdesc = pdesc == null ? null : pdesc.trim();
    }

    public Date getPtime() {
        return ptime;
    }

    public void setPtime(Date ptime) {
        this.ptime = ptime;
    }

    public String getPscore() {
        return pscore;
    }

    public void setPscore(String pscore) {
        this.pscore = pscore == null ? null : pscore.trim();
    }

    public String getPother() {
        return pother;
    }

    public void setPother(String pother) {
        this.pother = pother == null ? null : pother.trim();
    }
}