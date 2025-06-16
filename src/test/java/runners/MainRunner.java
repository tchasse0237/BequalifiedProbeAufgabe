package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(features = {"classpath:features"}, glue = {"stepDefinitions"},
        tags = "", monochrome = true, dryRun = false,
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"}) //dryRun just use for new steps , because it does not execute the code of stepDefs
public class MainRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return  super.scenarios();
    }


}
