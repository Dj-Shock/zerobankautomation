package com.zerobank.steddefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AccountActivityNavigationStepDefs {

    AccountActivityPage activityPage = new AccountActivityPage();







    @When("the user clicks on {string} link on the Account Summary page")
    public void the_user_clicks_on_link_on_the_account_summary_page(String string) {
        BrowserUtils.clickToLink(string);

    }
    @Then("the Account Activity page should be displayed")
    public void the_account_activity_page_should_be_displayed() {
        Assert.assertEquals("Zero - Account Activity", Driver.getDriver().getTitle());

    }
    @Then("Account drop down should have {string} selected")
    public void account_drop_down_should_have_selected(String string) {
        String actualOption = activityPage.getDefaultOption();
        Assert.assertEquals("dropdown option dont match with actual",string, actualOption);

    }


}
