package com.secure_sandbox.modulrfinance.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PendingPaymentsPage extends BasePage
{
    public PendingPaymentsPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "/html/body/app-root/ng-component/div/div[2]/div[2]/div[2]/app-payments/div/section[1]/div/p")
    private List<WebElement> assertPendingPaymentsPage;

    @FindBy(xpath = "/html/body/app-root/ng-component/div/div[2]/div[1]/app-menu/aside/div[2]/nav/app-menu-customer/app-menu-item[4]/a/div/modlib-svg-text/div/div")
    private WebElement clickOnBeneficiaries;

    public void assertPendingPaymentsPage() {
        Assert.assertTrue(assertPendingPaymentsPage.size() > 0);
    }
    public BeneficiariesPage clickOnBeneficiaries() {
        clickOnBeneficiaries.click();
        return new BeneficiariesPage(driver);
    }

}
