package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.Before;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.actions;
import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.Selenide.switchTo;

public class SearchAndOpen {

    @Before
    public static void openURL() {

        open("https://www.google.ru/?gws_rd=ssl");
        $(By.name("q")).setValue("crtweb").pressEnter();
        $(By.cssSelector("#rso > div > div:nth-child(1) > div > div > div.yuRUbf > a")).click();
        switchTo().window(1);
        actions().click($x("//span[contains(text(),'меню')]")).build().perform();
    }
}
