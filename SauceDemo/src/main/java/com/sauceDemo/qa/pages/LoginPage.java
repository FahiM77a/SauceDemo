package com.sauceDemo.qa.pages;

import com.sauceDemo.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
//    Object repository
    @FindBy(id = "user-name")
    WebElement userNameField;
    @FindBy(id = "password")
    WebElement passwordField;
    @FindBy(id = "login-button")
    WebElement logInBtn;

//    initialize page factory
    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
//    actions:
    public String setUserNameField(String userName){
        userNameField.sendKeys(userName);
        return userNameField.getAttribute("value");
    }
    public String setPasswordField(String password){
        passwordField.sendKeys(password);
        return passwordField.getAttribute("value");
    }
    public ProductPage clickOnLogInBtn(){
        logInBtn.click();
        return new ProductPage();
    }

}
