package com.juaracoding.PageObjectTMS.Staff;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utils.Constants;
import io.cucumber.java.en.When;

public class TestSelectDivisi {
	
	WebDriver driver;
	private SelectDivisiPage selectDivisiPage = new SelectDivisiPage();
	private static ExtentTest extentest;

	public TestSelectDivisi() {
		driver = HooksTMSAStaff.driver;
		extentest = HooksTMSAStaff.extentTest;
	}
	
	@When("Staff go wo web ptdikaE1")
	public void staff_go_wo_web_ptdikaE1() {
		driver.get(Constants.URL);
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff go wo web ptdikaE1");
	}

}
