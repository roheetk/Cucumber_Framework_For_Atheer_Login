package utils;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumDriver {

	private static WebDriver driver;
	private static SeleniumDriver seleniumDriver;

	public static WebDriver getDriver() {
		return driver;
	}

	private SeleniumDriver() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	}

	public static void setUpDriver() {
		if (seleniumDriver == null) {
			seleniumDriver = new SeleniumDriver();
		}
	}

	public static void switchToFrame(String frameID) {
		driver.switchTo().frame(frameID);
	}

	public static void default_Content() {
		driver.switchTo().defaultContent();
	}

	public static void clickUsingJS(WebElement ele) {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ele);
	}

	public static void hoverAndClick(WebElement ele) {
		Actions a = new Actions(driver);
		a.moveToElement(ele).click().perform();
	}

	public static void tearDown() {
		if (driver != null) {
			driver.quit();
			seleniumDriver = null;
		}
	}
}
