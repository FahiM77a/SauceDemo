package com.sauceDemo.qa.pages;

import com.sauceDemo.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPage extends TestBase {
    @FindBy(xpath = "//span[contains(text(),'Checkout: Overview')]")
    WebElement overViewPageTitle;

    @FindBy(id = "finish")
    WebElement finishBtn;

//    init page factory
    public OverviewPage(){
        PageFactory.initElements(driver,this);
    }
//    Actions
    public String getOverviewPageTitle(){
        return overViewPageTitle.getText();
    }
    public CompletePage clickOnFinishBtn(){
        finishBtn.click();
        return new CompletePage();
    }

}
