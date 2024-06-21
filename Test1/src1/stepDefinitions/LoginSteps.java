package stepDefinitions;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pages.LoginPage;

public class LoginSteps {

    WebDriver driver;
    LoginPage loginPage;

    @Given("The user is on the Facebook login page")
    public void the_user_is_on_the_facebook_login_page() {
        loginPage = new LoginPage();
        loginPage.openURL();
    }

    @When("The user enters the username {string}")
    public void the_user_enters_the_username(String username) {
        loginPage.enterUsername(username);
    }

    @When("The user enters the password {string}")
    public void the_user_enters_the_password(String password) {
        loginPage.enterPassword(password);
    }

    @When("The user clicks on the login button")
    public void the_user_clicks_on_the_login_button() {
        loginPage.clickLoginButton();
    }

    
}