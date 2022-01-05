

Feature: Navigating to specific accounts in Accounts Activity

  Background: login
    Given the user is on the login page
    And User logins with username "username" and password "password"


  @accountActivity
    Scenario Outline: Check if the dropdown matching

      When the user clicks on "<option>" link on the Account Summary page
      Then the Account Activity page should be displayed
      And Account drop down should have "<option>" selected

      Examples:
        | option      |
        | Savings     |
        | Brokerage   |
        | Checking    |
        | Credit Card |
        | Loan        |
