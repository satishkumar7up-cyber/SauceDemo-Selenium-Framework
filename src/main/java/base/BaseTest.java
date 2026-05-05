package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import com.aventstack.extentreports.*;
import utils.ExtentManager;

import java.lang.reflect.Method;
import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;
    protected ExtentReports extent;
    protected ExtentTest test;

    @BeforeMethod
    public void setup(Method method){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com/");

        extent = ExtentManager.getReport();
        test = extent.createTest(method.getName());
    }

    @AfterMethod
    public void teardown(){
        extent.flush();
        driver.quit();
    }
}
