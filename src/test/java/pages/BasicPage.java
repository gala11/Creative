package pages;

import GlobalParamethers.Environment;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class BasicPage {

    public void clickButton(String text){
        $x("//a[contains(text(),'"+text+"')]").waitUntil(Condition.visible, 1500).click();
    }
    public void divCheckText(String text1){
        $x("//div[contains(text(),'"+text1+"')]").shouldBe(Condition.visible);
    }

    public void aCheckText(String text2){
        $x("//a[contains(text(),'"+text2+"')]").shouldBe(Condition.visible);
    }
    public void LinkCheckText(String text3){
        $(By.linkText(""+text3+"")).shouldBe(Condition.visible);
    }

}
