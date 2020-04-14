# Created by ricardovhz at 17/01/19
Feature: Add

  Scenario Outline: Add two numbers
    Given the numbers <n1> and <n2>
    When I make a the math operation "<operation>"
    Then the result should be <result>

    Examples:

      | n1 | n2 | operation | result |
      | 1  | 2  | sum       | 3     |
      | 1  | 3  | sum       | 4     |
