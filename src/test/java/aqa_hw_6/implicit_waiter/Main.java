package aqa_hw_6.implicit_waiter;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://hotline.ua/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement smartButton = driver.findElement(By.xpath("//span[text()='Смартфони, Смарт-годинники']"));
        smartButton.click();

        WebElement watchButton = driver.findElement(By.xpath("//a[contains(text(), 'Смарт-годинники і фітнес-браслети')]"));
        watchButton.click();

        WebElement wordsOfPage = driver.findElement(By.cssSelector("[class='catalog-title__main']"));
        String wordsOfNames = wordsOfPage.getText();

        Assert.assertEquals("Смарт-годинники і фітнес-браслети", wordsOfNames);

        driver.quit();
    }
}
