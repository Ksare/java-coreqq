package lr10;

import org.jsoup.Jsoup;

import javax.lang.model.util.Elements;
import javax.swing.text.Element;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class ex5 {
    public static void main(String[] args) {

    String url = "https://itlearn.ru/first-steps";
        try {
        Document doс = Jsoup.connect(url).get();
        Elements links = doс.select("a[href]");
        for (Element link: links) {
            System.out.println(link.attr("abs:href"));
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
}
}

