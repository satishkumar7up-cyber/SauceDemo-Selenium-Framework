package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductPage;

public class ProductpageTest extends BaseTest {

    @Test
    public void addToCart(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginbtn();

        ProductPage productPage = new ProductPage(driver);
        productPage.clickonaddToCartbtn();

        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
    }
}