package Cucumber.options;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/feature",
//plugin ="json:target/jsonReports/cucumber-report.json",
plugin = {"pretty","html:target/cucumber.html","json:target/jsonReports/cucumber-report.json"},
glue= {"stepDefination"},
stepNotifications=true,
//dryRun=false,
//monochrome=true,
tags="@portalTest")

//tags="@RegTest")
//tags="@RegTest or @SmokeTest")// eithr reg or sanity
//tags ="@RegTest and @SmokeTest- test should tagged by reg and smoke
//tags = "not @SanityTest- except sanity all should execute

public class TestRunner {
//tags= {"@DeletePlace"}  compile test verify
}

