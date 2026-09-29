package aqa_hw_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductDetailPage {
    private WebDriver driver;
    private WebDriverWait waiter;

    public ProductDetailPage(WebDriver driver) {
        this.driver = driver;
        waiter = new WebDriverWait(driver, Duration.ofSeconds(9));
    }

    public boolean productListCost() {
        WebElement listShops = driver.findElement(By.cssSelector("div._2GUpMSFoOfWffLkAQTjV"));
        listShops.isDisplayed();
        return true;
    }

    public void backOnHomePage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement backOnHomeButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.logo-container__link.nuxt-link-active")));
        backOnHomeButton.click();
    }

}
