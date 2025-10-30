package Runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
    features = "src/test/java/Com/Gmail/Users/Features/login2.feature",
    glue = {"Com.Gmail.Users.StepDef", "Com.Gmail.Users.Hooks"},
    tags="@TC3",
    plugin = {"pretty", "html:Reports/cucumber-reports.html"}
)

public class TourTestRunner2 extends AbstractTestNGCucumberTests {}

