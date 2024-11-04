Feature: Title Check

  @sanity @regression
  Scenario: Successfully check title in amazon home page
    Given users open the amazon home page
    When page title is captured by automation code
    Then it should validate with existing title and both should match
