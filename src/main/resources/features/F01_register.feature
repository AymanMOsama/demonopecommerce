Feature: user must be able to open site and push register
Background: user open browser Site
  Given user open browser

  Scenario: user open browser and push register
    And user register
    And user could register successfully
    Then Close Browser