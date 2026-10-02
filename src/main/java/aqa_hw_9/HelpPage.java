package aqa_hw_9;

import static com.codeborne.selenide.Selenide.$;

import static com.codeborne.selenide.WebDriverRunner.url;

public class HelpPage {
    public void personalAccountButton() {
        $("[class=\"faq-category-item__title\"]").click();
    }

    public void writeUsButton() {
        $("a.link-blue").click();

    }

    public boolean verifyCorrectPage() {
        return url().contains("/feedback/");

    }
}