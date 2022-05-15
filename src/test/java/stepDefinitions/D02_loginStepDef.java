package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.P02_login;

public class D02_loginStepDef {


    P02_login login;


    @When("user navigate to login page")

    public void user_navigate() {
        Hooks.driver.findElement(By.className("ico-login")).click();
        login = new P02_login(Hooks.driver);


    }

    @Then("^user enter \"(.*)\" and \"(.*)\"$")
    public void valid_data(String username, String password) throws InterruptedException {
        login.P02_login(username, password);
        Thread.sleep(2000);
        String expectedResult = "https://demo.nopcommerce.com/";
        String actualResult = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(actualResult.contains(expectedResult), true);
    }

    @Then("user click login button")
    public void login_button() throws InterruptedException {

        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
        Thread.sleep(2000);
        //check that my account menu is appear
        String expectedmyAccount = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a";
        String actualmyAccount = String.valueOf(Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")));
        System.out.println(actualmyAccount);
        Assert.assertTrue(actualmyAccount.contains(expectedmyAccount));
        Thread.sleep(2000);
    }

}