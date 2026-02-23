package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pageObjects.AssignmentCreateUserPage;
import utils.Base;


public class AssignmentCreateUserSteps extends Base {



    @Given("I am on the landing page")
    public void i_am_on_the_landing_page() {
        assignmentCreateUserPage.verifyLandingPage();
    }


    @Then("I click on Login button")
    public void iClickOnLoginButton() {
        assignmentCreateUserPage.selectLoginButton();
    }

    @And("I click on the sign up button")
    public void iClickOnTheSignUpButton() {
        assignmentCreateUserPage.selectSignUpButton();
    }

    @And("I enter a first Name")
    public void iEnterAFirstName() {
        assignmentCreateUserPage.enterFirstName();
    }

    @And("I enter a Last Name")
    public void iEnterALastName() {
        assignmentCreateUserPage.enterLastName();
    }

    @Then("I enter a valid email address")
    public void iEnterAValidEmailAddress() {
        assignmentCreateUserPage.enterEmail();

    }

    @And("I create a valid password")
    public void iCreateAValidPassword() {
        assignmentCreateUserPage.registerPassword();

    }

    @Then("I confirm the password")
    public void iConfirmThePassword() {
        assignmentCreateUserPage.confirmPassword();

    }


    @And("I select a group from the drop down")
    public void iSelectAGroupFromTheDropDown() {

    }

    @And("I Select to create the account")
    public void iSelectToCreateTheAccount() {

    }
}



