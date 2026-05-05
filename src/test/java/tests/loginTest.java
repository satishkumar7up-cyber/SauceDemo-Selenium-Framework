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

}
