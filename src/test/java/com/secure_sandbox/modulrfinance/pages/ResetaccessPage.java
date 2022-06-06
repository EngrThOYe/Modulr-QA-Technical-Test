package com.secure_sandbox.modulrfinance.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ResetaccessPage extends BasePage
{
    public ResetaccessPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "resetAccessSubheading")
    private List<WebElement> assertResetaccessPage;

    @FindBy(id = "usernameInput")
    private WebElement clickUsername;

    @FindBy(xpath = "//*[@id=\"signInSubmitButton\"]/span")
    private WebElement clickRequestAReset;

    @FindBy(id = "emailSentHeading")
    private List<WebElement> assertEmailSent;



    public void assertResetaccessPage() {
        Assert.assertTrue(assertResetaccessPage.size() > 0);
    }
    public void clickUsername() {
        clickUsername.click();
    }
    public void enterUsername(String Username) {
        clickUsername.sendKeys(Username);
    }
    public void clickRequestAReset() {
        clickRequestAReset.click();
    }
    public void assertEmailSent() {
        Assert.assertTrue(assertEmailSent.size() > 0);
    }
}
