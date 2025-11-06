package stepdefinitions;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.SeleniumDriver;

public class AfterActions {
	@AfterStep
	public void tearDown(Scenario scenario) {
		if (!scenario.isFailed()) {
			byte[] screenshotBytes = ((TakesScreenshot) SeleniumDriver.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshotBytes, "image/png",
					"Screenshot_" + new SimpleDateFormat("dd-MM-yy_HH-mm-ss").format(new Date()));
		}
	}

	@After
	public void tearDown() {
		SeleniumDriver.tearDown();
	}
}
