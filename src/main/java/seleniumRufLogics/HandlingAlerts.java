package seleniumRufLogics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HandlingAlerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        String hyrTitle = driver.getTitle();
        WebElement alertBox = driver.findElement(By.id("promptBox"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", alertBox);
        Thread.sleep(3000);
//        js.executeScript("arguments[0].style.border='2px red dotted'",alertBox);
        js.executeScript("arguments[0].setAttribute('style','border:2px red dotted;background:blue')", alertBox);
        alertBox.click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(Keys.BACK_SPACE + "vishnu");
        String text = alert.getText();
        System.out.println(text);
        alert.accept();
//        driver.quit();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.facebook.com/");
        String fbTitle = driver.getTitle();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String ww : windowHandles) {
            WebDriver window = driver.switchTo().window(ww);
            String title1 = window.getTitle();
            if (hyrTitle.equals(title1)) {
                driver.close();
            }
        }
        Thread.sleep(5000);
        driver.quit();
    }
}
