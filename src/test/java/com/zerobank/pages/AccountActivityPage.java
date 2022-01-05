package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccountActivityPage extends BasePage{

    @FindBy(id="aa_accountId")
    public WebElement dropDown;

    public String getDefaultOption(){
        Select element = new Select(dropDown);
        return element.getFirstSelectedOption().getText();

    }




}
