Feature: Excel DataDriven Testing

  @sanity @regression
  Scenario: Successful DataDriven Testing
    Given users opens the mercury registration page
    When user fills the required details for registration form
    And the user clicks on submit button
    Then the user should be able to see success message
