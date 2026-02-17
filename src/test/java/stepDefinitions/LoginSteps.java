package stepDefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import utils.Base;

public class LoginSteps extends Base {


    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        loginPage.clickNavLoginButton();

    }

    @When("I enter valid username {}")
    public void i_enter_valid_username(String username) {
        loginPage.enterUsername(username);
    }

    @And("I enter valid password {}")
    public void i_enter_valid_password(String password) {
        loginPage.enterPassword(password);
    }

    @And("I click the login button")
    public void i_click_the_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("I should be redirected to the dashboard")
    public void i_should_be_redirected_to_the_dashboard() {
        String actualValue = loginPage.getLoginSuccessMessage();
        System.out.println("Actual login success message: " + actualValue);
        String expectedValue = "Welcome back, Keishia! \uD83D\uDC4B";
        Assert.assertEquals(actualValue, expectedValue, "Expected message: " + expectedValue + ", but got: " + actualValue);
    }

    @Given("I am logged in")
    public void iAmLoggedIn() {
        loginPage.clickNavLoginButton();
    }

  /* @Given("I am logged in")
    public void iAmLoggedIn() {
        loginPage.clickNavLoginButton();}*/


    @Then("I click on the Learn tab")
    public void i_click_on_the_learn_tab() {
        learningMaterialsPage.clickLearnButton();
    }

    @And("I click on learning materials tab")
    public void iClickOnLearningMaterialsTab() {
        learningMaterialsPage.clickLearningMaterialsButton();
    }


    @And("Click on the web automation basic button")
    public void clickOnTheWebAutomationBasicButton() {
        learningMaterialsPage.clickWebAutomationBasicForm();
    }

    @Then("Insert full name")
    public void insertFullName() {
        learningMaterialsPage.enterName();
    }

    @And("Insert email address")
    public void insertEmailAddress() {
        learningMaterialsPage.enterEmail();
    }

    @And("Insert age")
    public void insertAge() {
        learningMaterialsPage.enterAge();
    }

    @And("Select gender")
    public void selectGender() {
        learningMaterialsPage.selectGender();
    }

    @And("Select country")
    public void selectCountry() {
        learningMaterialsPage.selectCountry();
    }


    @And("Select experience level")
    public void selectExperienceLevel() {
        learningMaterialsPage.selectExperienceLevel();
    }

    @And("Select skills")
    public void selectSkills() {
        learningMaterialsPage.selectSkill();

    }

    @Then("Add a comment")
    public void addAComment() {
        learningMaterialsPage.enterComment();

    }

    @Then("Select the terms and conditions button")
    public void selectTheTermsAndConditionsButton() {
       learningMaterialsPage.selectTermsAndConditions();
    }


    @And("Select the submit form button")
    public void selectTheSubmitFormButton() {
        learningMaterialsPage.selectTheSubmitButton();
    }


}




