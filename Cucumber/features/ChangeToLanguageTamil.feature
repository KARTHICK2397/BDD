Feature: Change the language to Tamil Successfully

  @sanity @regression
  Scenario: Successfully change language to Tamil in amazon
    Given users open the amazon home page
    When user clicks on language button
    And clicks on tamil language button and click save changes button
    Then the user should be able to see the amazon in tamil langauge
