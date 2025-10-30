package TestScript;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
 
public class HomePage {
 
	WebDriver driver;
	By registerLink = By.linkText("Register");
	By gender = By.id("gender-female");
	By firstName = By.name("FirstName");
	By lastName = By.xpath("//input[@id='LastName']");
	By email = By.xpath("//input[@id='Email']");
	By password = By.xpath("//input[@id='Password']");
	By confirmPassword = By.xpath("//input[@id='ConfirmPassword']");
	By registerButton = By.xpath("//input[@id='register-button']");
	By loginLink = By.linkText("Log in");
	By loginButton = By.xpath("//input[@value='Log in']");
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	public void getRegister(String firstNa,String lastNa,String mail,String pass,String confirmPass) {
		driver.findElement(registerLink).click();
		driver.findElement(gender).click();
		driver.findElement(firstName).sendKeys(firstNa);
		driver.findElement(lastName).sendKeys(lastNa);
		driver.findElement(email).sendKeys(mail);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(confirmPassword).sendKeys(confirmPass);
		driver.findElement(registerButton).click();
	}
public void loginNow(String mail,String pass) {
		driver.findElement(loginLink).click();
		driver.findElement(email).sendKeys(mail);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginButton).click();
	}

}





//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.CacheLookup;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
//import org.openqa.selenium.support.PageFactory;
//
//public class HomePage {
//		
//	//pagefactory initialization
//	public HomePage(WebDriver driver) {
//		PageFactory.initElements(driver,this);
//		//here this refers to current class
//	}
//    
//	//by using the page factory pattern (not pom)
//	@FindBy(linkText="Register")WebElement registerLink;
//	@FindBy(id="gender-female")WebElement gender;
//	@FindBy(name="FirstName")WebElement firstname;
//	@FindBy(xpath="//input[@id='LastName']")WebElement lastname;
//	@FindBy(xpath="//input[@id='Email']")WebElement email;
//	@FindBy(xpath="//input[@id='Password']")WebElement pass;
//	@FindBy(xpath="//input[@id='ConfirmPassword']")WebElement conformpass;
//	@FindBy(xpath="//input[@id='register-button']")WebElement regbtn;
//	
//	//find elements using HOW class
//	@FindBy(how=How.LINK_TEXT,using="Register")@CacheLookup WebElement register;
//	@FindBy(how=How.ID,using="gender-female")WebElement gend;
//	@FindBy(how=How.XPATH,using="//input[@id='LastName']")WebElement lastName;
//	
//	//find element for login
//	
//	By loginLink = By.linkText("Log in");
//	By loginButton = By.xpath("//input[@value='Log in']");
//
//	public void getRegister(String fm,String lm,String mail,String pwd,String confirmPwd) {
//		registerLink.click();
//		gender.click();
//		firstname.sendKeys(fm);
//		lastname.sendKeys(lm);
//		email.sendKeys(mail);
//		pass.sendKeys(pwd);
//		conformpass.sendKeys(confirmPwd);
//		regbtn.click();		
//	}
//	
//}
//






 
	
	


