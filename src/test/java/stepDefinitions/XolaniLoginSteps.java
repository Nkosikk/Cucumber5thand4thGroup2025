package stepDefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XolaniLoginSteps {
    WebDriver driver;

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        driver = new ChromeDriver();
        driver.get("https://ndosiautomation.co.za/#practice");


    }
    @When("I enter valid email {}")
    public void i_enter_valid_email(String email) {
        driver.findElement(By.id("login-email")).sendKeys(email);

    }

    @And("I enter valid password {}")
    public void i_enter_valid_password(String password) {
        driver.findElement(By.id("login-password")).sendKeys("Khoti@90");

    }
    @And("I click the login button")
    public void i_click_the_login_button() {
        driver.findElement(By.id("login-submit")).click();

    }
    @Then("I should be redirected to the dashboard")
    public void i_should_be_redirected_to_the_dashboard() {

    }

}
