package stepDefinitions;

import com.google.common.collect.*;
import io.cucumber.java.en.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageObjects.SignUpPage;
import utils.Base;

import java.time.Duration;
import java.util.Map;
import java.util.Random;

import static com.microsoft.schemas.vml.STStrokeArrowType.Enum.table;

public class SignSteps extends Base {

    SignUpPage signUpPage = new SignUpPage(driver);

    @Given("I am on the sign up page")
    public void i_am_on_the_sign_up_page() {
        signUpPage.navigateToSignUpPage();
    }

    @When("I enter valid first name {}")
    public void i_enter_valid_first_name(String firstName) {
        signUpPage.enterFirstName(firstName);
    }

    @And("I enter valid last name {}")
    public void i_enter_valid_last_name(String lastName) {
        signUpPage.enterLastName(lastName);
    }

    @And("I enter valid email {}")
    public void I_enter_valid_email(String email) {
        String newEmail = email.replace("@", new Random().nextInt(10, 90) + 10 + "@");
       // driver.findElement(By.id("email")).sendKeys(newEmail);
        System.out.println("Generated email: " + newEmail);
        signUpPage.enterEmail(newEmail);
    }

    @And("I enter valid register password {string}")
    public void i_enter_valid_register_password(String password) {
        signUpPage.enterPassword(password);
    }

    @And("I enter valid confirm password {string}")
    public void i_enter_valid_confirm_password(String confirmPassword) {
        signUpPage.confirmPassword(confirmPassword);
    }

    @And("I select relevant group")
    public void i_select_relevant_group() {
        signUpPage.selectGroup();
    }

    @And("I click the create account button")
    public void i_click_the_create_account_button() {
        signUpPage.clickCreateAccountButton();
    }

    @Then("I should be presented with a success message")
    public void i_should_be_presented_with_a_success_message() {
        // Wait for alert to be present
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        assert alert != null;
        String alertText = alert.getText();
        assert alertText.equals("Registration submitted successfully. Your account is pending admin approval.");

        alert.accept();
    }
}