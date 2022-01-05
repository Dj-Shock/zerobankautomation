package com.zerobank.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class BrowserUtils {

    /**
     * this method is used to pause the code for given seconds.
     * It is static method so we can call:
     *  BrowserUtils.sleep(5);
     * @param seconds
     */
    public static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Exception happened in sleep method");
        }
    }

    public static void scrollDown(int pixels){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, "+ pixels +")");
    }

     public static void clickToLink(String text){
        WebElement link = Driver.getDriver().findElement(By.partialLinkText(text));
        link.click();

    }
}



