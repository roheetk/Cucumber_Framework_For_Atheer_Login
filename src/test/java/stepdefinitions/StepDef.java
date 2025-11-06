package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages_actions.PageActions;
import utils.SeleniumDriver;

public class StepDef {
	PageActions pageActions = new PageActions();

	@Given("User navigates to website {string}")
	public void user_navigates_to_swag_labs_website(String websiteURL) throws Throwable {
		SeleniumDriver.getDriver().get(websiteURL);
	}

	@When("User enters username {string}")
	public void user_enters_username(String username) throws Throwable {
		pageActions.enterUsername(username);
	}

	@When("User enters password {string}")
	public void user_enters_password(String password) throws Throwable {
		pageActions.enterPassword(password);
	}

	@When("Uncheck remember me checkbox")
	public void uncheck_remember_me_checkbox() {
		pageActions.uncheckRememberMeCheckbox();
	}

	@When("User clicks Login button")
	public void user_clicks_login_button() {
		pageActions.clickLoginButton();
	}

	@Then("User should be logged in")
	public void user_should_be_logged_in() {
		pageActions.isHomeIconDisplayed();
		pageActions.isAvatarIconDisplayed();
		pageActions.isSearchBarDisplayed();
	}

	@Then("User logs out")
	public void user_clicks_logs_out() {
		pageActions.clickAvatarButton();
		pageActions.clickSignOutButton();
	}

	@Then("User should be logged out")
	public void user_should_be_logged_out() {
		pageActions.isLogOutMsgDisplayed();
	}
}
