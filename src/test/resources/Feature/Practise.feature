Feature: Account Management

  Scenario Outline: Create an account using a valid email
    Given I am on Create an account page
    When I enter "<FirstName>" "<LastName>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click on Create an account
    Then My account page should be displayed


    Examples:
      | FirstName | LastName | Email                | Password       | ConfirmPassword |
      | Seun      | Shittu   | seunshittu@gmail.com | Playstation@22 | Playstation@22  |


  Scenario Outline: Registered customer to login with their username and Password
    Given I am on Login page
    When I enter "<Username>" and "<Password>"
    And I click on Login
    Then My account page should be displayed


    Examples:
      | Username             | Password       |
      | Seunshittu@gmail.com | Playstation@22 |


  Scenario Outline: Unregistered customer should see an error message on the page while attempting to login into account
    Given I am on Login page
    When I enter "<Username>" and "<Password>"
    And I click on Login
    Then An error message should be displayed


    Examples:
      | Username           | Password    |
      | jokotade@gmail.com |Tankeke12@22 |