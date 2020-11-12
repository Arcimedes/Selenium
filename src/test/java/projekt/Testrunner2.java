package projekt;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/Feature"}, glue = "projekt/Steps")
public class Testrunner2 extends AbstractTestNGCucumberTests {
}
