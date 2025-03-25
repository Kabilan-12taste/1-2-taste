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
        "html:target/cucumber-reports/index.html",
        "json:target/cucumber-reports/Cucumber.json",
        "junit:target/cucumber-reports/Cucumber.xml"
    },
    monochrome = true
)
public class FirstRunner {
    @AfterClass
    public static void generateReport() {
        System.out.println("Generating JVM Report...");
        JVMReport.generateJVMReport("target/cucumber-reports/Cucumber.json");
    }
}
