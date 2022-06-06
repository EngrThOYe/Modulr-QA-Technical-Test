package com.secure_sandbox.modulrfinance.pages;

import com.secure_sandbox.modulrfinance.commons.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends DriverManager
{
    public String BASE_URL = "https://secure-sandbox.modulrfinance.com/";
    public void NavigateToLogInPage()
    {
        driver.navigate().to(BASE_URL);
    }


    private Select select;

    public void selectByText(WebElement element, String text)
    {
        select = new Select(element);
        select.selectByVisibleText(text);
    }

    public void selectByValue(WebElement element, String value)
    {
        select = new Select(element);
        select.selectByValue(value);
    }
    public void selectByIndex(WebElement element, int index)
    {
        select = new Select(element);
        select.selectByIndex(index);
    }


}
