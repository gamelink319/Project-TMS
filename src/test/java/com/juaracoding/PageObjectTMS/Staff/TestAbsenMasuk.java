package com.juaracoding.PageObjectTMS.Staff;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import static org.testng.Assert.assertEquals;
import com.relevantcodes.extentreports.LogStatus;
import Utils.Constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.juaracoding.PageObjectTMS.Staff.Rifky.AbsenMasuk;

public class TestAbsenMasuk {
	
	private 
	WebDriver driver;
	private AbsenMasuk absenmasuk = new AbsenMasuk();
	private static ExtentTest extentest;

	public TestAbsenMasuk() {
		driver = HooksTMSAStaff.driver;
		extentest = HooksTMSAStaff.extentTest;
	}
	@Given("Staff login website")
		public void staff_login_website() {
		driver.get(Constants.URL);
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "staff login website");
	}
	@When("Input username and password")
	public void input_username_and_password() {
		HooksTMSAStaff.delay(2);
		absenmasuk.Inputnik("D6190873");
		absenmasuk.Inputpassword("2001-07-21");
		extentest.log(LogStatus.PASS, "input username and password");
	}
	@And ("Klik button login")
	public void klik_button_login() {
		HooksTMSAStaff.delay(2);
		absenmasuk.btnsubmit();
		extentest.log(LogStatus.PASS, "klik button login");
	}
	@Then ("Staff valid login")
	public void Staff_valid_login() {
		HooksTMSAStaff.delay(3);
		absenmasuk.GetDashboard();
		assertEquals(absenmasuk.GetDashboard(), "Dashboard");
		extentest.log(LogStatus.PASS, "staff valid login");
	}
	@When("Staff click on tab laporan kegiatan")
	public void staff_click_on_tab_laporan_kegiatan() {
		HooksTMSAStaff.delay(3);
		absenmasuk.btnlaporan();
		extentest.log(LogStatus.PASS, "staff click on tab laporan kegiatan");
	}
	@And("Click on absen masuk")
	public void click_on_absen_masuk() {
		HooksTMSAStaff.delay(3);
		absenmasuk.btnmasuk();
		extentest.log(LogStatus.PASS, "click on absen masuk");
	}
	@Then("Staff valid on tab absen masuk")
	public void staff_valid_on_tab_absen_masuk() {
		HooksTMSAStaff.delay(3);
		absenmasuk.GetDashboard();
		assertEquals(absenmasuk.GetDashboard(), "Absen Masuk");
		extentest.log(LogStatus.PASS, "Absen Masuk");
	}
	@When("Staff Input Upload Foto Selfie")
	public void Staff_Input_Upload_Foto_Selfie() {
		HooksTMSAStaff.delay(3);
		absenmasuk.btnfile1();
		extentest.log(LogStatus.PASS, "Staff Input Upload Foto Selfie");
	}
	@And("Staff Select Divisi")
	public void Staff_Select_Divisi() {
		HooksTMSAStaff.delay(3);
		absenmasuk.btndivisi("Call Center");;
		extentest.log(LogStatus.PASS, "Staff Select Divisi");
	}
	@And("Staff Select Tipe Shift")
	public void Staff_Select_Tipe_Shift() {
		HooksTMSAStaff.delay(3);
		absenmasuk.btnshift("Call Center 1");
		HooksTMSAStaff.scroll(300);
		extentest.log(LogStatus.PASS, "Staff Select Shift");
	}
	@And("Staff Select Nama Shift")
	public void Staff_Select_Nama_Shift() {
		HooksTMSAStaff.delay(3);
		absenmasuk.btnnamashift();
		extentest.log(LogStatus.PASS, "Staff Select Nama Shift");
	}
	@And("Staff select Tipe Absen")
	public void Staff_select_Tipe_Absen() {
		HooksTMSAStaff.delay(3);
		absenmasuk.btntipe("WFH");
		extentest.log(LogStatus.PASS, "Staff Select Tipe Absen");
	}
	@And("Staff Input Keterangan")
	public void Staff_Input_Keterangan() {
		HooksTMSAStaff.delay(3);
		absenmasuk.keterangan();
		extentest.log(LogStatus.PASS, "Staff Select Tipe Absen");
	}
	@Then ("Click submit")
	public void Click_submit() {
		HooksTMSAStaff.delay(3);
		absenmasuk.submit();
		HooksTMSAStaff.delay(3);
		assertEquals(absenmasuk.alert(), "Input Result");
		extentest.log(LogStatus.PASS, "Click Submit");
	}
	
	// absen pulang

	@When("Staff click on tab laporan kegiatan Two")
	public void staff_click_on_tab_laporan_kegiatan_Two() {
		HooksTMSAStaff.delay(3);
		absenmasuk.Inputlaporan();
		extentest.log(LogStatus.PASS, "staff click on tab laporan kegiatan");
	}
	@And("Click on absen pulang")
	public void click_on_absen_pulang() {
		HooksTMSAStaff.delay(3);
		absenmasuk.btnpulang();
		extentest.log(LogStatus.PASS, "click on absen pulang");
	}
	@When("Staff valid on tab absen pulang")
	public void staff_valid_on_tab_absen_pulang() {
		HooksTMSAStaff.delay(3);
		absenmasuk.GetDashboard();
		assertEquals(absenmasuk.GetDashboard(), "Absen Pulang");
		extentest.log(LogStatus.PASS, "Absen Pulang");
	}
	@And("Staff Input Upload Foto Selfie pulang")
	public void Staff_Input_Upload_Foto_Selfie_pulang() {
		HooksTMSAStaff.delay(3);
		absenmasuk.btnfile2();
		extentest.log(LogStatus.PASS, "Staff Input Upload Foto Selfie");
	}
	@And("Staff Select Divisi pulang")
	public void Staff_Select_Divisi_pulang() {
		HooksTMSAStaff.delay(3);
		absenmasuk.Inputdivisi("Call Center");;
		extentest.log(LogStatus.PASS, "Staff Select Divisi");
	}
	@And("Staff Select Tipe Shift pulang")
	public void Staff_Select_Tipe_Shift_pulang() {
		HooksTMSAStaff.delay(3);
		absenmasuk.Inputshift("Call Center 1");
		HooksTMSAStaff.scroll(300);
		extentest.log(LogStatus.PASS, "Staff Select Shift");
	}
	@And("Staff Select Nama Shift pulang")
	public void Staff_Select_Nama_Shift_pulang() {
		HooksTMSAStaff.delay(3);
		absenmasuk.Inputnamashift();
		extentest.log(LogStatus.PASS, "Staff Select Nama Shift");
	}
	@And("Staff select Tipe Absen pulang")
	public void Staff_select_Tipe_Absen_pulang() {
		HooksTMSAStaff.delay(3);
		absenmasuk.Inputtipe("WFH");
		extentest.log(LogStatus.PASS, "Staff Select Tipe Absen");
	}
	@And("Staff Input Keterangan Pulang")
	public void Staff_Input_Keterangan_Pulang() {
		HooksTMSAStaff.delay(3);
		absenmasuk.Inputketerangan();
		extentest.log(LogStatus.PASS, "Staff Select Tipe Absen");
	}
	@Then ("Click submit")
	public void Click_submit_pulang() {
		HooksTMSAStaff.delay(3);
		absenmasuk.inputsubmit();
		HooksTMSAStaff.delay(3);
		assertEquals(absenmasuk.Inputalert(), "Input Result");
		extentest.log(LogStatus.PASS, "Click Submit");
	}

}
