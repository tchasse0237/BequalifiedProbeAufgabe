package stepDefinitions;

import io.cucumber.java.en.And;
import pageObjects.Base_PO;
import pageObjects.Cart_PO;
import pageObjects.Checkout_PO;

public class Checkout_Steps extends Base_PO {
    private Checkout_PO checkoutPo;

    public Checkout_Steps(Checkout_PO checkoutPo) {
        this.checkoutPo = checkoutPo;
    }

    @And("I input the firstname,lastname and Zip code")
    public void i_input_firstname_lastname_zipcode() {
        checkoutPo.add_firstname(generateRandomPUsernameassword(5, 'a', 'f'));
        checkoutPo.add_lastname(generateRandomPUsernameassword(10, 'f', 'i'));
        checkoutPo.add_postal_code(generateRandomPUsernameassword(5, '1', '9'));
    }

    @And("I click on checkout")
    public void i_click_on_checkout() {
        checkoutPo.continue_buying();
    }

    @And("I click on finish")
    public void i_click_on_finish() {
        checkoutPo.finish();
    }

    @And("I should be presented with order confirmation page")
    public void check_order_confirmation() {
        checkoutPo.verify_order_complete();
    }
}
