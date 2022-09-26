package com.juaracoding.PageObjectTMS.Staff.Nisa;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.juaracoding.PageObjectTMS.HooksTMS;
//import com.juaracoding.PageObjectTMS.Admin.HooksTMSAdmin;
//import com.juaracoding.PageObjectTMS.Staff.HooksTMSAStaff;
import com.juaracoding.PageObjectTMS.Staff.Nisa.AbsenOffStaff;
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
//		driver = HooksTMSAStaff.driver;
//		extentTest = HooksTMSAStaff.extentTest;
		driver = HooksTMS.driver;
		extentTest = HooksTMS.extentTest;
	}
	@Given("Staff Login Website")
		public void staff_login_website() {
		driver.get(Constants.URL);
//		HooksTMSAStaff.delay(3);
		HooksTMS.delay(2);
		extentTest.log(LogStatus.PASS, "Staff Login Website");
	}
	@When("Input Username and Password n")
	public void input_username_and_password() {
//		HooksTMSAStaff.delay(3);
		HooksTMS.delay(2);
		absenOffStaff.Inputnik("D6190873");
		absenOffStaff.Inputpassword("2001-07-21");
		extentTest.log(LogStatus.PASS, "Input Username and Password n");
	}
	
	@And ("Klik Btn Login n")
	public void klik_Btn_login() {
//		HooksTMSAStaff.delay(3);
		HooksTMS.delay(2);
		absenOffStaff.btnsubmit();
		extentTest.log(LogStatus.PASS, "Klik Btn Login n");
	}
	
	@Then ("Staff Valid Login Website n")
	public void Staff_valid_login_website() {
//		HooksTMSAStaff.delay(3);
		HooksTMS.delay(2);
		absenOffStaff.GetDashboard();
		assertEquals(absenOffStaff.GetDashboard(), "Dashboard");
		extentTest.log(LogStatus.PASS, "Staff Valid Login n");
	}
	
	@When("Tab Laporan Kegiatan n")
	public void staff_click_on_tab_laporan_kegiatan() {
//		HooksTMSAStaff.delay(3);
		HooksTMS.delay(2);
		absenOffStaff.btnlaporan();
		extentTest.log(LogStatus.PASS, "Staff Click On Tab Laporan Kegiatan n");
	}
	@And("Tab Absen Off n")
	public void click_on_absen_off() {
//		HooksTMSAStaff.delay(3);
		HooksTMS.delay(2);
		absenOffStaff.Btnoff();
		extentTest.log(LogStatus.PASS, "Click Tab Absen off n");
	}
	
