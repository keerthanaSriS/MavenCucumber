package org.finalRun;


import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@RerunReport\\\\failed.txt", glue = "org.stepdefinition", dryRun = false, strict = true, monochrome = true, 
plugin = {
		"pretty", 
		"rerun:C:\\Users\\dhivi\\eclipse-workspace\\CucumberBatch5pm\\AllReport\\RerunReport\\failed.txt"})


public class RerunnerClass {

	@AfterClass
	public static void report() {

		JvmReport.generateJvmReport(
				"C:\\Users\\dhivi\\eclipse-workspace\\CucumberBatch5pm\\AllReport\\Json\\JsonReport.json");

	}
	
}
