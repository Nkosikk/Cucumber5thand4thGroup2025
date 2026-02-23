@smoke
Feature: User Creation test

  Scenario: User navigates to Ndosi's Automation Page
    Given I am on the landing page
    Then I click on Login button
    And I click on the sign up button
    And I enter a first Name
    And I enter a Last Name
    Then I enter a valid email address
    And I create a valid password
    Then I confirm the password
    And I select a group from the drop down
    And I Select to create the account


