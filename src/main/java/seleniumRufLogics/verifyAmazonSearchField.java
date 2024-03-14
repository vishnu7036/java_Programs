package seleniumRufLogics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class verifyAmazonSearchField {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");

        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("iphone7");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@title,'Search for Products')]/../following-sibling::ul/li/div/a/div[2]")));
        List<WebElement> eles = driver.findElements(By.xpath("//button[contains(@title,'Search for Products')]/../following-sibling::ul/li/div/a/div[2]"));
        System.out.println(eles.size());
        for(WebElement ele : eles){
            String act = ele.getText();
            System.out.println("actual text :"+act);
            if(act.equals("iphone7 back cover")){
                ele.click();
            }
        }
        Thread.sleep(7000);
        driver.quit();
    }
}
