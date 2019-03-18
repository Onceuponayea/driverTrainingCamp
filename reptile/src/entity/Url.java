package entity;

import rule.RuleInterface;

public class Url {
	private String urlName;  //url名字
	private String match;    //是否需要正则匹配
	private RuleInterface rule; //获取链接和标题的接口
	public Url(String urlName, String match, RuleInterface rule) {
		super();
		this.urlName = urlName;
		this.match = match;
		this.rule = rule;
	}
	public String getUrlName() {
		return urlName;
	}
	public void setUrlName(String urlName) {
		this.urlName = urlName;
	}
	public String getMatch() {
		return match;
	}
	public void setMatch(String match) {
		this.match = match;
	}
	public RuleInterface getRule() {
		return rule;
	}
	public void setRule(RuleInterface rule) {
		this.rule = rule;
	}
	
	

}
