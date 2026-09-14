package aqa_hw_6.explicit_waiter;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotline.ua/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement comparButton = driver.findElement(By.cssSelector("[class='button flex-column middle-xs center-xs header__icon']"));
        comparButton.click();

        By listComparWindow = By.cssSelector("[class='profile-sidebar__section-content flex-column']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(listComparWindow));
        WebElement comparWindow = driver.findElement(listComparWindow);

        Assert.assertTrue(comparWindow.isDisplayed());

        driver.quit();
    }
}
