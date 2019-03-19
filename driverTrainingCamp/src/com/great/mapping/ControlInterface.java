package com.great.mapping;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.great.entity.Car;
import com.great.entity.Message;
import com.great.entity.School;
import com.great.entity.Student;

@Repository
public interface ControlInterface {
	//查看所有驾校信息
	public List<School> selectAllSchool();
	//通过驾校id修改驾校状态针对禁止和恢复报名申请的
	public void updateSchoolStateById();
	//查看所有教练的详细信息
	public void selectAllTeacher();
	//通过教练姓名查教练id
	public void selectTeacherIdByName(@Param("teacher_name")String teacher_name );
	//查询所有教练车信息
	public List<Car> selectAllCar();
	//查看所有学员信息
	public List<Student> selectAllStudent();
	//查询公告信息
	public List<Message> selectAllMessage();
	//增加公告信息
	public void addMassage(@Param("massage_content")String massage_content ,
			@Param("massage_time")String massage_time);
	//查询驾校的状态下拉框显示
	public List<SchooleState> selectSchoolState();
	//查询驾校开通申请表
	public List<SchoolApply> selectSchoolApply();
	//审批驾校开通申请
	public void updateSchoolApplyState(@Param("schoolapply_id") int schoolapply_id);
	
	
	
	
	

}
