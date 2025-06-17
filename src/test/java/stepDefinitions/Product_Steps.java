package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.Base_PO;
import pageObjects.Login_PO;
import pageObjects.Product_PO;

public class Product_Steps extends Base_PO {
    private Product_PO productPo;
    public Product_Steps(Product_PO productPo){
        this.productPo=productPo;
    }

    @And("Add  Sauce Labs Backpack to cart and verify Cart")
    public void i_add_a_sauce_labs_backpack_to_cart() {
        productPo.add_Sauce_Lab_Backpack();
    }
    @And("Add  Sauce Fleece Jacket to cart and verify")
    public void i_add_Sauce_Lab_fleece_jacket_to_cart() {
        productPo.add_Sauce_Lab_fleece_jacket();
    }
    @And("Add  Red Shirt to cart and verify")
    public void i_add_red_t_shirt_to_cart() {
        productPo.add_red_t_shirt();
    }
    @And("Add  Onesie to cart and verify")
    public void i_add_onesie() {
        productPo.add_onesie();
    }
    @And("Add  Bolt Shirt to cart and verify")
    public void i_bolt_shirt() {
        productPo.add_bolt_shirt();
    }
    @And("Add  Bike Light to cart and verify")
    public void i_add_bike_light() {
        productPo.add_bike_light();
    }
    @Then("I go to the cart")
    public void i_navigate_to_cart(){
        productPo.navigate_to_cart();
    }
    @Then("I can't click on a 4th item anymore")
    public void cant_add_bike_light() {
        productPo.fourth_item_error_add_bike_light();
    }


}
