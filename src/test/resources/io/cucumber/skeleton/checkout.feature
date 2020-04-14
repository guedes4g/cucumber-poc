Feature: Checkout

  Scenario Outline: products Checkout 
    Given the product "<product>" costs <price>
    When I checkout <amount> x "<product>"
    Then the total price for "<product>" must be <total>

    Examples:

      | product | price | amount | total |
      | banana  | 40    | 1      | 40    |
      | banana  | 40    | 2      | 80    |
      | apple   | 20    | 1      | 20    |
      | apple   | 20    | 3      | 60    |
