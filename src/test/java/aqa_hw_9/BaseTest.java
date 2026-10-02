package aqa_hw_9;

import com.codeborne.selenide.Selenide;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import java.time.Duration;


public class BaseTest {



    @BeforeMethod
    public void beforeMethod() {

        Selenide.open("https://hotline.ua/");

    }




    @AfterMethod
    public void quitDriver() {
        Selenide.closeWebDriver();
    }
}