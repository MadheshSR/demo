package cucumberoptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\maddy\\eclipse-workspace\\E2E\\src\\test\\resources\\features",
		glue = "Stepdefinition")
public class TestRunner {

}
