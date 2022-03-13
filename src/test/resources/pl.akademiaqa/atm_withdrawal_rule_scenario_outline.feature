  Scenario Template: I should be able to withdraw all money.
    Given I have <AccountBalance> PLN in my account
    When I request <RequestAmount> PLN
    Then <DispensedAmount> PLN should be dispensed

    Scenarios: Positive balance
    |AccountBalance|RequestAmount|DispensedAmount|
    |100|20|20|
    |100|100|100|
    |0|10|0|