package com.juaracoding.PageObjectTMS.Staff.Nisa;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.juaracoding.PageObjectTMS.HooksTMS;
//import com.juaracoding.PageObjectTMS.Admin.HooksTMSAdmin;
//import com.juaracoding.PageObjectTMS.Staff.HooksTMSAStaff;
import com.juaracoding.PageObjectTMS.Staff.Nisa.AbsenSakitStaff;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utils.Constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestAbsenSakitStaff {

	private 
	WebDriver driver;
	private AbsenSakitStaff absenSakitStaff = new AbsenSakitStaff();
	private static ExtentTest extentTest;
	
	public TestAbsenSakitStaff() {
//		driver = HooksTMSAStaff.driver;
//		extentTest = HooksTMSAStaff.extentTest;
//	}
		driver = HooksTMS.driver;
		extentTest = HooksTMS.extentTest;
	}
	@Given("Staff go to web TMS")
		public void StaffgotowebTMS() {
		driver.get(Constants.URL);
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentTest.log(LogStatus.PASS, "Staff Login Website");
	}
	@When("Staff Input Username and Password n1")
	public void Staff_Input_Username_and_Password() {
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		absenSakitStaff.inputnik("D6201031");
		absenSakitStaff.inputpassword("1994-10-02");
		extentTest.log(LogStatus.PASS, "Staff Input Username and Password n1");
	}

	@And ("Staff click button login n1")
	public void Staffclickbuttonlogin() {
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		absenSakitStaff.ButtonLogin();
		extentTest.log(LogStatus.PASS, "Staff click button login n1");
	}
	
	@Then ("Staff Valid Login n1")
	public void Staff_Valid_Login() {
///		HooksTMSAStaff.delay(3);
		HooksTMS.delay(1);
		absenSakitStaff.GetDashboard();
		assertEquals(absenSakitStaff.GetDashboard(), "Dashboard");
		extentTest.log(LogStatus.PASS, "Staff Valid Login n1");
	}
	
	@When("Click tab laporan kegiatan n1")
	public void Click_tab_laporan_kegiatan() {
//		HooksTMSAStaff.delay(3);
		HooksTMS.delay(1);
		absenSakitStaff.ClickLaporanKegiatan();
		extentTest.log(LogStatus.PASS, "Click tab laporan kegiatan n1");
	}
	@And("Click On Tab Absen Sakit n1")
	public void Click_On_Tab_Absen_Sakit() {
//		HooksTMSAStaff.delay(3);
		HooksTMS.delay(1);
		absenSakitStaff.ClickAbsnSakit();
		extentTest.log(LogStatus.PASS, "Click On Tab Absen Sakit n1");
	}
	
//	@Then("Staff Valid To Absen Sakit")
//	public void Staff_Valid_To_Absen_Sakit() {
//		HooksTMSAStaff.delay(3);
//		absenSakitStaff.GetDashboard();
//		assertEquals(absenSakitStaff.GetDashboard(), "Absen Sakit");
//		extentTest.log(LogStatus.PASS, "Absen Sakit");
//	}
	
	@Then("Staff get attributeD1 n1")
	public void staff_get_attributed1() {
		assertEquals(absenSakitStaff.getPleaseSelectFileD1(), "true");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentTest.log(LogStatus.PASS, "Staff get attributeD1 n1");
	}
	
	@When("Staff choose file2 n1")
	public void staff_choose_file2() {
		absenSakitStaff.ClickChooseFile2("C:\\Users\\Xh\\Downloads\\tt.mp4");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(350,0)", "");
		extentTest.log(LogStatus.PASS, "Staff choose file2 n1");
	}

	@Then("image not shown n1")
	public void image_not_shown() {
		assertEquals(absenSakitStaff.imageNotShown(), "img");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentTest.log(LogStatus.PASS, "Staff get attributeD1 n1");
	}
	
	@When("Staff Upload Foto n1")
	public void Staff_Upload_Foto() {
//		HooksTMSAStaff.delay(3);
		HooksTMS.delay(1);
		absenSakitStaff.ClickChooseFile("C:\\Users\\Xh\\Downloads\\se.png");
		extentTest.log(LogStatus.PASS, "Staff Input Upload Foto Selfie n1");
	}
	@And ("Click Submit n1")
	public void Click_submit() {
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		absenSakitStaff.submit();
//		HooksTMSAStaff.delay(3);
		HooksTMS.delay(1);
		extentTest.log(LogStatus.PASS, "Click Submit n1");
	}
	
	@And("Get Attribute n1")
	public void GetAttribute() {
//		HooksTMSAStaff.delay(3);
		HooksTMS.delay(1);
		assertEquals(absenSakitStaff.DivNotChoose(),"false");
		extentTest.log(LogStatus.PASS,"Get Attribute n1");
	}
	
	@When("Staff Choose Divisi n1")
	public void Staff_Choose_Divisi() {
//		HooksTMSAStaff.delay(3);
		HooksTMS.delay(1);
		absenSakitStaff.ClickTipeDivisi();
		extentTest.log(LogStatus.PASS, "Staff Choose Divisi n1");
	}
	
	@Then("Staff Not Choose Nama Shift n1")
	public void StaffNotChooseNamaShift() {
//		HooksTMSAStaff.delay(3);
		HooksTMS.delay(1);
		assertEquals(absenSakitStaff.ShiftNotChoose(),"false");
		extentTest.log(LogStatus.PASS, "Staff Not Choose Nama Shift n1");
	}
	
	@When("Staff Choose Nama Shift n1")
	public void Staff_Choose_Nama_Shift() {
//		HooksTMSAStaff.delay(3);
		HooksTMS.delay(1);
		absenSakitStaff.ClickNamaShift();
		extentTest.log(LogStatus.PASS, "Staff Choose Nama Shift n1");
	}
	
	@And("Click Shift n1")
	public void Clickshift() {
//		HooksTMSAStaff.delay(3);
		HooksTMS.delay(1);
		absenSakitStaff.namaShift();
		extentTest.log(LogStatus.PASS, "Click Shift n1");
	}
	
	@Then("Null tipe absen n1")
	public void Nulltipeabsen() {
//	HooksTMSAStaff.delay(3);
		HooksTMS.delay(1);
	assertEquals(absenSakitStaff.TipeAbsenNotChoose(),"");
	extentTest.log(LogStatus.PASS, "Null tipe absen n1");
	}
	
	@When("Staff Select Tipe Absen n1")
	public void Staff_Select_Tipe_Absen() {
//		HooksTMSAStaff.delay(3);
		HooksTMS.delay(1);
		absenSakitStaff.ClickBtnTipeAbsen("WFH");
		extentTest.log(LogStatus.PASS, "Staff Select Tipe Absen n1");
	}
	
	@Then ("Null keterangan n1")
	public void Nullketeranga() {
//		HooksTMSAStaff.delay(3);
		HooksTMS.delay(1);
		assertEquals(absenSakitStaff.KeteranganKosong(),"");
		extentTest.log(LogStatus.PASS, "Staff Not Choose Nama Shift n1");
	}
	
	@When("Staff Input Keterangan n1")
	public void Staff_Input_Keterangan() {
//		HooksTMSAStaff.delay(3);
		HooksTMS.delay(1);
		absenSakitStaff.InputKeterangan("Sedang demam, batuk, dan flu berat");
		extentTest.log(LogStatus.PASS, "Staff Input Keterangan n1");
	}
	
	@Then("Get warning sentence n1")
	public void get_warning_sentence() {
		assertEquals(absenSakitStaff.dataFailedTosend(), "false");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentTest.log(LogStatus.PASS, "Get warning sentence n1");
	}
	
	@Then("Success input data n1")
	public void success_input_data() {
		assertEquals(absenSakitStaff.alert(), "Input Dataaa");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentTest.log(LogStatus.PASS, "Success input data n1");
	}
	
	@When("Staff Logout n1")
	public void Staff_Logout() {
		absenSakitStaff.logout();
		extentTest.log(LogStatus.PASS, "Staff Logout n1");
	}
	
	@Then("Staff back to login TMS n1")
	public void Admin_back_to_login_TMS() {
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		String v = "DIKA";
		assertEquals(absenSakitStaff.gettextdika(), v);
		extentTest.log(LogStatus.PASS, "Staff back to login TMS n1");
	}
}
