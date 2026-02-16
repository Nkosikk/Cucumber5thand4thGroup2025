package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
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

    public void enterName(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(enterName));
        enterName.sendKeys("Keishia");
    }




}

