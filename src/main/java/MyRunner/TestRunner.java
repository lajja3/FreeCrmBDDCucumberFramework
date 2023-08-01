//Test Runner file is to run your feature and to generate output report

package MyRunner;
// i'm runner for FreeCRM BDD framework
import org.junit.runner.RunWith;

//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features = the path of the feature file
		features = "C:\\Users\\Lajja Patel\\OneDrive\\Desktop\\MySelenium57\\Cucumber\\CucumberWorkspace\\FreeCrmBDDFramework\\src\\main\\java\\Features\\taggedhooks.feature",  
		glue = {"stepDefinations"}, //glue= your name of the stepdefination package
		//format is use for different types of reporting ,, replace format with plugin as format got depreciated for certain versions
		//plugin = { "pretty" ,   "json:json_output/cucumber.json" , "junit:junit_xml/cucumber.xml","html : test-output "}, getting error with html
		monochrome = true, //display the console output in a proper readable format
		//strict has been decommissioned starting from Cucumber 7.0.0
		//strict = true, // it will check if any step is not defined in step defination file
		dryRun = false // to check the mapping is proper between feature file and step defination file
		//tags = "(not @SmokeTest) and (not @RegressionTest) and (not @End2End)"
		)

public class TestRunner {
//no need to write any code here
}

// NOTES:-
//Code will be executed based on the sequence written in feature file not in setpdefination file
//If you try to run your code from stepdefinition file no option will come
//thus you have to run in from test runner file as a junit

//Options available in cucumber and purpose of each(IMP for interview)
//1.dryRun
//2.Tags
//3.strict
//4.Features
//5.Monochrome
//6.Glue
//7.Format

//Taggings examples
//1. tags = "@SmokeTest" - 13 runs
//2. tags = "@End2End"   - 6
//3. tags = "@RegressionTest" -7
//4. tags = "@SmokeTest or @RegressionTest" -15
//5. tags = "@SmokeTest and @RegressionTest" -5
//6. tags = "(not @SmokeTest) and @RegressionTest" -2
//7. tags = "(not @SmokeTest) or (not @RegressionTest)" -2
//8. tags = "(not @SmokeTest) and (not @RegressionTest) and (not @End2End)" -1