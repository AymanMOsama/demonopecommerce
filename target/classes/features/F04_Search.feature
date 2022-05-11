Feature: user must be able to open site and search
  Background: user open browser Site for search
    Given user open browser and search

  Scenario: user could open site and search
    And user navigate to home page and search
    Then Close Browser after search