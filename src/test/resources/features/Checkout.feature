Feature:  Swag Labs - Complete checkout process


  Background:
    Given  I open the Swag Labs login page

  Scenario: Login and add  products to cart and verify order completed
    When I enter a correct username "standard_user"
    And I enter a correct password "secret_sauce"
    And  I click on the login button
    And  I should be presented with the product page
    And Add  Red Shirt to cart and verify
    And Add  Bolt Shirt to cart and verify
    And Add  Bike Light to cart and verify
    And I go to the cart
    And I click on checkout button
    And I input the firstname,lastname and Zip code
    And I click on checkout
    And I click on finish
    And I should be presented with order confirmation page
    Then  Close and cleanup browser

  Scenario: Login and add  products to cart, then navigate to cart remove some continue with the checkout
    When I enter a correct username "standard_user"
    And I enter a correct password "secret_sauce"
    And  I click on the login button
    And  I should be presented with the product page
    And Add  Red Shirt to cart and verify
    And Add  Bolt Shirt to cart and verify
    And Add  Bike Light to cart and verify
    And Add  Sauce Fleece Jacket to cart and verify
    And Add  Onesie to cart and verify
    And I go to the cart
    And I remove onesie from Cart
    And I remove shirt red from Cart
    And I click on checkout button
    And I input the firstname,lastname and Zip code
    And I click on checkout
    And I click on finish
    Then I should be presented with order confirmation page

  Scenario: Login and add  products to cart ,remove some items, go back to product site and add again and item and complete order
    When I enter a correct username "standard_user"
    And I enter a correct password "secret_sauce"
    And  I click on the login button
    And  I should be presented with the product page
    And Add  Red Shirt to cart and verify
    And Add  Bolt Shirt to cart and verify
    And Add  Bike Light to cart and verify
    And Add  Sauce Labs Backpack to cart and verify Cart
    And I go to the cart
    And I remove  Sauce Lab bikelight from Cart
    And I remove shirt red from Cart
    And I go back to product page
    And Add  Bike Light to cart and verify
    And I go to the cart
    And I click on checkout button
    And I input the firstname,lastname and Zip code
    And I click on checkout
    And I click on finish
    Then I should be presented with order confirmation page


