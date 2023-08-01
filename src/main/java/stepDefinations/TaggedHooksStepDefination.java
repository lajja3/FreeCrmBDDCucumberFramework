//Feature file : taggedhooks.feature
//Global Hooks are applicable for all the scenarios
//Tagged Hooks are used when you want some pre and post conditions for certain specific scenarios only
/*Note:- This tagged hook feature is something new in cucumber that is only applicable for
         specified scenario. This thing is missing in TestNG where we use @Beforemethod which
         is applicable for all the test methods*/
//Too much of hooks and tagging is not recommended sometimes for maintenance point of view it is very confusing

package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TaggedHooksStepDefination {

	//Global Hooks
	//if u have multiple global hooks u can give then order 
	@Before(order=0)
	public void setUP(){
		System.out.println("launch FF -- order 0");
		System.out.println("Enter URL for Free CRM APP -- order 0");
	}

	@After(order=0)
	public void tearDown(){
		System.out.println("close the browser -- order 0");
	}
	
	//Global Hooks
	@Before(order=1)
	public void setUP1(){
		System.out.println("launch FF  --  order 1");
		System.out.println("Enter URL for Free CRM APP  --  order 1");
	}

	@After(order=1)
	public void tearDown1(){
		System.out.println("close the browser  --  order 1");
	}
	
	//local - only for first scenario (Tagged Hook)
	@Before("@First")
	public void beforeFirst(){
		System.out.println("before only first scenario");
	}
	
	@After("@First")
	public void afterFirst(){
		System.out.println("after only first sceanrio");
	}
	
	//local - only for second scenario (Tagged Hook)
	@Before("@Second")
	public void beforeSecond(){
		System.out.println("before only second scenario");
	}
	
	@After("@Second")
	public void afterSecond(){
		System.out.println("after only second sceanrio");
	}
	
	//local - only for third scenario (Tagged Hook)
	@Before("@Third")
	public void beforeThird(){
		System.out.println("before only third scenario");
	}
	
	@After("@Third")
	public void afterThird(){
		System.out.println("after only third sceanrio");
	}
	
	//Scenario 1,2,3 have same steps thus only one time it is written
	@Given("^this is the first step$")
	public void this_is_the_first_step() throws Throwable {
		System.out.println("1st step");
	}

	@When("^this is the second step$")
	public void this_is_the_second_step() throws Throwable {
		System.out.println("2nd step");
	}

	@Then("^this is the third step$")
	public void this_is_the_third_step() throws Throwable {
		System.out.println("3rd step");
	}
}
