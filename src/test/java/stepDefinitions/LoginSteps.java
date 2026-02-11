package stepDefinitions;

import io.cucumber.java.en.*;

import static utils.HelperFunctions.alertHandler;

public class LoginSteps {

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {

    }
    @When("I enter valid username {}")
    public void i_enter_valid_username(String username) {

    }

    @And("I enter valid password {}")
    public void i_enter_valid_password(String password) {

    }
    @And("I click the login button")
    public void i_click_the_login_button() {

    }
    @Then("I should be redirected to the dashboard")
    public void i_should_be_redirected_to_the_dashboard() {

    }

    @Then("I should be getting error message {}")
    public void iShouldBeGettingErrorMessage(String message) {
        alertHandler(message);
    }
}
