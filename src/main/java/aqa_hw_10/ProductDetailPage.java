package aqa_hw_10;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ProductDetailPage {

    @Step("USer clicks on the color button under the photo on Product Detail Page")
    public void clickOnColorButton() {
        $("a.body_color.plain").click();
    }

    @Step("USer gets correct color name after chaning color on Product Detail Page")
    public void checkColor(String expectedColor) {
        $("div.mb-8.m-padding.flex.f-center.gap-4").shouldHave(text(expectedColor));
    }

    @Step("USer gets new color name on Product Detail Page")
    public String newColor() {
        return $("div.mb-8.m-padding.flex.f-center.gap-4").text();

    }

    @Step("USer gets product name of first product on Product Detail Page")
    public String titleFirstElement() {
        return $("[class='size24 green bold']").text();
    }

    @Step("USer clicks on the next advertisement button on Product Detail Page")
    public void nextAdButton() {
        $("[id='next_auto_listing']").click();

    }

    @Step("USer gets product name of second product on Product Detail Page")
    public String titleSecondElement() {
        return $("[class='size24 green bold']").text();
    }

}
