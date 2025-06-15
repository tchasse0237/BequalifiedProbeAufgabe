package pageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.Global_Vars;

public class Login_PO extends Base_PO{
    private  @FindBy( id = "user-name")
    WebElement username_InputField;
    private  @FindBy(id = "password")
    WebElement password_InputField;
    private  @FindBy(id = "login-button")
    WebElement loginButton;
    private @FindBy(className = "inventory_container")
    WebElement inventoryLogin;
    private @FindBy(xpath = "//h3[@data-test='error']")
    WebElement errorContainer;

    public  Login_PO(){
        super();
    }

    public void  navigateTo_SwagLabs_LoginPage(){
        navigateTo_URL(Global_Vars.WEBDRIVER_SAUCEDEMO_URL);
    }

    public void inputUsername(String username){
        waitFor(username_InputField);
        sendKeys(username_InputField,username);
    }

    public void inputPassword(String password){
        waitFor(password_InputField);
        sendKeys(password_InputField,password);
    }

    public void click_LoginButton(){
        waitForwebElementAndClick(loginButton);
    }

    public  void validate_Successfullogin(){
        if (inventoryLogin.isDisplayed()){
            System.out.println("Login was successful");

        }
        else if (errorContainer.isDisplayed()){
            System.out.println("Verify if Username or Password are entered ?? and correct");
        }
    }

    public  void check_ErrorMessage(String expectedMessage){
        System.out.println("Verifying if the message entered" + expectedMessage + "is the same as the displayed one");
        String actualErrorMessage = errorContainer.getText();
        Assert.assertEquals(actualErrorMessage,expectedMessage);
    }

}
