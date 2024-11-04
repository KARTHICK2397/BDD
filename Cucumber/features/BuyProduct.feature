Feature: Book functionality

  @sanity @regression
  Scenario: Successful adding a product to cart and book in amazon
    Given users open the amazon home page
    When user enters the search product "wild stone edge perfume"
    And the user clicks on search button
    And the user clicks on add to cart button
    And the user should be able to see the product in cart
    And the user clicks on product
    And in the new tab will open user need to click buy now
    And the user should be able to see the booking page
    And enter the mobile number "+918525839831" and click continue button
    And user enters the following addersss and book the product
      | name          | karthick            |
      | mobile        | 8525839831          |
      | pincode       | 639002              |
      | street number | 100/4 nandha        |
      | area          | Thangavel Nagar     |
      | landmark      | backside kongu mess |
      | city          | karur               |
