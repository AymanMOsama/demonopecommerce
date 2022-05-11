package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D03_CurrenciesStepDef {


    WebDriver driver = null;



    @Given("user open browser for select currency")

    public void user_open_browser() throws InterruptedException {
        //1-bride between test scripts and browsers
        System.setProperty("webdriver.chrome.driver","C:\\Users\\aymamoh\\Downloads\\Pages-object-website-http-demo.nopcommerce.com-master(1)\\demonopecommerce\\src\\main\\resources\\chromedriver.exe");

        //2- new object of webdriver
        driver = new ChromeDriver();

        //3 - navigate to website
        driver.manage().window().maximize();
        Thread.sleep(2000);

    }

    @And("user navigate to home page and select currency")
    public void user_navigate() throws InterruptedException {
        driver.navigate().to("https://demo.nopcommerce.com/");
        Select selectCurrency = new Select(driver.findElement(By.xpath("//*[@id=\"customerCurrency\"]")));
        selectCurrency.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");
            Thread.sleep(4000);
        }

    @Then("Close Browser after select currency")
    public void Close_browser() throws InterruptedException {

        Thread.sleep(4000);
        driver.quit();

    }
    }