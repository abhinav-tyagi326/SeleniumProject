package Utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ScreenshotClass {
	
	static WebDriver driver;
	
	public WebDriver setUp(String browser) {
		switch(browser) {
		case "Chrome":
			driver=new ChromeDriver();
			break;
		case "Firefox":
			driver=new FirefoxDriver();
			break;
		case "Safari":
			driver=new SafariDriver();
			break;
		case "Edge":
			System.setProperty("webdriver.edge.driver","C:\\Users\\abaskara\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			driver=new EdgeDriver();
			break;
		default:
			System.out.println("Invalid browser found");	
		}
		//driver.get(url);
		return driver;
	}
	
   public void screen2(WebDriver driver) {
	   this.driver=driver;
		
		//it stores screenshot images with date and time combination it stores unique name for each ss it takes
		try {
			Date dates=new Date();
			DateFormat df=new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
			String time=df.format(dates);
			
			File x=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File destination=new File(".\\src\\test\\java\\Reports\\img"+time+".png");
			FileUtils.copyFile(x,destination);
		}catch(IOException e) {
			e.printStackTrace();
		}	
	}
   
//   public void signin(String user,String pass) {
//	   WebElement username=driver.findElement(By.name("userName"));
//		username.sendKeys(user);
//		
//		WebElement password=driver.findElement(By.name("password"));
//		password.sendKeys(pass);
//		
//		WebElement submit=driver.findElement(By.name("submit"));
//		submit.click();	
//		
//		WebElement logintext=driver.findElement(By.xpath("//h3[normalize-space()='Login Successfully']"));
//		Assert.assertEquals(logintext.getText(),"Login Successfully");
//   }
//   
// 

}
