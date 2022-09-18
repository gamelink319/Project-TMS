package com.juaracoding.PageObjectTMS.Admin;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(tags ="",
			features = {"src/test/resources/features/Admin/ModulAdminReportAbsen.feature"},
				glue ="com.juaracoding.PageObjectTMS.Admin",
				plugin={"pretty","html:target/CucumberAdminReportAbsen-reports.html",
						"json:target/extentAdminReportAbsen-reports.html"})
public class TestRunnerTMSAdmin extends AbstractTestNGCucumberTests {
}

/*
"src/test/resources/features/Admin/01LoginAdmin.feature"
"src/test/resources/features/Admin/TMSAdminMasuk.feature"
"src/test/resources/features/Admin/TMSAdminPulang.feature"
"src/test/resources/features/Admin/TMSAdminSakit.feature"
"src/test/resources/features/Admin/TMSAdminOff.feature"
"src/test/resources/features/Admin/TMSAdminShifting.feature"
"src/test/resources/features/Admin/TMSAdminNonShifting.feature"
*/