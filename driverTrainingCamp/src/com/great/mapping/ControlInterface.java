package com.great.mapping;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.great.entity.Car;
import com.great.entity.Message;
import com.great.entity.School;
import com.great.entity.SchoolState;
import com.great.entity.Student;
import com.great.entity.Teacher;

@Repository
public interface ControlInterface {
	//查询所有学校
	public List<School> selectAllSchool();
	//ͨ通过学校id更新学校状态
	public void updateSchoolStateById();
	//查询所有老师集合
	public List<Teacher> selectAllTeacher();
	//ͨ通过老师姓名查老师
	public void selectTeacherIdByName(@Param("teacher_name")String teacher_name );
	//查询所有教练车
	public List<Car> selectAllCar();
	//查询所有学生
	public List<Student> selectAllStudent();
	//查询所有公告信息
	public List<Message> selectAllMessage();
	//新增公告信息
	public void addMassage(@Param("massage_content")String massage_content ,
			@Param("massage_time")String massage_time);
	//查询学校状态集合
	public List<SchoolState> selectSchoolState();
	//查询驾校申请表
	public List<SchoolApply> selectSchoolApply();
	//更新申请表
	public void updateSchoolApplyState(@Param("schoolapply_id") int schoolapply_id);
	
	
	
	
	

}
