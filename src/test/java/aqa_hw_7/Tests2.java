package aqa_hw_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Tests2 extends BaseTest {

    @Test
    public void test3() {
        WebElement catalogButton = getDriver().findElement(By.cssSelector("div.button-menu-main "));
        catalogButton.click();

        WebElement energoButton = getDriver().findElement(By.cssSelector("[href='/ua/power/']"));
        energoButton.click();

        WebElement powerBankButton = getDriver().findElement(By.cssSelector("[href='/ua/mobile/universalnye-batarei/']"));
        powerBankButton.click();

        WebElement compairButton = getDriver().findElement(By.cssSelector("[class='compare-button']"));
        compairButton.click();

        WebElement counterButton = getDriver().findElement(By.cssSelector("span.button__count"));

        Assert.assertTrue(counterButton.isDisplayed());
    }

    @Test
    public void test4() {
        WebElement loyaltyButton = getDriver().findElement(By.cssSelector("[class='services-section__link link--black bonuses']"));
        loyaltyButton.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(6));
        WebElement enterButton = getDriver().findElement(By.cssSelector("[class='loyalty-more-bonus__button text-center btn btn--graphite']"));
        enterButton.click();

        Assert.assertTrue(getDriver().getCurrentUrl().endsWith("/login/"));
    }


}
