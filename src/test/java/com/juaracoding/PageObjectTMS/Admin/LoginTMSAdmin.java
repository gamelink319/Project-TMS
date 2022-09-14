package com.juaracoding.PageObjectTMS.Admin;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utils.Constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTMSAdmin {

	WebDriver driver;
	private LoginAdmin login = new LoginAdmin();
	private static ExtentTest extentTest;

	public LoginTMSAdmin() {
		driver = HooksTMSAdmin.driver;
		extentTest = HooksTMSAdmin.extentTest;
	}

	@Given("Admin go to web TMS")
	public void AdmingotowebTMS() {
		driver.get(Constants.URL);
		HooksTMSAdmin.delay(2);
		extentTest.log(LogStatus.PASS, "Admin go to web TMS");
	}

	@When("Admin enter username True and password True")
	public void AdminEnterUsernameTrueAndPasswordTrue() {
		login.InputNIK("admin_tms");
		login.InputPassword("d1k4@passw0rd");
		extentTest.log(LogStatus.PASS, "Admin enter username True and password True");
	}

	@And("Admin click button login")
	public void Adminclickbuttonloginvalid() {
		login.ButtonLogin();
		extentTest.log(LogStatus.PASS, "Admin click button login");
	}

	@Then("Admin valid login")
	public void Adminvalidlogin() {
		HooksTMSAdmin.delay(3);
		login.GetTextDashboard();
		String x = "Selamat datang, Admin TMS";
		assertEquals(login.GetTextDashboard(), x);
		extentTest.log(LogStatus.PASS, "Admin valid login");
	}

	@When("Admin enter username false and password false")
	public void AdminEnterUsernameNullAndPasswordNull() {
		login.InputNIK("dika");
		login.InputPassword("tms");
		HooksTMSAdmin.delay(2);
		extentTest.log(LogStatus.PASS, "Admin enter username false and password false");
	}

	@When("Admin enter username false and password true")
	public void AdminEnterUsernameFalseAndPasswordtrue() {
		login.InputNIK("admin");
		login.InputPassword("d1k4@passw0rd");
		HooksTMSAdmin.delay(2);
		extentTest.log(LogStatus.PASS, "Admin enter username false and password true");
	}

	@When("Admin enter username true and password false")
	public void AdminEnterUsernameTrueAndPasswordFalse() {
		login.InputNIK("admin_tms");
		login.InputPassword("password");
		HooksTMSAdmin.delay(2);
		extentTest.log(LogStatus.PASS, "Admin enter username true and password false");
	}

	@Then("Admin invalid credentials")
	public void Admin_invalid_credentials() {
		HooksTMSAdmin.delay(2);
		login.GetAlert();
		assertTrue(login.GetAlert());
		extentTest.log(LogStatus.PASS, "Admin invalid credentials");
	}
	
	@When("Admin click btnLogout")
	public void Admin_click_btnlogout() {
		login.logout();
		extentTest.log(LogStatus.PASS, "Admin click btnLogout");
	}
	
	@Then("Admin back to login TMS")
	public void Admin_back_to_login_TMS() {
		HooksTMSAdmin.delay(2);
		String v = "DIKA";
		assertEquals(login.gettextdika(), v);
		extentTest.log(LogStatus.PASS, "Admin back to login TMS");
	}
}