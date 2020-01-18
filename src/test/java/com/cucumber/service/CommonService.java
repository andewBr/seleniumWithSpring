package com.cucumber.service;

import com.codeborne.selenide.SelenideElement;
import com.cucumber.page.Page;
import org.springframework.stereotype.Service;

import java.util.Map;

import static com.codeborne.selenide.Condition.visible;

@Service
public abstract class CommonService {

    protected SelenideElement getFromMap(Map<String, SelenideElement> map, String name){
        return map.get(name);
    }

    public String getText(Page obj, String element) {
        return getFromMap(obj.getElements(), element).getText();
    }

    public void clickButton(Page obj, String button){
        getFromMap(obj.getElements(), button).click();
    }

    public void inputText(Page obj, String field, String text){
        getFromMap(obj.getElements(), field).setValue(text);
    }

    public void isElementDisplayed(Page obj, String element){
        getFromMap(obj.getElements(), element).shouldBe(visible);
    }

}
