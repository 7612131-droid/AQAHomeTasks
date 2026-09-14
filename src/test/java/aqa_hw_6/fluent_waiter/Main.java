package aqa_hw_6.fluent_waiter;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotline.ua/");

        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(8))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        WebElement allForHouseButton = driver.findElement(By.xpath("//span[text()='Все для дому']"));
        allForHouseButton.click();

        WebElement chairButton = fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='фото Офісні крісла']")));


        Assert.assertTrue(chairButton.isDisplayed());


        driver.quit();
    }
}
