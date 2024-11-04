Feature: Excel DataDriven Testing

  @sanity @regression
  Scenario Outline: Successful DataDriven Testing
    Given users opens the mercury registration page
    When user fills the required details for registration with excel rows "<row_index>"
    And the user clicks on submit button
    Then the user should be able to see success message

    Examples: 
      | row_index |
      |         1 |
      |         2 |
      |         3 |
