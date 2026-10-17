package aqa_hw_11;


import org.junit.Assert;
import org.testng.annotations.Test;

public class Tests extends BaseTest {

    @Test
    public void verifySuccessCleanFavoriteList() {
        testCaseId = 47;
        HomePage homePage = new HomePage();
        homePage.clickOnFirstProduct();

        ProdactDetailPage prodactDetailPage = new ProdactDetailPage();
        prodactDetailPage.addToFavoriteList();
        prodactDetailPage.clickOnFavoriteButton();

        FavoritesPage favoritesPage = new FavoritesPage();
        String addingProduct = favoritesPage.cunterAddInFavoriteList();

        favoritesPage.clickOnTheSelectAllButton();
        favoritesPage.clickOnDeleteButton();
        String emptyFavoriteList = favoritesPage.textAfterDeleteProduct();

        Assert.assertNotEquals(addingProduct, emptyFavoriteList);

    }

    @Test
    public void verifySearchSameModelFromPDP() {
        testCaseId = 48;
        String searchModel = "Audi";
        HomePage homePage = new HomePage();
        homePage.clickOnNewCarButton();
        homePage.searchModelButton(searchModel);
        homePage.clickOnSearchButton();

        SearchResultPage searchResultPage = new SearchResultPage();
        searchResultPage.clickOnProduct();

        ProdactDetailPage prodactDetailPage = new ProdactDetailPage();
        prodactDetailPage.clickOnSearchLink();

        searchResultPage.checkFoundModels();
    }

    @Test
    public void verifyNumberPnone() {
        testCaseId = 49;
        HomePage homePage = new HomePage();
        homePage.clickOnNewCarButton();
        homePage.clickOnSelectYearsButton();
        homePage.clickOnSearchButton();

        SearchResultPage searchResultPage = new SearchResultPage();
        searchResultPage.clickOnProduct();

        ProdactDetailPage prodactDetailPage = new ProdactDetailPage();
        prodactDetailPage.clickOnGreenButton();
        prodactDetailPage.checkAppearPhoneWindow();
    }
}
