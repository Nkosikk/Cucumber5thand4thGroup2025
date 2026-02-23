package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class SignUpPage {

    WebDriver driver;
    WebDriverWait wait;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    // ===== Locators =====

    @FindBy(id = "signup-toggle")
    WebElement signUpButton;

    @FindBy(id = "register-firstName")
    WebElement firstNameField;

    @FindBy(id = "register-lastName")
    WebElement lastNameField;

    @FindBy(id = "register-email")
    WebElement emailField;

    @FindBy(id = "register-password")
    WebElement passwordField;

    @FindBy(id = "register-confirmPassword")
    WebElement confirmPasswordField;

    @FindBy(id = "register-group")
    WebElement groupDropdown;

    @FindBy(id = "register-submit")
    WebElement createAccountButton;

    @FindBy(id = "registration-success-message")
    WebElement successMessage;

    @FindBy(xpath = "//div[@class='nav-user-section']")
    WebElement loginNavButton;
    // ===== Methods =====

    public void navigateToSignUpPage() {
        wait.until(ExpectedConditions.elementToBeClickable(loginNavButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(signUpButton)).click();
    }

    public void enterFirstName(String firstName) {
        wait.until(ExpectedConditions.visibilityOf(firstNameField));
        firstNameField.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void confirmPassword(String confirmPassword) {
        confirmPasswordField.sendKeys(confirmPassword);
    }

    public void selectGroup() {
        Select select = new Select(groupDropdown);
        select.selectByIndex(1);
    }

    public void clickCreateAccountButton() {
        createAccountButton.click();
    }

    public String getSuccessMessage() {
        wait.until(ExpectedConditions.visibilityOf(successMessage));
        return successMessage.getText();
    }
}