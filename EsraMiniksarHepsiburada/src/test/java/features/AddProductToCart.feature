Feature: Product search and Filtering

  Scenario: Verify "Add to Cart" button visibility after price range filtering
    Given user searches products in all categories
    When user filters price range
    Then user validates add to cart button