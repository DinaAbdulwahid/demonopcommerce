@smoke
Feature: User could switch between currencies [US-Euro]

  Scenario: User switch between US and Euro

    Given Select “Euro” from currency dropdown list
    Then User could find the selected currency