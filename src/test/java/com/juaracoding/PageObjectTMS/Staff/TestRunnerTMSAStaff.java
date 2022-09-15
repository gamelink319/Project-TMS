package com.juaracoding.PageObjectTMS.Staff;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags ="",
				features = {"src/test/resources/features/Staff/01.LoginStaff.feature",
						"src/test/resources/features/Staff/02.LogoutStaff.feature",
						"src/test/resources/features/Staff/03.AbsenIzin.feature"},
				glue ="com.juaracoding.PageObjectTMS.Staff",
				plugin={"pretty","html:target/CucumberStaff-reports.html",
						"json:target/ExtentStaff-reports.html"})
public class TestRunnerTMSAStaff extends AbstractTestNGCucumberTests {

}