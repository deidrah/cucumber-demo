Feature: ATM withdrawal rule multiple withdraws

  I should be able to withdraw multiple amount of money from the ATM

  Rule: Locked account

  Scenario: Multiple withdraws
    Given I have 100 PLN in my account
    When I request 20 PLN
    * I request 20 PLN
    * I request 20 PLN
    * I request 20 PLN
    Then 80 PLN should be dispensed
    And 20 PLN should stay on my account