package aqa_hw_7;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Tests3 extends BaseTest {

    @Test(dataProvider = "getSearchData", dataProviderClass = ProviderData.class)
    public void test5(String wordSearh, String wordTitle) {

        WebElement searchField = getDriver().findElement(By.cssSelector("[type='text']"));
        searchField.sendKeys(wordSearh);
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(6));

        WebElement searchButton = getDriver().findElement(By.cssSelector("button.search__btn.flex.middle-xs.center-xs"));
        searchButton.click();

        WebElement searchPage = getDriver().findElement(By.cssSelector("div.search__title"));
        String wordOfPage = searchPage.getText();

        Assert.assertEquals(wordOfPage, wordTitle);


    }

}
