@smoke
Feature: User could register with valid information

  Scenario: User register with valid information
    Given Click on Register tab
    When Click on any radio button to choose gender
    And User enter First Name and Last Name
    And User select date of birth : select[day, month, year]
    And User enter email "mohamed@example.com" field
    And User fill company name
    And User fill Password "P@ssw0rd" and confirm password with "P@ssw0rd"
    And Click on REGISTER button

    Then User could register successfully

