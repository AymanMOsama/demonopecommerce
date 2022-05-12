@regression
Feature: user must be able to open site and push on Currency
Background: user open browser Site for select currency
Given user open browser for select currency


  Scenario: user could select currency
    And user navigate to home page and select currency
    Then Close Browser after select currency