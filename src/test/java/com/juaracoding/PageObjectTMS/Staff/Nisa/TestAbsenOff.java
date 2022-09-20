package com.juaracoding.PageObjectTMS.Staff.Nisa;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.juaracoding.PageObjectTMS.Staff.HooksTMSAStaff;
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
		absenOffStaff.Inputnik("D6190873");
		absenOffStaff.Inputpassword("2001-07-21");
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
	
//	@Then("Valid Absen Off")
//	public void Staff_Valid_On_Tab_Absen_Off() {
//		HooksTMSAStaff.delay(3);
//		absenOffStaff.GetDashboard();
//		assertEquals(absenOffStaff.GetDashboard(), "Absen Off");
//		extentTest.log(LogStatus.PASS, "Absen off");
//	}
	
	@Then("Staff Get Select File")
	public void StaffGetSelectFile() {
		assertEquals(absenOffStaff.getSelectFile(), "true");
		HooksTMSAStaff.delay(2);
		extentTest.log(LogStatus.PASS, "Staff Get Select File");
	}
	
	@When("Staff choose wrong file")
	public void staff_choose_wrong_file() {
		absenOffStaff.ClickChooseFile("D:\\icha\\Pictures\\Screenpresso\\2022-09-18_16h31_29.mp4");
		HooksTMSAStaff.delay(2);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(350,0)", "");
		extentTest.log(LogStatus.PASS, "Staff choose wrong file");
	}
	
	@Then("Image Not show")
	public void Image_Not_show() {
		assertEquals(absenOffStaff.noimg(), "img");
		HooksTMSAStaff.delay(2);
		extentTest.log(LogStatus.PASS, "");
	}

	@When("Staff Upload Foto Selfie")
	public void Staff_Input_Upload_Foto_Selfie() { 
		HooksTMSAStaff.delay(3);
		absenOffStaff.FileTrue("D:\\icha\\Pictures\\2017-05\\icon2 (1).jpg");
		extentTest.log(LogStatus.PASS, "Staff Upload Foto Selfie");
	}
	
	@And("Submit")
	public void Click_submit() {
		HooksTMSAStaff.delay(3);
		absenOffStaff.submit();
		HooksTMSAStaff.delay(3);
		extentTest.log(LogStatus.PASS, "Click Submit");
	}
	
	@And("Not Divis")
	public void NotDivis() {
		HooksTMSAStaff.delay(3);
		assertEquals(absenOffStaff.NotDiv(),"false");
		extentTest.log(LogStatus.PASS,"Not Divis");
	}
	
	@When("Choose Divisi")
	public void Staff_Select_Divisi() {
		HooksTMSAStaff.delay(3);
		absenOffStaff.btndivisi("Rent Car");
		extentTest.log(LogStatus.PASS, "Choose Divisi");
	}
	
	@Then("No Choose Nama Shift")
	public void StaffNotChooseNamaShift() {
		HooksTMSAStaff.delay(3);
		assertEquals(absenOffStaff.ShiftNotChoose(),"false");
		extentTest.log(LogStatus.PASS, "No Choose Nama Shift");
	}
	
	@When("Choose Nama Shift")
	public void Choose_Nama_Shift() {
		HooksTMSAStaff.delay(3);
		absenOffStaff.clickNamaShift();;
		extentTest.log(LogStatus.PASS, "Choose Nama Shift");
	}
	
	@And("Click shift")
	public void ClickShift() {
		HooksTMSAStaff.delay(3);
		absenOffStaff.Namashift();
		extentTest.log(LogStatus.PASS, "Click Shift");
	}
	
	@Then("Tipe absen kosong")
	public void Tipeabsenkosong() {
	HooksTMSAStaff.delay(3);
	assertEquals(absenOffStaff.NoTipeAbsen(),"");
	extentTest.log(LogStatus.PASS, "Tipe absen kosong");
	}
	
	@When("Staff Choose Tipe Absen")
	public void Staff_Choose_Tipe_Absen() {
		HooksTMSAStaff.delay(3);
		absenOffStaff.btntipe("WFO");
		extentTest.log(LogStatus.PASS, "Staff Select Tipe Absen");
	}
	
	@Then ("Null Keterangan")
	public void NullKeterangan() {
		HooksTMSAStaff.delay(3);
		assertEquals(absenOffStaff.Keterangankosong(),"");
		extentTest.log(LogStatus.PASS, "Staff Not Choose Nama Shift");
	}
	
	@When("Input Keterangan")
	public void Staff_Input_Keterangan() {
		HooksTMSAStaff.delay(3);
		absenOffStaff.keterangan("SAYA SEDANG OFF HARI INI!!!");;
		extentTest.log(LogStatus.PASS, "Input keterangan");
	}
	@Then("Get warning")
	public void get_warning() {
		assertEquals(absenOffStaff.DataFailed(), "false");
		HooksTMSAStaff.delay(2);
		extentTest.log(LogStatus.PASS, "Get warning");
	}
	
	@Then("Input data berhasil")
	public void Inputdataberhasil() {
		assertEquals(absenOffStaff.Alert(), "Input Dataaa");
		HooksTMSAStaff.delay(2);
		extentTest.log(LogStatus.PASS, "Input data berhasil");
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