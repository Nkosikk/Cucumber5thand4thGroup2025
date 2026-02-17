@smoke
Feature: User login test

  Scenario Outline: User navigates to learning materials
    Given I am on the login page
    When I enter valid username <username>
    And I enter valid password <password>
    And I click the login button
    Then I should be redirected to the dashboard
    When I click on the Learn tab
    And I click on learning materials tab
    And Click on the web automation basic button
    Then Insert full name
    And Insert email address
    And Insert age
    And Select gender
    And Select country
    And Select experience level
    And Select skills
    Then Add a comment
    Then Select the terms and conditions button
    And Select the submit form button


    Examples:
      | username           | password    |
      | kmblouws@gmail.com | D3vt3sting# |






