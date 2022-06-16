@sanity
Feature: Checkout the selected fruit juice

  Scenario: Login and select the fruit juice to check out
   	Given launch the juice shop OWASP URL
    And login into the account
    When the juice is selected to add into the basket
    And checkout the selected juice to the address
    Then delivery speed displayed to choose before Payments option
    