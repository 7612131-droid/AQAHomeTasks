package aqa_hw_7;

import org.testng.annotations.DataProvider;

public class ProviderData {

    @DataProvider
    public Object[][] getSearchData() {
        return new Object[][]{
                {"iPhone", "За запитом «iPhone» знайдено 10000+ товарів"},
                {"laptop", "За запитом «laptop» знайдено 393 товари"},
                {"LEGO", "За запитом «LEGO» знайдено 3951 товар"}
        };
    }

}
