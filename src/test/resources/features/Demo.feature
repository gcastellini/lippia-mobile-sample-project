Feature: As a potential client i want to interact with the mobile application

  Background:
    Given The app is loaded correctly

  Scenario Outline: The user tries to log in
    When Login page is displayed
    And The user logs in the application with: <email>, <password>
    Then Home page is displayed
    Examples:
      | email                           | password |
      | giuliana_castellini@hotmail.com | hola1234 |

  @prueba
  Scenario Outline: The user adds time entry
    When Login page is displayed
    And The user logs in the application with: <email>, <password>
    Then Home page is displayed
    Given The user clicks on add button
    And Time Entry page is displayed
    When The user clicks on Start End Layout
    And The user sets start hour time <hour>, <minute>
    And The user sets end hour time <12>, <20>
    Then A time entry is displayed
    @Demo
    Examples:
      | email                           | password | hour | minute |
      | giuliana_castellini@hotmail.com | hola1234 | 10   | 20     |

