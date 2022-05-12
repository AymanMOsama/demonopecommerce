package stepDefinitions;

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

    WebDriver driver = null;

    P02_login login;

    @Given("user open browser for login")

    public void user_open_browser() throws InterruptedException {
        //1-bride between test scripts and browsers
        System.setProperty("webdriver.chrome.driver","C:\\Users\\aymamoh\\Downloads\\Pages-object-website-http-demo.nopcommerce.com-master(1)\\demonopecommerce\\src\\main\\resources\\chromedriver.exe");

        //2- new object of webdriver
        driver = new ChromeDriver();

        //3 - navigate to website
        driver.manage().window().maximize();
        Thread.sleep(2000);
        login = new P02_login(driver);

    }

    @And("user navigate to login page")

            public void user_navigate()
    {
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.findElement(By.className("ico-login")).click();

    }

    @When("^user enter \"(.*)\" and \"(.*)\"$")
            public void valid_data (String username , String password) throws InterruptedException {
                login.P02_login(username,password);
                Thread.sleep(3000);
                String expectedResult = "https://demo.nopcommerce.com/";
                String actualResult = driver.getCurrentUrl();
                Assert.assertEquals(actualResult.contains(expectedResult),true);
            }

    @And("user click login button")
    public void login_button() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
        Thread.sleep(2000);
        //check that my account menu is appear
        String expectedmyAccount = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a";
        String actualmyAccount = String.valueOf(driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")));
        System.out.println(actualmyAccount);
        Assert.assertTrue(actualmyAccount.contains(expectedmyAccount));
        Thread.sleep(4000);
    }


    @Then("Close Browser after login")
    public void Close_browser() throws InterruptedException {

        Thread.sleep(4000);
        driver.quit();

    }



}
