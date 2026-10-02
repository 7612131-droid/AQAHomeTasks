package aqa_hw_9;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ProductDetailPage {


    public boolean checkProductListDisplayed() {

        return $("div._2GUpMSFoOfWffLkAQTjV").isDisplayed();

    }

    public void backOnHomePage() {
        $("a.logo-container__link.nuxt-link-active").click();


    }
}
