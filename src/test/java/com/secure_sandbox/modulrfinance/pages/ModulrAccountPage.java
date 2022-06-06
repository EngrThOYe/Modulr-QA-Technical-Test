package com.secure_sandbox.modulrfinance.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ModulrAccountPage extends BasePage
{
    public ModulrAccountPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "/html/body/app-root/ng-component/div/div[2]/div[2]/div[2]/app-account/div/section[1]/div[1]/p")
    private List<WebElement> assertModulrAccountPage;

    @FindBy(xpath = "/html/body/app-root/ng-component/div/div[2]/div[1]/app-menu/aside/div[2]/nav/app-menu-customer/app-menu-item[2]/a/div/modlib-svg-text/div/div")
    private WebElement clickOnMoveMoney;

    public void assertModulrAccountPage() {
        Assert.assertTrue(assertModulrAccountPage.size() > 0);
    }
    public MoveMoneyPage clickOnMoveMoney() {
        clickOnMoveMoney.click();
        return new MoveMoneyPage(driver);
    }
}
