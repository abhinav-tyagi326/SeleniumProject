package Com.Gmail.Users.StepDef;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import Com.Gmail.Users.Hooks.Hooks;
//import Com.Gmail.Users.TestCases.UserInteraction;
import Com.Gmail.Users.TestCases.NewUser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


//public class loginDemo2 extends Base{
public class loginDemo2 {
	WebDriver driver= Hooks.driver;
	ExtentTest test = Hooks.test;
//	UserInteraction demo;
	NewUser demo;
		
    @Given("I navigate to Browser")
    public void i_navigate_to_browser() {
        driver.get("https://demo.guru99.com/test/newtours/index.php");
        demo = new NewUser(driver,test);
//        demo = new UserInteraction(driver,test); // Pass driver to UserInteraction
    }
 
    @Then("I navigate {string}")
    public void i_navigate_to_url(String url) {
        driver.get(url);
    }
 
    @When("I insert {string} and {string}")
    public void I_Insert_userName(String un, String pwrd) {
        demo.getUserName(un);
        demo.getPassword(pwrd);
        System.out.println(un + " " + pwrd);
    }
 
    @And("I clicked the signin button")
    public void I_Clicked_Login() {
        demo.getSubmitted();
    }
    @Then("Its navigates the UI")
    public void its_navigated_to_the_home_page() {
    			demo.LoginSuccess();
    }
    @Then("Its not navigates the UI")
    public void its_not_navigates_the_ui() {
    	demo.LoginFails();
		}		
    @Then("Its navigated to the {string}")
    public void its_navigated_to_the(String expectedResult) {
       boolean result =  demo.Run(expectedResult);
       Assert.assertTrue(result);
    }
}
