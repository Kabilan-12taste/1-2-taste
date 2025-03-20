package org.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinitions.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	    features = "C:\\Users\\Lenovo\\eclipse-workspace\\1-2-taste\\src\\test\\resources\\FeatureFiles\\LoginwithValid.feature",
	    glue = "org.stepdefinitions",
	    tags = "not @skip",
	    plugin = {
	        "pretty",
	        "html:target/HtmlReport",
	        "json:target/cucumber-reports/CucumberReport.json",  // Ensure this is correct
	        "junit:target/JunitReport/Junit.xml"
	    }
	)

public class FirstRunner {

	@AfterClass
	public static void jvm() {

		JVMReport.generateJVMReport("target/cucumber-reports/cucumber.json");



	}
}
