package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutOverview_PO extends  Base_PO{
    private  @FindBy(id= "finish")
    WebElement finishButtonCheckout;
    private  @FindBy(id= "cancel")
    WebElement cancelButtonCheckout;
    private  @FindBy(id= "//*[@id='checkout_summary_container']")
    WebElement checkoutSummary;
    private  @FindBy(id= "//*[@id='checkout_complete_container']")
    WebElement checkoutCompletion;
    private  @FindBy(id= "back-to-products")
    WebElement backToProducts;

}
