package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutsPage;
import pages.LoginPage;
import pages.ProductPage;

public class CheckoutsTest extends BaseTest {

    @Test
    public void SauceDemoTestSuit() {

        test.info("Login start");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginbtn();
        test.pass("Login successful");

        test.info("Add product start");
        ProductPage productPage = new ProductPage(driver);
        productPage.clickonaddToCartbtn();

        CartPage cartPage = new CartPage(driver);
        cartPage.clickonCatbtn();
        test.pass("Product added successfully");

        test.info("Clicked checkout");
        CheckoutsPage checkoutsPage = new CheckoutsPage(driver);
        checkoutsPage.ClickonCheckouts();

        checkoutsPage.enterFirstName("Satish");
        checkoutsPage.enterLastName("Kumar");
        checkoutsPage.enterZipCode("12345");
        checkoutsPage.clickContinueButton();

        test.pass("Checkout details entered");

        // ✔ Strong Assertion
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("checkout-step-two"),
                "Failed: Not navigated to checkout step two page. Current URL: " + currentUrl);

        test.pass("Checkout completed successfully");
    }
}