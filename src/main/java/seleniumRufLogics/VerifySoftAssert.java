package seleniumRufLogics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class VerifySoftAssert {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        String text = driver.findElement(By.name("login")).getText();
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(text,"Log");
//        Assert.assertEquals(text,"Loin");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.facebook.com/");
        driver.findElement(By.name("login")).isDisplayed();

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.facebook.com/");
        driver.findElement(By.name("login")).isDisplayed();
        Thread.sleep(3000);
        driver.quit();
        /* assertAll() method is used to collect all the information of assertion failures
           It needs to declare at end of the method, so it will catch all the assert failure
         */
        sa.assertAll();
    }
}
