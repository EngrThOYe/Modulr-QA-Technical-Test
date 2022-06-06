package com.secure_sandbox.modulrfinance.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class NotificationsPage extends BasePage
{
    public NotificationsPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "/html/body/app-root/ng-component/div/div[2]/div[2]/div[2]/app-notification/div/p")
    private List<WebElement> assertNotificationsPage;


    public void assertNotificationsPage() {
        Assert.assertTrue(assertNotificationsPage.size() > 0);
    }


}
