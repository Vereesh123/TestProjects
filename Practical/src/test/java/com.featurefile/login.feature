
Feature: Test Automation page Launch
  

  @Smoke
  Scenario: Login to the test Automation page
    Given User navigate to the aplication
    And user enter the username as "student"
    And user enters the password as "Password123"
    When user clicks the login button
    Then Login should be successfull
    
 
