package org.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {

	public static void generateJvmReport(String json) {
		//1.Add File loc
		File f = new File("C:\\Users\\dhivi\\eclipse-workspace\\CucumberBatch5pm\\AllReport\\JVMreport");
		
		//2.Add Details
		Configuration c = new Configuration(f, "Facebook Application");
		
		c.addClassifications("platfrom", "window");
		c.addClassifications("sprint", "java");
		
		//3.
		List<String> li = new ArrayList<String>();
		li.add(json);
		
		//4.
		ReportBuilder r = new ReportBuilder(li, c);
		r.generateReports();
		
		

	}
	
	
}
