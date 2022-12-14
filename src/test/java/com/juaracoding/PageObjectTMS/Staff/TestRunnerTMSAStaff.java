package com.juaracoding.PageObjectTMS.Staff;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags ="",
			features = {"src/test/resources/features/Staff/01LoginStaff.feature"},
				glue ="com.juaracoding.PageObjectTMS.Staff",
				plugin={"pretty","html:target/CucumberStaffRifki-reports.html",
						"json:target/extentStaffRifki-reports.html"})
public class TestRunnerTMSAStaff extends AbstractTestNGCucumberTests {

}