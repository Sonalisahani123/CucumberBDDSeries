package parallel;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;



@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src\\test\\resources\\parallel"},
		glue={"parallel"},
		/*tags="@smoke",*/
	    plugin = {"pretty",
		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", 
		 "timeline:test-output-thread/"
						/*"json:target/MyReports/report.json"	,
				        "junit:target/MyReports/report.xml"*/
	    		
		}	
		)
//This is for TestNG runner
public class ParallelRun extends AbstractTestNGCucumberTests{
	
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
		
	}

}
