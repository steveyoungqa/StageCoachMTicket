@amaze
Feature: Automation of Purchasing Tickets in Amaze

  Scenario Outline:
    Given I am on the Amaze Environment of "<Environment>"
    And I login to Amaze with credentials "<name>" and "<password>"
    Then I sign in to My Account with credentials "<email>" and "<password2>"
    And I choose an Outgoing Station of "<Outgoing>"
    And I choose an Inbound Station of "<Inbound>"
    Then I select Find Trains button

    Examples:
      | Environment | name    | password        | email                | password2  | Outgoing | Inbound |
#      | UAT         | dogfish | 5oEeQ2oS6y635PC | stevey+test@dogfi.sh | Password10 |          |         |
      | RSPA        | staff   | preview         | klaudia@dogfi.sh     | Password2  | STP      | LCN     |