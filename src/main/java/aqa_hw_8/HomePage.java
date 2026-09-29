package aqa_hw_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static java.lang.Thread.sleep;

public class HomePage {

    private WebDriver driver;
    private WebDriverWait waiter;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        waiter = new WebDriverWait(driver, Duration.ofSeconds(9));
    }

    public void enterSearchText(String searchWord) {
        WebElement searchField = driver.findElement(By.cssSelector("[type='text']"));
        searchField.sendKeys(searchWord);
    }

    public void clickOnSearchButton() {
        WebElement searchButton = driver.findElement(By.cssSelector("button.search__btn.flex.middle-xs.center-xs"));
        searchButton.click();
    }

    public void clickOnLoginButton() {

        WebElement loginButton = driver.findElement(By.cssSelector("[class='user-info']"));
        loginButton.click();
    }


    public String justViewedProdact(int viewedProductIndex) {

        WebElement viewedElemet = driver.findElement(By.cssSelector("a.slider-card"));
        return viewedElemet.getText();

    }

    public void clickOnFAQUsers() {
        WebElement buttonFAQUsers = driver.findElement(By.cssSelector("[data-tracking-id=\"global-26\"]"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(buttonFAQUsers));
        Actions actions = new Actions(driver);
        actions.moveToElement(buttonFAQUsers).perform();
        buttonFAQUsers.click();
    }
}

