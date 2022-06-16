@sanity
Feature: Find the only few left juices

  Scenario: Find the only few left juices
    Given launch the OWASP juice shop URL
    When search the juices with only few left
    Then shows the list of juices with only few left