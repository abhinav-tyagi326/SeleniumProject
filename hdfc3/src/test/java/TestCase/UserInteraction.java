package TestCase;

import javax.swing.text.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import TestScript.HomePage;
import Utility.ExcelReference;
import Utility.ScreenshotClass;

public class UserInteraction {

	WebDriver driver;
	ScreenshotClass s;
	
	@Parameters({"browser","url"})
	@BeforeMethod
	public void launch(String browser,String url) {
		s=new ScreenshotClass();
		driver=s.setUp(browser);
		driver.get(url);
	}

	
	@Test(dataProvider="input", dataProviderClass= Utility.DataProvider1.class, enabled =false)
	public void verifyRegister(String firstNm,String lastNm,String email,String password,String confirmPwd) {
		HomePage registerpage=PageFactory.initElements(driver,HomePage.class);
		registerpage.getRegister(firstNm, lastNm, email, password, confirmPwd);
		WebElement target = driver.findElement(By.xpath("//div[contains(text(),'registration completed')]]"));
		Assert.assertTrue(target.isDisplayed());
	}
	
	@Test(dataProvider="input2", dataProviderClass= Utility.DataProvider1.class)
	public void loginNow(String email,String password) {
		HomePage registerpage=PageFactory.initElements(driver,HomePage.class);
		registerpage.loginNow(email, password);
		WebElement target = driver.findElement(By.xpath("//a[normalize-space()='Log Out']"));
		Assert.assertTrue(target.isDisplayed());
	}
	
	@AfterMethod
	public void teardown(ITestResult res) {
		int actualstatus=res.getStatus();
		int expectedstatus=ITestResult.FAILURE;
		if(actualstatus==expectedstatus) {
			s.screen2(driver);
		}
	}
	
	
}
