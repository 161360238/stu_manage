package com.pdsu.stuManage.bean;

public class Student1 {
    private String sid;

    private String sname;

    private String simage;

    private String snum;

    private String exnum;

    private String colname;

    private String spwd;

    private String cid;

    private String cname;

    private String rid;

    private String sphone;

    private Integer sgrade;

    private Integer identity;

    private Integer ssex;

    private String smajor;

    private Integer sstatue;

    private String salt;

    private String role;
    
    private Student2 student2;

    public Student2 getStudent2() {
		return student2;
	}

	public void setStudent2(Student2 student2) {
		this.student2 = student2;
	}

	public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public String getSimage() {
        return simage;
    }

    public void setSimage(String simage) {
        this.simage = simage == null ? null : simage.trim();
    }

    public String getSnum() {
        return snum;
    }

    public void setSnum(String snum) {
        this.snum = snum == null ? null : snum.trim();
    }

    public String getExnum() {
        return exnum;
    }

    public void setExnum(String exnum) {
        this.exnum = exnum == null ? null : exnum.trim();
    }

    public String getColname() {
        return colname;
    }

    public void setColname(String colname) {
        this.colname = colname == null ? null : colname.trim();
    }

    public String getSpwd() {
        return spwd;
    }

    public void setSpwd(String spwd) {
        this.spwd = spwd == null ? null : spwd.trim();
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid == null ? null : rid.trim();
    }

    public String getSphone() {
        return sphone;
    }

    public void setSphone(String sphone) {
        this.sphone = sphone == null ? null : sphone.trim();
    }

    public Integer getSgrade() {
        return sgrade;
    }

    public void setSgrade(Integer sgrade) {
        this.sgrade = sgrade;
    }

    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }

    public Integer getSsex() {
        return ssex;
    }

    public void setSsex(Integer ssex) {
        this.ssex = ssex;
    }

    public String getSmajor() {
        return smajor;
    }

    public void setSmajor(String smajor) {
        this.smajor = smajor == null ? null : smajor.trim();
    }

    public Integer getSstatue() {
        return sstatue;
    }

    public void setSstatue(Integer sstatue) {
        this.sstatue = sstatue;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }
}