package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkout_PO extends Base_PO {

    public Checkout_PO() {
        super();
    }

    private @FindBy(id = "first-name")
    WebElement firstnameCheckout;
    private @FindBy(id = "last-name")
    WebElement lastnameCheckout;
    private @FindBy(id = "postal-code")
    WebElement postalCodeCheckout;
    private @FindBy(id = "continue")
    WebElement continueButtonCheckout;
    private @FindBy(id = "cancel")
    WebElement cancelButtonCheckout;
    private @FindBy(id = "finish")
    WebElement finishButtonCheckout;
    private @FindBy(id = "checkout_complete_container")
    WebElement completeConfirmation;

    public void add_firstname(String firstname) {
        waitForwebElementAndClick(firstnameCheckout);
        sendKeys(firstnameCheckout, firstname);
    }

    public void add_lastname(String lastname) {
        waitForwebElementAndClick(lastnameCheckout);
        sendKeys(lastnameCheckout, lastname);
    }

    public void add_postal_code(String postalcode) {
        waitForwebElementAndClick(postalCodeCheckout);
        sendKeys(postalCodeCheckout, postalcode);
    }

    public void continue_buying() {
        waitForwebElementAndClick(continueButtonCheckout);
    }

    public void cancel_buying() {
        waitForwebElementAndClick(cancelButtonCheckout);
    }

    public void finish() {
        waitForwebElementAndClick(finishButtonCheckout);
    }

    public void verify_order_complete() {
        waitForwebElementAndClick(completeConfirmation);
    }
}
