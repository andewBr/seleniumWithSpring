package com.cucumber.service;


import com.cucumber.page.BasePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasePageService extends CommonService {

    @Autowired
    private BasePage basePage;

    public void searchArticle(String value){
        clickButton(basePage,"elemSearchFromBasePage");
        inputText(basePage, "searchTextField", value);
        isElementDisplayed(basePage, "searchTextField");
        getFromMap(basePage.getElements(), "searchTextField").pressEnter();
    }



}

