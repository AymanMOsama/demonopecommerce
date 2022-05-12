@regression
Feature: user can push to slider
  Background: user open site and click on slider
    Given user open browser and click to slider

  Scenario: user could open site and push slider
    And user navigate to land page
    And user push slider
    Then Close Browser after push slider