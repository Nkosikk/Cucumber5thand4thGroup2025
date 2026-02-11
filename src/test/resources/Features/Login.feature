Feature: User login test

  Scenario Outline: Successful login with valid credentials
    Given I am on the login page
    When I enter valid username <username>
    And I enter valid password <password>
    And I click the login button
    Then I should be redirected to the dashboard

    Examples:
      | username      | password     |
      | standard_user | secret_sauce |

  Scenario Outline: Unsuccessful login with invalid credentials
    Given I am on the login page
    When I enter valid username <username>
    And I enter valid password <password>
    And I click the login button
    Then I should be getting error message <error_message>

    Examples:
      | username      | password    | error_message                          |
      | standard_user | secret_sauc | Invalid credentials. Please try again. |