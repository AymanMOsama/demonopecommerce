package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D04_searchStepDef {


    @When("user navigate to home page and search")
    public void user_search() throws InterruptedException {
        //open site
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
        //search for device
        Hooks.driver.findElement(By.id("small-searchterms")).sendKeys("Nokia Lumia 1020");
        //click search
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[2]/form/button")).click();
        Thread.sleep(2000);
    }
}