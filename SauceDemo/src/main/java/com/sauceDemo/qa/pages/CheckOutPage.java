package com.sauceDemo.qa.pages;

import com.sauceDemo.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends TestBase {
    @FindBy(xpath = "//span[contains(text(),'Checkout: Your Information')]")
    WebElement checkOutPageTitle;
    @FindBy(id = "first-name")
    WebElement checkPageFirstName;
    @FindBy(id = "last-name")
    WebElement checkPageLirstName;
    @FindBy(id = "postal-code")
    WebElement checkPageZipCode;
    @FindBy(id = "continue")
    WebElement continueBtn;

//    init page factory
    public CheckOutPage(){
        PageFactory.initElements(driver,this);
    }
//    actions:
    public String getCheckOutPageTitle(){
        return checkOutPageTitle.getText();
    }
    public void setCheckPageInformation(String fname, String lname, String zipCode){
        checkPageFirstName.sendKeys(fname);
        checkPageLirstName.sendKeys(lname);
        checkPageZipCode.sendKeys(zipCode);
    }
    public OverviewPage clickOnCheckOutCtnBtn(){
         continueBtn.click();
         return new OverviewPage();
    }
}
