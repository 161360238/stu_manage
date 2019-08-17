package com.pdsu.stuManage.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pdsu.stuManage.bean.Room;
import com.pdsu.stuManage.bean.RoomExample;
import com.pdsu.stuManage.bean.RoomExample.Criteria;
import com.pdsu.stuManage.bean.Student1;
import com.pdsu.stuManage.bean.Student1Example;
import com.pdsu.stuManage.dao.RoomMapper;
import com.pdsu.stuManage.dao.Student1Mapper;

/*
 * 处理与宿舍有关的业务逻辑
 */
@Service("roomService")
public class RoomService {
	
	@Resource(name="roomMapper")
	private RoomMapper roomMapper;
	
	@Resource(name="student1Mapper")
	private Student1Mapper student1Mapper;

	/*
	 * 添加宿舍
	 */
	public void addRoom(Room room) {
		roomMapper.insertSelective(room);
	}

	public List<Room> selectRoomByClid(int clid) {
		RoomExample example=new RoomExample();
		Criteria criteria=example.createCriteria();
		example.setOrderByClause("rnum ASC");
		criteria.andRscoreEqualTo(clid);
		return roomMapper.selectByExample(example);
		
	}

	public List<Room> selectRoomByClid2(int clid, String cid) {
		RoomExample example=new RoomExample();
		Criteria criteria=example.createCriteria();
		criteria.andRscoreEqualTo(clid).andCidEqualTo(cid);
		return roomMapper.selectByExample(example);
	}

	public Room selectByRnum(String rnum) {
		
		RoomExample example=new RoomExample();
		Criteria criteria=example.createCriteria();
		criteria.andRnumEqualTo(Integer.parseInt(rnum));
		List<Room> list=new ArrayList<>();
		list=roomMapper.selectByExample(example);
		if(list.size()!=0){
			return list.get(0);
		}else{
			return null;
		}
		 
		
	}

	public void addRoomToC(String rnum, String cid) {
		Room room=new Room();
		room.setCid(cid);
		room.setRnum(Integer.parseInt(rnum));
		RoomExample example=new RoomExample();
		Criteria criteria=example.createCriteria();
		criteria.andRnumEqualTo(Integer.parseInt(rnum));
		roomMapper.updateByExampleSelective(room, example);
	}

	public void disRoom(String clazzs, String rid) {
		Room room=new Room();
		room.setCid(clazzs);
		RoomExample example=new RoomExample();
		Criteria criteria=example.createCriteria();
		criteria.andRidEqualTo(rid);
		roomMapper.updateByExampleSelective(room, example);
	}

	public Room selectByRid(String rid) {
		RoomExample example=new RoomExample();
		Criteria criteria=example.createCriteria();
		criteria.andRidEqualTo(rid);
		
		List<Room> list=roomMapper.selectByExample(example);
		if(list.size()!=0){
			return list.get(0);
		}else{
			return null;
		}
		
	}

	public void editRoom(Room room, String rid) {
		RoomExample example=new RoomExample();
		Criteria criteria=example.createCriteria();
		criteria.andRidEqualTo(rid);
		roomMapper.updateByExampleSelective(room, example);
		
	}

	public void deleteRoom(String rid) {
		RoomExample example=new RoomExample();
		Criteria criteria=example.createCriteria();
		criteria.andRidEqualTo(rid);
		// TODO Auto-generated method stub
		roomMapper.deleteByExample(example);
	}

	public List<Room> selectRoomByCid(String clazz) {
		if(clazz.length()<3){
			return roomMapper.selectByExample(null);
		}else{
			RoomExample example=new RoomExample();
			Criteria criteria=example.createCriteria();
			criteria.andCidEqualTo(clazz);
			return roomMapper.selectByExample(example);
		}
	}
	
	//加上混寝宿舍
	public List<Room> selectRoomByCid2(String clazz) {
		if(clazz.length()<3){
			return roomMapper.selectByExample(null);
		}else{
			RoomExample example=new RoomExample();
			Criteria criteria=example.createCriteria();
			criteria.andCidEqualTo(clazz);
			List<Room> rooms=new ArrayList<>();
			List<Room> rooms2=new ArrayList<>();
			RoomExample example2=new RoomExample();
			Criteria criteria2=example.createCriteria();
			criteria2.andIsmixEqualTo(1).andCidNotEqualTo("11111111111111111111111111111111");
			rooms2=roomMapper.selectByExample(example2);
			
			rooms=roomMapper.selectByExample(example);
			rooms.addAll(rooms2);
			return rooms;
		}
	}

	public String selectCidBysid(String sid) {
		Student1 stu=new Student1();
		stu=student1Mapper.selectByPrimaryKey(sid);
		return stu.getCid();
	}

	//把宿舍分配学生
	public void chooseRoom(String rid, String sid) {
		// TODO Auto-generated method stub
		Student1 stu1=new Student1();
		stu1.setRid(rid);
		//stu1.setSid(sid);
		Student1Example example=new Student1Example();
		com.pdsu.stuManage.bean.Student1Example.Criteria criteria=example.createCriteria();
		criteria.andSidEqualTo(sid);
		student1Mapper.updateByExampleSelective(stu1, example);
	}
}
