package aqa_hw_11;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class FavoritesPage {
    public void clickOnTheSelectAllButton() {

        $("[id=\"selectAllAction\"]").click();
    }

    public void clickOnDeleteButton() {

        $("[id=\"deleteSelectedAction\"]").click();
    }

    public String cunterAddInFavoriteList(){
        return $("[id=\"advertisementsCounter\"]").text();
    }
    public String textAfterDeleteProduct(){
        return $("[ id=\"advertisementsCounter\"]").text();
    }
    public boolean checkFavoriteList() {

        return $("[class=\"notepad-empty\"]").isDisplayed();
    }
}
