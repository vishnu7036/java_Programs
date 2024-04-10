package seleniumRufLogics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class HandlingFrames {
    @Test
    public void handlingFrames() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        Actions act = new Actions(driver);
        WebElement ele = driver.findElement(By.xpath("//ul[@id='nav1'][1]//a[.='Selenium Practice']"));
        js.executeScript("arguments[0].click()",ele);
        act.contextClick();
//        act.moveToElement(ele).perform();
//        ele.click();
        try {
            driver.findElement(By.xpath("//a[.='Frames Practice']")).click();
            WebElement frame = driver.findElement(By.id("aswift_3"));
            if (frame.isDisplayed()) {
                driver.switchTo().frame(frame);
                driver.findElement(By.id("dismiss-button")).click();
            }
        }catch(NoSuchElementException e ){
            System.out.println("Element with id 'aswift_3' not found or not displayed.");
        }
        driver.switchTo().defaultContent();
//        WebElement tn = driver.findElement(By.xpath("//ul[@id='nav1'][1]/li/a[.='Tech News']"));
//        act.moveToElement(tn).build().perform();
        Thread.sleep(3000);
        js.executeScript("scrollTo(0,500)");
    }
}
