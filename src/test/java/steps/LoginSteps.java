package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import pages.LoginPage;

public class LoginSteps {
    @Steps
    LoginPage loginPage;

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage(){
        loginPage.openLoginPage();
    }
    @When("the user enters valid credentials")
    public void theUserEntersValidCredentials(){
        loginPage.enterUsername("retoautomationsiigo@yopmail.com");
        loginPage.enterPassword("T4b4ck0ff1c3P455w0rd658*");
        loginPage.clickLogin();
    }

    @Then("the user should see the welcome message {string}")
    public void theUserShouldSeeTheWelcomeMessage(String message){
        loginPage.verifyWelcomeMessage(message);
    }
}