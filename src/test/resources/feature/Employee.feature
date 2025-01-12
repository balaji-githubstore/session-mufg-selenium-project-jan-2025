@employee
Feature: Employee
  In order to manage employee records
  As an admin
  I would like to add, edit, delete employee details

  Scenario Outline: Add Valid Employee
    Given I have browser with OrangeHRM application
    When I enter username as '<username>'
    And I enter password as '<password>'
    And I click on login
    And I click on PIM menu
    And I click on Add Employee Menu
    And I fill the employee details form
      | first_name | middle_name | last_name |
      | <fname>    | <mname>     | <lname>   |
    And I click on save
    Then I should get the added name as '<fname> <lname>'

    Examples: 
      | username | password | fname | mname | lname |
      | Admin    | admin123 | jack  | w     | wick  |
      | Admin    | admin123 | peter | j     | ken   |
