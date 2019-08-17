package com.pdsu.stuManage.bean;

import java.util.List;

import com.pdsu.stuManage.bean.Punishment;
import com.pdsu.stuManage.bean.Reward;
import com.pdsu.stuManage.bean.Student2;
/**
 * 学生的详情信息
 * @author zhangchi
 *
 */
public class StuDetailInfo {
	
	private List<Reward> rewards;
	
	private List<Punishment> punishments;
	
	private Student2 student2;

	
	public List<Reward> getRewards() {
		return rewards;
	}

	public void setRewards(List<Reward> rewards) {
		this.rewards = rewards;
	}

	public List<Punishment> getPunishments() {
		return punishments;
	}

	public void setPunishments(List<Punishment> punishments) {
		this.punishments = punishments;
	}

	public Student2 getStudent2() {
		return student2;
	}

	public void setStudent2(Student2 student2) {
		this.student2 = student2;
	}
	
	
	
	
}
