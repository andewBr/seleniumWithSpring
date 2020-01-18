package com.cucumber.steps;

import com.codeborne.selenide.WebDriverRunner;
import com.cucumber.config.PropertiesConfig;
import com.cucumber.config.WebdriverBeanConfig;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import static com.codeborne.selenide.Selenide.open;

@ContextConfiguration(classes = {WebdriverBeanConfig.class})
public class BasePageStepDefs {


    @Autowired
    private PropertiesConfig config;

    public BasePageStepDefs() {

    }

    @Before
    public void before() {
        open(config.getWeb().getBaseurl());
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    @After
    public void after() {
        WebDriverRunner.clearBrowserCache();
    }


}
