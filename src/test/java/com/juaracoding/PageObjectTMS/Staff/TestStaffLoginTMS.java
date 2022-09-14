package com.juaracoding.PageObjectTMS.Staff;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utils.Constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestStaffLoginTMS {

	WebDriver driver;
	private TestLoginStaffTMS testLoginStaffTMS = new TestLoginStaffTMS();
	private static ExtentTest extentest;

	public TestStaffLoginTMS() {
		driver = HooksTMSAStaff.driver;
		extentest = HooksTMSAStaff.extentTest;
	}

	@When("Staff go to web ptdikaA1")
	public void staff_go_to_web_ptdika1() {
		driver.get(Constants.URL);
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff go to web ptdikaA1");
	}

	@And("Staff enter password")
	public void staff_enter_password() {
		testLoginStaffTMS.login1("hallo");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff enter password");
	}

	@And("Staff click button loginA1")
	public void staff_click_button_login1() {
		testLoginStaffTMS.clickLogin1();
		extentest.log(LogStatus.PASS, "Staff click button loginA1");
	}

	@Then("Staff invalid loginA1")
	public void staff_invalid_login1() {
		assertEquals(testLoginStaffTMS.getNIKRequired(), "true");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff invalid loginA1");
	}

	@When("Staff go to web ptdikaA2")
	public void staff_go_to_web_ptdika2() {
		driver.get(Constants.URL);
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff go to web ptdikaA2");
	}

	@And("Staff enter nik")
	public void staff_enter_nik() {
		testLoginStaffTMS.login2("hallo");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff enter nik");
	}

	@And("Staff click button loginA2")
	public void staff_click_button_login2() {
		testLoginStaffTMS.clickLogin2();
		extentest.log(LogStatus.PASS, "Staff click button loginA2");
	}

	@Then("Staff invalid loginA2")
	public void staff_invalid_login2() {
		assertEquals(testLoginStaffTMS.getPasswordRequired(), "true");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff invalid loginA2");
	}
	
	@When("Staff go to web ptdikaA3")
	public void staff_go_to_web_ptdika3() {
		driver.get(Constants.URL);
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff go to web ptdikaA3");
	}

	@And("Staff enter NIK password invalid")
	public void staff_enter_nik_password_invalid() {
		testLoginStaffTMS.login3("hallo", "hallo");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff enter NIK password invalid");
	}

	@And("Staff click button loginA3")
	public void staff_click_button_login3() {
		testLoginStaffTMS.clickLogin3();
		extentest.log(LogStatus.PASS, "Staff click button loginA3");
	}

	@Then("Staff invalid loginA3")
	public void staff_invalid_login3() {
		assertEquals(testLoginStaffTMS.getWrongMsg(), "Wrong username or password..!");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff invalid loginA3");
	}
	
	@When("Staff go to web ptdikaA4")
	public void staff_go_to_web_ptdika4() {
		driver.get(Constants.URL);
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff go to web ptdikaA4");
	}

	@And("Staff enter NIK password valid")
	public void staff_enter_nik_password_valid() {
		testLoginStaffTMS.login4("D6200927", "1997-10-23");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff enter NIK password valid");
	}

	@And("Staff click button loginA4")
	public void staff_click_button_login4() {
		testLoginStaffTMS.clickLogin4();
		extentest.log(LogStatus.PASS, "Staff click button loginA4");
	}

	@Then("Staff valid login")
	public void staff_valid_login() {
		assertEquals(testLoginStaffTMS.getDashboard(), "Dashboard");
		extentest.log(LogStatus.PASS, "Staff valid login");
	}

}
