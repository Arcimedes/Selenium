package Steps;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/java/Feature"}, glue = "Steps")
public class TestRunner extends AbstractTestNGCucumberTests {
}
