package com.secure_sandbox.modulrfinance.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UsersPage extends BasePage
{
    public UsersPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "/html/body/app-root/ng-component/div/div[2]/div[2]/div[2]/app-user/main/section[1]/div/div[1]/a[1]/span")
    private List<WebElement> assertUsersPage;

    @FindBy(xpath = "/html/body/app-root/ng-component/div/div[2]/div[1]/app-menu/aside/div[2]/nav/app-menu-customer/app-menu-item[7]/a/div/modlib-svg-text/div/div")
    private WebElement clickOnNotifications;

    public void assertUsersPage() {
        Assert.assertTrue(assertUsersPage.size() > 0);
    }
    public NotificationsPage clickOnNotifications() {
        clickOnNotifications.click();
        return new NotificationsPage(driver);
    }

}
