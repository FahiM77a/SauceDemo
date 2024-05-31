package com.sauceDemo.qa.pages;

import com.sauceDemo.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends TestBase {
//    object repository
    @FindBy(xpath = "//span[contains(text(),'Your Cart')]")
    WebElement cartPageTitle;
    @FindBy(id = "checkout")
    WebElement checkOutBtn;
//    init pagefactory
    public CartPage(){
        PageFactory.initElements(driver,this);
    }
//    actions
    public String getCartPageTitle(){
        return cartPageTitle.getText();
    }
    public CheckOutPage clickOnCheckoutBtn(){
        checkOutBtn.click();
        return new CheckOutPage();
    }
}
