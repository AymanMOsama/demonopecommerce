package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D06_homeSlidersStepDef {

    WebDriver driver = null;

    @Given("user open browser and click to slider")

    public void user_open_internet() throws InterruptedException {
        //1-bride between test scripts and browsers
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");

        //2- new object of webdriver
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        Thread.sleep(2000);

    }

    @And("user navigate to land page")
    public void user_nav_cart() throws InterruptedException {
        //open site
        driver.navigate().to("https://demo.nopcommerce.com");
        Thread.sleep(2000);
    }


    @And("user push slider")
    public void user_push_slider() throws InterruptedException {

        // add to shopping cart
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[2]/a[2]")).click();

    }

    @Then("Close Browser after push slider")
    public void Close() throws InterruptedException {

        Thread.sleep(2000);
        driver.quit();


    }

}