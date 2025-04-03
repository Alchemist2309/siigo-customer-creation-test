package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/resources/features",
        glue = {"steps"},
        plugin = {"pretty", "json:target/cucumber-reports/cucumber.json"},
        monochrome = true
)
public class TestRunner {
}


