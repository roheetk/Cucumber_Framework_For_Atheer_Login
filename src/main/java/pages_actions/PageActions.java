package pages_actions;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages_locators.PageLocators;
import utils.SeleniumDriver;

public class PageActions {
	PageLocators pageLocators = null;

	public PageActions() {
		this.pageLocators = new PageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), pageLocators);
	}

	public void enterUsername(String username) {
		WebDriverWait wait = new WebDriverWait(SeleniumDriver.getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(PageLocators.fieldUsername));
		if (PageLocators.fieldUsername.isDisplayed()) {
			PageLocators.fieldUsername.sendKeys(username);
		}
	}

	public void enterPassword(String password) {
		WebDriverWait wait = new WebDriverWait(SeleniumDriver.getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(PageLocators.fieldPassword));
		if (PageLocators.fieldUsername.isDisplayed()) {
			PageLocators.fieldPassword.sendKeys(password);
		}

	}

	public void uncheckRememberMeCheckbox() {
		if (PageLocators.chkBoxRembMeChecked.size() == 1) {
			PageLocators.chkBoxRembMe.click();
		}
	}

	public void clickLoginButton() {
		WebDriverWait wait = new WebDriverWait(SeleniumDriver.getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(PageLocators.btnLogin));
		if (PageLocators.btnLogin.isDisplayed()) {
			PageLocators.btnLogin.click();
		}

	}

	public boolean isHomeIconDisplayed() {
		if (PageLocators.iconHome.isDisplayed()) {
			return true;
		}
		return false;
	}

	public boolean isAvatarIconDisplayed() {
		if (PageLocators.iconAvatar.isDisplayed()) {
			return true;
		}
		return false;
	}

	public void clickAvatarButton() {
		PageLocators.iconAvatar.click();
	}

	public void clickSignOutButton() {
		WebDriverWait wait = new WebDriverWait(SeleniumDriver.getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(PageLocators.btnSignOut));
		PageLocators.btnSignOut.click();
	}

	public boolean isSearchBarDisplayed() {
		SeleniumDriver.switchToFrame("ngxFrame");
		WebDriverWait wait = new WebDriverWait(SeleniumDriver.getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(PageLocators.searchBar));
		boolean res = PageLocators.searchBar.isDisplayed();
		SeleniumDriver.default_Content();
		if (res) {
			return true;
		}
		return false;
	}

	public boolean isLogOutMsgDisplayed() {
		WebDriverWait wait = new WebDriverWait(SeleniumDriver.getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(PageLocators.msgSignOut));
		if (PageLocators.msgSignOut.isDisplayed()) {
			return true;
		}
		return false;
	}

}
