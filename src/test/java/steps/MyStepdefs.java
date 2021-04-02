package steps;

import GlobalParamethers.Environment;
import io.cucumber.java.en.Then;
import pages.BasicPage;

public class MyStepdefs {

    private BasicPage page = new BasicPage();

    @Then("Click {string} button")
    public void clickButton(String arg0) {
        page.clickButton(arg0);
        page.divCheckText(Environment.HeadOffice.getContacts());
        page.aCheckText(Environment.Moscow.getContacts());
        page.divCheckText(Environment.Office.getContacts());
        page.aCheckText(Environment.Tumen.getContacts());
        page.aCheckText(Environment.PhoneNumber.getContacts());
        page.LinkCheckText(Environment.Email.getContacts());
    }
}
