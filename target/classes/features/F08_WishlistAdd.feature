@regression
Feature: Add product to wish list
  Background: user open site and add product to wishlist
    Given user open browser and add wishlist

  Scenario: user could open site add product to wish list
    And user navigate to product page
    And user push on add to wishlist
    Then Close Browser after wish