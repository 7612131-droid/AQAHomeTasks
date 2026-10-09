package aqa_hw_10;

import com.codeborne.selenide.conditions.Visible;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class HomePage {

    @Step("User clicks on new car button on navigation menu on the Home Page")
    public void clickOnNewCarButton() {
        $$("[class=\"common-text body\"]").get(2).click();
    }

    @Step("User write Model of the car and click enter on on navigation menu the Home Page")
    public void searchModelButton(String searchModel) {
        $$(".select-head").get(1).click();
        $("[type=\"text\"]").shouldBe(visible).setValue(searchModel);
        $$("[class=\"label-content-wrapper side-left large\"]").findBy(text(searchModel)).click();
    }

    @Step("User clicks on the search button on navigation menu on the Home Page")
    public void clickOnSearchButton() {
        $("[type=\"submit\"]").click();
    }

    @Step("User clicks on the used car button on navigation menu on the Home Page")
    public void usedCarButton() {
        $$("[class=\"select-label\"]").get(1).click();
    }

    @Step("User clicks on the search region button on navigation menu on the Home Page")
    public void searchRegionButton(String searchRegion) {
        $$(".select-head").get(4).click();
        $("[type=\"search\"]").shouldBe(visible).setValue(searchRegion);
        $$("[class=\"label-content-wrapper side-left large\"]").findBy(text(searchRegion)).click();
        $("[class=\"size-large primary\"]").click();
        $("[class=\"size-large primary\"]").click();
    }

    @Step("User clicks on the all for car button on the top navigation menu on the Home Page")
    public void allForCarButton() {
        $$("[class=\"nav-link\"]").get(2).click();
    }


}
