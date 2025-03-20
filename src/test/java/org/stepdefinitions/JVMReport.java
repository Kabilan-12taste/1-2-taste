package org.stepdefinitions;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
    public static void generateJVMReport(String jsonpath) {
        File f = new File("target/JVMReport");  // Store reports inside target/

        Configuration c = new Configuration(f, "1-2 Taste - Automation Report");
        c.addClassifications("OS Name", "Windows");
        c.addClassifications("OS Version", "10");
        c.addClassifications("Browser", "Chrome");
        c.addClassifications("Project_Name", "1-2 Taste");

        List<String> li = new ArrayList<>();
        li.add(jsonpath);

        ReportBuilder r = new ReportBuilder(li, c);
        r.generateReports();
    }
}
