package com.secure_sandbox.modulrfinance.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ReportsPage extends BasePage
{
    public ReportsPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "/html/body/app-root/ng-component/div/div[2]/div[2]/div[2]/app-report/section/p")
    private List<WebElement> assertReportPage;

    @FindBy(xpath = "/html/body/app-root/ng-component/div/div[2]/div[1]/app-menu/aside/div[2]/nav/app-menu-customer/app-menu-item[6]/a/div/modlib-svg-text/div/div")
    private WebElement clickOnUsers;

    public void assertReportPage() {
        Assert.assertTrue(assertReportPage.size() > 0);
    }
    public UsersPage clickOnUsers() {
        clickOnUsers.click();
        return new UsersPage(driver);
    }

}
