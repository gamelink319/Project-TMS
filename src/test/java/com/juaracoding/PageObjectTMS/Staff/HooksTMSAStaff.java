
package com.juaracoding.PageObjectTMS.Staff;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.juaracoding.PageObjectTMS.Drivers.DriverSingleton;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utils.Constants;
import Utils.TestScenarioAdmin;
import Utils.TestScenarioStaff;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import Utils.Utils;

public class HooksTMSAStaff {
	public static WebDriver driver;
	public static ExtentTest extentTest;
	public static ExtentReports reports = new ExtentReports("target/extentStaff-reports.html");

	@Before
	public void setUP() {
		DriverSingleton.getInstance(Constants.FIREFOX);
		driver = DriverSingleton.getDriver();
		TestScenarioStaff[] tests = TestScenarioStaff.values();
		extentTest = reports.startTest(tests[Utils.testCount].getTestTMSStaff());
		Utils.testCount++;
	}
	
	
	@AfterStep
	public void getResultStatus(Scenario scenario) throws IOException {
		if (scenario.isFailed()) {
			String scrennshotpath = Utils.getScreenshot(driver, scenario.getName().replace(" ", "_"));
			extentTest.log(LogStatus.FAIL, scenario.getName()+"\n"+extentTest.addScreenCapture(scrennshotpath));
		}
	}
	
	@After
	public void ex() {
		reports.endTest(extentTest);
		reports.flush();
	}
	@AfterAll
	public static void CloseBrowser() {
		delay(5);
		DriverSingleton.CloseObjectInstance();
	}

	public static void delay(int detik) {
		try {
			Thread.sleep(1000 * detik);
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println(e);
		}

	}

	public static void scroll(int vertical) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0," + vertical + ")");
	}

}