package com.juaracoding.PageObjectTMS.Staff.rifki;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import static org.testng.Assert.assertEquals;
import com.relevantcodes.extentreports.LogStatus;
import Utils.Constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import com.juaracoding.PageObjectTMS.HooksTMS;
//import com.juaracoding.PageObjectTMS.Admin.HooksTMSAdmin;
//import com.juaracoding.PageObjectTMS.Staff.HooksTMSAStaff;
import com.juaracoding.PageObjectTMS.Staff.Rifki.AbsenMasuk;

public class TestAbsenMasuk {
	
	WebDriver driver;
	private AbsenMasuk absenmasuk = new AbsenMasuk();
	private static ExtentTest extentest;

	public TestAbsenMasuk() {
//		driver = HooksTMSAStaff.driver;
//		extentest = HooksTMSAStaff.extentTest;
//	}
		driver = HooksTMS.driver;
		extentest = HooksTMS.extentTest;
	}
	@Given("Staff Login Website r")
		public void staff_login_website() {
		driver.get(Constants.URL);
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(2);
		extentest.log(LogStatus.PASS, "Staff Login Website r");
	}
	@When("Input Username and Password r")
	public void input_username_and_password() {
//		HooksTMSAStaff.delay(1);
		HooksTMS.delay(2);
		absenmasuk.Inputnik("D6201031");
		absenmasuk.Inputpassword("1994-10-02");
		extentest.log(LogStatus.PASS, "Input Username and Password r");
	}
	@And ("Klik Btn Login r")
	public void klik_Btn_login() {
//		HooksTMSAStaff.delay(1);
		HooksTMS.delay(2);
		absenmasuk.btnsubmit();
		extentest.log(LogStatus.PASS, "Klik Btn Login r");
	}
	@Then ("Staff Valid Login r")
	public void Staff_valid_login() {
//		HooksTMSAStaff.delay(1);
		HooksTMS.delay(2);
		absenmasuk.GetDashboard();
		assertEquals(absenmasuk.GetDashboard(), "Dashboard");
		extentest.log(LogStatus.PASS, "Staff Valid Login r");
	}
	@When("Staff Click On Tab Laporan Kegiatan r")
	public void staff_click_on_tab_laporan_kegiatan() {
//		HooksTMSAStaff.delay(1);
		HooksTMS.delay(2);
		absenmasuk.btnlaporan();
		extentest.log(LogStatus.PASS, "Staff Click On Tab Laporan Kegiatan r");
	}
	@And("Click On Absen Masuk r")
	public void click_on_absen_masuk() {
//		HooksTMSAStaff.delay(1);
		HooksTMS.delay(2);
		absenmasuk.btnmasuk();
		extentest.log(LogStatus.PASS, "Click On Absen Masuk r");
	}
	@Then("Staff Valid On Tab Absen Masuk r")
	public void Staff_Valid_On_Tab_Absen_Masuk() {
//		HooksTMSAStaff.delay(1);
		HooksTMS.delay(2);
		absenmasuk.GetDashboard();
		assertEquals(absenmasuk.GetDashboard(), "Absen Masuk r");
		extentest.log(LogStatus.PASS, "Absen Masuk");
	}
	@When("Staff Input Upload Foto Selfie r")
	public void Staff_Input_Upload_Foto_Selfie() {
//		HooksTMSAStaff.delay(1);
		HooksTMS.delay(2);
		absenmasuk.btnfile1();
		extentest.log(LogStatus.PASS, "Staff Input Upload Foto Selfie r");
	}
	@And("Staff Select Divisi r")
	public void Staff_Select_Divisi() {
//		HooksTMSAStaff.delay(1);
		HooksTMS.delay(2);
		absenmasuk.btndivisi("Call Center");;
		extentest.log(LogStatus.PASS, "Staff Select Divisi r");
	}
	@And("Staff Select Tipe Shift r")
	public void Staff_Select_Tipe_Shift() {
//		HooksTMSAStaff.delay(1);
		HooksTMS.delay(2);
		absenmasuk.btnshift("Call Center 1");
//		HooksTMSAStaff.scroll(300);
		HooksTMS.scroll(300);
		extentest.log(LogStatus.PASS, "Staff Select Shift r");
	}
	@And("Staff Select Nama Shift r")
	public void Staff_Select_Nama_Shift() {
//		HooksTMSAStaff.delay(1);
		HooksTMS.delay(2);
		absenmasuk.btnnamashift();
		extentest.log(LogStatus.PASS, "Staff Select Nama Shift r");
	}
	@And("Staff select Tipe Absen r")
	public void Staff_select_Tipe_Absen() {
//		HooksTMSAStaff.delay(1);
		HooksTMS.delay(2);
		absenmasuk.btntipe("WFH");
		extentest.log(LogStatus.PASS, "Staff Select Tipe Absen r");
	}
	@And("Staff Input Keterangan r")
	public void Staff_Input_Keterangan() {
//		HooksTMSAStaff.delay(1);
		HooksTMS.delay(2);
		absenmasuk.keterangan();
		extentest.log(LogStatus.PASS, "Staff Select Tipe Absen r");
	}
	@Then ("Click Submit r")
	public void Click_submit() {
//		HooksTMSAStaff.delay(1);
		HooksTMS.delay(1);
		absenmasuk.submit();
//		HooksTMSAStaff.delay(1);
		HooksTMS.delay(1);
		assertEquals(absenmasuk.alert(), "Input Result");
		extentest.log(LogStatus.PASS, "Click Submit r");
	}
	
