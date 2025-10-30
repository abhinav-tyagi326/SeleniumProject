package TestCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import TestScript.ProductPage;
import Utility.ScreenshotClass;

public class ProductTests {
	
	WebDriver driver;
	ScreenshotClass s;
	
	@Parameters({"browser","url"})
	@BeforeMethod
	public void launch(String browser,String url) {
		s=new ScreenshotClass();
		driver=s.setUp(browser);
		driver.get(url);
	} 
	
  @Test
  public void verifySearch() {
	  ProductPage productpage=new ProductPage(driver);
	  productpage.getSearch("Fiction");
  }
}
