package pageObjects;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.Global_Vars;

public class Product_PO extends  Base_PO{

    public  Product_PO(){
        super();
    }
    private @FindBy(xpath = "//*[@id='header_container']")
    WebElement productTab;
    private  @FindBy(id = "shopping_cart_container")
    WebElement shoppingCart;
    private @FindBy(id= "add-to-cart-sauce-labs-backpack")
    WebElement addBackpackCartButton;
    private @FindBy(id= "remove-sauce-labs-backpack")
    WebElement removeBackpackCartButton;
    private  @FindBy(id= "add-to-cart-sauce-labs-bike-light")
    WebElement addBikeLightButton;
    private  @FindBy(id= "remove-sauce-labs-bike-light")
    WebElement removeBikeLightButton;
    private  @FindBy(id= "add-to-cart-sauce-labs-bolt-t-shirt")
    WebElement addBoltShirtButton;
    private  @FindBy(id= "remove-sauce-labs-bolt-t-shirt")
    WebElement removeBoltShirtButton;
    private  @FindBy(id= "add-to-cart-sauce-labs-fleece-jacket")
    WebElement addFleeceJacketButton;
    private  @FindBy(id= "remove-sauce-labs-fleece-jacket")
    WebElement removeFleeceJacketButton;
    private  @FindBy(id= "add-to-cart-sauce-labs-onesie")
    WebElement addSauceLabsOnesieButton;
    private  @FindBy(id= "remove-sauce-labs-onesie")
    WebElement removeSauceLabsOnesieButton;
    private  @FindBy(id= "add-to-cart-test.allthethings()-t-shirt-(red)")
    WebElement AddRedShirtButton;
    private  @FindBy(id= "remove-test.allthethings()-t-shirt-(red)")
    WebElement removeRedShirtButton;

    public void  add_Sauce_Lab_Backpack(){
        waitForwebElementAndClick(addBackpackCartButton);
        Assert.assertTrue(removeBackpackCartButton.isDisplayed(),"Backpack sucessfuly added to cart");
    }

    public void navigate_to_cart(){
        waitForwebElementAndClick(shoppingCart);
    }


}
