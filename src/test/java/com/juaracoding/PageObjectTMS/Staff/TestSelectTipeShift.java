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

public class TestSelectTipeShift {
	
	WebDriver driver;
	private SelectTipeShiftPage selectTipeShiftPage = new SelectTipeShiftPage();
	private static ExtentTest extentest;

	public TestSelectTipeShift() {
		driver = HooksTMSAStaff.driver;
		extentest = HooksTMSAStaff.extentTest;
	}
	
	@When("Staff go wo web ptdikaF1")
	public void staff_go_wo_web_ptdikaF1() {
		driver.get(Constants.URL);
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff go wo web ptdikaF1");
	}
	
	@And("Staff enter own nik passwordF1")
	public void staff_enter_own_nik_passwordF1() {
		selectTipeShiftPage.staffGoLogin("D6200927", "1997-10-23");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff enter own nik passwordF1");
	}
	
	@And("Staff click button loginF1")
	public void staff_click_button_loginF1() {
		selectTipeShiftPage.clickBtnLogin();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff click button loginF1");
	}
	
	@And("Staff click laporan kegiatanF1")
	public void staff_click_laporan_kegiatanF1() {
		selectTipeShiftPage.clickLaporanKegiatan();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff click laporan kegiatanF1");
	}
	
	@And("Staff choose and click absen izinF1")
	public void staff_choose_dan_click_absen_izinF1() {
		selectTipeShiftPage.clickAbsenIzin();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff choose and click absen izinF1");
	}
	
	@And("Staff upload fotoF1")
	public void staff_upload_fotoF1() {
		selectTipeShiftPage.getFile("C:\\Users\\girangsnm\\Downloads\\jpg.jpg");
		HooksTMSAStaff.delay(2);		
		extentest.log(LogStatus.PASS, "Staff upload fotoF1");
	}
	
	@And("Staff choose divisiF1")
	public void staff_choose_divisiF1() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(350,0)", "");
		selectTipeShiftPage.selectTipeShift();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff choose divisiF1");
	}
	
	@And("Staff click submitF1")
	public void staff_click_submitF1() {
		HooksTMSAStaff.delay(2);
		selectTipeShiftPage.clickButtonSubmit1();
		extentest.log(LogStatus.PASS, "Staff click submitF1");
	}
	
	@Then("Staff get alertF1")
	public void staff_get_alertF1() {
		assertEquals(selectTipeShiftPage.getRequiredTipeShift(), "true");
		extentest.log(LogStatus.PASS, "Staff get alertF1");
	}
	
	@When("Staff click call center1")
	public void staff_click_call_center1() {
		selectTipeShiftPage.selectTipeShift1();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff click call center1");
	}
	
	@Then("Tipe shift has choosenE5")
	public void tipe_shift_has_choosenE5() {
		assertEquals(selectTipeShiftPage.viewCallCenter1(), "option");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Tipe shift has choosenE5");
	}
	
	@When("Staff click call center2")
	public void staff_click_call_center2() {
		selectTipeShiftPage.selectTipeShift2();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff click call center2");
	}
	
	@Then("Tipe shift has choosenE6")
	public void tipe_shift_has_choosenE6() {
		assertEquals(selectTipeShiftPage.viewCallCenter2(), "option");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Tipe shift has choosenE6");
	}
}
