package com.juaracoding.PageObjectTMS.Admin;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags ="",
			features = {"",
						""},
				glue ="com.juaracoding.PageObjectTMS.Admin",
				plugin={"pretty","html:target/cucumber-reports.html",
						"json:target/extent-reports.html"})
public class TestRunnerTMSAdmin extends AbstractTestNGCucumberTests {

}
