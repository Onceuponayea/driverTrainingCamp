package com.great.mapping;

import java.util.List;

import com.great.entity.EvaSchool;
import com.great.entity.EvaTheacher;

public interface EvaluateInterface {
	public List<EvaSchool> getEvaSchool(int school_id);// 获取驾校评价

	public List<EvaTheacher> getEvaTheacher(int theacher_id);// 获取教练评价

	public int AddEvaSchool(EvaSchool evaSchool);// 添加驾校评价

	public int AddEvaTheacher(EvaTheacher evaTheacher);// 添加教练评价
}
