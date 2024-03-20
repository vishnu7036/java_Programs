package seleniumRufLogics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class ApplyingJobsInNaukri {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Actions act = new Actions(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.naukri.com/mnjuser/homepage");
        act.moveToElement(driver.findElement(By.id("usernameField"))).click().sendKeys("vishnug4881@gmail.com").perform();
        act.moveToElement(driver.findElement(By.id("passwordField"))).click().sendKeys("Pavan@4881").perform();
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("a[alt='Naukri Logo']")).isDisplayed());
        WebElement ele = driver.findElement(By.cssSelector("a[title='Recommended Jobs']"));
        act.moveToElement(ele).perform();
        driver.findElement(By.xpath("//a[@title='Recommended Jobs']/following-sibling::div/ul//div[text()='Recommended jobs']")).click();
        boolean rjuHeading = driver.findElement(By.xpath("//span[.='Recommended jobs for you']")).isDisplayed();
        Assert.assertTrue(rjuHeading);
        WebElement prfil = driver.findElement(By.id("profile"));
        Assert.assertTrue(prfil.isEnabled());
        String parentWindowTitle = driver.getTitle();
        System.out.println("parentWindowTitle>>>>>>" + parentWindowTitle);
        List<WebElement> jobs = driver.findElements(By.cssSelector("div[class='jobTupleHeader'] p"));
        for (WebElement job : jobs) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollBy(0, 100)",job);
            Thread.sleep(2000);
            String jobTitle = job.getText();
            System.out.println("job title : " + jobTitle);
            if (jobTitle.contains("Automation"))
                job.click();
            String parentWindow = driver.getWindowHandle();
            Set<String> windows = driver.getWindowHandles();
            for (String window : windows) {
                if (!(window.equals(parentWindow))) {
                    System.out.println("currentWindowTitle>>>>>>" +driver.getTitle());
                    driver.switchTo().window(window);
                    driver.findElement(By.id("apply-button")).click();
                    Thread.sleep(3000);
                    driver.close();
                }
            }
            driver.switchTo().window(parentWindow);
        }
    }
}
