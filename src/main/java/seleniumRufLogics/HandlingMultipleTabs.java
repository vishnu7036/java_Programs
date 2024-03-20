package seleniumRufLogics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HandlingMultipleTabs {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.name("login")).isDisplayed();
        String tab1 = driver.getPageSource();
        System.out.println("Tab1 Page source: "+tab1);

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.facebook.com/");
        driver.findElement(By.name("login")).isDisplayed();
        String tab2 = driver.getPageSource();
        System.out.println("Tab1 Page source: "+tab2);

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.facebook.com/");
        driver.findElement(By.name("login")).isDisplayed();
        String tab3 = driver.getPageSource();
        System.out.println("Tab1 Page source: "+tab3);

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.facebook.com/");
        driver.findElement(By.name("login")).isDisplayed();
        String tab4 = driver.getPageSource();
        System.out.println("Tab1 Page source: "+tab4);

        Set<String> windowHandles = driver.getWindowHandles();
        for(String window : windowHandles){
            Thread.sleep(2000);
            WebDriver wi = driver.switchTo().window(window);
            String pageSource = wi.getPageSource();
            if(tab2.equals(pageSource)){
                Thread.sleep(3000);
                driver.close();
            }

        }
    }
}
