package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class loginTest extends BaseTest {

    @Test
    public void ValidloginTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginbtn();

        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
    }

    @Test
    public void invalidLoginTest(){
        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUsername("wrong_user");
        loginPage.enterPassword("wrong_pass");
        loginPage.clickLoginbtn();

        // Assertion for error message
        Assert.assertTrue(loginPage.getErrorMessage().contains("Username and password"), "Error message not displayed correctly");
        test.pass("Error message show on login page with invalid username and password");
    }
}
