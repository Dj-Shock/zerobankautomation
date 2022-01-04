package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AccountSummaryPage extends BasePage {


    public void clickToLink(String text){
        WebElement link = Driver.getDriver().findElement(By.partialLinkText(text));
    link.click();

    }


}
