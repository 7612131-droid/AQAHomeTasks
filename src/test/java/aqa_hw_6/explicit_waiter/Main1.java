package aqa_hw_6.explicit_waiter;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotline.ua/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement catalogButton = driver.findElement(By.cssSelector("[class='button-menu-main ']"));
        catalogButton.click();
        WebElement categoryButton = driver.findElement(By.cssSelector("[class='menu-main__item-icon icon-section icon-section--power']"));
        categoryButton.click();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("/power/"));

        driver.quit();

    }
}
