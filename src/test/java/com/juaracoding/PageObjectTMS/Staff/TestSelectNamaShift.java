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

public class TestSelectNamaShift {
	
	WebDriver driver;
	private SelectNamaShiftPage selectNamaShiftPage = new SelectNamaShiftPage();
	private static ExtentTest extentest;

	public TestSelectNamaShift() {
		driver = HooksTMSAStaff.driver;
		extentest = HooksTMSAStaff.extentTest;
	}
	
	@When("Staff go wo web ptdikaG1")
	public void staff_go_wo_web_ptdikaF1() {
		driver.get(Constants.URL);
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff go wo web ptdikaF1");
	}
	
	@And("Staff enter own nik passwordG1")
	public void staff_enter_own_nik_passwordG1() {
		selectNamaShiftPage.staffGoLogin("D6200927", "1997-10-23");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff enter own nik passwordG1");
	}
	
	@And("Staff click button loginG1")
	public void staff_click_button_loginG1() {
		selectNamaShiftPage.clickBtnLogin();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff click button loginG1");
	}
	
	@And("Staff click laporan kegiatanG1")
	public void staff_click_laporan_kegiatanG1() {
		selectNamaShiftPage.clickLaporanKegiatan();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff click laporan kegiatanG1");
	}
	
	@And("Staff choose and click absen izinG1")
	public void staff_choose_dan_click_absen_izinG1() {
		selectNamaShiftPage.clickAbsenIzin();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff choose and click absen izinG1");
	}
	
	@And("Staff upload fotoG1")
	public void staff_upload_fotoG1() {
		selectNamaShiftPage.getFile("C:\\Users\\girangsnm\\Downloads\\jpg.jpg");
		HooksTMSAStaff.delay(2);		
		extentest.log(LogStatus.PASS, "Staff upload fotoG1");
	}
	
	@And("Staff choose divisiG1")
	public void staff_choose_divisiG1() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(350,0)", "");
		selectNamaShiftPage.selectTipeShift();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff choose divisiG1");
	}
	
	@And("Staff click submitG1")
	public void staff_click_submitG1() {
		HooksTMSAStaff.delay(2);
		selectNamaShiftPage.clickButtonSubmit1();
		extentest.log(LogStatus.PASS, "Staff click submitG1");
	}
	
	@Then("Staff get alertG1")
	public void staff_get_alertG1() {
		assertEquals(selectNamaShiftPage.getRequiredNamaShift(), "div");
		extentest.log(LogStatus.PASS, "Staff get alertG1");
	}
	
	@When("Staff click box name shift")
	public void staff_click_box_name_shift() {
		selectNamaShiftPage.clickButtonNameShiftNamaShift();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff click box name shift");
	}
	
	@And("Staff choose non shift")
	public void staff_choose_non_shift() {
		selectNamaShiftPage.selectNamaShift();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff choose non shift");
	}
	
	@Then("Nama shift has choosenG2")
	public void nama_shift_has_choosenG2() {
		assertEquals(selectNamaShiftPage.getNonShift(), "a");
		extentest.log(LogStatus.PASS, "Nama shift has choosenG2");
	}

}
