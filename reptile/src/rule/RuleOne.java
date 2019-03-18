package rule;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class RuleOne implements RuleInterface{

	@Override
	public Elements getInfo(Document doc) {
		// TODO Auto-generated method stub
		Elements ele=doc.select(".home-common-ul").eq(1).select("li");//ul[class='home-common-ul'].eq(1)
		return ele;
	}

	@Override
	public String getElement(Element ele) {
		// TODO Auto-generated method stub
		String link= ele.select("a").attr("onclick");
		return link;
	}

	@Override
	public String getTitle(Element ele) {
		// TODO Auto-generated method stub
		String title= ele.select("a").attr("title");
		return title;
	}

	

}
