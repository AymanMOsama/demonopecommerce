package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D07_followUsStepDef {



    @When("user hover to follow us")
    public void user_hover() throws InterruptedException {
        // Locating the Main Menu (Parent element)
        WebElement followUs = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/div/strong"));

        //Instantiating Actions class
        Actions actions = new Actions(Hooks.driver);

        //Hovering on followus
        actions.moveToElement(followUs);

        // Locating the element from page
        WebElement faceBook = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[1]/a"));

        //To mouseover on facebook icon
        actions.moveToElement(faceBook);

        //build()- used to compile all the actions into a single step
        actions.click().build().perform();
        Thread.sleep(2000);

    }

}
