package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D09_ShoppingCartStepDef {


    @When("user navigate to product pages")
    public void user_nav_cart() throws InterruptedException {
        //open site
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/camera-photo");
        Thread.sleep(2000);
    }


    @Then("user push on add to shopping cart")
    public void user_add_to_cart() throws InterruptedException {

        // add to shopping cart
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]")).click();

    }

}
