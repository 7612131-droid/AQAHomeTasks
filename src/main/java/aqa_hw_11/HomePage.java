package aqa_hw_11;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Condition.*;
public class HomePage {

    protected String searchModel;
    public void clickOnFirstProduct(){
        $$("[class=\"common-text ws-pre-wrap titleS\"]").first().scrollTo().shouldBe(visible).click();
    }
    public void clickOnNewCarButton() {
        $$("[class=\"common-text body\"]").get(2).click();

    }
    public void searchModelButton(String searchModel) {
        $$("[class=\"select-value\"]").get(1).click();
        $("[type=\"text\"]").shouldBe(visible).setValue(searchModel);
        $$("[class=\"label-content-wrapper side-left large\"]").findBy(text(searchModel)).click();
    }

    public void clickOnSearchButton() {
        $("[type=\"submit\"]").click();
    }

    public void clickOnSelectYearsButton(){
        $("[for=\"year\"]").click();
        $("[for=\"year.from2026\"]").click();
        $("[for=\"year.to2026\"]").click();
    }
}
