package aqa_hw_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class Tests1 extends BaseTest {

    @Test
    public void test1() {
        WebElement loginButton = getDriver().findElement(By.cssSelector("a[href='/ua/login/']"));
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(6));
        loginButton.click();
        Assert.assertTrue(getDriver().getCurrentUrl().endsWith("/login/"));
    }

    @Test
    public void test2() {
        WebElement computerBatton = getDriver().findElement(By.cssSelector("[class='icon-section--categories icon-section--categories--computer']"));
        computerBatton.click();

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(6));
        WebElement computerListButton = getDriver().findElement(By.cssSelector("[src='/img/uploads/clients/12=5e6b9c1650bf1.jpg']"));
        computerListButton.click();

        WebElement firstProdustFavorite = getDriver().findElement(By.cssSelector("div.bookmark-button__icon-wrapper"));
        firstProdustFavorite.click();

        WebElement fieldNewFavoriteList = getDriver().findElement(By.cssSelector("[class='input field']"));
        fieldNewFavoriteList.sendKeys("New");

        WebElement errorButton = getDriver().findElement(By.cssSelector("[class='custom-input__invalid-text error']"));

        Assert.assertTrue(errorButton.isDisplayed(), "Повідомлення не з'являється");


    }

}