//	@Then("Valid Absen Off")
//	public void Staff_Valid_On_Tab_Absen_Off() {
//		HooksTMSAStaff.delay(3);
//		absenOffStaff.GetDashboard();
//		assertEquals(absenOffStaff.GetDashboard(), "Absen Off");
//		extentTest.log(LogStatus.PASS, "Absen off");
//	}
	
	@Then("Staff Get Select File n")
	public void StaffGetSelectFile() {
		assertEquals(absenOffStaff.getSelectFile(), "true");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(2);
		extentTest.log(LogStatus.PASS, "Staff Get Select File n");
	}
	
	@When("Staff choose wrong file n")
	public void staff_choose_wrong_file() {
		absenOffStaff.ClickChooseFile("C:\\Users\\Xh\\Downloads\\tt.mp4");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(2);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(350,0)", "");
		extentTest.log(LogStatus.PASS, "Staff choose wrong file n");
	}
	
	@Then("Image Not show n")
	public void Image_Not_show() {
		assertEquals(absenOffStaff.noimg(), "img");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(2);
		extentTest.log(LogStatus.PASS, "Image Not show n");
	}

	@When("Staff Upload Foto Selfie n")
	public void Staff_Input_Upload_Foto_Selfie() { 
//		HooksTMSAStaff.delay(3);
		HooksTMS.delay(2);
		absenOffStaff.FileTrue("C:\\Users\\Xh\\Downloads\\se.png");
		extentTest.log(LogStatus.PASS, "Staff Upload Foto Selfie n");
	}
	
	@And("Click Submit n")
	public void Click_submit() {
//		HooksTMSAStaff.delay(3);
		HooksTMS.delay(2);
		absenOffStaff.submit();
//		HooksTMSAStaff.delay(3);
		HooksTMS.delay(2);
		extentTest.log(LogStatus.PASS, "Click Submit n");
	}
	
	@And("Not Divis n")
	public void NotDivis() {
//		HooksTMSAStaff.delay(3);
		HooksTMS.delay(2);
		assertEquals(absenOffStaff.NotDiv(),"false");
		extentTest.log(LogStatus.PASS,"Not Divis n");
	}
	
	@When("Choose Divisi n")
	public void Staff_Select_Divisi() {
//		HooksTMSAStaff.delay(3);
		HooksTMS.delay(2);
		absenOffStaff.btndivisi("Rent Car");
		extentTest.log(LogStatus.PASS, "Choose Divisi n");
	}
	
	@Then("No Choose Nama Shift n")
	public void StaffNotChooseNamaShift() {
//		HooksTMSAStaff.delay(3);
		HooksTMS.delay(2);
		assertEquals(absenOffStaff.ShiftNotChoose(),"false");
		extentTest.log(LogStatus.PASS, "No Choose Nama Shift n");
	}
	
	@When("Choose Nama Shift n")
	public void Choose_Nama_Shift() {
//		HooksTMSAStaff.delay(3);
		HooksTMS.delay(2);
		absenOffStaff.clickNamaShift();;
		extentTest.log(LogStatus.PASS, "Choose Nama Shift n");
	}
	
	@And("Click shift n")
	public void ClickShift() {
//		HooksTMSAStaff.delay(3);
		HooksTMS.delay(2);
		absenOffStaff.Namashift();
		extentTest.log(LogStatus.PASS, "Click Shift n");
	}
	
	@Then("Tipe absen kosong n")
	public void Tipeabsenkosong() {
//	HooksTMSAStaff.delay(3);
		HooksTMS.delay(2);
	assertEquals(absenOffStaff.NoTipeAbsen(),"");
	extentTest.log(LogStatus.PASS, "Tipe absen kosong n");
	}
	
	@When("Staff Choose Tipe Absen n")
	public void Staff_Choose_Tipe_Absen() {
//		HooksTMSAStaff.delay(3);
		HooksTMS.delay(2);
		absenOffStaff.btntipe("WFO");
		extentTest.log(LogStatus.PASS, "Staff Select Tipe Absen n");
	}
	
	@Then ("Null Keterangan n")
	public void NullKeterangan() {
//		HooksTMSAStaff.delay(3);
		HooksTMS.delay(2);
		assertEquals(absenOffStaff.Keterangankosong(),"");
		extentTest.log(LogStatus.PASS, "Staff Not Choose Nama Shift n");
	}
	
	@When("Input Keterangan n")
	public void Staff_Input_Keterangan() {
//		HooksTMSAStaff.delay(3);
		HooksTMS.delay(2);
		absenOffStaff.keterangan("SAYA SEDANG OFF HARI INI!!!");;
		extentTest.log(LogStatus.PASS, "Input keterangan n");
	}
	@Then("Get warning n")
	public void get_warning() {
		assertEquals(absenOffStaff.DataFailed(), "false");
//   	HooksTMSAStaff.delay(2);
		HooksTMS.delay(2);
		extentTest.log(LogStatus.PASS, "Get warning n");
	}
	
	@Then("Input data berhasil n")
	public void Inputdataberhasil() {
		assertEquals(absenOffStaff.Alert(), "Input Dataaa");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(2);
		extentTest.log(LogStatus.PASS, "Input data berhasil n");
	}
	
	@When("Logout Website n")
	public void Logout_Website() {
		absenOffStaff.logout();
		extentTest.log(LogStatus.PASS, "Staff Logout n");
	}
	
	@Then("Back To Login TMS n")
	public void Back_To_Login_TMS() {
//		HooksTMSAStaff.delay(3);
		HooksTMS.delay(2);
		String v = "DIKA";
		assertEquals(absenOffStaff.gettextdika(), v);
		extentTest.log(LogStatus.PASS, "Back To Login TMS n");
	}
}