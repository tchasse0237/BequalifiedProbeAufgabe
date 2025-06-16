package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cart_PO extends Base_PO{
    private  @FindBy(id= "remove-sauce-labs-bike-light")
    WebElement removeBikeLight;
    private  @FindBy(id= "remove-sauce-labs-fleece-jacket")
    WebElement removeFleeceJacket;
    private  @FindBy(id= "remove-sauce-labs-backpack")
    WebElement removeLabsBackpack;
    private  @FindBy(id= "remove-sauce-labs-bolt-t-shirt")
    WebElement removeBoltShirt;
    private  @FindBy(id= "remove-sauce-labs-onesie")
    WebElement removeLabsOnesie;
    private  @FindBy(id= "remove-test.allthethings()-t-shirt-(red)")
    WebElement removeShirtRed;
    private  @FindBy(id= "continue-shopping")
    WebElement continueShoppingButtonCart;
    private  @FindBy(id= "checkout")
    WebElement checkoutButtonCart;
}
