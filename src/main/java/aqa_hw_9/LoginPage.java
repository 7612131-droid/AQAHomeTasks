package aqa_hw_9;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.numberOfWindows;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;
import static com.codeborne.selenide.WebDriverRunner.url;

public class LoginPage {

    public void clickOnUserAgrement() {

        $("[href=\"/ua/page/user_agreement/\"]").click();

    }

    public boolean verifyOpenUserAgrement() {
        webdriver().shouldHave(numberOfWindows(2));
        switchTo().window(1);
        return url().contains("/user_agreement/");
    }
}
