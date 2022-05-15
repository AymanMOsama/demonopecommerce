package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class P02_login {


    public P02_login(WebDriver driver) { Hooks.driver = driver; }

    public WebElement usernamePOM () {return Hooks.driver.findElement(By.className("email"));}
    public WebElement passwordPOM () {return Hooks.driver.findElement(By.id("Password"));}

    public void P02_login (String username , String Password)
    {
        //enter user via POM
        usernamePOM().sendKeys(username);
        passwordPOM().sendKeys(Password);

    }

}
