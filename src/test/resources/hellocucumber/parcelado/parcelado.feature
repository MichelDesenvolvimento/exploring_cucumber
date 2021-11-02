Feature: Is it Friday yet?
  Everybody wants to know when it's Friday

  Background:
    Given as massas
      | id          | example | day    |
      | parcelado#1 | Nope    | Sunday |
      | parcelado#2 | TGIF    | Friday |

  Scenario Outline: Sunday isn't Friday
    Given a seguinte massa: "<id>"
    And today is Sunday
    When I ask whether it's Friday yet
    Then I should be told that thing
    Examples:
      | id          |
      | parcelado#1 |

  Scenario Outline: Friday is Friday
    Given a seguinte massa: "<id>"
    And today is Friday
    When I ask whether it's Friday yet
    Then I should be told that thing
    Examples:
      | id          |
      | parcelado#2 |