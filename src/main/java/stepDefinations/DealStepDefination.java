////For Concept of Test Data Tables - data driven approach in cucumber 
////Feature file is  : deals.feature
//package stepDefinations;
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class DealStepDefination {
//
//WebDriver driver;
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
//	}
//	
//	@Then("^user enters username and password$")
//	public void user_enters_username_and_password(DataTable credentials) throws InterruptedException {
//		List<List<String>> data = credentials.cells(); // .raw() is no more available instead we use .cells()
//		driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
//		Thread.sleep(1000);
//		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
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
//	}
//	
//	@Then ("^user moves to new deal page$")
//	public void user_moves_to_new_deal_page() throws InterruptedException {
//		driver.switchTo().frame("mainpanel"); 
//		Thread.sleep(3000);
//		Actions action = new Actions(driver); 
//		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform(); 
//		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click(); 
//		Thread.sleep(1000);
//	}
//	
//	@Then ("^user enters deal details$")
//	 public void user_enters_contact_details(DataTable dealData) throws InterruptedException {
//		List<List<String>> dealValues = dealData.cells(); //cells is list of list of string
//		driver.findElement(By.id("title")).sendKeys(dealValues.get(0).get(0));
//		Thread.sleep(1000);
//		driver.findElement(By.id("amount")).sendKeys(dealValues.get(0).get(1));
//		Thread.sleep(1000);
//		driver.findElement(By.id("probability")).sendKeys(dealValues.get(0).get(2));
//		Thread.sleep(1000);
//		driver.findElement(By.id("commission")).sendKeys(dealValues.get(0).get(3));
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
//        Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[contains(text(),'Deals')]")).click();
//		Thread.sleep(2000);
//	}
//			
//	 //This step is giving error for junit results fail but output is working
//	  /*@Then("^close the browser$")
//	 public void close_the_browser() throws InterruptedException{
//		  Thread.sleep(3000);
//		 driver.quit();
//	 }*/
//	
//}
