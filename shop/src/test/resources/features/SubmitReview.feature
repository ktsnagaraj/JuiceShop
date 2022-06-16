@SubmitReview
Feature: Submit the product review comments

  Scenario: Select the prodcut and submit the review comments
    Given launch the Juice shop URL
    And login with valid account details
    When I select the product review 
    And enter the review comments
    Then I submit it successfully