package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D08_wishlistStepDef {

    WebDriver driver = null;

    @Given("user open browser and add wishlist")

    public void user_open_browsers() throws InterruptedException {
        //1-bride between test scripts and browsers
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");

        //2- new object of webdriver
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        Thread.sleep(2000);

    }

    @And("user navigate to product page")
    public void user_nav() throws InterruptedException {
        //open site
        driver.navigate().to("https://demo.nopcommerce.com/camera-photo");
        Thread.sleep(4000);
    }


    @And("user push on add to wishlist")
    public void user_add_wishlist() throws InterruptedException {

        // add to wishlist
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[3]")).click();

    }

    @Then("Close Browser after wish")
    public void Close() throws InterruptedException {

        Thread.sleep(4000);
        driver.quit();
    }
}
