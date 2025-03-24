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
    strict = true,
    features = "src/test/resources/FeatureFiles/LoginwithValid.feature",
    glue = "org.stepdefinitions",
    tags = "not @skip",
    plugin = {
        "pretty",
        "html:target/cucumber-reports/index.html",
        "json:target/cucumber-reports/Cucumber.json",
        "junit:target/JunitReport/Junit.xml"
    }
)
public class FirstRunner {
    @AfterClass
    public static void jvmReport() {
        System.out.println("Generating JVM Report...");
        JVMReport.generateJVMReport("target/cucumber-reports/Cucumber.json");
    }
}
