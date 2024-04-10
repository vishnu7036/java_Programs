package seleniumRufLogics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting1 {
    private WebDriver driver;
    @Parameters({"browser"})
    @BeforeTest
    public void inti(String browser){
        if(browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }
    }
    @Test
    public void launchFacebook(){
        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com/");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
