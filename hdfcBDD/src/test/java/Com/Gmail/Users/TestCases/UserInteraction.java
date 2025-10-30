package Com.Gmail.Users.TestCases;

import Com.Gmail.Users.Config.Reports;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
public class UserInteraction extends Reports{
	private WebDriver driver;
	private ExtentTest test;
	    public UserInteraction(WebDriver driver, ExtentTest test) {
	        this.driver = driver;
	        this.test = test;
	        PageFactory.initElements(driver,this);
	    }
 
//	    public void getUserName(String un) {
//	        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(un);
//	    }
// 
//	    public void getPassword(String pwrd) {
//	        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwrd);
//	    }
// 
//	    public void getSubmitted() {
//	        driver.findElement(By.xpath("//input[@name='submit']")).click();
//	    }
	    
	    
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
    		userName.sendKeys(un);
    	}
     
    	public void getPassword(String pwrd) {
     
    		pwd.clear();
    		pwd.sendKeys(pwrd);
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
    		Reports.captureScreenshot(driver, "Logn is not working properly");
    	}
	    
 
	    public void Run(String expectedResult) {
	        if (expectedResult.equals("Login Successfully")) {
	            WebElement success = driver.findElement(By.xpath("//h3[normalize-space()='Login Successfully']"));
	            Assert.assertEquals(success.getText(), "Login Successfully");
	            Reports.generateReport(driver, test, Status.PASS, expectedResult);
	            System.out.println("Navigated to HomePage");
	        } else if (expectedResult.equals("Enter data Correctly")) {
	            WebElement errorMsg = driver.findElement(By.xpath("//span[normalize-space()='Enter your userName and password correct']"));
	            Assert.assertEquals(errorMsg.getText(), "Enter your userName and password correct");
	            Reports.generateReport(driver, test, Status.FAIL, expectedResult);
	            System.out.println("Error message appeared");
	        }
	    }
}
 
	    
	  
	     
	   
	     
	    
	     
	    	
	     
	    	