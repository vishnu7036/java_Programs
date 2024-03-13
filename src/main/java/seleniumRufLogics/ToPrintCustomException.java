package seleniumRufLogics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ToPrintCustomException {
    public static void main(String[] args) throws CustomExceptions {
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.facebook.com/");
//        String text = driver.findElement(By.name("login")).getText();
        try{
            System.out.println(1/0);
        }catch(Exception e){
            throw new CustomExceptions("ArithmeticException: we can't divide by it 0");
//            System.out.println(e);
        }
    }
}
