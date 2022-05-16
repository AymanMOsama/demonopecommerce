@regression
Feature: user can push on followUs


  Scenario: user could open site and push follow us
    When user open facebook page
    Then  facebook is opened or no

  Scenario: user could open site and push follow us twitter
    When user open twitter page
    Then  twitter is opened in new tab

  Scenario: user could open site and push follow rss
    When user open rss page
    Then  rss is opened in new tab

  Scenario: user could open site and push follow youtube
    When user open youtube page
    Then  youtube is opened in new tab