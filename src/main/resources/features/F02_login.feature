@smoke
Feature: users could use login functionality to use their accounts

  Scenario: user could Login with valid credentials
    Given user go to login page
    When user login with "mohamed@example.com" and "P@ssw0rd"
    And user press on login button
    Then user should login successfully