package com.cucumber.steps;

import com.codeborne.selenide.WebDriverRunner;
import com.cucumber.config.PropertiesConfig;
import com.cucumber.config.WebdriverBeanConfig;
import com.cucumber.page.SearchPage;
import com.cucumber.service.BasePageService;
import com.cucumber.service.SearchPageService;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import static com.codeborne.selenide.Selenide.open;

public class SearchPageStep {


    @Autowired
    private SearchPageService searchPageService;

    @When("click to post page")
    public void inputTextInToSearchField() {
        searchPageService.clickToSearchLink();
    }

}
