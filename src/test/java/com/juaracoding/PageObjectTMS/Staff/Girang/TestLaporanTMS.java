package com.juaracoding.PageObjectTMS.Staff.Girang;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.juaracoding.PageObjectTMS.HooksTMS;
//import com.juaracoding.PageObjectTMS.Admin.HooksTMSAdmin;
//import com.juaracoding.PageObjectTMS.Staff.HooksTMSAStaff;
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
//		driver = HooksTMSAStaff.driver;
//		extentest = HooksTMSAStaff.extentTest;
//	}
		driver = HooksTMS.driver;
		extentest = HooksTMS.extentTest;
	}

	@When("Staff go to web ptdika g")
	public void staff_go_to_web_ptdika1() {
		driver.get(Constants.URL);
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff go to web ptdika g");
	}

	@And("Staff enter password g")
	public void staff_enter_password() {
		laporanKegiatanStaffPage.login1("hallo");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff enter password g");
	}

	@And("Staff enter nik g")
	public void staff_enter_nik() {
		laporanKegiatanStaffPage.login2("hallo");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff enter nik g");
	}
	
	@And("Staff enter NIK password invalid g")
	public void staff_enter_nik_password_invalid() {
		laporanKegiatanStaffPage.login3("hallo", "hallo");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff enter NIK password invalid g");
	}
	
	@And("Staff enter NIK password valid g")
	public void staff_enter_nik_password_valid() {
		laporanKegiatanStaffPage.login4("D6201031", "1994-10-02");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff enter NIK password valid g");
	}

	@And("Staff click button login g")
	public void staff_click_button_login1() {
		laporanKegiatanStaffPage.clickLogin1();
		extentest.log(LogStatus.PASS, "Staff click button loginA1 g");
	}

	@Then("Staff invalid loginA1 g")
	public void staff_invalid_login1() {
		assertEquals(laporanKegiatanStaffPage.getNIKRequired(), "false");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff invalid loginA1 g");
	}

	@Then("Staff invalid loginA2 g")
	public void staff_invalid_login2() {
		assertEquals(laporanKegiatanStaffPage.getPasswordRequired(), "flase");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff invalid loginA2 g");
	}
		
	@Then("Staff invalid loginA3 g")
	public void staff_invalid_login3() {
		assertEquals(laporanKegiatanStaffPage.getWrongMsg(), "Wrong username or password..!");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff invalid loginA3 g");
	}	

	@Then("Staff valid login g")
	public void staff_valid_login() {
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		assertEquals(laporanKegiatanStaffPage.getDashboard(), "Dashboard");
		extentest.log(LogStatus.PASS, "Staff valid login g");
	}
	
	@And("Staff click laporan kegiatan g")
	public void staff_click_laporan_kegiatan() {
		laporanKegiatanStaffPage.clickLaporanKegiatan();
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff click laporan kegiatan g");
	}
	
	@And("Staff choose dan click absen izin g")
	public void staff_choose_dan_click_absen_izin() {
		laporanKegiatanStaffPage.clickAbsenIzin();
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff choose dan click absen izin g");
	}
	
	@Then("Staff at form absen izin g")
	public void staff_at_form_absen_izin() {
		assertEquals(laporanKegiatanStaffPage.getFormAbsenIzin(), "Absen Izin");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff at form absen izin g");
	}
	
	@Then("Staff see button choose g")
	public void staff_see_button_choose() {
		assertEquals(laporanKegiatanStaffPage.getUploadFile(), "Upload Foto Selfie : *");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff see button choose g");
	}
	
	@Then("Staff see select box divisi g")
	public void staff_see_select_box_divisi() {
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		assertEquals(laporanKegiatanStaffPage.getSelectDivisi(), "Divisi");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,350)","");
		extentest.log(LogStatus.PASS, "Staff see select box divisi g");
	}
	
	@Then("Staff see select box nama shift g")
	public void staff_see_select_box_nama_shift() {
		assertEquals(laporanKegiatanStaffPage.getSelectNamaShift(), "Nama Shift");
		extentest.log(LogStatus.PASS, "Staff see select box nama shift g");
	}
	
	@Then("Staff see select box type absen g")
	public void staff_see_select_box_type_absen() {
		assertEquals(laporanKegiatanStaffPage.getSelectAbsen(), "Tipe Absen");
		extentest.log(LogStatus.PASS, "Staff see select box type absen g");
	}
	
	@Then("Staff see text area keterangan g")
	public void staff_see_text_area_keterangan() {
		assertEquals(laporanKegiatanStaffPage.getColoumnText(), "Isi Keterangan di bawah ini !");
		extentest.log(LogStatus.PASS, "Staff see text area keterangan g");
	}
	
	@Then("Staff see button submit g")
	public void staff_see_button_submit() {
		assertEquals(laporanKegiatanStaffPage.getButtonSubmit(), "input");
		extentest.log(LogStatus.PASS, "Staff see button submit g");
	}
	
	@And("Staff clik submit g")
	public void staff_clik_submit() {
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		laporanKegiatanStaffPage.clickButtonSubmit();
	}
	
	@Then("Staff get required from btn choose file g")
	public void staff_get_required_from_btn_choose_file() {
		assertEquals(laporanKegiatanStaffPage.getPleaseSelectFileD1(), "false");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff get required from btn choose file g");
	}

	@When("Staff choose file1 g")
	public void staff_choose_file1() {
		laporanKegiatanStaffPage.getFile1("C:\\Users\\Xh\\Downloads\\tt.mp4");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(350,0)", "");
		extentest.log(LogStatus.PASS, "Staff choose file1 g");
	}

	@Then("image not shown g")
	public void image_not_shown() {
		assertEquals(laporanKegiatanStaffPage.imageNotShown(), "false");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff get attributeD1 g");
	}

	@When("Staff choose file2 g")
	public void staff_choose_file2() {
		laporanKegiatanStaffPage.getFile2("C:\\Users\\Xh\\Downloads\\se.png");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(350,0)", "");
		extentest.log(LogStatus.PASS, "Staff choose file2 g");
	}
	
	@Then("image preview g")
	public void image_preview() {
		assertEquals(laporanKegiatanStaffPage.imageShown(), "img");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "image preview g");
	}
	
	@Then("Staff get required from selct box divisi g")
	public void staff_get_required_from_select_box_divisi() {
		assertEquals(laporanKegiatanStaffPage.getTxtRequiredFromDivisi(), "false");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff get required from selct box divisi g");
	}
	
	@When("Staff choose attraction g")
	public void staff_choose_attraction() {
		laporanKegiatanStaffPage.selectDivisi1();
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff choose attraction g");
	}
	
	@Then("Division has choosen attraction g")
	public void division_has_choosen_attraction() {
		assertEquals(laporanKegiatanStaffPage.viewAttraction(), "option");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Division has choosen attraction g");
	}
	
	@When("Staff choose rent car g")
	public void staff_choose_rent_car() {
		laporanKegiatanStaffPage.selectDivisi2();
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff choose rent car g");
	}
	
	@Then("Division has choosen rent car g")
	public void division_has_choosen_rent_car() {
		assertEquals(laporanKegiatanStaffPage.viewRentCar(), "option");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Division has choosen rent car g");
	}
	
	@When("Staff choose call center g")
	public void staff_choose_call_center() {
		laporanKegiatanStaffPage.selectDivisi3();
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff choose call center g");
	}
	
	@Then("Division has choosen and showing tipe shift g")
	public void division_has_choosen_and_showing_tipe_shift() {
		assertEquals(laporanKegiatanStaffPage.viewTipeShift(), "Tipe Shift");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Division has choosen and showing tipe shift g");
	}
	
	@Then("Staff get alert from select box tipe shift g")
	public void staff_get_alert_from_select_box_tipe_shift() {
		assertEquals(laporanKegiatanStaffPage.getRequiredFromTipeShift(), "false");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff get alert from select box tipe shift g");
	}
	
	@When("Staff click call center 1 g")
	public void staff_click_call_center_1() {
		laporanKegiatanStaffPage.selectTipeShift1();
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff click call center 1 g");
	}
	
	@Then("Tipe shift has choosen call center 1 g")
	public void tipe_shift_has_choosen_call_center_1() {
		assertEquals(laporanKegiatanStaffPage.viewCallCenter1(), "option");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Tipe shift has choosen call center 1 g");
	}
	
	@When("Staff click call center 2 g")
	public void staff_click_call_center_2() {
		laporanKegiatanStaffPage.selectTipeShift2();
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff click call center 2 g");
	}
	
	@Then("Tipe shift has choosen call center 2 g")
	public void tipe_shift_has_choosen_call_center_2() {
		assertEquals(laporanKegiatanStaffPage.viewCallCenter2(), "option");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Tipe shift has choosen call center 2 g");
	}
	
	@Then("Staff get stack name shift g")
	public void staff_get_stack_name_shift() {
		assertEquals(laporanKegiatanStaffPage.getRequiredFromNamaShift(), "false");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff get stack name shift g");
	}
	
	@When("Staff click select box name shift g")
	public void staff_click_select_box_name_shift() {
		laporanKegiatanStaffPage.clickButtonNameShift1();
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff click select box name shift g");
	}
	
	@And("Staff choose non shift g")
	public void staff_choose_non_shiftG2() {
		laporanKegiatanStaffPage.selectNamaShift();
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff choose non shiftG2 g");
	}
	
	@Then("Non shift has choosen g")
	public void non_shift_has_choosen() {
		assertEquals(laporanKegiatanStaffPage.getNonShift(), "a");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Nama shift has choosen g");
	}	
	
	@And("Staff choose D1 g")
	public void staff_choose_d1() {
		laporanKegiatanStaffPage.selectD1();
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff choose D1 g");
	}
	
	@Then("D1 has choosen g")
	public void d1_has_choosen() {
		assertEquals(laporanKegiatanStaffPage.getD1(), "div");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "D1 has choosen g");
	}
	
	@And("Staff choose D2 g")
	public void staff_choose_d2() {
		laporanKegiatanStaffPage.selectD2();
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff choose D2 g");
	}
	
	@Then("D2 has choosen g")
	public void d2_has_choosen() {
		assertEquals(laporanKegiatanStaffPage.getD2(), "div");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "D2 has choosen g");
	}
	
	@And("Staff choose D3 g")
	public void staff_choose_d3() {
		laporanKegiatanStaffPage.selectD3();
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff choose D3 g");
	}
	
	@Then("D3 has choosen g")
	public void d3_has_choosen() {
		assertEquals(laporanKegiatanStaffPage.getD3(), "div");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "D3 has choosen g");
	}
	
	@And("Staff choose senin pagi g")
	public void staff_choose_senin_pagi() {
		laporanKegiatanStaffPage.selectSeninPagi();
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff choose senin pagi g");
	}
	
	@Then("Senin pagi has choosen g")
	public void senin_pagi_has_choosen() {
		assertEquals(laporanKegiatanStaffPage.getSeninPagi(), "div");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Senin pagi has choosen g");
	}
	
	@And("Staff choose senin middle g")
	public void staff_choose_senin_middle() {
		laporanKegiatanStaffPage.selectSeninMiddle();
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff choose senin middle g");
	}
	
	@Then("Senin middle has choosen g")
	public void senin_middle_has_choosen() {
		assertEquals(laporanKegiatanStaffPage.getSeninMiddle(), "div");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Senin middle has choosen g");
	}
	
	@And("Staff choose senin siang g")
	public void staff_choose_senin_siang() {
		laporanKegiatanStaffPage.selectSeninSiang();
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff choose senin siang g");
	}
	
	@Then("Senin siang has choosen g")
	public void senin_siang_has_choosen() {
		assertEquals(laporanKegiatanStaffPage.getSeninSiang(), "div");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Senin siang has choosen g");
	}
	
	@Then("Staff get required from select box tipe absen g")
	public void staff_get_required_from_select_box_tipe_absen() {
		assertEquals(laporanKegiatanStaffPage.getRequiredTxtPleaseSelect(), "false");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff get required from select box tipe absen");
	}
	
	@When("Staff click WFH g")
	public void staff_click_wfh() {
		laporanKegiatanStaffPage.selectTipeWFH();
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff click WFH g");
	}
	
	@Then("WFH has choosen g")
	public void wfh_has_choosen() {
		assertEquals(laporanKegiatanStaffPage.viewWFH(), "option");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "WFH has choosen g");
	}
	
	@When("Staff click WFO g")
	public void staff_click_wfo() {
		laporanKegiatanStaffPage.selectTipeWFO();
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff click WFO g");
	}
	
	@Then("WFO has choosen g")
	public void wfo_has_choosen() {
		assertEquals(laporanKegiatanStaffPage.viewWFO(), "option");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "WFO has choosen g");
	}
	
	@Then("Staff get required from text area g")
	public void staff_get_required_from_text_area() {
		assertEquals(laporanKegiatanStaffPage.getTxtPleaseFillOut(), "false");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff get required from text area g");
	}
	
	@When("Staff fill in text g")
	public void staff_fill_in_text() {
		laporanKegiatanStaffPage.inputTextArea("Berhalangan hadir dikarenakan ada kegiatan dikampung");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff fill in text g");
	}
	
	@Then("Text area has been filled g")
	public void text_area_has_been_filled() {
		assertEquals(laporanKegiatanStaffPage.viewTextHasFilled(), "textarea");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Text area has been filled g");
	}
	
	@Then("Get warning sentence g")
	public void get_warning_sentence() {
		assertEquals(laporanKegiatanStaffPage.dataFailedTosend(), false);
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Get warning sentence g");
	}	
	
	@Then("Success input data g")
	public void success_input_data() {
		assertEquals(laporanKegiatanStaffPage.dataFailedTosend(), false);
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Success input data g");
	}	
	
	@And("Staff click logout pada navbar g")
	public void staff_click_logout_pada_navbar() {
		laporanKegiatanStaffPage.clickBtnNavLogout();
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff click logout pada navbar g");
	}

	@Then("Staff masuk ke halaman sign in g")
	public void staff_masuk_ke_halaman_sign_in() {
		assertEquals(laporanKegiatanStaffPage.getPageSign1(), "DIKA");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff masuk ke halaman sign in g");
	}

	@And("Staff click profil g")
	public void staff_click_profil() {
		laporanKegiatanStaffPage.cekProfill();
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff click profil g");
	}

	@And("Staff click logout pada profil g")
	public void staff_click_logout_pada_profil() {
		laporanKegiatanStaffPage.clickBtnLogoutProfill();
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff click logout pada profil g");
	}
//	@Then("D1 has choosen g")
//	public void d1_has_choosessn() {
//		assertEquals(laporanKegiatanStaffPage.getD1(), "div");
//		extentest.log(LogStatus.PASS, "D1 has choosen g");
//	}
}