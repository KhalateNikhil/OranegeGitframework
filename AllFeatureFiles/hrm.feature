Feature: Test Orange HRM Application

  Scenario: validate login page functionality
    Given user is on login page
    And user enter username password and click on login button

  Scenario: Validate Home Page Functionality
    When user is on homepage and validate home page title
    And validate home page url
    And user validate home page logo
