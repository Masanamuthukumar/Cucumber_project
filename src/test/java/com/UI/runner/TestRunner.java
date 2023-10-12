package com.UI.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue	= "com.UI.step_Definitions",
		dryRun = false,
		monochrome = true,
		plugin = {"html:cucumber_Reports/report.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)
public class TestRunner {

}
