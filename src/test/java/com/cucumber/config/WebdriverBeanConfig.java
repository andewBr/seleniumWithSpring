package com.cucumber.config;

import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.test.annotation.DirtiesContext;

@Configuration // сообщает spring что в этом пакете конфигурация
@ComponentScan("com.cucumber") // наподобии GLUR из cucumber сканирует указанный пакет на
@Import({DBBeanConfig.class, PropertiesConfig.class})
@DirtiesContext(methodMode = DirtiesContext.MethodMode.AFTER_METHOD) // @DirtiesContext пересоздаем контекст после метода теста
public class WebdriverBeanConfig {

    @Qualifier("chrome")
    @Bean
    public WebDriver chromeDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        WebDriverRunner.setWebDriver(driver); // говорим WebDriver что будем использовать selenide
        return WebDriverRunner.getWebDriver();
    }


}