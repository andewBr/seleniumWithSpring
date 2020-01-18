package com.cucumber.page;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Selenide.$;

@Getter
@Component
public class ArticlePage implements Page {

    private final Map<String, SelenideElement> elements = new HashMap<String, SelenideElement>() {{
        put("articleTitle", $(By.xpath("//span[@class='post__title-text']")));
    }};


}
