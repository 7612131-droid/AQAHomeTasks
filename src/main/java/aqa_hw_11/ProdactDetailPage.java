package aqa_hw_11;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProdactDetailPage {

    public void addToFavoriteList() {
        $("[data-action=\"notepad\"]").click();
    }

    public void clickOnFavoriteButton(){
        $$("[class='ghost']").get(1).click();
    }

    public void clickOnSearchLink(){
       $("svg.svg.svg_i16_search").shouldBe(visible).click();
    }

    public void clickOnGreenButton(){
        $("[id=\"react-phones-aside\"]").scrollTo().shouldBe(visible).click();
    }

    public void checkAppearPhoneWindow(){
        $("[class=\"mb-15 \"]").shouldBe(visible);
    }
}
