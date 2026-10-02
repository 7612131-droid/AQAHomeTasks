package aqa_hw_9;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {


    public void searchField(String searchWord) {
        $("[type='text']").setValue(searchWord).pressEnter();

    }

    public void clickOnSearchButton() {
        $("button.search__btn.flex.middle-xs.center-xs").click();

    }

    public void clickOnLoginButton() {

        $("[class='user-info']").click();

    }

    public void clickOnFAQUsers() {
        $("[data-tracking-id=\"global-26\"]").click();

    }
}
