package com.juaracoding.PageObjectTMS.Staff;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utils.Constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestAbsenIzin {

	WebDriver driver;
	private AbsenIzinPage absenIzinPage = new AbsenIzinPage();
	private static ExtentTest extentest;

	public TestAbsenIzin() {
		driver = HooksTMSAStaff.driver;
		extentest = HooksTMSAStaff.extentTest;
	}
	
	@When("Staff go to web ptdika")
	public void staff_go_to_web_ptdika() {
		driver.get(Constants.URL);
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff go to web ptdika");
	}
	
	@And("Staff enter own nik and password")
	public void staff_enter_own_nik_and_password() {
		absenIzinPage.staffLogin("D6190873", "2001-07-21");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff enter own nik and password");
	}
	
	@And("Staff click button login")
	public void staff_click_button_login() {
		absenIzinPage.clickBtnLogin();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff click button login");
	}
	
	@And("Staff click laporan kegiatan")
	public void staff_click_laporan_kegiatan() {
		absenIzinPage.clickLaporanKegiatan();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff click laporan kegiatan");
	}
	
	@And("Staff choose dan click absen izin")
	public void staff_choose_dan_click_absen_izin() {
		absenIzinPage.clickAbsenIzin();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff choose dan click absen izin");
	}
	
	@Then("Staff at form absen izin")
	public void staff_at_form_absen_izin() {
		assertEquals(absenIzinPage.getFormAbsenIzin(), "Absen Izin");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff at form absen izin");
	}
}
