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

public class TestLaporanTMS {
	
	WebDriver driver;
	private LaporanPage laporanKegiatanStaffPage = new LaporanPage();
	private static ExtentTest extentest;

	public TestLaporanTMS() {
		driver = HooksTMSAStaff.driver;
		extentest = HooksTMSAStaff.extentTest;
	}

	@When("Staff go to web ptdika")
	public void staff_go_to_web_ptdika1() {
		driver.get(Constants.URL);
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff go to web ptdikaA1");
	}

	@And("Staff enter password")
	public void staff_enter_password() {
		laporanKegiatanStaffPage.login1("hallo");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff enter password");
	}

	@And("Staff enter nik")
	public void staff_enter_nik() {
		laporanKegiatanStaffPage.login2("hallo");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff enter nik");
	}
	
	@And("Staff enter NIK password invalid")
	public void staff_enter_nik_password_invalid() {
		laporanKegiatanStaffPage.login3("hallo", "hallo");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff enter NIK password invalid");
	}
	
	@And("Staff enter NIK password valid")
	public void staff_enter_nik_password_valid() {
		laporanKegiatanStaffPage.login4("D6200183", "1995-03-27");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff enter NIK password valid");
	}

	@And("Staff click button login")
	public void staff_click_button_login1() {
		laporanKegiatanStaffPage.clickLogin1();
		extentest.log(LogStatus.PASS, "Staff click button loginA1");
	}

	@Then("Staff invalid loginA1")
	public void staff_invalid_login1() {
		assertEquals(laporanKegiatanStaffPage.getNIKRequired(), "false");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff invalid loginA1");
	}

	@Then("Staff invalid loginA2")
	public void staff_invalid_login2() {
		assertEquals(laporanKegiatanStaffPage.getPasswordRequired(), "flase");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff invalid loginA2");
	}
		
	@Then("Staff invalid loginA3")
	public void staff_invalid_login3() {
		assertEquals(laporanKegiatanStaffPage.getWrongMsg(), "Wrong username or password..!");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff invalid loginA3");
	}	

	@Then("Staff valid login")
	public void staff_valid_login() {
		HooksTMSAStaff.delay(2);
		assertEquals(laporanKegiatanStaffPage.getDashboard(), "Dashboard");
		extentest.log(LogStatus.PASS, "Staff valid login");
	}
	
	@And("Staff click laporan kegiatan")
	public void staff_click_laporan_kegiatan() {
		laporanKegiatanStaffPage.clickLaporanKegiatan();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff click laporan kegiatan");
	}
	
	@And("Staff choose dan click absen izin")
	public void staff_choose_dan_click_absen_izin() {
		laporanKegiatanStaffPage.clickAbsenIzin();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff choose dan click absen izin");
	}
	
	@Then("Staff at form absen izin")
	public void staff_at_form_absen_izin() {
		assertEquals(laporanKegiatanStaffPage.getFormAbsenIzin(), "Absen Izin");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff at form absen izin");
	}
	
	@Then("Staff see button choose")
	public void staff_see_button_choose() {
		assertEquals(laporanKegiatanStaffPage.getUploadFile(), "Upload Foto Selfie : *");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff see button choose");
	}
	
