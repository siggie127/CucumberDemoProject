Feature: Login Functionality
  In order to purchase products
  As an existing customer
  I want to log in successfully

  Background:
    Given I am in the login page of the open cart application

    Scenario:Successful login with valid credentials
    Given I have entered valid credentials
    When I click login
    Then I should be logged in successfully

    Scenario Outline: Unsuccessful login with invalid or empty credentials
    Given I have entered invalid "<username>" and "<password>"
    When I click login
    Then I should get an error message indicating "<error_message>"
    Examples:
      | username            | password         | error_message                                         |
      | invalid_username    | invalid_password | Warning: No match for E-Mail Address and/or Password. |
      | testuser1@yahoo.com | invalid_password | Warning: No match for E-Mail Address and/or Password. |
      | testuser1@yahoo     | 1qaz@WSX@        | Warning: No match for E-Mail Address and/or Password. |

    #Scenario: Navigate to the forgotten password page
     # When I click on forgotten password link
      #Then I should get directed to the password reset page