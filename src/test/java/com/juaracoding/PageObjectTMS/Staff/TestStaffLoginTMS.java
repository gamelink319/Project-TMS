package com.juaracoding.PageObjectTMS.Staff;

import org.openqa.selenium.WebDriver;

import com.juaracoding.PageObjectTMS.Drivers.DriverSingleton;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utils.Constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestStaffLoginTMS {
	
	public static WebDriver driver;
	private static ExtentTest extentest;
	private TestLoginStaffTMS testLoginStaffTMS = new TestLoginStaffTMS();

	public TestStaffLoginTMS() {
		driver = HooksTMSAStaff.driver;
		extentest = HooksTMSAStaff.extentTest;
	}
	
	@When("Staff go to web ptdika")
	public void staff_go_to_web_ptdika() {
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
		extentest.log(LogStatus.PASS, "Staff go to web ptdika");
		
	}
	
	@And("Staff enter password")
	public void staff_enter_password() {
		testLoginStaffTMS.login1("hallo");
		extentest.log(LogStatus.PASS, "Staff enter password");
	}
	
	@And("Staff click button login")
	public void staff_click_button_login() {
		testLoginStaffTMS.clickLogin();
		extentest.log(LogStatus.PASS, "Staff click button login");
	}
	
	@Then("Staff invalid login")
	public void staff_invalid_login() {
		
	}

}
