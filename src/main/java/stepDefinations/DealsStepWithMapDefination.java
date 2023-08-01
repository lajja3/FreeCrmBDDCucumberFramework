package stepDefinations;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//Feature file here is : dealsmap.feature
// data table with maps : for parameterization(key,value pair) of test cases using for loop
public class DealsStepWithMapDefination {

WebDriver driver;
	
	@Given("^user is already on Login Page$")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lajja Patel\\OneDrive\\Desktop\\MySelenium57\\Cucumber\\CucumberWorkspace\\geckodriver.exe");
		driver = new FirefoxDriver(); 
		driver.get("https://classic.freecrm.com/");
	}
	
	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable credentials) throws InterruptedException {
		for(Map<String, String> data : credentials.asMaps(String.class, String.class)) 
		{
		driver.findElement(By.name("username")).sendKeys(data.get("Username")); // Username is column name from feature file
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys(data.get("Password")); //Password is header name from feature file it should be exact same
		Thread.sleep(1000);
		}
	}
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		//without javaexecutor lines login button may not work for this crm page
		JavascriptExecutor js = (JavascriptExecutor)driver; //this 2 lines are given by naveen
		js.executeScript("arguments[0].click();",loginBtn);
	}
	
	@Then("^user is on home page$")
	public void user_is_on_home_page() throws InterruptedException {
		String title = driver.getTitle();
		System.out.println("Home Page title ::"+ title);
		Thread.sleep(3000);
	}
	
	@Then ("^user moves to new deal page$")
	public void user_moves_to_new_deal_page() throws InterruptedException {
		driver.switchTo().frame("mainpanel"); 
		Thread.sleep(3000);
		Actions action = new Actions(driver); 
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform(); 
		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click(); 
		Thread.sleep(1000);
	}
	
	@Then ("^user enters deal details$")
	 public void user_enters_contact_details(DataTable dealData) throws InterruptedException {
		
	  for (Map<String,String> data : dealData.asMaps(String.class,String.class)) {
		
		driver.findElement(By.id("title")).sendKeys(data.get("Title"));
		Thread.sleep(1000);
		driver.findElement(By.id("amount")).sendKeys(data.get("Amount"));
		Thread.sleep(1000);
		driver.findElement(By.id("probability")).sendKeys(data.get("Probability"));
		Thread.sleep(1000);
		driver.findElement(By.id("commission")).sendKeys(data.get("Commission"));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click(); //click save button
        Thread.sleep(2000);
        //move to new deal page again
        Actions action = new Actions(driver); 
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform(); 
		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click(); 
		Thread.sleep(2000);
	  }
	  
	}
	@Then ("^user moves to deal page again$")
	public void user_moves_to_deal_page_again() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'Deals')]")).click();
	}
			
	 //This step is giving error for junit results fail but output is working
	  /*@Then("^close the browser$")
	 public void close_the_browser() throws InterruptedException{
		  Thread.sleep(3000);
		 driver.quit();
	 }*/

}
