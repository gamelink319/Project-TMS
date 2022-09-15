package com.juaracoding.PageObjectTMS.Staff;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
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
	
	@When("Staff go to web ptdikaC1")
	public void staff_go_to_web_ptdikac1() {
		driver.get(Constants.URL);
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff go to web ptdikaC1");
	}
	
	@And("Staff enter own nik and passwordC1")
	public void staff_enter_own_nik_and_passwordc1() {
		absenIzinPage.staffLogin("D6190873", "2001-07-21");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff enter own nik and passwordC1");
	}
	
	@And("Staff click button loginC1")
	public void staff_click_button_loginc1() {
		absenIzinPage.clickBtnLogin();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff click button loginC1");
	}
	
	@And("Staff click laporan kegiatanC1")
	public void staff_click_laporan_kegiatanc1() {
		absenIzinPage.clickLaporanKegiatan();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff click laporan kegiatanC1");
	}
	
	@And("Staff choose dan click absen izinC1")
	public void staff_choose_dan_click_absen_izinc1() {
		absenIzinPage.clickAbsenIzin();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff choose dan click absen izinC1");
	}
	
	@Then("Staff at form absen izin")
	public void staff_at_form_absen_izin() {
		assertEquals(absenIzinPage.getFormAbsenIzin(), "Absen Izin");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff at form absen izin");
	}
	
	@Then("Staff see button choose")
	public void staff_see_button_choose() {
		assertEquals(absenIzinPage.getUploadFile(), "Upload Foto Selfie : *");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff see button choose");
	}
	
	@Then("Staff see select box divisi")
	public void staff_see_select_box_divisi() {
		assertEquals(absenIzinPage.getSelectDivisi(), "Divisi");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,350)","");
		extentest.log(LogStatus.PASS, "Staff see select box divisi");
	}
	
	@Then("Staff see select box nama shift")
	public void staff_see_select_box_nama_shift() {
		assertEquals(absenIzinPage.getSelectNamaShift(), "Nama Shift");
		extentest.log(LogStatus.PASS, "Staff see select box nama shift");
	}
	
	@Then("Staff see select box type absen")
	public void staff_see_select_box_type_absen() {
		assertEquals(absenIzinPage.getSelectAbsen(), "Tipe Absen");
		extentest.log(LogStatus.PASS, "Staff see select box type absen");
	}
	
	@Then("Staff see text area keterangan")
	public void staff_see_text_area_keterangan() {
		assertEquals(absenIzinPage.getColoumnText(), "Isi Keterangan di bawah ini !");
		extentest.log(LogStatus.PASS, "Staff see text area keterangan");
	}
	
	@Then("Staff see button submit")
	public void staff_see_button_submit() {
		assertEquals(absenIzinPage.getButtonSubmit(), "true");
		extentest.log(LogStatus.PASS, "Staff see button submit");
	}
}
