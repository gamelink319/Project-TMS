package com.juaracoding.PageObjectTMS.Admin;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags ="",
			features = {"src/test/resources/features/Admin/ProjectTMSStaffAndAdmin.feature"},
				glue ={"com.juaracoding.PageObjectTMS"},
				plugin={"pretty","html:target/CucumberReportProjectTMS-reports.html",
						"json:target/extentReportProjectTMS-reports.html"})
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
{"com.juaracoding.PageObjectTMS.Admin","com.juaracoding.PageObjectTMS.Staff"},
*/