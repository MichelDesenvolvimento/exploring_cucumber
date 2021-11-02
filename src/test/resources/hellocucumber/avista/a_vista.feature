Feature: Is it Friday yet?
  Everybody wants to know when it's Friday

  Background:
    Given as massas
      | id         | example | day    |
      | a_vista#1  | Nope    | Sunday |
      | a_vista#2  | TGIF    | Friday |
      | a_vista#3  | Nope    | Sunday |
      | a_vista#4  | TGIF    | Friday |
      | a_vista#5  | Nope    | Sunday |
      | a_vista#6  | TGIF    | Friday |
      | a_vista#7  | Nope    | Sunday |
      | a_vista#8  | TGIF    | Friday |
      | a_vista#9  | Nope    | Sunday |
      | a_vista#10 | TGIF    | Friday |
      | a_vista#11 | Nope    | Sunday |
      | a_vista#12 | TGIF    | Friday |

  Scenario Outline: Sunday isn't Friday
    Given a seguinte massa: "<id>"
    And today is the day
    When I ask whether it's Friday yet
    Then I should be told that thing
    Examples:
      | id         |
      | a_vista#1  |
      | a_vista#2  |
      | a_vista#3  |
      | a_vista#4  |
      | a_vista#5  |
      | a_vista#6  |
      | a_vista#7  |
      | a_vista#8  |
      | a_vista#9  |
      | a_vista#10 |
      | a_vista#11 |
      | a_vista#12 |