package com.great.mapping;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.great.entity.Log;
import com.great.entity.Param;

@Repository
public interface AdministrationInterface {
	public void insertLogInfo(Log log); //添加日志
	public List<Log> selectAllLog(); //查询日志
	public void updateLogById(Log log); //修改日志
	public void deleteLogById(int log_id); //删除日志
	public void insertParam(Param param); //添加参数
	public List<Param> selectAllParam(); //查询参数
	public void updateParamById(Param param); //修改参数
	public void deleteParamById(int param_id); //删除参数
	
}
