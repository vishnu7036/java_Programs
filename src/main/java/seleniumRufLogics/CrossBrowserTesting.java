package seleniumRufLogics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
    WebDriver driver;
    @Parameters("browser")
    @BeforeTest
    public void launchBrowser(String browser){
        if(browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
            driver.manage().window().maximize();
        }
    }
    @Test
    public void launchFacebook(){
        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com/");
    }
}
