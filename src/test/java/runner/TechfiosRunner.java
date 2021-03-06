package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

features = "src\\test\\java\\features\\Techfios.feature",
glue = "steps",
monochrome = true,
plugin = {
		"pretty",
		"html:target/cucumber",
		"json:target/cucumber.json"
}
		
		)

public class TechfiosRunner {
	

}
