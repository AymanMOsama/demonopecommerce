@regression
Feature: user must be able to open site and push login

  Scenario: user could login with valid credentials
    When user navigate to login page
    Then user enter "kalabala2005505@hotmail.com" and "MamoCompany@"
    Then user click login button
