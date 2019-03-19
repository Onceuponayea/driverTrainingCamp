package com.great.mapping;

import java.util.List;

import com.great.entity.Crawler;

public interface CrawlerInterface {
	//根据时间获取爬虫信息
	public List<Crawler> getInfo(String time);
	//添加爬虫爬取的信息
	public void addInfo(Crawler crawler);
	//删除爬虫爬取的信息
	public void delInfo(int crawler_id); 

}
