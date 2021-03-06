package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user_login")
    public WebElement userNameInput;

    @FindBy(id = "user_password")
    public WebElement userPasswordInput;

    @FindBy(name = "submit")
    public  WebElement signInButton;

    public void login(String u, String p){
        userNameInput.sendKeys(u);
        userPasswordInput.sendKeys(p);
        signInButton.click();
    }

    @FindBy(xpath = "//div[@class='alert alert-error']")
    public WebElement errorMessage;



}
