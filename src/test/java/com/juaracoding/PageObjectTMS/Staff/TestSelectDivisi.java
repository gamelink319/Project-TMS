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

public class TestSelectDivisi {
	
	WebDriver driver;
	private SelectDivisiPage selectDivisiPage = new SelectDivisiPage();
	private static ExtentTest extentest;

	public TestSelectDivisi() {
		driver = HooksTMSAStaff.driver;
		extentest = HooksTMSAStaff.extentTest;
	}
	
	@When("Staff go wo web ptdikaE1")
	public void staff_go_wo_web_ptdikaE1() {
		driver.get(Constants.URL);
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff go wo web ptdikaE1");
	}
	
	@And("Staff enter own nik passwordE1")
	public void staff_enter_own_nik_passwordE1() {
		selectDivisiPage.staffGoLogin("D6200927", "1997-10-23");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff enter own nik passwordE1");
	}
	
	@And("Staff click button loginE1")
	public void staff_click_button_loginE1() {
		selectDivisiPage.clickBtnLogin();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff click button loginE1");
	}
	
	@And("Staff click laporan kegiatanE1")
	public void staff_click_laporan_kegiatanE1() {
		selectDivisiPage.clickLaporanKegiatan();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff click laporan kegiatanE1");
	}
	
	@And("Staff choose and click absen izinE1")
	public void staff_choose_dan_click_absen_izinE1() {
		selectDivisiPage.clickAbsenIzin();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff choose and click absen izinE1");
	}
	
	@And("Staff upload fotoE1")
	public void staff_upload_fotoE1() {
		selectDivisiPage.getFile("C:\\Users\\girangsnm\\Downloads\\jpg.jpg");
		HooksTMSAStaff.delay(2);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(350,0)", "");
		extentest.log(LogStatus.PASS, "Staff upload fotoE1");
	}
	
	@And("Staff click button submitE1")
	public void staff_click_button_submitE1() {
		selectDivisiPage.clickButtonSubmit1();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff click button submitE1");
	}
	
	@Then("Staff get alertE1")
	public void staff_get_alertE1() {
		selectDivisiPage.getTxtRequired();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff get alertE1");
	}
	
	@When("Staff choose attraction")
	public void staff_choose_attraction() {
		selectDivisiPage.selectDivisi1();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff choose attraction");
	}
	
	@Then("Division has choosenE2")
	public void division_has_choosenE2() {
		assertEquals(selectDivisiPage.viewAttraction(), "option");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Division has choosenE2");
	}
	
	@When("Staff choose rent car")
	public void staff_choose_rent_car() {
		selectDivisiPage.selectDivisi2();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff choose rent car");
	}
	
	@Then("Division has choosenE3")
	public void division_has_choosenE3() {
		assertEquals(selectDivisiPage.viewRentCar(), "option");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Division has choosenE3");
	}
	
	@When("Staff choose call center")
	public void staff_choose_call_center() {
		selectDivisiPage.selectDivisi3();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff choose call center");
	}
	
	@Then("Division has choosen and showing tipe shift")
	public void division_has_choosen_and_showing_tipe_shift() {
		assertEquals(selectDivisiPage.viewTipeShift(), "Tipe Shift");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Division has choosen and showing tipe shift");
	}
	
}
