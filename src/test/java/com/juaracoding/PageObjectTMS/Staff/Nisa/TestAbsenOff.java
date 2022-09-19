package com.juaracoding.PageObjectTMS.Staff.Nisa;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.juaracoding.PageObjectTMS.Staff.HooksTMSAStaff;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utils.Constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestAbsenOff {

	private 
	WebDriver driver;
	private AbsenOffStaff absenOffStaff = new AbsenOffStaff();
	private static ExtentTest extentTest;

	public TestAbsenOff() {
		driver = HooksTMSAStaff.driver;
		extentTest = HooksTMSAStaff.extentTest;
	}
	@Given("Staff Login Website")
		public void staff_login_website() {
		driver.get(Constants.URL);
		HooksTMSAStaff.delay(3);
		extentTest.log(LogStatus.PASS, "Staff Login Website");
	}
	@When("Input Username and Password")
	public void input_username_and_password() {
		HooksTMSAStaff.delay(3);
		absenOffStaff.Inputnik("D6200792");
		absenOffStaff.Inputpassword("1993-12-14");
		extentTest.log(LogStatus.PASS, "Input Username and Password");
	}
	@And ("Klik Btn Login")
	public void klik_Btn_login() {
		HooksTMSAStaff.delay(3);
		absenOffStaff.btnsubmit();
		extentTest.log(LogStatus.PASS, "Klik Btn Login");
	}
	@Then ("Staff Valid Login Website")
	public void Staff_valid_login_website() {
		HooksTMSAStaff.delay(3);
		absenOffStaff.GetDashboard();
		assertEquals(absenOffStaff.GetDashboard(), "Dashboard");
		extentTest.log(LogStatus.PASS, "Staff Valid Login");
	}
	@When("Tab Laporan Kegiatan")
	public void staff_click_on_tab_laporan_kegiatan() {
		HooksTMSAStaff.delay(3);
		absenOffStaff.btnlaporan();
		extentTest.log(LogStatus.PASS, "Staff Click On Tab Laporan Kegiatan");
	}
	@And("Tab Absen Off")
	public void click_on_absen_off() {
		HooksTMSAStaff.delay(3);
		absenOffStaff.Btnoff();
		extentTest.log(LogStatus.PASS, "Click Tab Absen off");
	}
	@Then("Valid Absen Off")
	public void Staff_Valid_On_Tab_Absen_Off() {
		HooksTMSAStaff.delay(3);
		absenOffStaff.GetDashboard();
		assertEquals(absenOffStaff.GetDashboard(), "Absen Off");
		extentTest.log(LogStatus.PASS, "Absen off");
	}
	@When("Staff Upload Foto Selfie")
	public void Staff_Input_Upload_Foto_Selfie() {
		HooksTMSAStaff.delay(3);
		absenOffStaff.ClickChooseFile("D:\\icha\\Pictures\\2017-05\\icon2 (1).jpg");
		extentTest.log(LogStatus.PASS, "Staff Upload Foto Selfie");
	}
	@And("Choose Divisi")
	public void Staff_Select_Divisi() {
		HooksTMSAStaff.delay(3);
		absenOffStaff.btndivisi("Call Center");
		extentTest.log(LogStatus.PASS, "Staff Select Divisi");
	}
	@And("Staff Choose Tipe Shift")
	public void Staff_Select_Tipe_Shift() {
		HooksTMSAStaff.delay(3);
		absenOffStaff.btnshift("Call Center 2");
		HooksTMSAStaff.scroll(300);
		extentTest.log(LogStatus.PASS, "Staff Select Shift");
	}
	@And("Choose Nama Shift")
	public void Staff_Select_Nama_Shift() {
		HooksTMSAStaff.delay(3);
		absenOffStaff.btnnamashift();
		extentTest.log(LogStatus.PASS, "Staff Select Nama Shift");
	}
	@And("Staff Choose Tipe Absen")
	public void Staff_Choose_Tipe_Absen() {
		HooksTMSAStaff.delay(3);
		absenOffStaff.btntipe("WFO");
		extentTest.log(LogStatus.PASS, "Staff Select Tipe Absen");
	}
	@And("Input Keterangan")
	public void Staff_Input_Keterangan() {
		HooksTMSAStaff.delay(3);
		absenOffStaff.keterangan();
		extentTest.log(LogStatus.PASS, "Staff input keterangan");
	}
	@Then ("Submit")
	public void Click_submit() {
		HooksTMSAStaff.delay(3);
		absenOffStaff.submit();
		HooksTMSAStaff.delay(3);
		assertEquals(absenOffStaff.alert(), "Input Result");
		extentTest.log(LogStatus.PASS, "Click Submit");
	}
	
	@When("Logout Website")
	public void Logout_Website() {
		absenOffStaff.logout();
		extentTest.log(LogStatus.PASS, "Staff Logout");
	}
	
	@Then("Back To Login TMS")
	public void Back_To_Login_TMS() {
		HooksTMSAStaff.delay(3);
		String v = "DIKA";
		assertEquals(absenOffStaff.gettextdika(), v);
		extentTest.log(LogStatus.PASS, "Back To Login TMS");
	}
}