package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D04_searchStepDef {

    WebDriver driver = null;

    @Given("user open browser and search")

    public void user_open_browser() throws InterruptedException {
        //1-bride between test scripts and browsers
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");

        //2- new object of webdriver
        driver = new ChromeDriver();

        //3 - navigate to website
        driver.manage().window().maximize();
        Thread.sleep(2000);

    }

    @And("user navigate to home page and search")
    public void user_search() throws InterruptedException {
        //open site
        driver.navigate().to("https://demo.nopcommerce.com/");
        //search for device
        driver.findElement(By.id("small-searchterms")).sendKeys("Nokia Lumia 1020");
        //click search
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[2]/form/button")).click();
        Thread.sleep(4000);
    }

    @Then("Close Browser after search")
    public void Close_browser() throws InterruptedException {

        Thread.sleep(4000);
        driver.quit();

    }
}
