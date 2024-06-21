package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src1/features",
    glue = {"stepDefinitions"},
    tags = "@tag or @tag1",
    dryRun = false,
    monochrome = true,
    plugin = {"pretty", "html:target/cucumber-reports"}
)
public class TestRunner1 {
}