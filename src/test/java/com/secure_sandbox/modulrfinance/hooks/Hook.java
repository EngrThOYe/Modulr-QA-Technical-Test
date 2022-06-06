package com.secure_sandbox.modulrfinance.hooks;


import com.secure_sandbox.modulrfinance.commons.BrowserManager;
import io.cucumber.java.Before;

public class Hook extends BrowserManager {
    @Before
    public void setup() {
        launchBrowser("Chrome");
    }

    //@After
    public void tearDown() {
        closeBrowser();
    }
}
