package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/resources/Features",

        glue = "stepDefinitions",
        tags = "@smoke",
        monochrome = true,
        plugin = {"pretty"})


public class runner extends AbstractTestNGCucumberTests {

}