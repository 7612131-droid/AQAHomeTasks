package aqa_hw_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SearchResultPage {
    private WebDriver driver;
    private WebDriverWait waiter;
    private static final By TITLE_ELEMENT = By.cssSelector("h1.catalog-title__main");
    private static final By PRODUCT_ELEMENTS = By.cssSelector("div.list-item");

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
        waiter = new WebDriverWait(driver, Duration.ofSeconds(9));
    }


    public String getProductName(int productIndex) {
        WebElement product = getProductElement(productIndex);
        WebElement productName = waiter.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector("[class='list-item__title-container m_b-5']"))));
        return productName.getText();
    }

    public void clickOnProduct(int productIndex) {
        WebElement product = getProductElement(productIndex);
        WebElement productPicture = product.findElement(By.cssSelector("[class='list-item__photo']"));
        productPicture.click();
    }

    private WebElement getProductElement(int productIndex) {
        waiter.until(ExpectedConditions.numberOfElementsToBeMoreThan(PRODUCT_ELEMENTS, 8));
        List<WebElement> productElements = driver.findElements(PRODUCT_ELEMENTS);
        return productElements.get(productIndex - 1);
    }


}

