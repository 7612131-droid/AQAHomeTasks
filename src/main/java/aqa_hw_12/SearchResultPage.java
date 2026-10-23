package aqa_hw_12;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultPage {

    public void selectManufacturButton() {
        $$("[class=\"search-sidebar-checklist__item-name link link--black\"]").get(0).scrollTo().click();
    }

    public void checkFoundedProducts() {
        $$("[class=\"item-title text-md link link--black\"]").forEach(element ->
                element.shouldHave(text("Microsoft")));
    }

    public String getNameOfElemets() {
        return $("[class=\"spec-item spec-item--bullet\"]").getText();
    }
}
