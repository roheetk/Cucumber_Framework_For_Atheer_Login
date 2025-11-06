package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", glue = "stepdefinitions", plugin = { "pretty",
		"html:Reports/CucumberHTML/Report.html", "json:Reports/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })

public class Runner extends AbstractTestNGCucumberTests {

}
