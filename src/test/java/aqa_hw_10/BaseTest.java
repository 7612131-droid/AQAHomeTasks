package aqa_hw_10;


import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;


public class BaseTest {

    @BeforeMethod
    public void beforeMethod() {
        Selenide.open("https://auto.ria.com/uk/");
        $(".gdpr button").click();
    }

    @AfterMethod
    public void afterMethod() {
        Selenide.closeWebDriver();
    }

}
