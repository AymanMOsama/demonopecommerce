@regression
Feature: hover on category
  Background: user open site for hover
    Given user open browser and hover category

  Scenario: user could open site and hover
    And user navigate to home page and hover
    And user hover in page and select sub category
    Then Close Browser after Hover