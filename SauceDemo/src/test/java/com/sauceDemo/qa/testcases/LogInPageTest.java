package com.sauceDemo.qa.testcases;

import com.sauceDemo.qa.base.TestBase;
import com.sauceDemo.qa.pages.*;
import org.openqa.selenium.bidi.log.Log;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LogInPageTest extends TestBase {
    LoginPage loginPage;
    ProductPage productPage;
    CartPage cartPage;
    CheckOutPage checkOutPage;
    OverviewPage overviewPage;
    CompletePage completePage;
    public LogInPageTest(){
        super();
    }

    @BeforeClass
    public void setUp(){
        initialization();
        loginPage = new LoginPage();
    }
    @Test(priority = 1)
    public void testSetUserName(){
        String getUserName = loginPage.setUserNameField(prop.getProperty("userName"));
        Assert.assertEquals(getUserName,prop.getProperty("userName"));
    }
    @Test(priority = 2)
    public void testSetUserPassword(){
        String getUserPass = loginPage.setPasswordField(prop.getProperty("password"));
        Assert.assertEquals(getUserPass,prop.getProperty("password"));
    }
    @Test(priority = 3)
    public void testClickOnLogInBtn(){
        productPage = loginPage.clickOnLogInBtn();
        Assert.assertEquals(productPage.getProductPageTitle(),prop.getProperty("productPageTitle"));
    }
    @Test(priority = 4)
    public void testClickOnAddtoCart(){
        productPage.clickOnAddtoCart();
    }
    @Test(priority = 5)
    public void testNavigateToCartPage(){
        cartPage = productPage.navigateToCartPage();
        Assert.assertEquals(cartPage.getCartPageTitle(),prop.getProperty("cartPageTitle"));
    }
    @Test(priority = 6)
    public void testCheckOutBtn(){
        checkOutPage = cartPage.clickOnCheckoutBtn();
        Assert.assertEquals(checkOutPage.getCheckOutPageTitle(),prop.getProperty("checkOutPageTitle"));
    }
    @Test(priority = 7)
    public void testCheckOutInformationSet(){
        checkOutPage.setCheckPageInformation(prop.getProperty("firstName"),prop.getProperty("lastName"),prop.getProperty("zipcode"));
    }
    @Test(priority = 8)
    public void testClickOnCheckOutCtnBtn(){
        overviewPage = checkOutPage.clickOnCheckOutCtnBtn();
        Assert.assertEquals(overviewPage.getOverviewPageTitle(),prop.getProperty("overviewPageTitle"));
    }
    @Test(priority = 9)
    public void testClickOnCheckoutFinishBtn(){
        completePage = overviewPage.clickOnFinishBtn();
        Assert.assertTrue(completePage.orderConfirmMsg());
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
