package com.great.mapping;

import java.util.List;

import com.great.entity.SubjectTime;

public interface SubjectInterface {
	public List<SubjectTime> getSubjectTimeInfo(int student_id, int level_id);// 根据学生id、科目获取学时详情

	public int addSubjectTime(SubjectTime period);// 添加学时详情
}
