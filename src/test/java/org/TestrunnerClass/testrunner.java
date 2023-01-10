package org.TestrunnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", 
glue = "org.stepdefinition",
monochrome = true,
dryRun = false, 
strict = true, 
snippets = SnippetType.UNDERSCORE,
plugin = {"html:Report" , 
		"junit:Report\\junitreport_ManualTesting.xml" , 
		"json:Report\\jsonreport_ManualTesting.json"})
public class testrunner {

}
