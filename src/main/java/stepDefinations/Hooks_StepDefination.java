////Feature file : hooks.feature
////Just like @before, @beforemethod , @aftermethod, @after Annotations in TestNG 
////We have Hooks concept in cucumber
////For hooks we have @Before and @After 
////You have to import Before and After from cucumber.api (not from junit) they become hook
////you do not have to write @Before and @After in feature file , they are written in stepdefination only
//
//package stepDefinations;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class Hooks_StepDefination {
//
////@Before will be executed before each scenario
//	@Before
//	public void setUP() {
//		System.out.println("launch FF");
//		System.out.println("Enter URL for Free CRM App");
//	}
//
////@After will be executed after each scenario
//	@After
//	public void tearDown() {
//		System.out.println("close the browser");
//	}
//	
////Scenario 1
//	@Given("user is on deal page")
//	public void user_is_on_deal_page() {
//	    System.out.println("Scenario 1");
//		System.out.println("user is on deal page");
//	}
//	
//	@When("user fills the deals form")
//	public void user_fills_the_deals_form() {
//	    System.out.println("create a deal");
//	}
//	
//	@Then("deal is created")
//	public void deal_is_created() {
//	    System.out.println("deal is created");
//	}
//	
////Scenario 2
//	@Given("user is on contact page")
//	public void user_is_on_contact_page() {
//        System.out.println("Scenario 2");
//        System.out.println("user is on contact page");
//	}
//	
//	@When("user fills the contact form")
//	public void user_fills_the_contact_form() {
//        System.out.println("create a contact");
//	}
//	
//	@Then("contact is created")
//	public void contact_is_created() {
//        System.out.println("contact is created");
//	}
//	
////Scenario 3
//	@Given("^user is on mail page$")
//	public void user_is_on_mail_page() throws Throwable {
//		System.out.println("Scenario 3");
//		System.out.println("user is on mail page");
//	}
//	
//	@When("^user fills the mail form$")
//	public void user_fills_the_mail_form() throws Throwable {
//		System.out.println("create a mail");
//	}
//	
//	@Then("^mail is created$")
//	public void mail_is_created() throws Throwable {
//		System.out.println("mail is created");
//	}
//}
//
//
////Sequence of your output will be
////1.@Before will be executed before each scenario
////2.@Scenario1(-->Steps(Given,When,Then,...)) in sequence as per written in feature file
////3.@After will be executed after each scenario