package steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import pages.CustomerPage;


public class CustomerSteps {
    @Steps
    private CustomerPage customerPage;

    @And("the user clicks on create customer button")
    public void theUserClicksOnCreateCustomerButton() {
        customerPage.clickButtonInsideShadowDom();
    }
}
