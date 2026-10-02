package aqa_hw_9;

import junit.framework.Assert;
import org.jetbrains.annotations.TestOnly;
import org.testng.annotations.Test;

public class Tests extends BaseTest {

    @Test
    public void verifyFeedbackPage() {
        HomePage homePage = new HomePage();
        homePage.clickOnFAQUsers();

        HelpPage helpPage = new HelpPage();
        helpPage.personalAccountButton();
        helpPage.writeUsButton();
        Assert.assertTrue(helpPage.verifyCorrectPage());

    }

    @Test
    public void verifyDisplayedCompairList() {
        String searchWord = "Lego";
        int prodactSearchIndex = 1;

        HomePage homePage = new HomePage();
        homePage.searchField(searchWord);
        homePage.clickOnSearchButton();

        SearchResultPage searchResultPage = new SearchResultPage();
        searchResultPage.clickOnProduct(prodactSearchIndex);

        ProductDetailPage productDetailPage = new ProductDetailPage();


        Assert.assertTrue(productDetailPage.checkProductListDisplayed());
    }

    @Test
    public void verifyOpenUserAgrementFromLoginPageTest() {

        HomePage homePage = new HomePage();
        homePage.clickOnLoginButton();

        LoginPage loginPage;
        loginPage = new LoginPage();
        loginPage.clickOnUserAgrement();

        Assert.assertTrue(loginPage.verifyOpenUserAgrement());
    }

}