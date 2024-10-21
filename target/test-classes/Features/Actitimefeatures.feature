Feature: Test login functionality

  Scenario: Check login is successful with valid credentials
    Given Browser is open
    And User is on login page
    When user enters username and password
    And user clicks login
    Then user is navigated to the home page
