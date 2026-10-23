package aqa_hw_12;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class SearchResultPageStepDefinition extends BaseStepDefinition {
    private final SearchResultPage searchResultPage = new SearchResultPage();

    @And("User select laptop manufacturer on the filter on the Search Rasult Page")
    public void selectManufacturButton() {
        searchResultPage.selectManufacturButton();
    }

    @Then("Verify founded products are displayed correctly")
    public void checkFoundedProducts() {
        searchResultPage.checkFoundedProducts();
    }

    @Then("Verify name product from the search result list the same as name fist product")
    public void checkSearchSameList() {
        String firstNameProduct = getValueFromMapByKey("firstNameProduct");
        String fondedNameProduct = searchResultPage.getNameOfElemets();
        Assert.assertTrue(fondedNameProduct.contains(firstNameProduct));
    }
}
