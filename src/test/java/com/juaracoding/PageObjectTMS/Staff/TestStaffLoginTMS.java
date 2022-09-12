package com.juaracoding.PageObjectTMS.Staff;

import static org.testng.Assert.assertEquals;

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

	@And("Staff click button login1")
	public void staff_click_button_login1() {
		testLoginStaffTMS.clickLogin1();
		extentest.log(LogStatus.PASS, "Staff click button login1");
	}

	@Then("Staff invalid login1")
	public void staff_invalid_login1() {
		assertEquals(testLoginStaffTMS.getNIKRequired(), "true");
		extentest.log(LogStatus.PASS, "Staff invalid login");
	}
	
	@When("Staff enter NIK")
	public void staff_enter_nik() {
		testLoginStaffTMS.login2("hallo");
		extentest.log(LogStatus.PASS, "Staff enter NIK");
	}
	
	@And("Staff click button login2")
	public void staff_click_button_login2() {
		testLoginStaffTMS.clickLogin2();
		extentest.log(LogStatus.PASS, "Staff click button login2");
	}
	
	@Then("Staff invalid login2")
	public void staff_invalid_login2() {
		assertEquals(testLoginStaffTMS.getPasswordRequired(), "true");
		extentest.log(LogStatus.PASS, "Staff invalid login2");
	}
	
	@When("Staff enter NIK password invalid")
	public void staff_enter_nik_password_invalid() {
		testLoginStaffTMS.login3("hallo","hallo");
		extentest.log(LogStatus.PASS, "Staff enter NIK password invalid");
	}
	
	@And("Staff click button login3")
	public void staff_click_button_login3() {
		testLoginStaffTMS.clickLogin3();
		extentest.log(LogStatus.PASS, "Staff click button login3");
	}
	
	@Then("Staff invalid login3")
	public void staff_invalid_login3() {
		assertEquals(testLoginStaffTMS.getWrongMsg(), "Wrong username or password..!");
		extentest.log(LogStatus.PASS, "Staff invalid login3");
	}
	
	@When("Staff enter NIK password valid")
	public void staff_enter_nik_password_valid() {
		testLoginStaffTMS.login4("D6200927", "1997-10-23");
		extentest.log(LogStatus.PASS, "Staff enter NIK password valid");
	}
	
	@And("Staff click button login4")
	public void staff_click_button_login4() {
		testLoginStaffTMS.clickLogin4();
		extentest.log(LogStatus.PASS, "Staff click button login4");
	}
	
	@Then("Staff valid login")
	public void staff_valid_login() {
		assertEquals(testLoginStaffTMS.getDashboard(), "Dashboard");
		extentest.log(LogStatus.PASS, "Staff valid login");
	}
	
	
	
	

}
