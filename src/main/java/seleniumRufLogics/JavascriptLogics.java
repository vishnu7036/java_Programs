package seleniumRufLogics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class JavascriptLogics {
    private By txtEmail = By.id("email");
    private By txtPass = By.id("pass");
    private By lnkHelp = By.cssSelector("a[title='Visit our Help Centre.']");
    @Test
    public void javascriptLogics() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        WebElement email = driver.findElement(txtEmail);
        WebElement pass = driver.findElement(txtPass);
        WebElement lnkHelp = driver.findElement(this.lnkHelp);
//        Actions act = new Actions(driver);
//        act.sendKeys(email,"vishnupavan").build().perform();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value=arguments[1]",email,"vishnu");
        js.executeScript("arguments[0].style.border='5px red solid'",email);
        js.executeScript("arguments[0].style.background='yellow'",email);
        js.executeScript("arguments[0].setAttribute('style','border:5px pink dotted;background:blue')",pass);
        Thread.sleep(3000);
        lnkHelp.click();
        WebElement ele = driver.findElement(By.xpath("//span[.='Create Page']"));
        boolean b = ele.isDisplayed();
        System.out.println("*******"+b);

    }
}
