package com.pdsu.stuManage.service.impl;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pdsu.stuManage.bean.ActiveUser;
import com.pdsu.stuManage.bean.Function;
import com.pdsu.stuManage.bean.Student1;
import com.pdsu.stuManage.bean.Student2;
import com.pdsu.stuManage.dao.AdminBasicInfoMapper;
import com.pdsu.stuManage.dao.PovDeterminMapper;
import com.pdsu.stuManage.service.PovDeterminService;
import com.pdsu.stuManage.utils.FindStu;
import com.pdsu.stuManage.utils.Page;
@Service
public class PovDeterminNumServiceImpl implements PovDeterminService {
	
	@Autowired
	private PovDeterminMapper povDeterminMapper;
	@Autowired
	private AdminBasicInfoMapper adminBasicInfoMapper;
	
	//学生认定
	@Override
	public int insertPovDeterminNum(String[] povNum,HttpSession session,int marker) {	
		int yesOrNo = 0;
		String Xuanxiang ="";
		if(marker == 0) Xuanxiang ="[大一:],";
		if(marker == 1) Xuanxiang ="[大二:],";		
		float PoorNum = 0;float PoorNum1 = 0;
		float PoorNum2 = 0;float PoorNum3 = 0;
		for(int i = 0;i < povNum.length; i++){
			String[] strings = povNum[i].split("-");
			if(povNum.length - 1 == i){
				Xuanxiang = Xuanxiang +  povNum[i];
			}else{				
				Xuanxiang = Xuanxiang + povNum[i] + ",";
			}
			if(i <= 4)PoorNum1 = PoorNum1 + Integer.parseInt(strings[1]);	
			if(i > 4 && i <= 6) PoorNum2 = PoorNum2 + Integer.parseInt(strings[1]);
			if(i > 6&&i <= 8) PoorNum3 = PoorNum3 + Integer.parseInt(strings[1]);
		}	
		if(marker == 0)PoorNum = (float) (PoorNum1*0.602 +PoorNum2*0.163 + PoorNum3*0.107);//贫困分数大一				
		if(marker == 1)PoorNum = (float) (PoorNum1*0.543 +PoorNum2*0.147 + PoorNum3*0.97);//贫困分数大二						
		ActiveUser activeUser = (ActiveUser) session.getAttribute("activeUser");		
		Student2 stu2 = new Student2();
		stu2.setSid(activeUser.getUserid());
		stu2.setFammly(Xuanxiang);
		stu2.setFammlynum(PoorNum);
		int Stu2exist = adminBasicInfoMapper.selesctStudent2InfoExist(activeUser.getUserid());
		if(Stu2exist < 1){
			try {
				yesOrNo = povDeterminMapper.addStuPoorDeterMin(stu2);
			} catch (Exception e) {		
				e.printStackTrace();
				return 0;
			}
		}else{
			try {
				yesOrNo = povDeterminMapper.updateStuPoorDeterMin(stu2);
			} catch (Exception e) {
				e.printStackTrace();
				return 0;
			}
		}		
		return yesOrNo;
	}
	
	//贫困认定统计
	@Override
	public Page<Student1> selectStuPageByFindStu(FindStu findStu) {		
		Page<Student1> page = new Page<Student1>();
		page.setPage(findStu.getPage());//获取当前页
		findStu.setSize(15);//每次查询的条数
		page.setSize(15);//同步到返回的page中
		if(findStu != null){
			findStu.setStartRow((findStu.getPage()-1)*findStu.getSize());//开始行
			//判断当前页
			if(findStu.getStu_name()!=null && !"".equals(findStu.getStu_name().trim())){
				findStu.setStu_name(findStu.getStu_name().trim());
			}
			if(findStu.getEnter_year() !=null ){
				findStu.setEnter_year(findStu.getEnter_year());
			}
			if(findStu.getStu_major() !=null ){
				findStu.setStu_major(findStu.getStu_major());
			}
			if(findStu.getStu_class() !=null ){
				findStu.setStu_class(findStu.getStu_class());
			}
			
			Integer count = null;
			try {
				count = adminBasicInfoMapper.selectStuConunt(findStu);//总条数
			} catch (Exception e) {		
				e.printStackTrace();
			}
			page.setTotal(count);
			List<Student1> stuList = null;
			try {
				 stuList = povDeterminMapper.selectStuPageByFindStuPov(findStu);
			} catch (Exception e) {			
				e.printStackTrace();
			}
			page.setRows(stuList);
			
		}		
		return page;				
	}
	
	//添加民主评议分数
	@Override
	public int addPovDeterScore(String sid,String score,String marker) throws Exception {
		Student2 stu = new Student2();
		stu.setSid(sid);
		Student2 stu2 = povDeterminMapper.selectPovDeterScore(sid);
		if(stu2 == null) return 0;
		if(stu2.getFammlynum() == null) return 0;
		if(marker.equals("0")){
			stu.setFammlynum((float) (stu2.getFammlynum()+Integer.parseInt(score.trim())*0.126));
		}
		if(marker.equals("1")){
			stu.setFammlynum((float) (stu2.getFammlynum()+Integer.parseInt(score.trim())*0.213));
		}		
		return povDeterminMapper.addPovDeterScore(stu);
	}
	
	//查询提交的选项
	@Override
	public Student2 selectPovDeterInfo(String sid) throws Exception {
		Student2 stu = povDeterminMapper.selectPovDeterInfo(sid);		
		return stu;
	}
	
	//删除学生的认定信息
	@Override
	public int deletePovDeterInfo(String sid) throws Exception {
		return povDeterminMapper.deletePovDeterInfo(sid);
	}
	
	//贫困认定开放关闭
	@Override
	public int updatePovDeterStutasByStutas(String status) throws Exception {
		Function function = new Function();
		function.setFid("30");//表function中fid=30
		function.setPression(status);;//状态
		int yesOrNo = povDeterminMapper.updatePovDeterStutas(function);
		if(yesOrNo < 1) return 0;
		return yesOrNo;
	}
	
	//查询贫困认定是否开放
	@Override
	public Function selectPovDeterStutas() {
		Function function = null;
		try {
			function = povDeterminMapper.selectPovDeterStutas("30");
		} catch (Exception e) {			
			e.printStackTrace();
		}
		return function;
	}

}
