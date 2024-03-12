package seleniumRufLogics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;

public class Sample {
    public static void main(String[] args) throws InterruptedException, AWTException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement email = driver.findElement(By.id("email"));
        email.click();
        email.sendKeys("9493169159");
        WebElement pass = driver.findElement(By.id("pass"));
        pass.click();
        pass.sendKeys("Pavan@4881");
        driver.findElement(By.name("login")).sendKeys(Keys.ENTER);
//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);
        WebElement title = driver.findElement(By.xpath("//span[text()='Vishnu Chowdary']"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement until = wait.until(ExpectedConditions.visibilityOf(title));
        if(until.isDisplayed())
            System.out.println("Element is visible");
        else
            Assert.fail("Element is not visible");
        Thread.sleep(5000);
        driver.quit();
    }
}
