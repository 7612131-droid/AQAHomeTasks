package aqa_hw_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelpPage {
    private WebDriver driver;

    public HelpPage(WebDriver driver) {
        this.driver = driver;

    }

    public void clickOnPersonalAccount() {
        WebElement personalAccountButton = driver.findElement(By.cssSelector("[class=\"faq-category-item__title\"]"));
        personalAccountButton.click();


    }

    public void clickOnWriteUs() {
        WebElement writeUsButton = driver.findElement(By.cssSelector("a.link-blue"));
        writeUsButton.click();

    }

    public boolean verifyCorrectPage() {
        return driver.getCurrentUrl().endsWith("/feedback/");
    }
}
