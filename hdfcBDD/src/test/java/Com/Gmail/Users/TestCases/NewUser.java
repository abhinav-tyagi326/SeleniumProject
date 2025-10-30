package Com.Gmail.Users.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
import Com.Gmail.Users.Config.Reports;
 
public class NewUser extends Reports {
	WebDriver driver;
	ExtentTest test;
	WebDriverWait wait;
 
	public NewUser(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
	}
 
	@FindBy(name = "userName")
	private WebElement userName;
 
	@FindBy(name = "password")
	private WebElement pwd;
 
	@FindBy(name = "submit")
	private WebElement submitBtn;
 
	@FindBy(xpath = "//h3[normalize-space()='Login Successfully']")
	private WebElement target;
 
	@FindBy(xpath = "//span[normalize-space()='Enter your userName and password correct']")
	private WebElement target1;
 
	@FindBy(xpath = "//h3[normalize-space()='Login Successfully']")
	private WebElement success;
 
	@FindBy(xpath = "//span[normalize-space()='Enter your userName and password correct']")
	private WebElement errMsg;
 
	public void getUserName(String un) {
		userName.clear();
		try {
			// wait.until(ExpectedConditions.visibilityOf(userName));
			generateReport(driver, test, Status.PASS, "Username not found");
			userName.sendKeys(un);
 
		} catch (Exception e) {
			generateReport(driver, test, Status.FAIL, "Username not found");
		}
 
	}
 
	public void getPassword(String pwrd) {
 
		pwd.clear();
		try {
			generateReport(driver, test, Status.PASS, "valid password");
			pwd.sendKeys(pwrd);
		} catch (Exception e) {
			generateReport(driver, test, Status.FAIL, "Invalid password");
		}
 
	}
 
	public void getSubmitted() {
		System.out.println("I clicked the submit button");
		submitBtn.click();
 
	}
 
	public void LoginSuccess() {
		Assert.assertTrue(target.isDisplayed(), "Login success message not displayed");
		System.out.println("Login Successfully.");
	}
 
	public void LoginFails() {
		Assert.assertTrue(target1.isDisplayed(), "Error message not displayed");
		System.out.println("Login Failed....");
	}
 
	public boolean Run(String expectedResult) {
		boolean actResult = true;
		try {
			if (expectedResult.equals("Login Successfully")) {
				Assert.assertEquals(success.getText(), "Login Successfully");
				System.out.println("Navigated to HomePage");
				generateReport(driver, test, Status.PASS, "Valid User");
			} else if (expectedResult.equals("Enter your userName and password correct")) {
				actResult = false;
				Assert.assertEquals(errMsg.getText(), "Enter your userName and password correct");
				System.out.println("Error message appeared");
				generateReport(driver, test, Status.FAIL, "InValid User");
			} else {
//				Assert.fail("Unexpected result: " + expectedResult);
			}
		} catch (Exception e) {
			actResult = false;
			Reports.generateReport(driver, test, Status.FAIL, "Something went wrong");
		}
		return actResult;
	}
}
 
	     
	   
	     
	    
	     
	    	
	     
	    	
