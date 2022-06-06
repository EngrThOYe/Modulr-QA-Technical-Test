package com.secure_sandbox.modulrfinance.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MoveMoneyPage extends BasePage
{
    public MoveMoneyPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "/html/body/app-root/ng-component/div/div[2]/div[2]/div[2]/app-move-money-dashboard/div/h2")
    private List<WebElement> assertMoveMoneyPage;

    @FindBy(xpath = "/html/body/app-root/ng-component/div/div[2]/div[1]/app-menu/aside/div[2]/nav/app-menu-customer/app-menu-item[3]/a/div/modlib-svg-text/div/div")
    private WebElement clickOnPendingPayments;

    public void assertMoveMoneyPage() {
        Assert.assertTrue(assertMoveMoneyPage.size() > 0);
    }
    public PendingPaymentsPage clickOnPendingPayments() {
        clickOnPendingPayments.click();
        return new PendingPaymentsPage(driver);
    }

}
