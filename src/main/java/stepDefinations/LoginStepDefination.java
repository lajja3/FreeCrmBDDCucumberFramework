////select all then ctrl + / will comment the entire code
////FreeCrmBDDFramework
//// In step defination package we do code mapping 
////in this file, based on our feature file we will write code using selenium + java + annotations
////Feature files : login.feature and contacts.feature
//
//package stepDefinations;
////as per video unable to download natural bdd plugin for eclipse
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class LoginStepDefination {
//
//	WebDriver driver;
//	
//	@Given("^user is already on Login Page$")
//	public void user_is_on_login_page() {
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lajja Patel\\OneDrive\\Desktop\\MySelenium57\\Cucumber\\CucumberWorkspace\\geckodriver.exe");
//		driver = new FirefoxDriver(); 
//		driver.get("https://classic.freecrm.com/");
//	}
//	
//	@When("^title of login page is Free CRM$")
//	public void title_of_login_page_is_Free_CRM() {
//		String title = driver.getTitle();
//		System.out.println(title);
//		//Assert.assertEquals("Free CRM  - CRM software for customer relationship management, sales, and support.", title);
//	}
//	
//	/* This hard coded values we are passing here which is not good practice
//	@Then("^user enters username and password$")
//	public void user_enters_username_and_password() {
//		driver.findElement(By.name("username")).sendKeys("lajjacrm"); //hardcode
//		driver.findElement(By.name("password")).sendKeys("Crm@3794"); //hardcode
//	}*/
//	
//	//1. Data driven without examples keyword 
//	// \"([^\"]*)\"   or   \"(.*)\"   --  these two are Regular expressions u can use either of them
//	//2. For Data driven with examples keyword same method will be executed number of times based on the number of data sets available
//	@Then("^user enters \"(.*)\" and \"(.*)\"$")
//	public void user_enters_username_and_password(String username,String password) throws InterruptedException {
//		driver.findElement(By.name("username")).sendKeys(username);
//		Thread.sleep(1000);
//		driver.findElement(By.name("password")).sendKeys(password);
//		Thread.sleep(1000);
//	}
//	
//	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button() {
//		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
//		//without javaexecutor lines login button may not work for this crm page
//		JavascriptExecutor js = (JavascriptExecutor)driver; //this 2 lines are given by naveen
//		js.executeScript("arguments[0].click();",loginBtn);
//	}
//	
//	@Then("^user is on home page$")
//	public void user_is_on_home_page() throws InterruptedException {
//		String title = driver.getTitle();
//		System.out.println("Home Page title ::"+ title);
//		Thread.sleep(3000);
//		//Assert.assertEquals("CRMPRO", title); error
//	}
//	
//	@Then ("^user moves to new contact page$")
//	public void user_moves_to_new_contact_page() throws InterruptedException {
//		//do not change the name of frame from here it is given by naveen as "mainpanel"
//		driver.switchTo().frame("mainpanel"); //since there is frame here when u right click u will see this frame option
//		Thread.sleep(3000);//without this line unable to find element error comes and also keep mouse away from screen like at the bottom somewhere otherwise it gives error of not finding element
//		Actions action = new Actions(driver); //mouse hover to contacts which is an action
//		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform(); // so our req element new contact gets visible , contacts is on diff frame
//		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click(); // now click on new contacts
//		Thread.sleep(1000);
//	}
//	
//	@Then ("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
//	 public void user_enters_contact_details(String firstname, String lastname, String position) throws InterruptedException {
//		driver.findElement(By.id("first_name")).sendKeys(firstname);
//		Thread.sleep(1000);
//		driver.findElement(By.id("surname")).sendKeys(lastname);
//		Thread.sleep(1000);
//		driver.findElement(By.id("company_position")).sendKeys(position);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click(); //click save
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();//go back to contact page
//		Thread.sleep(2000);
//	}
//			
//	 //This step is giving error for junit results fail but output is working
//	  /*@Then("^close the browser$")
//	 public void close_the_browser() throws InterruptedException{
//		  Thread.sleep(3000);
//		 driver.quit();
//	 }*/
//}
