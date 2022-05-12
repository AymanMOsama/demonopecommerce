@regression
Feature: user can push on followUs
  Background: user open site and click follow us
    Given user open browser and click on follow us

  Scenario: user could open site and push follow us
    And user navigate to the site
    And user hover to follow us
    Then Close Browser after finish