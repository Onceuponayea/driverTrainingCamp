package com.great.mapping;

import java.util.List;

import com.great.entity.Link;

public interface LinkInterface {
		//获取友情链接
		public List<Link> getLink();
		//添加友情链接
		public void addLink(Link crawler);
		//删除友情链接
		public void delLink(int link_id);

}
