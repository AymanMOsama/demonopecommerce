package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D07_followUsStepDef {

    WebDriver driver = null;

    @Given("user open browser and click on follow us")

    public void user_open_browsers() throws InterruptedException {
        //1-bride between test scripts and browsers
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\aymamoh\\Downloads\\Pages-object-website-http-demo.nopcommerce.com-master(1)\\demonopecommerce\\src\\main\\resources\\chromedriver.exe");

        //2- new object of webdriver
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        Thread.sleep(2000);

    }

    @And("user navigate to the site")
    public void user_nav() throws InterruptedException {
        //open site
        driver.navigate().to("https://demo.nopcommerce.com/");
        Thread.sleep(4000);
    }


    @And ("user hover to follow us")
    public void user_hover() throws InterruptedException {
        // Locating the Main Menu (Parent element)
        WebElement followUs = driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/div/strong"));

        //Instantiating Actions class
        Actions actions = new Actions(driver);

        //Hovering on followus
        actions.moveToElement(followUs);

        // Locating the element from page
        WebElement faceBook = driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[1]/a"));

        //To mouseover on facebook icon
        actions.moveToElement(faceBook);

        //build()- used to compile all the actions into a single step
        actions.click().build().perform();
        Thread.sleep(3000);

    }

    @Then("Close Browser after finish")
    public void Close() throws InterruptedException {

        Thread.sleep(4000);
        driver.quit();

    }
}
