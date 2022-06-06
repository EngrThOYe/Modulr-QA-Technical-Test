package com.secure_sandbox.modulrfinance.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BeneficiariesPage extends BasePage
{
    public BeneficiariesPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "/html/body/app-root/ng-component/div/div[2]/div[2]/div[2]/app-beneficiaries/main/app-beneficiaries-header/div/div[1]/a[1]")
    private List<WebElement> assertBeneficiariesPage;

    @FindBy(xpath = "/html/body/app-root/ng-component/div/div[2]/div[1]/app-menu/aside/div[2]/nav/app-menu-customer/app-menu-item[5]/a/div/modlib-svg-text/div/div")
    private WebElement clickOnReport;

    public void assertBeneficiariesPage() {
        Assert.assertTrue(assertBeneficiariesPage.size() > 0);
    }
    public ReportsPage clickOnReport() {
        clickOnReport.click();
        return new ReportsPage(driver);
    }

}
