package pageObjects;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
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
        Assert.assertTrue(removeBackpackCartButton.isDisplayed(),"Difficulties encountered while clicking the Backpack ");
    }

    public void  add_Sauce_Lab_fleece_jacket(){
        waitForwebElementAndClick(addFleeceJacketButton);
        Assert.assertTrue(removeFleeceJacketButton.isDisplayed(),"Difficulties encountered while clicking the Fleece Jacket ");
    }

    public void  add_red_t_shirt(){
        waitForwebElementAndClick(AddRedShirtButton);
        Assert.assertTrue(removeRedShirtButton.isDisplayed(),"Difficulties encountered while clicking the  Red Shirt");
    }

    public void  add_onesie(){
        waitForwebElementAndClick(addSauceLabsOnesieButton);
        Assert.assertTrue(removeSauceLabsOnesieButton.isDisplayed(),"Difficulties encountered while clicking the Onesie ");
    }
    public void  add_bolt_shirt(){
        waitForwebElementAndClick(addBoltShirtButton);
        Assert.assertTrue(removeBoltShirtButton.isDisplayed(),"Difficulties encountered while clicking the  Bolt Shirt ");
    }
    public void  add_bike_light(){
        waitForwebElementAndClick(addBikeLightButton);
        Assert.assertTrue(removeBikeLightButton.isDisplayed(),"Difficulties encountered while clicking the Bike Light ");
    }
    public void  fourth_item_error_add_bike_light(){

        //Assert.assertTrue(addBikeLightButton.isDisplayed(),"Difficulties encountered while clicking the Bike Light ");
        //Assert.assertTrue(isElementNotVisible(addBikeLightButton));

    }

    public void navigate_to_cart(){
        waitForwebElementAndClick(shoppingCart);
    }


}
