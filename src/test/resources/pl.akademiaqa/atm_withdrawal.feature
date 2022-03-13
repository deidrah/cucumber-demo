Feature: ATM Withdrawal
  I should be able to withdraw money from the ATM

  Background: I have positive balance
    Given I have 100 PLN in my account
    But my account is locked

  Scenario: I have positive balance so I should be able to withdraw money.
    When I request 20 PLN
    Then 20 PLN should be dispensed
    And 80 PLN should stay on my account

  Scenario: I should be able to withdraw all money.
    When I request 100 PLN
    Then 100 PLN should be dispensed

  Rule: Locked account

  Scenario: Multiple withdraws
    When I request 20 PLN
    * I request 20 PLN
    * I request 20 PLN
    * I request 20 PLN
    Then 80 PLN should be dispensed
    And 20 PLN should stay on my account


#  Scenario Template: I should be able to withdraw all money.
#    Given I have <AccountBalance> PLN in my account
#    When I request <RequestAmount> PLN
#    Then <DispensedAmount> PLN should be dispensed
#
#    Scenarios: Positive balance
#    |AccountBalance|RequestAmount|DispensedAmount|
#    |100|20|20|
#    |100|100|100|
#    |0|10|0|

