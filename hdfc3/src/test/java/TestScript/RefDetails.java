package TestScript;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RefDetails {
	
	//this class is only to read properties file and to get webElement 
	//stored in that properties file so we dont perform any actions all the action realtes scripts should be in the TestCase/TestNg class

	public String getPropertyRef(String key) {
		String value=null;
		try {
			FileInputStream fis=new FileInputStream(".\\src\\test\\java\\Repository\\locators.properties");
			Properties prop=new Properties();
			prop.load(fis);
			
			value=prop.getProperty(key);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return value;
	}
	
    public WebElement getWebElementRef(String key1,WebDriver driver) {
    	
    	WebElement ele=null;
    	RefDetails refdetails=new RefDetails();
    	String info=refdetails.getPropertyRef(key1);
    	
    	String[] value= info.split(":");
    	
    	switch(value[0]){
    		
    	case "id":
    		ele=driver.findElement(By.id(value[1]));
    		break;
    	
    	case "name":
    		ele=driver.findElement(By.name(value[1]));
    		break;
    	
    	case "xpath":
    		ele=driver.findElement(By.xpath(value[1]));
    		break;
    	
    	case "linkText":
    		ele=driver.findElement(By.linkText(value[1]));
    		break;
    		
    	case "className":
    		ele=driver.findElement(By.className(value[1]));
    		break;
    		
    	case "cssSelector":
    		ele=driver.findElement(By.cssSelector(value[1]));
    		break;
    		
    	case "tagName":
    		ele=driver.findElement(By.tagName(value[1]));
    		break;
    		
    	case "partialLinkText":
    		ele=driver.findElement(By.partialLinkText(value[1]));
    		break;
    		
    	default:
    		System.out.println("Invalid locator found...");
    	
    	}
    	
    	return ele;
		
	}
}
