package com.sauceDemo.qa.pages;

import com.sauceDemo.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompletePage extends TestBase {
    @FindBy(xpath = "//div[@id='checkout_complete_container']/h2")
    WebElement ConfirmationMsg;
    public CompletePage(){
        PageFactory.initElements(driver,this);
    }
//    Actions
    public boolean orderConfirmMsg(){
        return ConfirmationMsg.isDisplayed();
    }
}
