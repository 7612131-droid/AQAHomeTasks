package aqa_hw_11;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultPage {

    public void clickOnProduct(){
        $$("[class=\"proposition_name\"]").first().scrollTo().shouldBe(visible).click();
    }

    public void checkFoundModels(){
        $$("[class=\"proposition_area\"]").filterBy(text("Audi")).shouldHave(size($$("[class=\"proposition_area\"]").size()));

    }


}
