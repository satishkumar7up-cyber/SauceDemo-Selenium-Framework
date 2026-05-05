package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutsPage {
    WebDriver driver;
    public CheckoutsPage(WebDriver driver){
        this.driver = driver;
    }

    // Locators.
    By checkouts = By.xpath("//button[@id='checkout']");
    By FirstName = By.xpath("//input[@id='first-name']");
    By LastName = By.xpath("//input[@id='last-name']");
    By ZipCode = By.xpath("//input[@id='postal-code']");
    By continueButton = By.xpath("//input[@id='continue']");


    public void ClickonCheckouts(){
        driver.findElement(checkouts).click();
    }

    public void enterFirstName(String fistname){
        driver.findElement(FirstName).sendKeys(fistname);
    }

    public void enterLastName(String lastname){
        driver.findElement(LastName).sendKeys(lastname);
    }

    public void enterZipCode(String zipcode){
        driver.findElement(ZipCode).sendKeys(zipcode);
    }

    public void clickContinueButton(){
        driver.findElement(continueButton).click();
    }
}