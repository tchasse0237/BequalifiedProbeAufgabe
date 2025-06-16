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

    @And("Add  Sauce Labs Backpack to cart")
    public void i_add_a_sauce_labs_backpack_to_cart() {
        productPo.add_Sauce_Lab_Backpack();
    }
    @Then("I go to the cart")
    public void i_navigate_to_cart(){
        productPo.navigate_to_cart();
    }

}
