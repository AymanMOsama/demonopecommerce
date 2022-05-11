package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D05_hoverCategoriesStepDef {

        WebDriver driver = null;

        @Given("user open browser and hover category")

        public void user_open_browsers() throws InterruptedException {
            //1-bride between test scripts and browsers
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\aymamoh\\Downloads\\Pages-object-website-http-demo.nopcommerce.com-master(1)\\demonopecommerce\\src\\main\\resources\\chromedriver.exe");

            //2- new object of webdriver
            driver = new ChromeDriver();

            driver.manage().window().maximize();
            Thread.sleep(2000);

        }

        @And("user navigate to home page and hover")
        public void user_nav() throws InterruptedException {
            //open site
            driver.navigate().to("https://demo.nopcommerce.com/");
            Thread.sleep(4000);
        }


        @And ("user hover in page and select sub category")
        public void user_hover() throws InterruptedException {
            // Locating the Main Menu (Parent element)
            WebElement mainMenu = driver.findElement(By.xpath("</html/body/div[6]/div[2]/ul[1]/li[2]/a"));

            //Instantiating Actions class
            Actions actions = new Actions(driver);

            //Hovering on main menu
            actions.moveToElement(mainMenu);

            // Locating the element from Sub Menu
            WebElement subMenu = driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/ul/li[3]/a"));

            //To mouseover on sub menu
            actions.moveToElement(subMenu);

            //build()- used to compile all the actions into a single step
            actions.click().build().perform();
            Thread.sleep(3000);

        }

        @Then("Close Browser after Hover")
        public void Close() throws InterruptedException {

            Thread.sleep(4000);
            driver.quit();

        }
    }


