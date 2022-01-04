package com.zerobank.steddefinitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AccountActivityNavigationStepDefs {

    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();




    @When("the user clicks on {string} link on the Account Summary page")
    public void the_user_clicks_on_link_on_the_account_summary_page(String string) {
        accountSummaryPage.clickToLink(string);

    }
    @Then("the Account Activity page should be displayed")
    public void the_account_activity_page_should_be_displayed() {
        Assert.assertEquals("Zero - Account Summary", Driver.getDriver().getTitle());

    }
    @Then("Account drop down should have {string} selected")
    public void account_drop_down_should_have_selected(String string) {

    }
}
