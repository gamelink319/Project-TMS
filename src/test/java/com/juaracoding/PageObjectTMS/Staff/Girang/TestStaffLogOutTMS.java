package com.juaracoding.PageObjectTMS.Staff.Girang;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.juaracoding.PageObjectTMS.HooksTMS;
//import com.juaracoding.PageObjectTMS.Staff.HooksTMSAStaff;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utils.Constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestStaffLogOutTMS {
	
	WebDriver driver;
	private LogOutStaffTMSPage logoutStaffTMSPage = new LogOutStaffTMSPage();
	private static ExtentTest extentest;
	
	public TestStaffLogOutTMS() {
		driver = HooksTMS.driver;
		extentest = HooksTMS.extentTest;
	}
	
	@When("Staff go to web ptdikaB1")
	public void staff_go_to_web_ptdika1() {
		driver.get(Constants.URL);
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff go to web ptdikaB1");
	}
	
	@And("Staff enter NIK password validB1")
	public void staff_enter_nik_password_valid1() {
		logoutStaffTMSPage.goLogin1("D6190873", "2001-07-21");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff enter NIK password validB1");		
	}
	
	@And("Staff click button loginB1")
	public void staff_click_button_login1() {
		logoutStaffTMSPage.clickBtnLogin1();
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff click button loginB1");
	}
	
	@And("Staff click logout pada navbar")
	public void staff_click_logout_pada_navbar() {
		logoutStaffTMSPage.clickBtnNavLogout();
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff click logout pada navbar");
	}
	
	@Then("Staff masuk ke halaman sign inB1")
	public void staff_masuk_ke_halaman_sign_in1() {
		assertEquals(logoutStaffTMSPage.getPageSign1(), "DIKA");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff masuk ke halaman sign inB1");
	}
	
	@When("Staff enter NIK password validB2")
	public void staff_enter_nik_password_validB2() {
		logoutStaffTMSPage.goLogin2("D6190873", "2001-07-21");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff enter NIK password validB2");
	}
	
	@And("Staff click button loginB2")
	public void staff_click_button_loginB2() {
		logoutStaffTMSPage.clickBtnLogin2();
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff click button loginB2");
	}
	
	@And("Staff click profil")
	public void staff_click_profil() {
		logoutStaffTMSPage.cekProfill();
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff click profil");
	}
	
	@And("Staff click logout pada profil")
	public void staff_click_logout_pada_profil() {
		logoutStaffTMSPage.clickBtnLogoutProfill();	
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff click logout pada profil");
	}
	
	@Then("Staff masuk ke halaman sign inB2")
	public void staff_masuk_ke_halaman_sign_inB2() {
		assertEquals(logoutStaffTMSPage.getPageSign2(), "DIKA");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff masuk ke halaman sign inB2");
	}	
}