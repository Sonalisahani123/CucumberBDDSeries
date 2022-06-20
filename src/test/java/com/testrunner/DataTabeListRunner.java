package com.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\parallel\\DataTableASList.feature"},
                glue= {"parallel"},
               // tags="@All",
                		plugin={"pretty",
                		 "json:target/MyReports/report.json", 
                		 "junit:target/MyReports/report.xml" 
                		 }
                //monochrome = false,
                //dryRun=false
                //strict=true

		)
public class DataTabeListRunner {

}
