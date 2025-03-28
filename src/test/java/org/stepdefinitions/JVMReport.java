package org.stepdefinitions;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class JVMReport {
    public static void generateJVMReport(String jsonFilePath) {
        File reportOutputDirectory = new File("target/cucumber-html-reports");
        Configuration config = new Configuration(reportOutputDirectory, "12Taste Automation");
        config.addClassifications("Platform", "Windows");
        config.addClassifications("Browser", "Chrome");
        config.addClassifications("Environment", "QA");

        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add(jsonFilePath);

        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, config);
        reportBuilder.generateReports();
    }
}