	// absen pulang

	@When("Staff Click On Tab Laporan Kegiatan Two r")
	public void staff_Click_On_Tab_Laporan_Kegiatan_Two() {
//		HooksTMSAStaff.delay(1);
		HooksTMS.delay(2);
		absenmasuk.Inputlaporan();
		extentest.log(LogStatus.PASS, "Staff Click On Tab Laporan Kegiatan r");
	}
	@And("Click On Absen Pulang r")
	public void Click_On_Absen_Pulang() {
//		HooksTMSAStaff.delay(1);
		HooksTMS.delay(2);
		absenmasuk.btnpulang();
		extentest.log(LogStatus.PASS, "Click On Absen Pulang r");
	}
	@When("Staff Valid On Tab Absen Pulang r")
	public void Staff_Valid_On_Tab_Absen_Pulang() {
//		HooksTMSAStaff.delay(1);
		HooksTMS.delay(2);
		absenmasuk.GetDashboard();
		assertEquals(absenmasuk.GetDashboard(), "Absen Pulang");
		extentest.log(LogStatus.PASS, "Staff Valid On Tab Absen Pulang r");
	}
	@And("Staff Select Divisi Pulang r")
	public void Staff_Select_Divisi_Pulang() {
	//	HooksTMSAStaff.delay(1);
		HooksTMS.delay(2);
		absenmasuk.Inputdivisi("Call Center");;
		extentest.log(LogStatus.PASS, "Staff Select Divisi Pulang r");
	}
	@And("Staff Select Tipe Shift Pulang r")
	public void Staff_Select_Tipe_Shift_Pulang() {
//		HooksTMSAStaff.delay(1);
		HooksTMS.delay(2);
		absenmasuk.Inputshift("Call Center 1");
//		HooksTMSAStaff.scroll(300);
		HooksTMS.scroll(300);
		extentest.log(LogStatus.PASS, "Staff Select Shift Pulang");
	}
	@And("Staff Select Nama Shift Pulang r")
	public void Staff_Select_Nama_Shift_Pulang() {
//		HooksTMSAStaff.delay(1);
		HooksTMS.delay(2);
		absenmasuk.Inputnamashift();
		extentest.log(LogStatus.PASS, "Staff Select Nama Shift Pulang r");
	}
	@And("Staff Select Tipe Absen Pulang r")
	public void Staff_select_Tipe_Absen_Pulang() {
//		HooksTMSAStaff.delay(1);
		HooksTMS.delay(2);
		absenmasuk.Inputtipe("WFH");
		extentest.log(LogStatus.PASS, "Staff Select Tipe Absen Pulang r");
	}
	@And("Staff Input Keterangan Pulang r")
	public void Staff_Input_Keterangan_Pulang() {
//		HooksTMSAStaff.delay(1);
		HooksTMS.delay(2);
		absenmasuk.Inputketerangan();
		extentest.log(LogStatus.PASS, "Staff Select Keterangan Pulang r");
	}
	@When("Staff Input Upload Foto Selfie Null r")
	public void Staff_Input_Upload_Foto_Selfie_Null() {
//		HooksTMSAStaff.delay(1);
		HooksTMS.delay(2);
		System.out.println("Selfie Null");
		extentest.log(LogStatus.PASS, "Staff Input Upload Foto Selfie Null r");
	}
	@And("Staff Select Divisi Null r")
	public void Staff_Select_Divisi_Null() {
//		HooksTMSAStaff.delay(1);
		HooksTMS.delay(2);
		System.out.println("Divisi Null");
		extentest.log(LogStatus.PASS, "Staff Select Divisi Null r");
	}
	@And("Staff Select Tipe Shift Null r")
	public void Staff_Tipe_Shift_Null() {
//		HooksTMSAStaff.delay(1);
		HooksTMS.delay(2);
		System.out.println("Tipe Shift Null");
		extentest.log(LogStatus.PASS, "Staff Select Tipe Shift Null r");
	}
	@And("Staff Select Nama Shift Null r")
	public void Staff_Select_tipe_Shift_Null() {
//		HooksTMSAStaff.delay(1);
		HooksTMS.delay(2);
		System.out.println("Nama Shift Null");
		extentest.log(LogStatus.PASS, "Staff Select Nama Shift Null r");
	}
	@And("Staff select Tipe Absen Null r")
	public void Staff_Select_tipe_Absen_Null() {
//		HooksTMSAStaff.delay(1);
		HooksTMS.delay(2);
		System.out.println("Tipe Absen Null");
		extentest.log(LogStatus.PASS, "Staff Select Tipe Absen Null r");
	}
	@And("Staff Input Keterangan Null r")
	public void Staff_Select_Input_Keterangan_Null() {
//		HooksTMSAStaff.delay(3);
		HooksTMS.delay(2);
		System.out.println("Input Keterangan Null");
		extentest.log(LogStatus.PASS, "Staff Input Keterangan Null r");
	}
	@Then("Click Submit FAIL r")
	public void Click_Submit_FAIL() {
//		HooksTMSAStaff.delay(3);
		HooksTMS.delay(2);
		absenmasuk.submit();
		assertEquals(absenmasuk.alert(), "Field * harus diisi");
		extentest.log(LogStatus.FAIL, "Click Submit FAIL r");
	}
	@And("Refresh Page r")
	public void Refresh_Page() {
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(2);
		driver.navigate().refresh();
		extentest.log(LogStatus.PASS, "Refresh Page r");
	}
}