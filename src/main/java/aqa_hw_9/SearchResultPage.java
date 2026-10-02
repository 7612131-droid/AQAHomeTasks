package aqa_hw_9;


import static com.codeborne.selenide.Selenide.$;

public class SearchResultPage {

    public void clickOnProduct(int productIndex) {
        $("[class='list-item__photo']").click();

    }

}