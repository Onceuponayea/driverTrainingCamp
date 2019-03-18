package rule;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class RuleTwo implements RuleInterface {

	@Override
	public Elements getInfo(Document doc) {
		Elements ele=doc.select(".news_list dt a").select("a[target]");//ul[class='home-common-ul'].eq(1)
		return ele;
	}

	@Override
	public String getElement(Element ele) {
		String link= ele.attr("href");
		return link;
	}

	@Override
	public String getTitle(Element ele) {
		// TODO Auto-generated method stub
		String title= ele.text();
		return title;
	}

}
