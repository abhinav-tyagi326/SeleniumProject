//package Com.Gmail.Users.StepDef;
//
//import java.util.List;
//import java.util.NoSuchElementException;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.be.I;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
// 
//public class tourLoginDemo {
//	WebDriver driver = new ChromeDriver();
// 
//	@Given("I navigate to login page")
//	public void i_navigate_to_login_page() {
//		
//		driver.get("https://demo.guru99.com/test/newtours/");
//		Assert.assertEquals(driver.getCurrentUrl(), "https://demo.guru99.com/test/newtours/");
//		System.out.println("Page Navigated");
//	}
//	
//	@When("I insert {string} and {string}")
//	public void i_insert_and(String usernm, String psswd) {
//		System.out.println(usernm+" "+psswd);
//		WebElement unm= driver.findElement(By.xpath("//input[@name='userName']"));
//		unm.sendKeys(usernm);
//		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
//		password.sendKeys(psswd);
//	}
//	
//	
//	@When("I entered following details")
//	public void i_entered_following_details(DataTable dataTable) {
//		List<List<String>> ele = dataTable.cells();
////		System.out.println(ele.get(0).get(0));
////		System.out.println(ele.get(0).get(1));
////		System.out.println(ele.get(1).get(0));
////		System.out.println(ele.get(1).get(1));
////		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(ele.get(1).get(0));
////		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
////		password.sendKeys(ele.get(1).get(1));
//		
//		for(int i=0; i<ele.size(); i++) {
//				WebElement unm= driver.findElement(By.xpath("//input[@name='userName']"));
//				unm.sendKeys(ele.get(i).get(0));
//				WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
//				password.sendKeys(ele.get(i).get(1));
//			}
//		System.out.println("credentials were entered");
//	}
// 
// 
// 
//	@And("I entered username and password")
//	public void i_entered_username_and_password() {
//		
//		WebElement username = driver.findElement(By.name("userName"));
//		username.sendKeys("mercury");
//		WebElement password = driver.findElement(By.name("password"));
//		password.sendKeys("mercury");
//		System.out.println("Data Entered");
//		WebElement submit = driver.findElement(By.name("submit"));
//		submit.click();
//		WebElement sc = driver.findElement(By.xpath("//h3[normalize-space()='Login Successfully']"));
//		Assert.assertEquals(sc.getText(), "Login Successfully");
//		System.out.println("Button clicked");
//	}
// 
//	
//	@And("I clicked signin button")
//	public void i_clicked_signin_button() {
//	    WebElement submit = driver.findElement(By.name("submit"));
//	    submit.click();
//	}
//	
////	public void i_clicked_signin_button() {
////		
////		WebElement submit = driver.findElement(By.name("submit"));
////		submit.click();
////		WebElement sc = driver.findElement(By.xpath("//h3[normalize-space()='Login Successfully']"));
////		Assert.assertEquals(sc.getText(), "Login Successfully");
////		System.out.println("Button clicked");
////	}
//	
////	@Then("Its navigated to the {string}")
////	public void its_navigated_to_the_homepage(String expectedResult) {
//// 
////		if (expectedResult.equals("Login Successfully")) {
////			WebElement success = driver.findElement(By.xpath("//h3[normalize-space()='Login Successfully']"));
////			Assert.assertEquals(success.getText(), "Login Successfully");
////			System.out.println("Navigated to HomePage");
////		} else if (expectedResult.equals("Enter your userName and password correct")) {
////			WebElement errorMsg = driver
////					.findElement(By.xpath("//span[normalize-space()='Enter your userName and password correct']"));
////			Assert.assertEquals(errorMsg.getText(), "Enter your userName and password correct");
////			System.out.println("Error message appeared");
////		}
//// 
////	}
//	
//	
//	@Then("Its navigated to the homepage {string}")
//	public void its_navigated_to_the_homepage(String expectedResult) {
//	    try {
//	        if (expectedResult.equals("Login Success")) {
//	            WebElement success = driver.findElement(By.xpath("//h3[normalize-space()='Login Successfully']"));
//	            Assert.assertTrue(success.isDisplayed());
//	            System.out.println("Login successful");
//	        } else if (expectedResult.equals("Enter your userName and password correct")) {
//	            WebElement errorMsg = driver.findElement(By.xpath("//span[normalize-space()='Enter your userName and password correct']"));
//	            Assert.assertTrue(errorMsg.isDisplayed());
//	            System.out.println("Error message displayed");
//	        } else {
//	            Assert.fail("Unexpected result: " + expectedResult);
//	        }
//	    } catch (NoSuchElementException e) {
//	        Assert.fail("Expected element not found for result: " + expectedResult);
//	    }
//	}
//
// 
////	@Then("Its navigated to the HomePage")
////	public void its_navigated_to_the_home_page() {
////		driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
////		System.out.println("Homepage Launched");
////	}
//	
//	
//	@Given("I navigate to login page from Homepage")
//	public void i_navigate_to_login_page_from_homepage() {
//		
//		driver.get("https://demo.guru99.com/test/newtours/");
//		Assert.assertEquals(driver.getCurrentUrl(), "https://demo.guru99.com/test/newtours/");
//		System.out.println("Page for TC2 Navigated");
//	}
// 
//	@And("I entered username and wrong password")
//	public void i_entered_username_and_wrong_password() {
//		
//		WebElement username = driver.findElement(By.name("userName"));
//		username.sendKeys("mercury");
//		WebElement password = driver.findElement(By.name("password"));
//		password.sendKeys("ajslkdjfkash");
//		System.out.println("Data Entered for TC2");
//	}
// 
//	@And("I clicked on signin button")
//	public void i_clicked_on_signin_button() {
//		
//		WebElement submit = driver.findElement(By.name("submit"));
//		submit.click();
//		WebElement target1 = driver.findElement(By.xpath("//span[normalize-space()='Enter your userName and password correct']"));
//        Assert.assertTrue(target1.isDisplayed());
//		System.out.println("Login Failed here...");
//	}
// 
//	@Then("navigated to the error msg")
//	public void its_navigated_to_the_error_msg() {
//		driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
//		System.out.println("There is error in Loading homepage");
//	}
//	
//}
