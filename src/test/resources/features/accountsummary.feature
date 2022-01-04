Feature: Account Summary Tab Functionality

  Background: Login Steps
    Given the user is on the login page
    And User logins with username "username" and password "password"

@wip
    Scenario: Checking account summary page features
      And  the "Account summary" page should be displayed
      Then Account summary page should have to following account types:
        | Cash Accounts       |
        | Investment Accounts |
        | Credit Accounts     |
        | Loan Accounts       |

      And Credit Accounts table must have columns
        | Account     |
        | Credit card |
        | Balance     |