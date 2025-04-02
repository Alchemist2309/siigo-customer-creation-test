Feature: Login to Siigo
  As a user, I want to log in to the Siigo application

  Scenario: Successful login
    Given the user is on the login page
    When the user enters valid credentials
    Then the user should see the welcome message "Inicio"
