package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.LearningMaterialsPage;
import pageObjects.LoginPage;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.ndosiautomation.co.za/#practice");
    public LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    public LearningMaterialsPage learningMaterialsPage = PageFactory.initElements(driver, LearningMaterialsPage.class);

}
