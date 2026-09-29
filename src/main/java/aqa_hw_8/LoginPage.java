package aqa_hw_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    private WebDriver driver;
    private WebDriverWait waiter;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        waiter = new WebDriverWait(driver, Duration.ofSeconds(9));
    }


    public void clickOnUserAgrement() {

        WebElement userAgrimentButton = driver.findElement(By.cssSelector("[href=\"/ua/page/user_agreement/\"]"));
        userAgrimentButton.click();

    }

    public boolean verifyOpenUserAgrement() {
        String secondTabId = driver.getWindowHandles().stream().toList().get(1);
        driver.switchTo().window(secondTabId);
        return driver.getCurrentUrl().endsWith("/user_agreement/");


    }
}
