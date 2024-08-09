package org.shoppingCart.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.shoppingCart.pages.LoginPage;
import org.testng.Assert;
import org.testng.asserts.Assertion;

public class LoginPageStepDefinition {
    private WebDriver driver;
    LoginPage loginPage;
    @Before
        public void setUp(){
            driver = new ChromeDriver();
        }

    @After
        public void tearDown(){
        if(driver !=null){
            driver.quit();
        }
    }

    @Given("I am in the login page of the open cart application")
    public void i_am_in_the_login_page_of_the_open_cart_application() {
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        loginPage = new LoginPage(driver);


    }
   @Given("I have entered valid credentials")
   public void i_have_entered_valid_credentials() {
        loginPage.enterEmail("testuser1@yahoo.com");
        loginPage.enterPassword("1qaz@WSX@");

   }
    @When("I click login")
    public void i_click_login() {
    loginPage.clickLogin();
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        loginPage.verifyAccountPage();
    }
//
//
//    @Given("I am in the login page of the open cart application")
//    public void i_am_in_the_login_page_of_the_open_cart_application() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
    @Given("I have entered invalid {string} and {string}")
    public void i_have_entered_invalid_and(String email, String password) {
    loginPage.loginWithCredentials(email, password);
    }
//    @When("I click login")
//    public void i_click_login() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
    @Then("I should get an error message indicating {string}")
    public void i_should_get_an_error_message_indicating(String string) {
        Assert.assertEquals(driver.findElement(By.xpath("//div[contains(@class,'alert alert-danger')]")).getText(),string);
        System.out.println(driver.findElement(By.xpath("//div[contains(@class,'alert alert-danger')]")).getText());
    }
//
//
//
//    @Given("I am in the login page of the open cart application")
//    public void i_am_in_the_login_page_of_the_open_cart_application() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Given("I have entered invalid {string} and {string}")
//    public void i_have_entered_invalid_and(String string, String string2) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @When("I click login")
//    public void i_click_login() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("I should get an error message indicating {string}")
//    public void i_should_get_an_error_message_indicating(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//
//    @Given("I am in the login page of the open cart application")
//    public void i_am_in_the_login_page_of_the_open_cart_application() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Given("I have entered invalid {string} and {string}")
//    public void i_have_entered_invalid_and(String string, String string2) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @When("I click login")
//    public void i_click_login() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("I should get an error message indicating {string}")
//    public void i_should_get_an_error_message_indicating(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
}
