package org.shoppingCart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;
    private By emailInputLocator = By.name("email");
    private By passwordInputLocator = By.name("password");
    private By loginButtonLocator = By.xpath("//input[@value='Login']");
    private By forgottenPasswordLocator = By.linkText("Forgotten Password");
    private By accountLabelLocator = By.xpath("//h2[normalize-space(text())='My Account']");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterEmail(String email){
        WebElement emailInput = driver.findElement(emailInputLocator);
        emailInput.sendKeys(email);

    }

    public void enterPassword(String password){
        WebElement passwordInput = driver.findElement(passwordInputLocator);
        passwordInput.sendKeys(password);

    }

    public void loginWithCredentials(String email, String password){
        WebElement emailInput = driver.findElement(emailInputLocator);
        emailInput.sendKeys(email);
        WebElement passwordInput = driver.findElement(passwordInputLocator);
        passwordInput.sendKeys(password);

    }

    public void clickLogin(){
        WebElement loginButton = driver.findElement(loginButtonLocator);
        loginButton.click();

    }

    public void forgottenPassword(){
        WebElement forgottenPassword = driver.findElement(forgottenPasswordLocator);
        forgottenPassword.click();

    }

    public void verifyAccountPage(){
        WebElement accountLabel = driver.findElement(accountLabelLocator);
        accountLabel.isDisplayed();


    }
}
