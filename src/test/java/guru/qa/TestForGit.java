package guru.qa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestForGit {

    @Test

    void Test() {
        open("/text-box");
        $("#userName").setValue("Alex");
        $("#userEmail").setValue("1IT@qa.ru");
        $("#currentAddress").setValue("Saratov");
        $("#permanentAddress").setValue("LA");
        $("#submit").click();
        $("#name").shouldHave(text ("Alex"));
        $("#email").shouldHave(text ("1IT@qa.ru"));
        $("#currentAddress", 1).shouldHave(text ("Saratov"));
        $("#permanentAddress", 1).shouldHave(text ("LA"));
        System.out.println("Hello, World!");

    }
}
