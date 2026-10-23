package aqa_hw_12;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class HomePage {

    public void openHomePage() {
        Selenide.open("https://hotline.ua/");
    }

    public void clickOnLocationButton() {
        $("div.location__city").click();
    }

    public void chooseNewLocation() {
        $$("[class=\"cities-list__link\"]").get(6).click();
    }

    public boolean verifyNewLocationDisplayed() {
        return $("[title=\"Харків\"]").isDisplayed();
    }

    public void enterSearchWord(String searchWord) {
        $("[type=\"text\"]").setValue(searchWord).pressEnter();
    }

    public void clickSearchButton() {
        $("[title=\"Поиск\"]").click();
    }

    public void clickOnRecomendProduct() {
        $$("[class=\"popular-products-section__product col-sm-6 col-xs-6 col-xl-3 col-lg-4\"]").get(0)
                .scrollTo().click();
    }
}
