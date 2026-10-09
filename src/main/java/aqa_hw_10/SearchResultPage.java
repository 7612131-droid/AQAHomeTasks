package aqa_hw_10;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultPage {

    @Step("USer clicks on the fisrt product of the list elements on Search Result Page")
    public void clickOnProduct() {
        $$("div.proposition_area").first().click();
    }

    @Step("User gets name of the region")
    public String foundRegion(){
        return $$("[class=\"common-text ellipsis-1 body\"]").get(3).shouldBe(visible).text();
    }


    @Step("USer clicks on the check car button on Search Result Page")
    public void checkCarButton(){
        $("[href=\"https://auto.ria.com/uk/check-car/\"]").scrollTo().click();
    }
}
