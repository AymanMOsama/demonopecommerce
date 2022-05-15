package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D01_registerStepDef {


    @When("user register")
    public void user_push_reg() {
        Hooks.driver.findElement(By.className("ico-register")).click();
        Hooks.driver.findElement(By.id("gender-male")).click();
        Hooks.driver.findElement(By.id("FirstName")).sendKeys("Ayman");
        Hooks.driver.findElement(By.id("LastName")).sendKeys("Osama");
        // select Day
        Select dateofBirth = new Select(Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]")));
        dateofBirth.selectByValue("1");

        // Select Month
        Select DateOfBirthMonth = new Select(Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]")));
        DateOfBirthMonth.selectByValue("3");

        //  select Year
        Select DateOfBirthYear = new Select(Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]")));
        DateOfBirthYear.selectByValue("1990");

        //insert Email
        Hooks.driver.findElement(By.id("Email")).sendKeys("kalabala20055055@hotmail.com");

        //insert company
        Hooks.driver.findElement(By.id("Company")).sendKeys("MamoCompany");

        //insert pass and confirm pass
        Hooks.driver.findElement(By.id("Password")).sendKeys("MamoCompany@");
        Hooks.driver.findElement(By.id("ConfirmPassword")).sendKeys("MamoCompany@");

        //click register
        Hooks.driver.findElement(By.id("register-button")).click();

    }

    @Then("user could register successfully")
    //expected result
    public void success_login() {
        String expectedResult = "Your registration completed";
        String expectedColor = "rgba(76, 177, 124, 1)";
        String actualResult = Hooks.driver.findElement(By.className("result")).getText();
        String actualColor = Hooks.driver.findElement(By.className("result")).getCssValue("color");
        System.out.println("color:  " + actualColor);
        Assert.assertTrue(actualResult.contains(expectedResult));
        Assert.assertEquals(actualResult.contains(expectedResult), true);
        Assert.assertTrue(actualColor.contains(expectedColor), "TrueColor");

    }


}
