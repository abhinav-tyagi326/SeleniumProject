package TestCase;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Grid1 {
	public WebDriver driver;
	ChromeOptions co= new ChromeOptions();
	EdgeOptions c2= new EdgeOptions();
	FirefoxOptions c3= new FirefoxOptions();
	String hub = "http://10.51.243.231:5555/";
	
	@Parameters({"browser"})
	@Test
	public void Launch(String browser) throws MalformedURLException
	{
		if(browser.equals("chrome"))
		{
				co.setCapability("browserName", "chrome");
				driver = new RemoteWebDriver(new URL(hub),co);
		}
		if(browser.equals("MicrosoftEdge"))
		{
				c2.setCapability("browserName", "MicrosoftEdge");
				driver = new RemoteWebDriver(new URL(hub),c2);
		}	
		if(browser.equals("firefox"))
		{
				c3.setCapability("browserName", "firefox");
				driver = new RemoteWebDriver(new URL(hub),c3);
		}	
		driver = new RemoteWebDriver(new URL(hub),co);
		driver.get("http://www.capgemini.com");
		System.out.println(driver.getTitle());
	}
}
