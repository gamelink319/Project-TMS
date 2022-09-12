package com.juaracoding.PageObjectTMS.Admin;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags ="",
			features = {
					"src/test/resources/features/Admin/TMSAdminMasuk.feature"},
				glue ="com.juaracoding.PageObjectTMS.Admin",
				plugin={"pretty","html:target/CucumberAdmin-reports.html",
						"json:target/extentAdmin-reports.html"})
public class TestRunnerTMSAdmin extends AbstractTestNGCucumberTests {
}

//"src/test/resources/features/Admin/01LoginAdmin.feature"
//"src/test/resources/features/Admin/TMSAdminPositife.feature"