package com.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src\\test\\resources\\parallel\\LoginPage.feature"},
		glue={"parallel"},
		/*tags="@smoke",*/
		/* tags="not @skip", */
	    plugin = {"pretty",
		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", 
		 "timeline:test-output-thread/",
		 "rerun:target/rerunfailed.txt"
						/*"json:target/MyReports/report.json"	,
				        "junit:target/MyReports/report.xml"*/
	    		
		}	
		)

public class MyTestRunner {

}
