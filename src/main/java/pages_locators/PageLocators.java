package pages_locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageLocators {

	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	public static WebElement fieldUsername;

	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	public static WebElement fieldPassword;

	@FindBy(how = How.XPATH, using = "//input[@id='rememberme']")
	public static WebElement chkBoxRembMe;

	@FindBy(how = How.XPATH, using = "//input[@id='rememberme'][contains(@class,'ng-not-empty')]")
	public static List<WebElement> chkBoxRembMeChecked;

	@FindBy(how = How.XPATH, using = "//button[text()='Sign in']")
	public static WebElement btnLogin;

	@FindBy(how = How.XPATH, using = "//md-icon[@md-font-icon='zmdi zmdi-home']")
	public static WebElement iconHome;

	@FindBy(how = How.XPATH, using = "//img[@class='avatar-picture ']")
	public static WebElement iconAvatar;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Search']")
	public static WebElement searchBar;

	@FindBy(how = How.XPATH, using = "//span[text()='Sign out']")
	public static WebElement btnSignOut;

	@FindBy(how = How.XPATH, using = "//div[@class='row layout-align-center-center']/h3")
	public static WebElement msgSignOut;

}
