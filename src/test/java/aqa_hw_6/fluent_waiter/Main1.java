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


public class Main1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotline.ua/");


        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(8))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        WebElement motoButton = driver.findElement(By.cssSelector("[class='icon-section--categories icon-section--categories--auto']"));
        motoButton.click();

        WebElement autoTireButton = fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='фото Шини']")));
        autoTireButton.click();

        WebElement favoriteButton = driver.findElement(By.cssSelector("[class='bookmark-button__icon-wrapper']"));
        favoriteButton.click();

        WebElement notification = fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='bookmark-list']")));


        Assert.assertTrue("Повідомлення про додавання в обране не зєявилось", notification.isDisplayed());


        driver.quit();


    }
}
