Feature: Testing All Items Page Functionality

  @Tag1
  Scenario Outline: Positive Testing of adding all items
    Given Login to Sauce Demo page using '<username>' and '<password>'
    When Add all items to cart
    And Provide all details and Checkout i.e. '<Firstname>', '<Lastname>' and '<PostalCode>'
    Then Take the order details

    Examples: 
      | username      | password     | Firstname | Lastname   | PostalCode |
      | standard_user | secret_sauce | Subhasish | Pattanayak |     560075 |

  @Tag2
  Scenario: Testing each item functionality
    Given Login to Sauce Demo page using username and password
      | standard_user | secret_sauce |
    When Visit to each item page and check the functionality
      | Sauce Labs Backpack               |
      | Sauce Labs Bike Light             |
      | Sauce Labs Bolt T-Shirt           |
      | Sauce Labs Fleece Jacket          |
      | Sauce Labs Onesie                 |
      | Test.allTheThings() T-Shirt (Red) |
    Then Log Out from the page
