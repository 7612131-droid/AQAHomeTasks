package aqa_hw_10;

import io.qameta.allure.Epic;

import io.qameta.allure.Description;
import org.apache.http.io.SessionOutputBuffer;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests extends BaseTest {

    @Test
    @Description("Verify changing color of the car on the prodact detail page after click color button")
    @Epic("Search")
    public void verifyChangingColorOfCar() {
        String searchModel = "Volkswagen";

        HomePage homePage = new HomePage();
        homePage.clickOnNewCarButton();
        homePage.searchModelButton(searchModel);
        homePage.clickOnSearchButton();

        SearchResultPage searchResultPage = new SearchResultPage();
        searchResultPage.clickOnProduct();

        ProductDetailPage productDetailPage = new ProductDetailPage();
        productDetailPage.clickOnColorButton();
        productDetailPage.checkColor("Grenadilla Black");
    }

    @Test
    @Description("Verify redirect to the next advertisement after click on the next advertisement button")
    @Epic("Search")
    public void verifyNextAdvButton() {
        HomePage homePage = new HomePage();
        homePage.clickOnNewCarButton();
        homePage.searchModelButton("BMW");
        homePage.clickOnSearchButton();

        SearchResultPage searchResultPage = new SearchResultPage();
        searchResultPage.clickOnProduct();

        ProductDetailPage productDetailPage = new ProductDetailPage();

        String first = productDetailPage.titleFirstElement();

        productDetailPage.nextAdButton();

        String second = productDetailPage.titleSecondElement();

        Assert.assertNotEquals(first, second);

    }

    @Test
    @Description("Check search by region")
    @Epic("Search")
    public void verifySearchResultByRegion() {
        String searchRegion = "Київ";
        HomePage homePage = new HomePage();
        homePage.usedCarButton();
        homePage.searchRegionButton(searchRegion);

        SearchResultPage searchResultPage = new SearchResultPage();
        String resultRegion = searchResultPage.foundRegion();


        Assert.assertEquals(resultRegion, searchRegion);


    }

    @Test
    @Description("Verify appear error message after enter incorrect data on the text field on  the Serach Result Page")
    @Epic("Verify car")
    public void checkAppearMessage() {
        String vin = "1212121212";
        HomePage homePage = new HomePage();
        homePage.allForCarButton();

        SearchResultPage searchResultPage = new SearchResultPage();
        searchResultPage.checkCarButton();

        CheckCar checkCar = new CheckCar();
        checkCar.fieldForVIN(vin);
        checkCar.checkErrorMessageDisplayed();


    }
}
