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
	//�鿴���м�У��Ϣ
	public List<School> selectAllSchool();
	//ͨ����Уid�޸ļ�У״̬��Խ�ֹ�ͻָ����������
	public void updateSchoolStateById();
	//�鿴���н�������ϸ��Ϣ
	public void selectAllTeacher();
	//ͨ���������������id
	public void selectTeacherIdByName(@Param("teacher_name")String teacher_name );
	//��ѯ���н�������Ϣ
	public List<Car> selectAllCar();
	//�鿴����ѧԱ��Ϣ
	public List<Student> selectAllStudent();
	//��ѯ������Ϣ
	public List<Message> selectAllMessage();
	//���ӹ�����Ϣ
	public void addMassage(@Param("massage_content")String massage_content ,
			@Param("massage_time")String massage_time);
	//��ѯ��У��״̬��������ʾ
/*	public List<SchooleState> selectSchoolState();
	//��ѯ��У��ͨ�����
	public List<SchoolApply> selectSchoolApply();*/
	//������У��ͨ����
	public void updateSchoolApplyState(@Param("schoolapply_id") int schoolapply_id);
	
	
	
	
	

}
