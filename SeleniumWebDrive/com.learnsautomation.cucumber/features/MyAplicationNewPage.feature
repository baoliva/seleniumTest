Feature: Test Facebook smoke scenario

  Scenario: Test login with valid credentials
    Given Open Firefox and start application
    When I enter valid "blanky.oliva89@gmail.com" and valid "password"
    Then user should be able to login successfull
    Then application should be closed

   
