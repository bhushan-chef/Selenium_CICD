package com.parallel.grid.tests.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {
                "com.parallel.grid.tests.stepDefinitions",
                "com.parallel.grid.tests.hooks"   // ✅ ADD THIS
        },
        plugin = {
                "pretty"
        }
)
public class TestRunner extends AbstractTestNGCucumberTests {
}