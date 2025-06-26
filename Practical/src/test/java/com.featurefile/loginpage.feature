
Feature: TestAutomation login page

  @Smoke
  Scenario: login to the TestAutomation practice page
    Given User navigate to the aplication
    And user enter the username as "student"
    And user enters the password as "Password123"
    And user clicks the login button
    
    Then Login should be successfull
    
 