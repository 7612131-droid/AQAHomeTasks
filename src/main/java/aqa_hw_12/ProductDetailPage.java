package aqa_hw_12;


import org.junit.Assert;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProductDetailPage {

    public void clickOnSimilarProduct() {
        $("[class=\"show-similar-link__icon-container\"]").click();
    }

    public String nameProduct() {
        return $("div.title").shouldBe(visible).getText();

    }


}
