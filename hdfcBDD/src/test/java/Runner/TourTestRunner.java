package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/Com/Gmail/Users/Features/TourLogin.feature",
    glue = "Com.Gmail.Users.StepDef",
    tags="@TC3",
    plugin = {"pretty", "html:Reports/cucumber-reports.html"}
//    tags = "@TC1 or @TC2"
)

public class TourTestRunner {}
