package com.yhbae;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class WebCrawlingTest {

    @Test
    @DisplayName("웹 크롤링 테스트")
    void crwalingTest() throws IOException {
        String url = "https://sports.news.naver.com/index";

        Document doc = Jsoup.connect(url).get();

        String title = doc.title();
        assertEquals("스포츠홈 : 네이버 스포츠", title, "Page title should match");

        Elements links = doc.select("a[href]");
        assertFalse(links.isEmpty(), "Links should not be empty");

    }

}
