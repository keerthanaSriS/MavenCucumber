package org.finalRun;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\FeatureFile", glue = "org.stepdefinition", dryRun = false, strict = true, monochrome = true, plugin = {
		"pretty", "html:C:\\Users\\dhivi\\eclipse-workspace\\CucumberBatch5pm\\AllReport\\HtmlReport",
		"junit:C:\\Users\\dhivi\\eclipse-workspace\\CucumberBatch5pm\\AllReport\\JunitReport\\Junit1Report.xml",
		"json:C:\\Users\\dhivi\\eclipse-workspace\\CucumberBatch5pm\\AllReport\\Json\\JsonReport.json",
		"rerun:C:\\Users\\dhivi\\eclipse-workspace\\CucumberBatch5pm\\AllReport\\RerunReport\\failed.txt"})

public class RunAll {

	@AfterClass
	public static void report() {

		JvmReport.generateJvmReport(
				"C:\\Users\\dhivi\\eclipse-workspace\\CucumberBatch5pm\\AllReport\\Json\\JsonReport.json");

	}

}
