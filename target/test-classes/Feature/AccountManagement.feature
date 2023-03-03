@AccountManagement
Feature: Account Management

  @CreateAccount
  Scenario Outline: Create an account using a valid email address
    Given I am on create an account page
    When I enter "<FirstName>" "<Lastname>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click on create an account
    Then My account page should be displayed



    Examples:
      | FirstName | Lastname | Email                | Password       | ConfirmPassword |
      | Seun      | Shittu   | seunshittu@gmail.com | Playstation@22 | Playstation@22  |


  @Login
  Scenario Outline: Registered customer to login with their username and Password
    Given I am on login page
    When I enter "<Email>" "<Password>"
    And I click on sign in
    Then My account page should be displayed

    Examples:
      | Email                | Password       |
      | seunshittu@gmail.com | Playstation@22 |

  @UnregisteredCustomerLogin
  Scenario Outline: Unregistered customer should see an error message on the page while attempting to login into account
    Given I am on login page
    When I enter "<Email>" "<Password>"
    And I click on sign in
    Then Customer does not exist error message should be displayed

    Examples:
      | Email                | Password   |
      | seunjegede@gmail.com | Omolomo@33 |


  @DuplicateAccount
  Scenario Outline: Duplicate Account creation is not allowed
    Given I am on create an account page
    When I enter "<FirstName>" "<Lastname>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click on create an account
    Then An error message should be displayed

    Examples:
      | FirstName | Lastname | Email                | Password       | ConfirmPassword |
      | Seun      | Shittu   | seunshittu@gmail.com | Playstation@22 | Playstation@22  |


  @UpdatePassword
  Scenario Outline: Customer should able to update password
    Given I am on My Account page
    When I click on Change Password
    And I enter "<CurrentPassword>" "<NewPassword>" "<ConfirmNewPassword>"
    And I click on Save
    Then Password should be updated

    Examples:
      | CurrentPassword | NewPassword    | ConfirmNewPassword |
      | Playstation@22  | Playstation@23 | Playstation@23     |

  @DeletedCustomer
  Scenario Outline: Deleted customer cannot login
    Given I am on login page
    When I enter "<Email>" "<Password>"
    And I click on sign in
    Then Account deleted error message should be displayed

    Examples:
      | Email                | Password       |
      | seunshittu@gmail.com | Playstation@22 |


