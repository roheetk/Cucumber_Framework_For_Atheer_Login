@LoginAndLogout
Feature: Authentication

  Scenario: Login and logout functionality validation
    Given User navigates to website "https://evergreen.atheer.qa/signin"
    When User enters username "automationtest"
    And User enters password "Test@111"
    And Uncheck remember me checkbox
    And User clicks Login button
    Then User should be logged in
    When User logs out
    Then User should be logged out
