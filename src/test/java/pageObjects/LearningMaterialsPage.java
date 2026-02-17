package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LearningMaterialsPage {

    WebDriver driver;

    @FindBy(css = "button.nav-dropdown-trigger")
    WebElement learnButton;

    @FindBy(xpath = "//button[.//span[text()='Learning Materials']]")
    WebElement learningMaterialsButton;

    @FindBy(xpath = "//span[text()='Web Automation Basic Form']")
    WebElement webAutomationBasicForButton;

    @FindBy(id = "name")
    WebElement enterName;

    @FindBy(id = "email")
    WebElement enterEmail;

    @FindBy(id = "age")
    WebElement enterAge;

    @FindBy(id = "gender")
    WebElement genderDropdown_id;

    @FindBy(id = "Female")
    WebElement selectGender;

    @FindBy(id = "country")
    WebElement countryDropDown_id;

    @FindBy(id = "United States")
    WebElement selectCountry;

    @FindBy(id = "experience")
    WebElement selectExperienceLevel_id;
    @FindBy(id = "advanced")
    WebElement selectExperienceLevel;

    @FindBy(id = "skill-javascript")
    WebElement selectSkill;

    @FindBy(id = "comments")
    WebElement enterComment;

    @FindBy(id ="terms")
    WebElement selectTermsAndConditions_id;

    @FindBy(id ="submit-btn")
    WebElement submitForm_id;

    public LearningMaterialsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);  // 🔥 VERY IMPORTANT
    }


    public void clickLearnButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(learnButton));
        learnButton.click();
    }


    public void clickLearningMaterialsButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement learnTab = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//button[.//span[text()='Learning Materials']]")
                )
        );
        learningMaterialsButton.click();
    }

    public void clickWebAutomationBasicForm() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(webAutomationBasicForButton));
        webAutomationBasicForButton.click();
    }

    public void enterName() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(enterName));
        enterName.sendKeys("Keishia Blouws");
    }

    public void enterEmail() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(enterEmail));
        enterEmail.sendKeys("kmblouws@gmail.com");
    }

    public void enterAge() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(enterAge));
        enterAge.sendKeys("20");

    }

    public void selectGender() {
        Select gender = new Select(genderDropdown_id);
        gender.selectByVisibleText("Female");
    }

    public void selectCountry() {
        Select country = new Select(countryDropDown_id);
        country.selectByVisibleText("Canada");
    }

    public void selectExperienceLevel() {
        Select country = new Select(selectExperienceLevel_id);
        country.selectByVisibleText("Experience Level");
    }


    public void selectSkill() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(selectSkill));
        selectSkill.click();
    }

    public void enterComment() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(enterComment));
        enterComment.sendKeys("testing comment section");

    }
    public void selectTermsAndConditions() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(selectTermsAndConditions_id));
        selectTermsAndConditions_id.click();

    }
    public void selectTheSubmitButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(submitForm_id));
        submitForm_id.click();

    }

}

