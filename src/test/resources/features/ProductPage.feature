Feature:  Swag Labs - Products Page


  Background:
    Given  I open the Swag Labs login page

  @Standarduser
  Scenario: Login and input 1 article to the cart
    When I enter a correct username "standard_user"
    And I enter a correct password "secret_sauce"
    And  I click on the login button
    And  I should be presented with the product page
    Then Add  Sauce Fleece Jacket to cart and verify

  Scenario: Login and input 1 article and go to the cart
    When I enter a correct username "standard_user"
    And I enter a correct password "secret_sauce"
    And  I click on the login button
    And  I should be presented with the product page
    And Add  Sauce Labs Backpack to cart and verify Cart
    Then I go to the cart

  Scenario: Login and add all products to cart and verify
    When I enter a correct username "standard_user"
    And I enter a correct password "secret_sauce"
    And  I click on the login button
    And  I should be presented with the product page
    And Add  Red Shirt to cart and verify
    And Add  Sauce Labs Backpack to cart and verify Cart
    And Add  Sauce Fleece Jacket to cart and verify
    And Add  Onesie to cart and verify
    And Add  Bolt Shirt to cart and verify
    And Add  Bike Light to cart and verify
    Then I go to the cart

  @erroruser
  Scenario: Checking that locked_out_user user always have locked out status
    When I enter a correct username "error_user"
    And I enter a correct password "secret_sauce"
    And I click on the login button
    And Add  Onesie to cart and verify
    And Add  Bike Light to cart and verify
    And Add  Sauce Labs Backpack to cart and verify Cart
    Then I can't click on a 4th item anymore