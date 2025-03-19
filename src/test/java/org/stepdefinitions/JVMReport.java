package org.stepdefinitions;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

	public static void generateJVMReport(String jsonpath) {
		
		File f = new File("C:\\Users\\Lenovo\\eclipse-workspace\\1-2-taste\\JVMReport");

		net.masterthought.cucumber.Configuration c = new net.masterthought.cucumber.Configuration(f, "LoginWithValid");

		c.addClassifications("OS Name", "Windows");
		c.addClassifications("OS Version", "10");
		c.addClassifications("Browser", "Chrome");
		c.addClassifications("Project_Name", "1-2 Taste");

		List<String> li = new ArrayList<String>();
		li.add(jsonpath);

		ReportBuilder r = new ReportBuilder(li, c);
		r.generateReports();
	}


}