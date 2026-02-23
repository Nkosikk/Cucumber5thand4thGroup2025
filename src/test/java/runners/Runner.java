package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/resources/Features/CreateUserAssignment.feature",

        glue = "stepDefinitions",
        tags = "@smoke",
        monochrome = true,
        plugin = {"pretty"})


public class Runner extends AbstractTestNGCucumberTests {

}