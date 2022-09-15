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
	@Given("staff login website")
		public void staff_login_website() {
		driver.get(Constants.URL);
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "staff login website");
	}
	@When("input username and password")
	public void input_username_and_password() {
		HooksTMSAStaff.delay(2);
		absenmasuk.Inputnik("D6190873");
		absenmasuk.Inputpassword("2001-07-21");
		extentest.log(LogStatus.PASS, "input username and password");
	}
	@And ("klik button login")
	public void klik_button_login() {
		HooksTMSAStaff.delay(2);
		absenmasuk.btnsubmit();
		extentest.log(LogStatus.PASS, "klik button login");
	}
	@Then ("staff valid login")
	public void Staff_valid_login() {
		HooksTMSAStaff.delay(3);
		absenmasuk.GetDashboard();
		assertEquals(absenmasuk.GetDashboard(), "Dashboard");
		extentest.log(LogStatus.PASS, "staff valid login");
	}
	@When("staff click on tab laporan kegiatan")
	public void staff_click_on_tab_laporan_kegiatan() {
		HooksTMSAStaff.delay(3);
		absenmasuk.btnlaporan();
		extentest.log(LogStatus.PASS, "staff click on tab laporan kegiatan");
	}
	@And("click on absen masuk")
	public void click_on_absen_masuk() {
		HooksTMSAStaff.delay(3);
		absenmasuk.btnmasuk();
		extentest.log(LogStatus.PASS, "click on absen masuk");
	}
	@Then("staff valid on tab absen masuk")
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
}
