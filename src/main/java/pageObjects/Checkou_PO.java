package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkou_PO {

    private  @FindBy(id= "first-name")
    WebElement firstnameCheckout;
    private  @FindBy(id= "last-name")
    WebElement lastnameCheckout;
    private  @FindBy(id= "postal-code")
    WebElement postalCodeCheckout;
    private  @FindBy(id= "continue")
    WebElement continueButtonCheckout;
    private  @FindBy(id= "cancel")
    WebElement cancelButtonCheckout;
}
