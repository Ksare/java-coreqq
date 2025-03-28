package lr10;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.List;


public class ex6 {
    public static void main(String[] args) {
        try {
            // Получаем HTML-код страницы
            Document doc = Jsoup.connect("https://urfu.ru/ru/novosti/").get();

            // Извлекаем список новостей
            Elements newsParent = doc.select("body > table > tbody > tr > td > div > table > " +
                    "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > " +
                    "tr > td:nth-child(1)");

            // Выводим последние 10 новостей в консоль
            for (int i = 3; i < 20; i++) {
                if (!(i % 2 == 0)) {
                    List<Node> nodes = newsParent.getFirst().childNodes();
                    System.out.println("Тема: " +
                            ((Element) nodes.get(i)).getElementsByClass("blocktitle").getFirst().childNodes().getFirst());

                    System.out.println("Дата: " +
                            ((Element) nodes.get(i)).getElementsByClass("blocktitle").getFirst().childNodes().getFirst() + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



