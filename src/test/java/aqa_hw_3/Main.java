package aqa_hw_3;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.String.format;
import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        try {
            String wordToFind = "Електросамокат";

            driver.get("https://hotline.ua");
            driver.manage().window().maximize();
            WebElement searchFeild = driver.findElement(By.cssSelector("[type='text']"));
            searchFeild.sendKeys(wordToFind);
            sleep(3000);

            WebElement searchButton = driver.findElement(By.cssSelector("[title='Поиск']"));
            searchButton.click();
            sleep(7000);

            WebElement titleElement = driver.findElement(By.cssSelector("[class='search__title']"));
            String pageTitleString = titleElement.getText();
            Assert.assertTrue(format("<%s> title doesn't contain <%s> word", pageTitleString, wordToFind), pageTitleString.contains(wordToFind));


            WebElement feedbackButton = driver.findElement(By.cssSelector("[class='footer__category-item flex middle-xs']"));
            feedbackButton.click();
            sleep(3000);

            String wordOnPage = "Відгуки покупців";
            WebElement feedbackPage = driver.findElement(By.cssSelector("[class='reviews__title m_b-15']"));
            String wordToGet = feedbackPage.getText();

            Assert.assertTrue("Feedback page is not displayed", feedbackPage.isDisplayed());
            Assert.assertTrue(format("<%s> title doesn't contain <%s> word", wordToGet, wordOnPage), wordToGet.contains(wordOnPage));


        } catch (AssertionError ex) {
            ex.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
