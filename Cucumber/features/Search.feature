Feature: Search functionality

  @sanity @regression
  Scenario: Successful Search in amazon
    Given users open the amazon home page
    When user enters the search product "wild stone edge perfume"
    And the user clicks on search button
    Then the user should be able to see the product list
