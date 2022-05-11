package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D01_registerStepDef {

    WebDriver driver = null;


    @Given("user open browser")

    public void user_open_browser() throws InterruptedException {
        //1-bride between test scripts and browsers
        System.setProperty("webdriver.chrome.driver","C:\\Users\\aymamoh\\Downloads\\Pages-object-website-http-demo.nopcommerce.com-master(1)\\demonopecommerce\\src\\main\\resources\\chromedriver.exe");

        //2- new object of webdriver
        driver = new ChromeDriver();

        //3 - navigate to website
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

    }

    @And("user register")
    public void user_push_reg() {
        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Ayman");
        driver.findElement(By.id("LastName")).sendKeys("Osama");
       // select Day
        Select dateofBirth = new Select(driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]")));
        dateofBirth.selectByValue("1");

       // Select Month
        Select DateOfBirthMonth = new Select(driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]")));
        DateOfBirthMonth.selectByValue("3");

        //  select Year
        Select DateOfBirthYear = new Select(driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]")));
        DateOfBirthYear.selectByValue("1990");

        //insert Email
        driver.findElement(By.id("Email")).sendKeys("kalabala2005505@hotmail.com");

        //insert company
        driver.findElement(By.id("Company")).sendKeys("MamoCompany");

        //insert pass and confirm pass
        driver.findElement(By.id("Password")).sendKeys("MamoCompany@");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("MamoCompany@");

        //click register
        driver.findElement(By.id("register-button")).click();

    }
    @And("user could register successfully")
        //expected result
        public void success_login()
    {
        String expectedResult = "Your registration completed";
        String expectedColor = "rgba(76, 177, 124, 1)";
        String actualResult = driver.findElement(By.className("result")).getText();
        String actualColor = driver.findElement(By.className("result")).getCssValue("color");
        System.out.println("color:  " + actualColor);
        Assert.assertTrue(actualResult.contains(expectedResult));
        Assert.assertEquals(actualResult.contains(expectedResult),true);
        Assert.assertTrue(actualColor.contains(expectedColor),"TrueColor");

    }


    @Then("Close Browser")
    public void Close_browser()
    {
        driver.quit();
    }


}
