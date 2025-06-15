package stepDifinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Base_PO;
import pageObjects.Login_PO;

public class Login_Steps extends Base_PO {

    private Login_PO loginPo;
    public Login_Steps(Login_PO loginPo){
        this.loginPo=loginPo;
    }
    @Given("I open the Swag Labs login page")
    public void i_open_the_swag_labs_login_page() {
        // Open the Swag Labs Page
        System.out.println("Opening Swag Labs webpage -->");
        loginPo.navigateTo_SwagLabs_LoginPage();
    }

    @When("I enter a correct username {string}")
    public void i_enter_a_correct_standard_user(String username) {
        // Input username
        System.out.println("Entering the username -->");
        loginPo.inputUsername(username);
    }

    @When("I enter a correct password {string}")
    public void i_enter_a_correct_secret_sauce(String password) {
        System.out.println("Entering the password -->");
        loginPo.inputPassword(password);

    }

    @When("I click on the login button")
    public void i_click_on_the_login_button() {
        System.out.println("Clicking on login button -->");
        loginPo.click_LoginButton();
    }

    @Then("I should be presented with the product page")
    public void i_should_be_presented_with_the_product_page() {
        System.out.println("Verifying if login status -->");
        loginPo.validate_Successfullogin();
    }

    @Then("I should get Error message {string}")
    public void i_should_get_error_message(String expectedMessage) {
        // Write code here that turns the phrase above into concrete actions
        loginPo.check_ErrorMessage(expectedMessage);
    }

    @When("I enter a random username")
    public void i_enter_a_random_username() {
        // Write code here that turns the phrase above into concrete actions
        loginPo.inputUsername(generateRandomPUsernameassword(5,'a','z'));
    }

    @When("I enter a random password")
    public void i_enter_a_random_password() {
        // Write code here that turns the phrase above into concrete actions
        loginPo.inputPassword(generateRandomPUsernameassword(7,'e','i'));
    }
}
