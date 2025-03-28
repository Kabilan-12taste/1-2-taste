package org.stepdefinitions;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class JVMReport {
    public static void generateJVMReport(String jsonPath) {
        // Directory where the reports will be saved
        File reportOutputDirectory = new File("target/cucumber-reports");
        
        // List to hold the path of the JSON files
        List<String> jsonFiles = new ArrayList<>();
        
        // Add the path to the JSON file(s)
        File jsonFile = new File(jsonPath);
        if (!jsonFile.exists()) {
            System.out.println("ERROR: Cucumber JSON file not found! Path: " + jsonPath);
            return;
        }

        jsonFiles.add(jsonPath);

        // Configuration for the report
        Configuration config = new Configuration(reportOutputDirectory, "12Taste B2B");
        config.addClassifications("Platform", "Windows");
        config.addClassifications("Browser", "Chrome");
        config.addClassifications("Environment", "QA");

        // Create a report builder
        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, config);
        
        // Generate the report
        reportBuilder.generateReports();
        System.out.println("JVM Report successfully generated at: " + reportOutputDirectory.getAbsolutePath());
    }
}
