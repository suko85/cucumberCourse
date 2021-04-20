package cucumberOptions;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features", /* this run all features file inside the package. To run specific, write the name of feature file*/
        glue = "stepDefinitions", tags = "@SmokeTest, @RegTest") /*This is the name of stepDefinition file*/
public class TestRunner {

}
