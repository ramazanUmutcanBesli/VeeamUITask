package com.veeam.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/n11/step_definitions",
        features = "@target/rerun.txt",
        dryRun = false,
        tags = ""

)
public class FailedTestRunner {

}
