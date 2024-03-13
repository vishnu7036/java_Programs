package seleniumRufLogics;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class ToTakeScreenShot {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.name("login")).isDisplayed();
        TakesScreenshot ts = (TakesScreenshot) driver;
        File screenshot= ts.getScreenshotAs(OutputType.FILE);
        File filePath = new File("E:\\Framework\\src\\main\\screenShots\\fb.jpg");
        FileUtils.copyFile(screenshot,filePath);
        Thread.sleep(3000);
        driver.quit();
    }
}
