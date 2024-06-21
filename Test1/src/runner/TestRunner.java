package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/features",
    glue = "stepDefinitions",
    tags = "@tag1 or @tag",
    dryRun = false, monochrome = true
)
public class TestRunner {
}
