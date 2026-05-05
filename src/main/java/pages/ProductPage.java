package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    WebDriver driver;

    public ProductPage(WebDriver driver){
        this.driver = driver;
    }

    //Locators//
    By addToCartbtn = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");

    public void clickonaddToCartbtn(){
        driver.findElement(addToCartbtn).click();
    }

}