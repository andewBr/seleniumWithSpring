package com.cucumber.service;

import com.cucumber.page.SearchPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchPageService extends CommonService {

    @Autowired
    private SearchPage searchPage;

    public void clickToSearchLink(){
        clickButton(searchPage,"postLink");
    }



}

