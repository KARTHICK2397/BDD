Feature: Cart functionality

  @sanity @regression
  Scenario: Successful adding a product to cart in amazon
    Given users open the amazon home page
    When user enters the search product "wild stone edge perfume"
    And the user clicks on search button
    And the user clicks on add to cart button
    Then the user should be able to see the product in cart
