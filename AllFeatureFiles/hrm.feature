Feature: Test Orange HRM Application

  Scenario: validate login page functionality
    Given user is on login page
    And user enter username password and click on login button

  Scenario: Validate Home Page Functionality
    When user is on homepage and validate home page title
    And validate home page url
    And user validate home page logo

  Scenario: Validate PIM Page Functionality
    When user click on pim link
    Then validate user is on pim page by using url
    And user click on Add employee
    And user enter fname and lastname and click on save button
    And user capture the employee id number
    And user click on employee list button
