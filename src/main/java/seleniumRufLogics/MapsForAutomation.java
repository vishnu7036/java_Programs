package seleniumRufLogics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.HashMap;

public class MapsForAutomation {
    @Test
    public void launchFacebook(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com/");
        HashMap<String, By> map = new HashMap<>();
        map.put("txtUN", By.id("email"));
        map.put("txtPass",By.id("pass"));
        map.put("btnLogin",By.name("login"));

        driver.findElement(map.get("txtUN")).sendKeys("Vishnu pavan");
        driver.findElement(map.get("txtPass")).sendKeys("12345678");
        driver.findElement(map.get("btnLogin")).click();
    }
}