	@Then("Staff see select box divisi")
	public void staff_see_select_box_divisi() {
		HooksTMSAStaff.delay(2);
		assertEquals(laporanKegiatanStaffPage.getSelectDivisi(), "Divisi");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,350)","");
		extentest.log(LogStatus.PASS, "Staff see select box divisi");
	}
	
	@Then("Staff see select box nama shift")
	public void staff_see_select_box_nama_shift() {
		assertEquals(laporanKegiatanStaffPage.getSelectNamaShift(), "Nama Shift");
		extentest.log(LogStatus.PASS, "Staff see select box nama shift");
	}
	
	@Then("Staff see select box type absen")
	public void staff_see_select_box_type_absen() {
		assertEquals(laporanKegiatanStaffPage.getSelectAbsen(), "Tipe Absen");
		extentest.log(LogStatus.PASS, "Staff see select box type absen");
	}
	
	@Then("Staff see text area keterangan")
	public void staff_see_text_area_keterangan() {
		assertEquals(laporanKegiatanStaffPage.getColoumnText(), "Isi Keterangan di bawah ini !");
		extentest.log(LogStatus.PASS, "Staff see text area keterangan");
	}
	
	@Then("Staff see button submit")
	public void staff_see_button_submit() {
		assertEquals(laporanKegiatanStaffPage.getButtonSubmit(), "input");
		extentest.log(LogStatus.PASS, "Staff see button submit");
	}
	
	@And("Staff clik submit")
	public void staff_clik_submit() {
		HooksTMSAStaff.delay(2);
		laporanKegiatanStaffPage.clickButtonSubmit();
	}
	
	@Then("Staff get required from btn choose file")
	public void staff_get_required_from_btn_choose_file() {
		assertEquals(laporanKegiatanStaffPage.getPleaseSelectFileD1(), "false");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff get required from btn choose file");
	}

	@When("Staff choose file1")
	public void staff_choose_file1() {
		laporanKegiatanStaffPage.getFile1("C:\\Users\\girangsnm\\Downloads\\bmp.bmp");
		HooksTMSAStaff.delay(2);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(350,0)", "");
		extentest.log(LogStatus.PASS, "Staff choose file1");
	}

	@Then("image not shown")
	public void image_not_shown() {
		assertEquals(laporanKegiatanStaffPage.imageNotShown(), "false");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff get attributeD1");
	}

	@When("Staff choose file2")
	public void staff_choose_file2() {
		laporanKegiatanStaffPage.getFile2("D:\\foto\\download.jpg");
		HooksTMSAStaff.delay(2);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(350,0)", "");
		extentest.log(LogStatus.PASS, "Staff choose file2");
	}
	
	@Then("image preview")
	public void image_preview() {
		assertEquals(laporanKegiatanStaffPage.imageShown(), "img");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "image preview");
	}
	
	@Then("Staff get required from selct box divisi")
	public void staff_get_required_from_select_box_divisi() {
		assertEquals(laporanKegiatanStaffPage.getTxtRequiredFromDivisi(), "false");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff get required from selct box divisi");
	}
	
	@When("Staff choose attraction")
	public void staff_choose_attraction() {
		laporanKegiatanStaffPage.selectDivisi1();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff choose attraction");
	}
	
	@Then("Division has choosen attraction")
	public void division_has_choosen_attraction() {
		assertEquals(laporanKegiatanStaffPage.viewAttraction(), "option");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Division has choosen attraction");
	}
	
	@When("Staff choose rent car")
	public void staff_choose_rent_car() {
		laporanKegiatanStaffPage.selectDivisi2();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff choose rent car");
	}
	
	@Then("Division has choosen rent car")
	public void division_has_choosen_rent_car() {
		assertEquals(laporanKegiatanStaffPage.viewRentCar(), "option");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Division has choosen rent car");
	}
	
	@When("Staff choose call center")
	public void staff_choose_call_center() {
		laporanKegiatanStaffPage.selectDivisi3();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff choose call center");
	}
	
	@Then("Division has choosen and showing tipe shift")
	public void division_has_choosen_and_showing_tipe_shift() {
		assertEquals(laporanKegiatanStaffPage.viewTipeShift(), "Tipe Shift");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Division has choosen and showing tipe shift");
	}
	
	@Then("Staff get alert from select box tipe shift")
	public void staff_get_alert_from_select_box_tipe_shift() {
		assertEquals(laporanKegiatanStaffPage.getRequiredFromTipeShift(), "false");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff get alert from select box tipe shift");
	}
	
	@When("Staff click call center 1")
	public void staff_click_call_center_1() {
		laporanKegiatanStaffPage.selectTipeShift1();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff click call center 1");
	}
	
	@Then("Tipe shift has choosen call center 1")
	public void tipe_shift_has_choosen_call_center_1() {
		assertEquals(laporanKegiatanStaffPage.viewCallCenter1(), "option");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Tipe shift has choosen call center 1");
	}
	
	@When("Staff click call center 2")
	public void staff_click_call_center_2() {
		laporanKegiatanStaffPage.selectTipeShift2();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff click call center 2");
	}
	
	@Then("Tipe shift has choosen call center 2")
	public void tipe_shift_has_choosen_call_center_2() {
		assertEquals(laporanKegiatanStaffPage.viewCallCenter2(), "option");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Tipe shift has choosen call center 2");
	}
	
	@Then("Staff get stack name shift")
	public void staff_get_stack_name_shift() {
		assertEquals(laporanKegiatanStaffPage.getRequiredFromNamaShift(), "false");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff get stack name shift");
	}
	
	@When("Staff click select box name shift")
	public void staff_click_select_box_name_shift() {
		laporanKegiatanStaffPage.clickButtonNameShift1();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff click select box name shift");
	}
	
	@And("Staff choose non shift")
	public void staff_choose_non_shiftG2() {
		laporanKegiatanStaffPage.selectNamaShift();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff choose non shiftG2");
	}
	
	@Then("Non shift has choosen")
	public void non_shift_has_choosen() {
		assertEquals(laporanKegiatanStaffPage.getNonShift(), "a");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Nama shift has choosen");
	}	
	
	@And("Staff choose D1")
	public void staff_choose_d1() {
		laporanKegiatanStaffPage.selectD1();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff choose D1");
	}
	
	@Then("D1 has choosen")
	public void d1_has_choosen() {
		assertEquals(laporanKegiatanStaffPage.getD1(), "div");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "D1 has choosen");
	}
	
	@And("Staff choose D2")
	public void staff_choose_d2() {
		laporanKegiatanStaffPage.selectD2();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff choose D2");
	}
	
	@Then("D2 has choosen")
	public void d2_has_choosen() {
		assertEquals(laporanKegiatanStaffPage.getD2(), "div");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "D2 has choosen");
	}
	
	@And("Staff choose D3")
	public void staff_choose_d3() {
		laporanKegiatanStaffPage.selectD3();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff choose D3");
	}
	
	@Then("D3 has choosen")
	public void d3_has_choosen() {
		assertEquals(laporanKegiatanStaffPage.getD3(), "div");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "D3 has choosen");
	}
	
	@And("Staff choose senin pagi")
	public void staff_choose_senin_pagi() {
		laporanKegiatanStaffPage.selectSeninPagi();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff choose senin pagi");
	}
	
	@Then("Senin pagi has choosen")
	public void senin_pagi_has_choosen() {
		assertEquals(laporanKegiatanStaffPage.getSeninPagi(), "div");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Senin pagi has choosen");
	}
	
	@And("Staff choose senin middle")
	public void staff_choose_senin_middle() {
		laporanKegiatanStaffPage.selectSeninMiddle();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff choose senin middle");
	}
	
	@Then("Senin middle has choosen")
	public void senin_middle_has_choosen() {
		assertEquals(laporanKegiatanStaffPage.getSeninMiddle(), "div");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Senin middle has choosen");
	}
	
	@And("Staff choose senin siang")
	public void staff_choose_senin_siang() {
		laporanKegiatanStaffPage.selectSeninSiang();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff choose senin siang");
	}
	
	@Then("Senin siang has choosen")
	public void senin_siang_has_choosen() {
		assertEquals(laporanKegiatanStaffPage.getSeninSiang(), "div");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Senin siang has choosen");
	}
	
	@Then("Staff get required from select box tipe absen")
	public void staff_get_required_from_select_box_tipe_absen() {
		assertEquals(laporanKegiatanStaffPage.getRequiredTxtPleaseSelect(), "false");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff get required from select box tipe absen");
	}
	
	@When("Staff click WFH")
	public void staff_click_wfh() {
		laporanKegiatanStaffPage.selectTipeWFH();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff click WFH");
	}
	
	@Then("WFH has choosen")
	public void wfh_has_choosen() {
		assertEquals(laporanKegiatanStaffPage.viewWFH(), "option");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "WFH has choosen");
	}
	
	@When("Staff click WFO")
	public void staff_click_wfo() {
		laporanKegiatanStaffPage.selectTipeWFO();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff click WFO");
	}
	
	@Then("WFO has choosen")
	public void wfo_has_choosen() {
		assertEquals(laporanKegiatanStaffPage.viewWFO(), "option");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "WFO has choosen");
	}
	
	@Then("Staff get required from text area")
	public void staff_get_required_from_text_area() {
		assertEquals(laporanKegiatanStaffPage.getTxtPleaseFillOut(), "false");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff get required from text area");
	}
	
	@When("Staff fill in text")
	public void staff_fill_in_text() {
		laporanKegiatanStaffPage.inputTextArea("Berhalangan hadir dikarenakan ada kegiatan dikampung");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff fill in text");
	}
	
	@Then("Text area has been filled")
	public void text_area_has_been_filled() {
		assertEquals(laporanKegiatanStaffPage.viewTextHasFilled(), "textarea");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Text area has been filled");
	}
	
	@Then("Get warning sentence")
	public void get_warning_sentence() {
		assertEquals(laporanKegiatanStaffPage.dataFailedTosend(), false);
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Get warning sentence");
	}	
	
	@Then("Success input data")
	public void success_input_data() {
		assertEquals(laporanKegiatanStaffPage.dataFailedTosend(), false);
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Success input data");
	}	
	
	@And("Staff click logout pada navbar")
	public void staff_click_logout_pada_navbar() {
		laporanKegiatanStaffPage.clickBtnNavLogout();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff click logout pada navbar");
	}

	@Then("Staff masuk ke halaman sign in")
	public void staff_masuk_ke_halaman_sign_in() {
		assertEquals(laporanKegiatanStaffPage.getPageSign1(), "DIKA");
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff masuk ke halaman sign in");
	}

	@And("Staff click profil")
	public void staff_click_profil() {
		laporanKegiatanStaffPage.cekProfill();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff click profil");
	}

	@And("Staff click logout pada profil")
	public void staff_click_logout_pada_profil() {
		laporanKegiatanStaffPage.clickBtnLogoutProfill();
		HooksTMSAStaff.delay(2);
		extentest.log(LogStatus.PASS, "Staff click logout pada profil");
	}

}
