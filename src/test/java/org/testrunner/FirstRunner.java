package org.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinitions.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Lenovo\\eclipse-workspace\\1-2-taste\\src\\test\\resources\\FeatureFiles\\Quote.feature",
glue = "org.stepdefinitions", tags = "not @skip", plugin = {"html:HtmlReport", "junit:JunitReport\\Junit.xml", "json:JsonReport\\Jsonreport.json"})

public class FirstRunner {

	@AfterClass
	public static void jvm() {
		
		JVMReport.generateJVMReport("C:\\Users\\Lenovo\\eclipse-workspace\\1-2-taste\\JsonReport\\Jsonreport.json");
	
	}
}


