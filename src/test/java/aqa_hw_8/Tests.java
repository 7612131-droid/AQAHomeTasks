package aqa_hw_8;

import junit.framework.Assert;
import org.jetbrains.annotations.TestOnly;
import org.testng.annotations.Test;

public class Tests extends BaseTest {

    @Test
    public void verifyFeedbackPage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnFAQUsers();

        HelpPage helpPage = new HelpPage(getDriver());
        helpPage.clickOnPersonalAccount();
        helpPage.clickOnWriteUs();
        Assert.assertTrue(helpPage.verifyCorrectPage());

    }

    @Test
    public void verifyDisplayedCompairList() {
        String searchWord = "Lego";
        int prodactSearchIndex = 1;

        HomePage homePage = new HomePage(getDriver());
        homePage.enterSearchText(searchWord);
        homePage.clickOnSearchButton();

        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        searchResultPage.clickOnProduct(prodactSearchIndex);

        ProductDetailPage productDetailPage = new ProductDetailPage(getDriver());


        Assert.assertTrue(productDetailPage.productListCost());
    }

    @Test
    public void verifyOpenUserAgrementFromLoginPageTest() {

        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnLoginButton();

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickOnUserAgrement();

        Assert.assertTrue(loginPage.verifyOpenUserAgrement());
    }

}

