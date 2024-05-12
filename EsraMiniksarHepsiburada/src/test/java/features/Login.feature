Feature: User logs in and validates login
  As a user of the application
  I want to log in and validate my login

  Scenario: User logs in and validates login
    Given user goes to login page
    When user logs in
    Then user validates login