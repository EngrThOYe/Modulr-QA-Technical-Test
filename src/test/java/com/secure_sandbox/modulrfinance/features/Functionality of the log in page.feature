Feature: Functionality of the log in page

  Scenario Outline: Logging in with valid Username and valid Password
    Given I navigate to modulrfinance log in page
    When I click username textbox
    And I enter username as "<Username>"
    And I click password textbox
    And I enter password as "<Password>"
    And I click on Sign in button
    Then I am logged into my account details page

    Examples:
      | Username  | Password     |
      | Olu.Ade59 | Password@123 |


  Scenario Outline: Logging in with invalid Username or/and Password
    Given I navigate to modulrfinance log in page
    When I click username textbox
    And I enter username as "<Username>"
    And I click password textbox
    And I enter password as "<Password>"
    And I click on Sign in button
    Then A pop up error and warning message "The username or password is incorrect" is displayed

    Examples:
      | Username  | Password     |
      | Olu.Ade59 | Invalid      |
      | Invalid   | Password@123 |
      | Invalid   | Invalid      |


  Scenario Outline: Logging in with null Username or/and Password
    Given I navigate to modulrfinance log in page
    When I click username textbox
    And I enter username as "<Username>"
    And I click password textbox
    And I enter password as "<Password>"
    And I click on Sign in button
    Then A pop up error message "This field is required" is displayed

    Examples:
      | Username  | Password     |
      | Olu.Ade59 |              |
      |           | Password@123 |
      |           |              |


  Scenario Outline: Reseting password
    Given I navigate to modulrfinance log in page
    When I click Forgotten Password button
    And Resetaccess page is displayed
    And I click username (recovery) textbox
    And I enter valid username (recovery) as "<Username>"
    And I click on Request a reset button
    Then A pop up message "Email sent" is displayed

    Examples:
      | Username  |
      | Olu.Ade |