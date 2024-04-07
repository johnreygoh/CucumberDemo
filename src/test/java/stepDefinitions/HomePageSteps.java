package stepDefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {
    WebDriver driver;

    @Given("^The user is on the PSA home page$")
    public void the_user_is_on_the_psa_home_page() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://psa.gov.ph");
    }

    @When("^The user retrieves the title of the page$")
    public void the_user_retrieves_the_title_of_the_page() {
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);
    }

    @Then("^The title of the page should be \"([^\"]*)\"$")
    public void the_title_of_the_page_should_be_something(String expectedTitle) {
        assertEquals(driver.getTitle(), expectedTitle);
        driver.quit();
    }
}
