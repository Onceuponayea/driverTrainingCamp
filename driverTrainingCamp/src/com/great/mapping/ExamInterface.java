package com.great.mapping;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.great.entity.Choose;
import com.great.entity.Radio;

@Repository("examInterface")
public interface ExamInterface {
	public List<Radio> getRadio(int num);// 随机获取选择题

	public List<Choose> getChoose(int num);// 随机获取判断题

	public int addRadio(Radio radio);// 添加选择题

	public int addChoose(Choose choose);// 添加判断题
}
