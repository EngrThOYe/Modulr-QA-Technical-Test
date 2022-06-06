Feature: Functionality of Modulr accounts management


  Scenario Outline: Opening the Modulr accounts menu tabs pages
    Given I am logged into Modulr accounts with username as "<Username>" and password as "<Password>"
    When Accounts page is displayed
    And I click on Move Money tab
    And Move Money page is displayed
    And I click on Pending payments tab
    And Pending payments page is displayed
    And I click on Beneficiaries tab
    And Beneficiaries page is displayed
    And I click on Reports tab
    And Reports page is displayed
    And I click on Users tab
    And Users page is displayed
    And I click on Notifications tab
    Then Notifications page is displayed

    Examples:
      | Username  | Password     |
      | Olu.Ade59 | Password@123 |
