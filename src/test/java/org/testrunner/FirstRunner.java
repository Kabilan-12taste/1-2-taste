package org.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinitions.JVMReport;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/FeatureFiles/LoginwithValid.feature", // Relative path
    glue = "org.stepdefinitions",
    tags = "not @skip",
    plugin = {
        "pretty",
        "html:target/cucumber-reports/index.html",
        "json:target/cucumber-reports/CucumberReport.json"
    },
    monochrome = true
)
public class FirstRunner {
    @AfterClass
    public static void generateReport() {
        System.out.println("Generating JVM Report...");
        JVMReport.generateJVMReport("target/cucumber-reports/CucumberReport.json");
    }
}
