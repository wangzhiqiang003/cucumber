Feature: calc
  Scenario Outline: add
    Given a=<a>,b=<b>
    When a add b
    Then result is <c>
    Examples:
    |a |b |c |
    | 1|2 |3 |
    | 2|5 |7 |