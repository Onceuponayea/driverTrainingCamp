package test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import entity.Url;
import rule.RuleInterface;
import rule.RuleOne;
import rule.RuleTwo;
import tool.Catch;

public class Test {
	public static void main(String[] args) {
		/*try {
			URL url=new URL("http://www.jpxcw.com");
			
			URLConnection urlConnect=url.openConnection();
			BufferedInputStream bis=new BufferedInputStream(urlConnect.getInputStream());
			
			FileOutputStream fos=new FileOutputStream(new File("D:/555.txt"));
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			int n=-1;
			while((n=bis.read())!=-1) {
				bos.write(n);
				bos.flush();
			}
			bos.close();
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		RuleInterface ruleOne=new RuleOne();
		Url url=new Url("http://www.jpxcw.com", "\\w+\\.\\w+\\?.+\\d", ruleOne);//输入网址,匹配规则和获取内容接口
		Catch.catchUrl(ruleOne, url);
		ruleOne=new RuleTwo();
		url=new Url("http://news.16888.com/zcfg/index.html", null, ruleOne);
		Catch.catchUrl(ruleOne, url);
	}

}
