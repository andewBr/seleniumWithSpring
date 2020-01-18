package com.cucumber.steps;

import com.cucumber.service.ArticlePageService;
import com.cucumber.service.BasePageService;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;


public class ArticlePageStep {

    @Autowired
    private ArticlePageService articlePageService;

    @Then("I am on result page with {string}")
    public void inputTextInToSearchField(String article) {
        articlePageService.checkResult(article);
    }


}
