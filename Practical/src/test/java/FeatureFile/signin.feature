
Feature: Teconnect browser lanuch
  

  @Smoke
  Scenario: TecConnect portal login
    Given User navigate to the application
   And User enters the username as "vnagadani@credenti.io"
    
    Then login page opened successfully
    

  