package com.secure_sandbox.modulrfinance.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/com/secure_sandbox/modulrfinance/features"},
        glue = {"com/secure_sandbox/modulrfinance/hooks", "com/secure_sandbox/modulrfinance/step_definitions"},
        tags = "@test",
        publish = true
)
public class TestRunner {
}
