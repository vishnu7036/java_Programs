package facebook.loginPageLocators;

import org.openqa.selenium.By;

public interface LoginPageLoc {
    //https://www.facebook.com/
    By txtEmail = By.id("email");
    By txtPassword = By.id("pass");
    By btnLogin = By.name("login");
}
