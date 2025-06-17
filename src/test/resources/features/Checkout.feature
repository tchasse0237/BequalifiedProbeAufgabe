Feature:  Swag Labs - Complete checkout process


  Background:
    Given  I open the Swag Labs login page

  Scenario: Login and add  products to cart and verify
    When I enter a correct username "standard_user"
    And I enter a correct password "secret_sauce"
    And  I click on the login button
    And  I should be presented with the product page
    And Add  Red Shirt to cart and verify
    And Add  Bolt Shirt to cart and verify
    And Add  Bike Light to cart and verify
    Then I go to the cart

  Scenario: Login and add all products to cart then remove in checkout
    When I enter a correct username "standard_user"
    And I enter a correct password "secret_sauce"
    And  I click on the login button
    And  I should be presented with the product page
    And Add  Red Shirt to cart and verify
    And Add  Bolt Shirt to cart and verify
    And Add  Bike Light to cart and verify
    Then I go to the cart

