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
	    features = "src/test/resources/FeatureFiles/LoginwithValid.feature", // Path to feature files
	    glue = "org.stepdefinitions", // Path to step definitions
	    tags = "not @skip", // If you have any specific tags to include/exclude
	    plugin = {
	        "pretty",
	        "html:target/cucumber-reports/index.html", // HTML report
	        "json:target/cucumber-reports/cucumber.json", // JSON report
	        "junit:target/JunitReport/Junit.xml" // JUnit report (optional)
	    },
	    monochrome = true
	)

public class FirstRunner {

	   @AfterClass
	    public static void jvmReport() {
	        JVMReport.generateJVMReport("target/cucumber-reports/cucumber.json");
	    }
}
