Feature: User login test

  Scenario Outline: Successful login with valid credentials
    Given I am on the login page
    When I enter valid email <email>
    And I enter valid password <password>
    And I click the login button
    Then I should be redirected to the dashboard

    Examples:
      | email                  | password     |
      | 20815802@dut4life.ac.za| Khoti@90 |