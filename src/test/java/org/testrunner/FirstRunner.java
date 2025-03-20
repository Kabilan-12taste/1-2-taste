package org.testrunner;

import java.io.File;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinitions.JVMReport;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	    features = "src/test/resources/FeatureFiles/LoginwithValid.feature",
	    glue = "org.stepdefinitions",
	    tags = "not @skip",
	    		plugin = {
	    			    "pretty",
	    			    "html:C:/ProgramData/Jenkins/.jenkins/workspace/1-2 Taste IN/target/cucumber-reports/index.html",
	    			    "json:C:/ProgramData/Jenkins/.jenkins/workspace/1-2 Taste IN/target/cucumber-reports/cucumber.json",
	    			    "junit:C:/ProgramData/Jenkins/.jenkins/workspace/1-2 Taste IN/target/JunitReport/Junit.xml"
	    			}
)

public class FirstRunner {

	@AfterClass
	public static void jvmReport() {
		JVMReport.generateJVMReport("target/cucumber-reports/cucumber.json");
	}
}
