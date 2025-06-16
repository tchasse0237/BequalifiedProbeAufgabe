package runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/resources/features",      // Path to your .feature files
        glue = "stepDefinitions",                       // Package containing your step definitions
        plugin = {
                "pretty",                                   // For readable console output
                "html:target/cucumber-reports.html",        // ✅ HTML report
                "json:target/cucumber.json"                 // Optional: for advanced reports
        },
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
