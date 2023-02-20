@OrderManagement
Feature: Order Management

  @ViewMyOrderHistory
  Scenario Outline: View my Orders
    Given I am on login page
    When I enter "<Email>" "<Password>"
    And I click on sign in
    And I click on My Orders
    Then My Orders page should be displayed

    Examples:
      | Email                | Password       |
      | seunshittu@gmail.com | Playstation@22 |
