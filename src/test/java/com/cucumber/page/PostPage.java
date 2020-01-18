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
public class PostPage implements Page {

    private final Map<String, SelenideElement> elements = new HashMap<String, SelenideElement>() {{
        put("searchFromPostPage", $(By.className("post__title-text")));
    }};


}
