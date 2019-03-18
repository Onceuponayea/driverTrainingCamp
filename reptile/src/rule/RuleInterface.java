package rule;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public interface RuleInterface {
	public Elements getInfo(Document doc); //获取页面有关链接和标题的内容
	public String getElement(Element ele);//获取超链接
	public String getTitle(Element ele);//获取标题

}
