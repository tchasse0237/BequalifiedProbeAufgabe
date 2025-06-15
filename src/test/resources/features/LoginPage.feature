@login @regression
  Feature:  Swag Labs - Login Page

    Background:
      Given  I open the Swag Labs login page

      Scenario Outline: Validate successful login
        When I enter a correct username "<username>"
        And  I enter a correct password "<password>"
        And  I click on the login button
        Then  I should be presented with the product page

        Examples:
          | username                | password     |
          | standard_user           | secret_sauce |
          | problem_user            | secret_sauce |
          | performance_glitch_user | secret_sauce |
          | error_user              | secret_sauce |
          | visual_user             | secret_sauce |

      Scenario: Checking that locked_out_user user always have locked out status
        When I enter a correct username "locked_out_user"
        And I enter a correct password "secret_sauce"
        And I click on the login button
        Then I should get Error message "Epic sadface: Sorry, this user has been locked out."

      Scenario:  Enter empty username and password
        When I enter a correct username ""
        And I enter a correct password ""
        And  I click on the login button
        Then  I should get Error message "Epic sadface: Username is required"

      Scenario: Enter no username and valid password
        When I enter a correct username ""
        And I enter a correct password "secret_sauce"
        And  I click on the login button
        Then  I should get Error message "Epic sadface: Username is required"

      Scenario: Enter valid username and no password
        When  I enter a correct username "standard_user"
        And  I enter a correct password ""
        And I click on the login button
        Then I should get Error message "Epic sadface: Password is required"

      Scenario:  Enter a random username and random password
        When I enter a random username
        And I enter a random password
        And I click on the login button
        Then I should get Error message "Epic sadface: Username and password do not match any user in this service"