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

public class TestAbsenSakitStaff {

	private 
	WebDriver driver;
	private AbsenSakitStaff absenSakitStaff = new AbsenSakitStaff();
	private static ExtentTest extentTest;
	
	public TestAbsenSakitStaff() {
		driver = HooksTMSAStaff.driver;
		extentTest = HooksTMSAStaff.extentTest;
	}
	@Given("Staff go to web TMS")
		public void StaffgotowebTMS() {
		driver.get(Constants.URL);
		HooksTMSAStaff.delay(2);
		extentTest.log(LogStatus.PASS, "Staff Login Website");
	}
	@When("Staff Input Username and Password")
	public void Staff_Input_Username_and_Password() {
		HooksTMSAStaff.delay(2);
		absenSakitStaff.inputnik("D6201031");
		
		absenSakitStaff.inputpassword("1994-10-02");
		extentTest.log(LogStatus.PASS, "Staff Input Username and Password");
	}

	@And ("Staff click button login")
	public void Staffclickbuttonlogin() {
		HooksTMSAStaff.delay(2);
		absenSakitStaff.ButtonLogin();
		extentTest.log(LogStatus.PASS, "Staff click button login");
	}
	
	@Then ("Staff Valid Login")
	public void Staff_Valid_Login() {
		HooksTMSAStaff.delay(3);
		absenSakitStaff.GetDashboard();
		assertEquals(absenSakitStaff.GetDashboard(), "Dashboard");
		extentTest.log(LogStatus.PASS, "Staff Valid Login");
	}
	
	@When("Click tab laporan kegiatan")
	public void Click_tab_laporan_kegiatan() {
		HooksTMSAStaff.delay(3);
		absenSakitStaff.ClickLaporanKegiatan();
		extentTest.log(LogStatus.PASS, "Click tab laporan kegiatan");
	}
	@And("Click On Tab Absen Sakit")
	public void Click_On_Tab_Absen_Sakit() {
		HooksTMSAStaff.delay(3);
		absenSakitStaff.ClickAbsnSakit();
		extentTest.log(LogStatus.PASS, "Click On Tab Absen Sakit");
	}
	
	@Then("Staff Valid To Absen Sakit")
	public void Staff_Valid_To_Absen_Sakit() {
		HooksTMSAStaff.delay(3);
		absenSakitStaff.GetDashboard();
		assertEquals(absenSakitStaff.GetDashboard(), "Absen Sakit");
		extentTest.log(LogStatus.PASS, "Absen Sakit");
	}
	@When("Staff Upload Foto")
	public void Staff_Upload_Foto() {
		HooksTMSAStaff.delay(3);
		absenSakitStaff.ClickChooseFile("D:\\icha\\Pictures\\2017-05\\icon2 (1).jpg");
		extentTest.log(LogStatus.PASS, "Staff Input Upload Foto Selfie");
	}
	@And("Staff Choose Divisi")
	public void Staff_Choose_Divisi() {
		HooksTMSAStaff.delay(3);
		absenSakitStaff.ClickTipeDivisi();
		extentTest.log(LogStatus.PASS, "Staff Choose Divisi");
	}
	
	@And("Staff Choose Nama Shift")
	public void Staff_Choose_Nama_Shift() {
		HooksTMSAStaff.delay(3);
		absenSakitStaff.ClickNamaShift();
		extentTest.log(LogStatus.PASS, "Staff Choose Nama Shift");
	}
	@And("Staff Select Tipe Absen")
	public void Staff_Select_Tipe_Absen() {
		HooksTMSAStaff.delay(3);
		absenSakitStaff.ClickBtnTipeAbsen("WFH");
		extentTest.log(LogStatus.PASS, "Staff Select Tipe Absen");
	}
	@And("Staff Input Keterangan")
	public void Staff_Input_Keterangan() {
		HooksTMSAStaff.delay(3);
		absenSakitStaff.InputKeterangan("Sedang demam, batuk, dan flu berat");
		extentTest.log(LogStatus.PASS, "Staff Input Keterangan");
	}
	
	@Then ("Click Submit")
	public void Click_submit() {
		HooksTMSAStaff.delay(2);
		absenSakitStaff.submit();
		HooksTMSAStaff.delay(3);
		assertEquals(absenSakitStaff.alert(), "Input Result");
		extentTest.log(LogStatus.PASS, "Click Submit");
	}
	@When("Staff Logout")
	public void Staff_Logout() {
		absenSakitStaff.logout();
		extentTest.log(LogStatus.PASS, "Staff Logout");
	}
	
	@Then("Staff back to login TMS")
	public void Admin_back_to_login_TMS() {
		HooksTMSAStaff.delay(2);
		String v = "DIKA";
		assertEquals(absenSakitStaff.gettextdika(), v);
		extentTest.log(LogStatus.PASS, "Staff back to login TMS");
	}
}