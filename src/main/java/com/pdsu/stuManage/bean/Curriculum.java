package com.pdsu.stuManage.bean;

public class Curriculum {
    private String cuid;

    private Integer cunature;

    private String cuname;

    private Integer cuscore;

    public String getCuid() {
        return cuid;
    }

    public void setCuid(String cuid) {
        this.cuid = cuid == null ? null : cuid.trim();
    }

    public Integer getCunature() {
        return cunature;
    }

    public void setCunature(Integer cunature) {
        this.cunature = cunature;
    }

    public String getCuname() {
        return cuname;
    }

    public void setCuname(String cuname) {
        this.cuname = cuname == null ? null : cuname.trim();
    }

    public Integer getCuscore() {
        return cuscore;
    }

    public void setCuscore(Integer cuscore) {
        this.cuscore = cuscore;
    }
}