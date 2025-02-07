package com.bkukowski.newsmediator.model.internal;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class NewsTest {

    @Test
    void whenSetCountryAndCategory_thenExpectedCountryAndCateory() {
        News news = new News().setCategory("technology").setCountry("pl");
        assertEquals("pl", news.getCountry());
        assertEquals("technology", news.getCategory());
        assertNull(news.getArticles());
    }

}