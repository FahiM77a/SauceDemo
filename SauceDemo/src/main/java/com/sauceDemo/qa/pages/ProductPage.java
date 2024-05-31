package com.sauceDemo.qa.pages;

import com.sauceDemo.qa.base.TestBase;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends TestBase {
    @FindBy(xpath = "//span[contains(text(),'Products')]")
    WebElement ProductPageTitle;

    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    WebElement Product1;
    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    WebElement Product2;

    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    WebElement Product3;
    @FindBy(xpath = "//div[@id=\"shopping_cart_container\"]/a")
    WebElement cartBtn;

//    initialization PageFactory
    public ProductPage(){
        PageFactory.initElements(driver,this);
    }
//    Actions:
    public String getProductPageTitle(){
        return ProductPageTitle.getText();
    }
    public void clickOnAddtoCart(){
        Product1.click();
        Product2.click();
        Product3.click();
    }
    public CartPage navigateToCartPage(){
        cartBtn.click();
        return new CartPage();
    }
}
