package seleniumRufLogics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.time.Duration;

public class HandlingAlerts1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.hyrtutorials.com/");
        boolean homePage = driver.findElement(By.id("Header1_headerimg")).isDisplayed();
        Assert.assertTrue(homePage);
        WebElement ele = driver.findElement(By.xpath("//a[.='Selenium Practice']"));
        Actions act = new Actions(driver);
        act.moveToElement(ele).perform();
        driver.findElement(By.xpath("//a[.='Alerts']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//h1[contains(.,'AlertsDemo')]")).isDisplayed());
        WebElement promptBox = driver.findElement(By.id("promptBox"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()",promptBox);
        promptBox.click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        Thread.sleep(5000);
        driver.quit();
    }
}
