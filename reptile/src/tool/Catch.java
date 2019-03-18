package tool;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import entity.Url;
import rule.RuleInterface;

public class Catch {
	public static Pattern p=null;
	public static void catchUrl(RuleInterface ruleOne,Url url) {
		try {
			Document doc=Jsoup.connect(url.getUrlName()).get();
			if(null!=url.getMatch()) {                      //判断是否需要正则表达式过滤链接,不需要则为空
				 p=Pattern.compile(url.getMatch());
			}
			else {
				p=null;
			}
			Elements links = ruleOne.getInfo(doc);   //根据相应方法获取页面特定内容
			for (Element element : links) {
				/*System.out.println(element);*/
				String urlBefore=ruleOne.getElement(element);//获取超链接
				if(null!=p) {                            //如果需要正则,则过滤超链接
					Matcher m=p.matcher(urlBefore);
					while(m.find()) {
						System.out.println(url.getUrlName()+"/"+m.group());
					}
				}
				else {
					System.out.println(urlBefore);  //输出超链接
				}
				
				System.out.println(ruleOne.getTitle(element)); //输出标题
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
