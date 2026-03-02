Feature: filling out basic form test

  Scenario Outline: Filling out a basic form with valid data
    Given I am on the form page
    When I enter a valid fullname <fullName>
    And I enter a valid email <email>
    And I enter a valid age <age>
    And I enter a valid gender <gender>
    And I enter a valid country <country>
    And I enter valid experience level <experienceLevel>
    And I select valid skills checkboxes
    And I enter valid comments
    And I select the terms and conditions checkbox
    And I click the submit button
    Then I should see a success message

    Examples:
      | fullName      | email               | age | gender| country | experienceLevel        |
      | Spencer Soundy|spencertest@gmail.com| 30  | Male  | Kenya   | Intermediate(2-5 year) |