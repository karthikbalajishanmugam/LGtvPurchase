package org.TvPurchase.StepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\resources\\Features",
                  glue = "org.TvPurchase.StepDefinition",
                  monochrome = true,
                  dryRun = false)

public class TestRunner {

}
