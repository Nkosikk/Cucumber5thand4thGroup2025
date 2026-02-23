package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.AssignmentCreateUserPage;
import pageObjects.LearningMaterialsPage;
import pageObjects.LoginPage;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();
    protected WebDriver driver;

    public LoginPage loginPage;
    public LearningMaterialsPage learningMaterialsPage;
    public AssignmentCreateUserPage assignmentCreateUserPage;

    public Base() {
        driver = browserFactory.startBrowser(
                "chrome",
                "https://ndosisimplifiedautomation.vercel.app"
        );

        loginPage = PageFactory.initElements(driver, LoginPage.class);
        learningMaterialsPage = PageFactory.initElements(driver, LearningMaterialsPage.class);
        assignmentCreateUserPage = PageFactory.initElements(driver, AssignmentCreateUserPage.class);
    }
}
