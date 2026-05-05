package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    //Locators//
    By cartbtn = By.xpath("//a[@class='shopping_cart_link']");

    public void clickonCatbtn(){
        driver.findElement(cartbtn).click();
    }
}