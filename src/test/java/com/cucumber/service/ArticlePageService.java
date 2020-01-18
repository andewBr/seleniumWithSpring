package com.cucumber.service;


import com.cucumber.page.ArticlePage;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticlePageService extends CommonService {

    @Autowired
    private ArticlePage articlePage;

    public void  checkResult(String article){
        String articleTitle = getText(articlePage, "articleTitle");
        Assert.assertEquals(articleTitle, article);
    }

}

