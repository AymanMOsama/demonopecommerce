@regression
Feature: user must be able to open site and push register

  Scenario: user open browser and push register
    When user register
    Then user could register successfully
