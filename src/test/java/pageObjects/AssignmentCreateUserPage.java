package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;


public class AssignmentCreateUserPage {

    WebDriver driver;

    // ✅ Class-level variable (shared across methods)
    private String generatedPassword;

    // ✅ Utility method (also at class level)
    public String generateRandomPassword() {
        return "Test" + System.currentTimeMillis();
    }

    @FindBy(id = "overview-section")
    WebElement landingPageVerification_id;

    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[3]/button/span[2]")
    WebElement loginButton_id;

    @FindBy(id = "signup-toggle")
    WebElement signUpButton_id;

    @FindBy(id = "register-firstName")
    WebElement registerFirstName_id;

    @FindBy(id = "register-lastName")
    WebElement registerLastName_id;

    @FindBy(id = "register-email")
    WebElement registerEmail_id;

    @FindBy(id = "registerPassword")
    WebElement registerPassword_id;

    @FindBy(id = "register-confirmPassword")
    WebElement confirmPassword_id;





    public AssignmentCreateUserPage(WebDriver driver) {
        this.driver = driver;
    }


    public void verifyLandingPage(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(landingPageVerification_id));
        landingPageVerification_id.isDisplayed();
    }

    public void selectLoginButton(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(loginButton_id));
        loginButton_id.click();
    }

    public void selectSignUpButton(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(signUpButton_id));
        signUpButton_id.click();
    }
    public void enterFirstName() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(registerFirstName_id));

        String randomFirstName = "Test" + System.currentTimeMillis();
        registerFirstName_id.sendKeys(randomFirstName);
    }

    public void enterLastName() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(registerLastName_id));

        String randomLastName = "Test" + System.currentTimeMillis();
        registerLastName_id.sendKeys(randomLastName);
    }

    public void enterEmail() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(registerEmail_id));

        String randomEmail = "Test" + System.currentTimeMillis();
        registerEmail_id.sendKeys(randomEmail);
    }

    public void registerPassword() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(registerPassword_id));

        generatedPassword = generateRandomPassword();
        registerPassword_id.sendKeys(generatedPassword);
    }

    public void confirmPassword() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(confirmPassword_id));

        confirmPassword_id.sendKeys(generatedPassword);
    }








}
