package com.secure_sandbox.modulrfinance.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LogInPage extends BasePage
{
    public LogInPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "username-inp")
    private WebElement clickUsername;

    @FindBy(id = "password-inp")
    private WebElement clickPassword;

    @FindBy(id = "signInSubmitButton")
    private WebElement clickSignIn;

    @FindBy(xpath = "//div[text()=' The username or password is incorrect. ']")
    private List<WebElement> assertErrorWarningMessage;

    @FindBy(xpath = "//div[text()=' This field is required ']")
    private List<WebElement> assertFieldRequiredMessage;

    @FindBy(id = "forgotPasswordHref")
    private WebElement clickForgottenPassword;

    public void clickUsername() {
        clickUsername.click();
    }
    public void enterUsername(String Username) {
        clickUsername.sendKeys(Username);
    }
    public void clickPassword() {
        clickPassword.click();
    }
    public void enterPassword(String Password) {
        clickPassword.sendKeys(Password);
    }
    public void assertErrorWarningMessage() {
        Assert.assertTrue(assertErrorWarningMessage.size() > 0);
    }
    public void assertFieldRequiredMessage() {
        Assert.assertTrue(assertFieldRequiredMessage.size() > 0);
    }
    public ModulrAccountPage clickSignIn() {
        clickSignIn.click();
        return new ModulrAccountPage(driver);
    }

    public ResetaccessPage clickForgottenPassword() {
        clickForgottenPassword.click();
        return new ResetaccessPage(driver);
    }
}
