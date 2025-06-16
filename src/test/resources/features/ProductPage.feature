Feature:  Swag Labs - Products Page

  Background:
    Given  I open the Swag Labs login page

Scenario: Login and input 1 article and go to the cart
 When I enter a correct username "standard_user"
 And I enter a correct password "secret_sauce"
 And  I click on the login button
 And  I should be presented with the product page
 And Add  Sauce Labs Backpack to cart
 Then I go to the cart