package aqa_hw_4;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotline.ua/");
        sleep(3000);

        WebElement favoretiButton = driver.findElement(By.xpath("//div[@data-tracking-id='global-17']"));
        favoretiButton.click();
        sleep(4000);

        WebElement favoriteWindow = driver.findElement(By.xpath("//span[text()='Списки']"));
        Assert.assertTrue(favoriteWindow.isDisplayed());
        sleep(5000);

        WebElement feedbackButton = driver.findElement(By.cssSelector("[class='services-section__link link--black productReviews']"));
        feedbackButton.click();
        sleep(3000);
        Assert.assertTrue(driver.getCurrentUrl().endsWith("/products/"));

        WebElement homePage = driver.findElement(By.cssSelector("[class='container flex']"));
        homePage.click();

        WebElement loginButton = driver.findElement(By.cssSelector("[class='user-button__image flex middle-xs center-xs']"));
        loginButton.click();
        sleep(3000);
        Assert.assertTrue(driver.getCurrentUrl().endsWith("/login/"));

        driver.get("https://hotline.ua/");
        sleep(3000);
        String wordBt = "Побутова техніка";
        WebElement btButton = driver.findElement(By.xpath("//span[text()='Побутова техніка']"));
        btButton.click();
        sleep(3000);

        WebElement foundWords = driver.findElement(By.cssSelector("[class='title-page flex middle-xs section-title']"));
        String getWords = foundWords.getText();
        sleep(3000);
        Assert.assertEquals(wordBt, getWords);


        driver.quit();

    }

}
