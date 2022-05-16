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

public class D05_hoverCategoriesStepDef {


        @When ("user hover in page and select sub category")
        public void user_hover() throws InterruptedException {
            // Locating the Main Menu (Parent element)
            WebElement mainMenu = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a"));

            //Instantiating Actions class
            Actions actions = new Actions(Hooks.driver);

            //Hovering on main menu
            actions.moveToElement(mainMenu);

            // Locating the element from Sub Menu
            WebElement subMenu = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/ul/li[3]/a"));

            //To mouseover on sub menu
            actions.moveToElement(subMenu);

            //build()- used to compile all the actions into a single step
           actions.click().build().perform();
            Thread.sleep(3000);

        }

    }


