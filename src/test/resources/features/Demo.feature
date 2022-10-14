Feature: As a potential client i want to interact with the mobile application

  Background:
    Given The app is loaded correctly

  Scenario Outline: The user starts the application, registers a new user, changes the language, log out of the app and log in to the app.
    When The user goes to the Sign Up page
    And The user registers a new user with: <username>, <email>, <password>
    Then Home page is displayed
    Examples:
      | username   | email                | password |
      | automation | automation@gmail.com | 123456   |

    Scenario:
    When The user changes the language
    And The user log out of the app
    Then Login page is displayed

  @prueba
  Scenario Outline: The user tries to log in
    Given The app is loaded correctly
    When Login page is displayed
    And The user logs in the application with: <email>, <password>
    Then Home page is displayed
@Demo
    Examples:
      | email                | password |
      | automation@gmail.com | 123456   |

