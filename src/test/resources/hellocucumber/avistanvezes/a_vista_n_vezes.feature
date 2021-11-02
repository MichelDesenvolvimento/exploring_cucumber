Feature: Is it Friday yet?
  Everybody wants to know when it's Friday

  Scenario Outline: Sunday isn't Friday
    Given a seguinte massa: "<massa>"
    And today is the day
    When I ask whether it's Friday yet
    Then I should be told that thing
    Examples:
      | massa                         |
      | id=1;example=Nope;day=Sunday  |
      | id=2;example=TGIF;day=Friday  |
      | id=3;example=Nope;day=Sunday  |
      | iid=2;example=TGIF;day=Friday |
      | id=5;example=Nope;day=Sunday  |
      | id=2;example=TGIF;day=Friday  |
      | id=7;example=Nope;day=Sunday  |
      | id=2;example=TGIF;day=Friday  |
      | id=9;example=Nope;day=Sunday  |
      | id=2;example=TGIF;day=Friday  |
      | id=11;example=Nope;day=Sunday |
      | id=2;example=TGIF;day=Friday  |