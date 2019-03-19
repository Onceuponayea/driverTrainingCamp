package com.great.mapping;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.great.entity.Control;
import com.great.entity.Menu;
import com.great.entity.School;
import com.great.entity.Student;
import com.great.entity.Teacher;
import com.great.entity.User;

@Repository
public interface UserInterface {
	public List<User> userLogin(String user_account, String user_pwd); //查询是什么角色登录,判断账号是否被禁用
	public List<Control> findControlByUid(int user_id); //根据user_id查询运营部门信息
	public List<School> findSchoolByUid(int user_id); //根据user_id查询驾校信息
	public List<Teacher> findTeacherByUid(int user_id); //根据user_id查询教练信息
	public List<Student> findStudentByUid(int user_id); //根据user_id查询学员信息
	public List<Menu> findMenuByRoleId(int role_id); //根据role_id查询菜单
	public Student checkStudentIdentity(String student_idnum); //查看学员身份证是否被注册
	public Student checkStudentPhone(String student_phone); //查看学员电话是否被注册
	public void insertIntoTblUser(User user); //学员和驾校注册插入账号密码等信息到user表
	public int findNewInsertUid(String user_account); //查询新插入数据的user_id
	public void insertStudentInfo(Student student); //学员注册
	public List<School> findAllSchools(); //查询所有驾校
	public List<Teacher> findTeacherBySchool(int school_id); //根据驾校查询所有教练
	public School checkSchoolPhone(String school_phone); //查询驾校电话是否被注册
	public School checkSchoolIdentity(String school_code); //查询驾校证件号是否被注册
	public void insertSchoolInfo(School school); //驾校开通申请(注册)
	
}
