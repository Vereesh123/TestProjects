

#Feature: Okta browser lanuch
#
  #@Smoke
  #Scenario: Okta browser login
    #Given User navigate to the application
    #And  User enters the username as "vnagadani@credenti.io"
    #When I complete action
    #And some other action
    #And yet another action
   #Then login page opened successfully
    #And check more outcomes


Feature: Okta Browser lanuch

@Smoke
Scenario: Login should be successful
  Given User navigates to the application
  And User enters the username as "vnagadani@credenti.io"
  #And User enters the password as "zAQ12wsx_960"
  #When User clicks the login button
  Then Login should be successful

  