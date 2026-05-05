package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.LoginPage;

public class CartTest extends BaseTest {

    @Test
    public void  CartTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginbtn();

        CartPage cartPage = new CartPage(driver);
        cartPage.clickonCatbtn();
        Assert.assertTrue(driver.getCurrentUrl().contains("cart"));

    }
}
