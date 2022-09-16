package com.juaracoding.PageObjectTMS.Staff;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags ="",
				features = {"src/test/resources/features/Staff/07.SelectNamaShift.feature"},
				glue ="com.juaracoding.PageObjectTMS.Staff",
				plugin={"pretty","html:target/CucumberStaff-reports.html",
						"json:target/ExtentStaff-reports.html"})
public class TestRunnerTMSAStaff extends AbstractTestNGCucumberTests {

}

// src/test/resources/features/Staff/01.LoginStaff.feature
// src/test/resources/features/Staff/02.LogoutStaff.feature
// src/test/resources/features/Staff/03.AbsenIzin.feature
// src/test/resources/features/Staff/04.UploadFoto.feature
// src/test/resources/features/Staff/05.SelectDivisi.feature
// src/test/resources/features/Staff/06.SelectTipeShift.feature
// src/test/resources/features/Staff/07.SelectNamaShift.feature
