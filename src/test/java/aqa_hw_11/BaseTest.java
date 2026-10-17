package aqa_hw_11;

import com.codeborne.selenide.Selenide;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static aqa_hw_11.TestRailController.publishResults;

public class BaseTest {

    protected int testCaseId;

    @BeforeMethod
    public void beforeMethod() {
        Selenide.open("https://auto.ria.com/uk/");
    }


    @AfterMethod
    public void afterMethod(ITestResult testResult) {
        publishTestResultsToTestRail(testResult);
        Selenide.closeWebDriver();
    }

    public void publishTestResultsToTestRail(ITestResult testResult) {
        if (testResult.getStatus() == ITestResult.SUCCESS) {
            publishResults(1, testCaseId);
        } else {
            publishResults(5, testCaseId);
        }
    }

}
