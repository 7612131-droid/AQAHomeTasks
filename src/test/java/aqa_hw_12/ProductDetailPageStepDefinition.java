package aqa_hw_12;

import aqa_hw_12.ProductDetailPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProductDetailPageStepDefinition extends BaseStepDefinition {
    private final ProductDetailPage productDetailPage = new ProductDetailPage();

    @And("Clck on search similar product button on the product detail page")
    public void clickOnSimilarProduct() {
        productDetailPage.clickOnSimilarProduct();
    }

    @And("User get name product on the product detail page")
    public void nameProduct() {
        String firstNameProduct = productDetailPage.nameProduct();
        putValueToMapByKey("firstNameProduct", firstNameProduct);
    }
}
