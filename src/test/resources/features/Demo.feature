@prueba
Feature: As a potential client i want to interact with the mobile application

  Scenario Outline: The user tries to log in
    Given The app is loaded correctly
    When Login page is displayed
    And The user logs in the application with: <email>, <password>
    Then Home page is displayed
    Given The user clicks on add button
    And Time Entry page is displayed
    When The user sets hour time <hour> and minute time <minute>
    Then A time entry is displayed

    @Demo
    Examples:
      | email                           | password      | hour | minute |
      | giuliana_castellini@hotmail.com | Supersonic20! | 01   | 20     |

