package aqa_hw_12;


import aqa_hw_12.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static com.codeborne.selenide.Selenide.$$;

public class HomePageStepDefinitions {

    private final HomePage homePage = new HomePage();

    @Given("User opens Home Page")
    public void openHomePage() {
        homePage.openHomePage();
    }

    @When("User click location button on the home page")
    public void clickLocationButton() {
        homePage.clickOnLocationButton();
    }

    @And("User select new location \"Харків\" on the pop-up window")
    public void chooseNewLocation() {
        homePage.chooseNewLocation();
    }

    @Then("Verify new location is displayed")
    public void verifyNewLocationDisplayed() {
        Assert.assertTrue(homePage.verifyNewLocationDisplayed());
    }

    @When("User enter {string} on the search field on the Home page")
    public void enterSearchWord(String searchWord) {
        homePage.enterSearchWord(searchWord);
    }

    @And("User click search button on the Home Page")
    public void clickSearchButton() {
        homePage.clickSearchButton();
    }

    @And("Click on the product from recomendation list on the home page")
    public void clickOnRecomendProduct() {
        homePage.clickOnRecomendProduct();
    }
}
