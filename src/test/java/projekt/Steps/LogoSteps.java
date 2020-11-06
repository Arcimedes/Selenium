package projekt.Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


public class LogoSteps {

    WebDriver driver;

    @Given("^I launch chrome browser$")
    public void iLaunchChromeBrowser() {
        System.setProperty("webdriver.chrome.driver", "C://Users//artur//Desktop//Arci//src//test//java");

    }

    @When("^I open orange hrm homepage$")
    public void iOpenOrangeHrmHomepage() {

    }

    @Then("^I verify that the logo present on page$")
    public void iVerifyThatTheLogoPresentOnPage() {
    }

    @And("^close browser$")
    public void closeBrowser() {
    }
}