@regression
Feature: user can push to slider


  Scenario: First Slider user could open site and push slider
    When user push slider
  Then relative product is displayed

  Scenario: Second Slider user could open site and push slider
    When user push second slider
    Then relative product second slider is displayed
