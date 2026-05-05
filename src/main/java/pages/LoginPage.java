package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators//
    By username = By.xpath("//input[@id='user-name']");
    By password = By.xpath("//input[@id='password']");
    By login = By.xpath("//input[@id='login-button']");


    public void enterUsername(String user) {
        driver.findElement(username).sendKeys(user);
    }
    public void enterPassword(String pass){
        driver.findElement(password).sendKeys(pass);
    }

    public void clickLoginbtn() {
        driver.findElement(login).click();
    }
}

