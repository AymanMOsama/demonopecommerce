package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D03_CurrenciesStepDef {


    @When("user navigate to home page and select currency")
    public void user_navigate() throws InterruptedException {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
        Select selectCurrency = new Select(Hooks.driver.findElement(By.xpath("//*[@id=\"customerCurrency\"]")));
        selectCurrency.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");
            Thread.sleep(2000);
        }

    }