@regression
Feature: Add product to shopping cart
  Background: user open site and add product to shopping cart
    Given user open browser and add shopping

  Scenario: user could open site add product to shopping cart
    And user navigate to product pages
    And user push on add to shopping cart
    Then Close Browser after shopping