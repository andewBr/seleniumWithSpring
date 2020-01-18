package com.cucumber.steps;

import com.cucumber.service.BasePageService;
import cucumber.api.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;


public class MainPageStep {

    @Autowired
    private BasePageService basePageService;

    @Given("input text in to search field {string}")
    public void inputTextInToSearchField(String text) {
        basePageService.searchArticle(text);
    }


}
