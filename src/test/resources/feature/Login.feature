Feature: Login
  In order to access the employee dashboard
  As an admin
  I want to login into the system

  Background: 
    Given I have browser with OrangeHRM application

  Scenario: Valid Login
    When I enter username as 'Admin'
    And I enter password as 'admin123'
    And I click on login
    Then I should get access to the dashboard with text as 'Quick Launch'

  Scenario Outline: Invalid Login
    When I enter username as '<username>'
    And I enter password as '<password>'
    And I click on login
    Then I should get the error message as '<expected_error>'

    Examples: 
      | username | password  | expected_error      |
      | john     | john123   | Invalid credentials |
      | peter    | peter 123 | Invalid credentials |
