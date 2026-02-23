Feature: User signup test

  Scenario Outline: Successful sign up with valid information
    Given I am on the sign up page
    When I enter valid first name "<firstName>"
    And I enter valid last name "<lastName>"
    And I enter valid email "<email>"
    And I enter valid register password "<password>"
    And I enter valid confirm password "<confirmPassword>"
    And I select relevant group
    And I click the create account button
    Then I should be presented with a success message

    Examples:
      | firstName | lastName | email             | password   | confirmPassword |
      | Teacher   | Smith    | 1signup@gmail.com | @12345678  | @12345678       |