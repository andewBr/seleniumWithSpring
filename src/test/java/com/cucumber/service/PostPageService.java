package com.cucumber.service;


import com.cucumber.page.PostPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostPageService extends CommonService {

    @Autowired
    private PostPage postPage;

    public void search(){
        clickButton(postPage,"searchFromPostPage");
    }



}

