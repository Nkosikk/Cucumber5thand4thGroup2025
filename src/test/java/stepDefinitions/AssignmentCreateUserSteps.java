package stepDefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

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
        assignmentCreateUserPage.selectGroup();

    }

    @And("I Select to create the account")
    public void iSelectToCreateTheAccount() {
        assignmentCreateUserPage.selectCreateAccount();

    }


    @Then("I login as an admin user with valid username")
    public void iLoginAsAnAdminUserWithValidUsername() {
        assignmentCreateUserPage.enterAdminUser();
    }


    @And("I enter a valid password")
    public void iEnterAValidPassword() {
        assignmentCreateUserPage.enterAdminUserPassword();
    }

    @Then("I select to login as an admin user")
    public void iSelectToLoginAsAnAdminUser() {
    assignmentCreateUserPage.selectLoginForAdminUser();
    }

    @And("Select the admin profile button")
    public void selectTheAdminProfileButton() {
       assignmentCreateUserPage.selectAdminPanel();
    }

    @Then("I select the admin Panel button")
    public void iSelectTheAdminPanelButton() {
       assignmentCreateUserPage.clickAdminPanelOption();
    }

    @And("I verify the admin dashboard")
    public void iVerifyTheAdminDashboard() {
      assignmentCreateUserPage.verifyAdminDashboard();
    }

    @And("I select the users button inside the admin portal")
    public void iSelectTheUsersButtonInsideTheAdminPortal() {
       assignmentCreateUserPage.selectUsersInAdminPortal();
    }

    @Then("I search for the email address that was generated")
    public void iSearchForTheEmailAddressThatWasGenerated() {
        assignmentCreateUserPage.searchWithGeneratedEmail();
    }

    @And("click to activate the user")
    public void clickToActivateTheUser() {
        assignmentCreateUserPage.selectInactiveButton();
    }

    @And("click okay on the alert to activate the user")
    public void clickOkayOnTheAlertToActivateTheUser() {
        assignmentCreateUserPage.confirmUserActivation();
    }

    @Then("click okay on successful activation alert")
    public void clickOkayOnSuccessfulActivationAlert() {
        assignmentCreateUserPage.confirmActivationIsSuccessful();
    }

    @And("select to go back to the website")
    public void selectToGoBackToTheWebsite() {
       assignmentCreateUserPage.navigateBackToWebpage();
    }


    @Then("select admin button")
    public void selectAdminButton() {
      assignmentCreateUserPage.selectAdminPanel2();
    }


    @And("Select Logout")
    public void selectLogout() {
        assignmentCreateUserPage.clickLogout();
    }

    @Then("confirm that I am sure I want to logout")
    public void confirmThatIAmSureIWantToLogout() {
        assignmentCreateUserPage.confirmOfLogout();
    }
}



