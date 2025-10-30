package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
	
	WebDriver driver;
	
	public ProductPage(WebDriver driver) {
		this.driver=driver;
	}

	By searchField= By.xpath("//input[@id='small-searchterms']");
	By searchButton =By.xpath("//input[@class='button-1 search-box-button']");
	
	public void getSearch(String search) {
		driver.findElement(searchField).sendKeys(search);
		driver.findElement(searchButton).click();
	}
}
