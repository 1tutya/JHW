package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;


public class App 
{
    public static void main( String[] args ) throws IOException {
        String url = "https://opt-opt-opt.ru/";
        Document doc = Jsoup.connect(url).get();
        Elements elements = doc.select("div .bx_catalog_item");
        elements.forEach(e -> System.out.println(e.select(".bx_catalog_item_articul").text()
                + e.select(".bx_catalog_item_price").text() + " " + e.select("a").first().absUrl("href")));
    }
}
