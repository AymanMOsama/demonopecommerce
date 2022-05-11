Feature: user must be able to open site and push login
  Background: user open browser Site for login
    Given user open browser for login
     And user navigate to login page

  Scenario: user could login with valid credentials
    When user enter "kalabala2005505@hotmail.com" and "MamoCompany@"
    And user click login button
    Then Close Browser after login