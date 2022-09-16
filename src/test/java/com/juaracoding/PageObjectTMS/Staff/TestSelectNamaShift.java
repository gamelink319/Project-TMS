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
		selectNamaShiftPage.clickButtonNameShift1();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff click box name shift");
	}
	
	@And("Staff choose non shiftG2")
	public void staff_choose_non_shiftG2() {
		selectNamaShiftPage.selectNamaShift1();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff choose non shiftG2");
	}
	
	@Then("Nama shift has choosenG2")
	public void nama_shift_has_choosenG2() {
		assertEquals(selectNamaShiftPage.getNonShift1(), "a");
		extentest.log(LogStatus.PASS, "Nama shift has choosenG2");
	}
	
	@When("Staff click D1")
	public void staff_click_D1() {
		selectNamaShiftPage.clickButtonNameShift2();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff click D1");
	}
	
	@And("Staff choose non shiftG3")
	public void staff_choose_non_shiftG3() {
		selectNamaShiftPage.selectNamaShift2();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff choose non shiftG3");
	}
	
	@Then("Nama shift has choosenG3")
	public void nama_shift_has_choosenG3() {
		assertEquals(selectNamaShiftPage.getNonShift2(), "div");
		extentest.log(LogStatus.PASS, "Nama shift has choosenG3");
	}
	
	@When("Staff click D2")
	public void staff_click_D2() {
		selectNamaShiftPage.clickButtonNameShift3();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff click D2");
	}
	
	@And("Staff choose non shiftG4")
	public void staff_choose_non_shiftG4() {
		selectNamaShiftPage.selectNamaShift3();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff choose non shiftG4");
	}
	
	@Then("Nama shift has choosenG4")
	public void nama_shift_has_choosenG4() {
		assertEquals(selectNamaShiftPage.getNonShift3(), "div");
		extentest.log(LogStatus.PASS, "Nama shift has choosenG4");
	}
	
	@When("Staff click D3")
	public void staff_click_D3() {
		selectNamaShiftPage.clickButtonNameShift4();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff click D3");
	}
	
	@And("Staff choose non shiftG5")
	public void staff_choose_non_shiftG5() {
		selectNamaShiftPage.selectNamaShift4();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff choose non shiftG5");
	}
	
	@Then("Nama shift has choosenG5")
	public void nama_shift_has_choosenG5() {
		assertEquals(selectNamaShiftPage.getNonShift4(), "div");
		extentest.log(LogStatus.PASS, "Nama shift has choosenG5");
	}
	
	@When("Staff senin pagi")
	public void staff_senin_pagi() {
		selectNamaShiftPage.clickButtonNameShift5();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff senin pagi");
	}
	
	@And("Staff choose non shiftG6")
	public void staff_choose_non_shiftG6() {
		selectNamaShiftPage.selectNamaShift5();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff choose non shiftG6");
	}
	
	@Then("Nama shift has choosenG6")
	public void nama_shift_has_choosenG6() {
		assertEquals(selectNamaShiftPage.getNonShift5(), "div");
		extentest.log(LogStatus.PASS, "Nama shift has choosenG6");
	}
}
