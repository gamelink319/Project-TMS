package com.juaracoding.PageObjectTMS.Staff;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags ="",
			features = {"src/test/resources/features/Staff/AbsenOff.feature"},
				glue ="com.juaracoding.PageObjectTMS.Staff",
				plugin={"pretty","html:target/CucumberStaff-reports.html",
						"json:target/extentStaff-reports.html"})
public class TestRunnerTMSAStaff extends AbstractTestNGCucumberTests {

}
//src/test/resources/features/Staff/AbsenSakit.feature