package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Random;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;


public class AssignmentCreateUserPage {

    WebDriver driver;

    private String generatedEmail;



    // ✅ Class-level variable (shared across methods)
    private String generatedPassword;

    // ✅ Utility method (also at class level)
    public String generateRandomPassword() {
        // Letters and numbers
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        // Special characters
        String specialCharacters = "!@#$%^&*";

        Random random = new Random();
        StringBuilder password = new StringBuilder();

        // Add 7 random letters/numbers
        for (int i = 0; i < 7; i++) {
            password.append(characters.charAt(random.nextInt(characters.length())));
        }

        // Add 1 special character to ensure at least one is included
        password.append(specialCharacters.charAt(random.nextInt(specialCharacters.length())));

        return password.toString();
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

    @FindBy(xpath = "//*[@id=\"register-password\"]")
    WebElement registerPassword_id;

    @FindBy(xpath = "//*[@id=\"register-confirmPassword\"]")
    WebElement confirmPassword_id;

    @FindBy(xpath = "//*[@id=\"register-group\"]")
    WebElement selectGroup_id;

    @FindBy(id = "register-submit")
    WebElement clickCreateAccount_id;

    @FindBy(id = "login-email")
    WebElement loginWithAdminUserUsername_id;

    @FindBy(id = "login-password")
    WebElement loginWithAdminUserPassword_id;

    @FindBy(id = "login-submit")
    WebElement adminUserLoginButton_id;

    @FindBy (xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[3]/div/button/span[2]")
    WebElement clickAdminProfileButton_id;

    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[3]/div/div/button[4]/span[2]")
    WebElement selectAdminPanel_id;

    @FindBy(xpath = "//*[@id=\"app-root\"]/div/div[3]/div/div[1]/h1")
    WebElement verifyTheAdminDashboard_id;

    @FindBy(xpath = "//*[@id=\"app-root\"]/div/div[2]/nav/button[2]")
    WebElement selectUsersInAdminPortal_id;

    @FindBy(xpath = "//*[@id=\"app-root\"]/div/div[3]/div/div[1]/div[2]/input")
    WebElement searchGeneratedEmail_id;

    @FindBy(xpath = "//*[@id=\"app-root\"]/div/div[3]/div/div[2]/table/tbody/tr/td[5]/button")
    WebElement selectInActiveStatusButton_id;

    @FindBy(xpath = "//*[@id=\"app-root\"]/div/div[2]/div[2]/button")
    WebElement navigateBackToWebpage_id;

    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[3]/div/div/button[5]")
    WebElement selectLogoutButton_id;



    public AssignmentCreateUserPage(WebDriver driver) {
        this.driver = driver;
    }


    public void verifyLandingPage() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(landingPageVerification_id));
        landingPageVerification_id.isDisplayed();
    }

    public void selectLoginButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(loginButton_id));
        loginButton_id.click();
    }

    public void selectSignUpButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(signUpButton_id));
        signUpButton_id.click();
    }

    public void enterFirstName() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(registerFirstName_id));

        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder randomName = new StringBuilder();

        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            randomName.append(letters.charAt(random.nextInt(letters.length())));
        }

        registerFirstName_id.sendKeys(randomName.toString());
    }

    public void enterLastName() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(registerLastName_id));

        String letters = "abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        StringBuilder name = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            name.append(letters.charAt(random.nextInt(letters.length())));
        }

        // Capitalize first letter
        String formattedName =
                name.substring(0, 1).toUpperCase() +
                        name.substring(1);

        registerLastName_id.sendKeys(formattedName);
    }

    public void enterEmail() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(registerEmail_id));

        generatedEmail = "test" + System.currentTimeMillis() + "@gmail.com";
        registerEmail_id.sendKeys(generatedEmail);
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


    public void selectGroup() {
        Select gender = new Select(selectGroup_id);
        gender.selectByVisibleText("1st Group 2026 (2026)");
    }

    public void selectCreateAccount() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(clickCreateAccount_id));
        clickCreateAccount_id.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.accept();  // Click OK

    }

    public void enterAdminUser() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(loginWithAdminUserUsername_id));
        loginWithAdminUserUsername_id.clear();
        loginWithAdminUserUsername_id.sendKeys("admin@gmail.com");
    }

    public void enterAdminUserPassword() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(  loginWithAdminUserPassword_id));
        loginWithAdminUserUsername_id.clear();
        loginWithAdminUserPassword_id.sendKeys("@12345678");
    }

    public void selectLoginForAdminUser() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(adminUserLoginButton_id));
        adminUserLoginButton_id.click();
    }

    public void selectAdminPanel() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(clickAdminProfileButton_id));
        clickAdminProfileButton_id.click();
    }

    public void clickAdminPanelOption() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(selectAdminPanel_id));
        selectAdminPanel_id.click();
    }

    public void verifyAdminDashboard() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(verifyTheAdminDashboard_id));
        verifyTheAdminDashboard_id.isDisplayed();
    }

    public void selectUsersInAdminPortal() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(selectUsersInAdminPortal_id));
        selectUsersInAdminPortal_id.click();
    }

    public void searchWithGeneratedEmail() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(searchGeneratedEmail_id));

        searchGeneratedEmail_id.clear();
        searchGeneratedEmail_id.sendKeys(generatedEmail);
    }

    public void selectInactiveButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(selectInActiveStatusButton_id));
        selectInActiveStatusButton_id.click();
    }

    public void confirmUserActivation() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void confirmActivationIsSuccessful() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void navigateBackToWebpage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(navigateBackToWebpage_id));
        navigateBackToWebpage_id.click();
    }

    public void selectAdminPanel2() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(clickAdminProfileButton_id));
        clickAdminProfileButton_id.click();
    }

    public void clickLogout() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(selectLogoutButton_id));
        selectLogoutButton_id.click();
    }

    public void confirmOfLogout() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
















}
