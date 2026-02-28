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

    Then I login as an admin user with valid username
    And I enter a valid password
    Then I select to login as an admin user
    And Select the admin profile button
    Then I select the admin Panel button
    And I verify the admin dashboard

    Then select the approvals button inside the admin portal
    And search for email of user created
    And approve the user under actions



    Then I select the users button inside the admin portal
    Then I search for the email address that was generated
    And click to create an admin user


    And select to go back to the website
    Then select admin button
    And Select Logout
    Then confirm that I am sure I want to logout

    Given I am back on the landing page
    Then Select Login button on dashboard
    And I enter email for new admin user
    And I enter the password for the new admin user
    Then Select Login button
    And Select the new admin profile Button
    And select the admin panel option for new admin user
    Then verify the new user admin dashboard






