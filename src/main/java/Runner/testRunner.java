package Runner;

        import cucumber.api.CucumberOptions;
        import cucumber.api.junit.Cucumber;
        import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/main/java/Features",
        glue = {"StepDefinition"},
        format = {"pretty", "html:cucumber-outputs","json:cucumber-outputs/output.json" },
        //plugin = { "usage" },
        monochrome = true,
        strict = true,
        dryRun = false,
        tags= {"@SmokeTest"}
)
public class testRunner {
}
