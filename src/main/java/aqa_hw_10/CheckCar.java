package aqa_hw_10;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;

public class CheckCar {

   @Step("User enter incoorect message in the check field on the ChekCar page")
   public void fieldForVIN(String vin) {

        $("[type=\"text\"]").setValue(vin).click();
        $("[class=\"size-large conversion\"]").click();

    }

    @Step("User checks appearing erroe message after wrong date enter on the ChekCar page")
    public void checkErrorMessageDisplayed() {
        $("[class=\"text-feedback body\"]").shouldBe(visible);

    }
}
