Feature: Login Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button


  Scenario:  Us_04_TC_01 Click on name Discount
    When Discount Login click on button with button name


  Scenario Outline:  Us_04_TC_02 User should be able to create a new Discount
    When Discount Login click on button with button name
    When When User Create a Discount name as "<DescriptionName>"  name as "<integrationCode>" name as "<Priority>"
    And Succes message should be displayed
    Examples:
      | DescriptionName | integrationCode | Priority |
      | Kinder Kleidung | 202             | 1        |


  Scenario Outline:Us_04_TC_03 User should be able to update an existant Discount+3
    When Discount Login click on button with button name
    Then  User edit the "<DescriptionName>" to "<Damen und KInder>"
    And Succes message should be displayed

    Examples:
      | DescriptionName |
      | Kinder Kleidung  |


  Scenario Outline:  Us_04_TC_04 User should be able to delete an existant Discount
    When Discount Login click on button with button name
    Then  User delet the "<DescriptionName>"
    And Succes message should be displayed

    Examples:
      | DescriptionName |
      | <Damen und KInder> |
