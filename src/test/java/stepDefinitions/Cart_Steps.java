package stepDefinitions;

import io.cucumber.java.en.And;
import pageObjects.Base_PO;
import pageObjects.Cart_PO;
import pageObjects.Product_PO;

public class Cart_Steps extends Base_PO {

    private Cart_PO cartPo;

    public Cart_Steps(Cart_PO cartPo) {
        this.cartPo = cartPo;
    }

    @And("I click on checkout button")
    public void i_click_on_checkout_button() {
        cartPo.checkout_cart();
    }
    @And("I remove Sauce Lab Backpack from Cart")
    public void remove_backpack_cart(){
        cartPo.remove_Sauce_Lab_Backpack();
    }
    @And("I remove  Sauce Lab bikelight from Cart")
    public void remove_bikelight_cart(){
        cartPo.remove_Sauce_Lab_bikelight();
    }
    @And("I remove fleece jacket from Cart")
    public void remove_fleecejacket_cart(){
        cartPo.remove_fleece_jacket();
    }
    @And("I remove onesie from Cart")
    public void remove_onesie_cart(){
        cartPo.remove_onesie();
    }
    @And("I remove bolt shirt from Cart")
    public void remove_bolt_shirt_cart(){
        cartPo.remove_bolt_shirt();
    }
    @And("I remove shirt red from Cart")
    public void remove_shirt_red_cart(){
        cartPo.remove_shirt_red();
    }
    @And ("I go back to product page")
        public void back_to_productpage(){
        cartPo.continue_shopping();
        }
}
