Feature: Dropdown functionality

  @sanity @regression
  Scenario: Successful select dropdown in amazon
    Given users open the amazon home page
    When user select the drop down from search box
    Then the user should be able to see the list of product
