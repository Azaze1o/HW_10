package qa.selenide;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class SearchRepository {

    @Test
    public void testPathToSoftAssertions() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(".js-wiki-more-pages-link--").click();
        $("[data-filterable-for='wiki-pages-filter']").shouldHave(Condition.text("SoftAssertions"));
        $("a[href$='SoftAssertions']").click();
        $("#wiki-body").shouldHave(Condition.text("Using JUnit5 extend"));
    }
}
