package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Cart_PO extends Base_PO {
    public Cart_PO() {
        super();
    }

    private @FindBy(id = "remove-sauce-labs-bike-light")
    WebElement removeBikeLight;
    private @FindBy(id = "remove-sauce-labs-fleece-jacket")
    WebElement removeFleeceJacket;
    private @FindBy(id = "remove-sauce-labs-backpack")
    WebElement removeLabsBackpack;
    private @FindBy(id = "remove-sauce-labs-bolt-t-shirt")
    WebElement removeBoltShirt;
    private @FindBy(id = "remove-sauce-labs-onesie")
    WebElement removeLabsOnesie;
    private @FindBy(id = "remove-test.allthethings()-t-shirt-(red)")
    WebElement removeShirtRed;
    private @FindBy(id = "continue-shopping")
    WebElement continueShoppingButtonCart;
    private @FindBy(id = "checkout")
    WebElement checkoutButtonCart;

    public void remove_Sauce_Lab_Backpack() {
        waitForwebElementAndClick(removeLabsBackpack);
        Assert.assertTrue(isElementNotVisible(removeLabsBackpack), "removeLabsBackpack is  clickable");
    }

    public void remove_Sauce_Lab_bikelight() {
        waitForwebElementAndClick(removeBikeLight);
        Assert.assertTrue(isElementNotVisible(removeBikeLight), "removeBikeLight is  clickable");
    }

    public void remove_fleece_jacket() {
        waitForwebElementAndClick(removeFleeceJacket);
        Assert.assertTrue(isElementNotVisible(removeFleeceJacket), "removeFleeceJacket is  clickable");
    }

    public void remove_onesie() {
        waitForwebElementAndClick(removeLabsOnesie);
        Assert.assertTrue(isElementNotVisible(removeLabsOnesie), "removeLabsOnesie is  clickable");
    }

    public void remove_bolt_shirt() {
        waitForwebElementAndClick(removeBoltShirt);
        Assert.assertTrue(isElementNotVisible(removeBoltShirt), "removeBoltShirt is  clickable");
    }

    public void remove_shirt_red() {
        waitForwebElementAndClick(removeShirtRed);
        Assert.assertTrue(isElementNotVisible(removeShirtRed), "removeShirtRed is  clickable");
    }

    public void continue_shopping() {
        waitForwebElementAndClick(continueShoppingButtonCart);
    }

    public void checkout_cart() {
        waitForwebElementAndClick(checkoutButtonCart);
    }
}
