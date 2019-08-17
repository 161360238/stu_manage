package com.pdsu.stuManage.utils;
/**
 * 学生条件查找
 * @author hasee
 *
 */
public class FindStu {
	
	private String enter_year;//入学年份
	private String stu_major;//专业
	private String stu_class;//班级
	private String stu_name;//姓名
	
	private Integer page = 1;//当前页
	
	private Integer size;//每页的记录数
	
	private Integer startRow;//开始行

	public String getEnter_year() {
		return enter_year;
	}

	public void setEnter_year(String enter_year) {
		this.enter_year = enter_year;
	}

	public String getStu_major() {
		return stu_major;
	}

	public void setStu_major(String stu_major) {
		this.stu_major = stu_major;
	}

	public String getStu_class() {
		return stu_class;
	}

	public void setStu_class(String stu_class) {
		this.stu_class = stu_class;
	}

	public String getStu_name() {
		return stu_name;
	}

	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Integer getStartRow() {
		return startRow;
	}

	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}
	
	
	
	
}
