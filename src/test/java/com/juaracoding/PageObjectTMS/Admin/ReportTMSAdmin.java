package com.juaracoding.PageObjectTMS.Admin;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReportTMSAdmin {

	WebDriver driver;
	private LoginAdmin login = new LoginAdmin();
	private AdminReportAbsen reportAbsen = new AdminReportAbsen();
	private FormAdminReportAbsen formAbsen = new FormAdminReportAbsen();
	private static ExtentTest extentTest;
	String x;

	public ReportTMSAdmin() {
		driver = HooksTMSAdmin.driver;
		extentTest = HooksTMSAdmin.extentTest;
	}

	@When("Admin click list absen")
	public void Admin_click_list_absen() {
		reportAbsen.ClickListAbsen();
		extentTest.log(LogStatus.PASS, "Admin click list absen");
	}

	@And("Admin choose absen masuk")
	public void Admin_choose_absen_masuk() {
		reportAbsen.ClickAbsenMasuk();
		extentTest.log(LogStatus.PASS, "Admin choose absen masuk");
	}

	@Then("Admin go to absen masuk")
	public void Admin_go_to_absen_masuk() {
		HooksTMSAdmin.delay(1);
		reportAbsen.GetAbsenMasuk();
		assertEquals(reportAbsen.GetAbsenMasuk(), "Report Masuk!!!");
		extentTest.log(LogStatus.PASS, "Admin go to absen masuk");
	}

	@And("Admin choose absen pulang")
	public void Admin_choose_absen_pulang() {
		reportAbsen.ClickAbsenPulang();
		extentTest.log(LogStatus.PASS, "Admin choose absen pulang");
	}

	@Then("Admin go to absen pulang")
	public void Admin_go_to_absen_pulang() {
		HooksTMSAdmin.delay(1);
		reportAbsen.GetAbsenPulang();
		assertEquals(reportAbsen.GetAbsenPulang(), "Report Pulang!!!");
		extentTest.log(LogStatus.PASS, "Admin go to absen pulang");
	}

	@And("Admin choose absen sakit")
	public void Admin_choose_absen_sakit() {
		reportAbsen.ClickAbsenSakit();
		;
		extentTest.log(LogStatus.PASS, "Admin choose absen sakit");
	}

	@Then("Admin go to absen sakit")
	public void Admin_go_to_absen_sakit() {
		HooksTMSAdmin.delay(1);
		reportAbsen.GetAbsenSakit();
		assertEquals(reportAbsen.GetAbsenSakit(), "Report Sakit!!!");
		extentTest.log(LogStatus.PASS, "Admin go to absen sakit");
	}

	@And("Admin choose absen off")
	public void Admin_choose_absen_off() {
		reportAbsen.ClickAbsenOff();
		;
		extentTest.log(LogStatus.PASS, "Admin choose absen off");
	}

	@Then("Admin go to absen off")
	public void Admin_go_to_absen_off() {
		HooksTMSAdmin.delay(1);
		reportAbsen.GetAbsenOff();
		assertEquals(reportAbsen.GetAbsenOff(), "Report OFF!!!");
		extentTest.log(LogStatus.PASS, "Admin go to absen off");
	}

	@And("Admin choose absen shifting")
	public void Admin_choose_absen_shifting() {
		reportAbsen.ClickAbsenShifting();
		;
		extentTest.log(LogStatus.PASS, "Admin choose absen shifting");
	}

	@Then("Admin go to absen shifting")
	public void Admin_go_to_absen_shifting() {
		HooksTMSAdmin.delay(1);
		reportAbsen.GetAbsenShifting();
		assertEquals(reportAbsen.GetAbsenShifting(), "Report Absen SHIFTING");
		extentTest.log(LogStatus.PASS, "Admin go to absen off");
	}

	@And("Admin choose absen non shifting")
	public void Admin_choose_absen_non_shifting() {
		reportAbsen.ClickAbsenNonShifting();
		;
		extentTest.log(LogStatus.PASS, "Admin choose absen non shifting");
	}

	@Then("Admin go to absen non shifting")
	public void Admin_go_to_absen_non_shifting() {
		HooksTMSAdmin.delay(1);
		reportAbsen.getAbsenNonShifString();
		assertEquals(reportAbsen.getAbsenNonShifString(), "Report Absen NON SHIFTING");
		extentTest.log(LogStatus.PASS, "Admin go to absen non shifting");
	}

	@When("Admin select position all")
	public void Admin_select_position_all() {
		formAbsen.ClickSelectPosition();
		formAbsen.InputSelect("all");
		HooksTMSAdmin.delay(2);
		extentTest.log(LogStatus.PASS, "Admin select position all");
	}

	@And("Admin select branch all")
	public void Admin_branch_all() {
		formAbsen.ClickSelectBranch();
		formAbsen.InputSelect("all");
		HooksTMSAdmin.delay(2);
		extentTest.log(LogStatus.PASS, "Admin select branch all");
	}

	@When("Admin select position manager")
	public void Admin_branch_manager() {
		formAbsen.ClickSelectPosition();
		formAbsen.InputSelect("manager");
		HooksTMSAdmin.delay(2);
		extentTest.log(LogStatus.PASS, "Admin select branch manager");
	}

	@When("Admin select unit all")
	public void Admin_select_unit_all() {
		formAbsen.ClickSelectUnit();
		formAbsen.InputSelect("all");
		HooksTMSAdmin.delay(2);
		extentTest.log(LogStatus.PASS, "Admin select unit all");
	}

	@And("Admin input start date true and end date true")
	public void Admin_input_start_date_and_end_date() {
		formAbsen.InputDateStart("2022-09-01");
		formAbsen.InputDateEnd("2022-09-10");
		extentTest.log(LogStatus.PASS, "Admin input start date true and end date true");
	}

	@And("Admin click export data")
	public void Admin_click_export_data() {
		formAbsen.ClickBtnExport();
		extentTest.log(LogStatus.PASS, "Admin click export data");
	}

	@Then("Admin validate data")
	public void Admin_validate_data() {
		HooksTMSAdmin.delay(3);
		formAbsen.CheckFile();
		assertTrue(formAbsen.CheckFile());
		extentTest.log(LogStatus.PASS, "Admin validate data");
	}

	@Then("Admin validate No Data")
	public void Admin_validate_No_data() {
		HooksTMSAdmin.delay(1);
		formAbsen.ClickBtnExportNoData();
		HooksTMSAdmin.delay(1);
		String TxtAlert = driver.switchTo().alert().getText();
		System.out.println(TxtAlert);
		assertEquals(TxtAlert, "No data...!!!");
		driver.switchTo().alert().accept();
		extentTest.log(LogStatus.PASS, "Admin validate No Data");
	}

	@Then("Admin validate tidak ada data")
	public void Admin_validate_tidak_ada_data() {
		HooksTMSAdmin.delay(1);
		formAbsen.ClickBtnExportNoData();
		HooksTMSAdmin.delay(1);
		String TxtAlert = driver.switchTo().alert().getText();
		System.out.println(TxtAlert);
		assertEquals(TxtAlert, "Tidak Ada Data");
		driver.switchTo().alert().accept();
		HooksTMSAdmin.delay(3);
		extentTest.log(LogStatus.PASS, "Admin validate tidak ada data");
	}

	@Then("Admin validate wrong input date")
	public void Admin_validate_wrong_input_date() {
		HooksTMSAdmin.delay(1);
		formAbsen.ClickBtnExportNoData();
		HooksTMSAdmin.delay(1);
		String TxtAlert = driver.switchTo().alert().getText();
		System.out.println(TxtAlert);
		assertEquals(TxtAlert, "Maximal Penarikan Data adalah 1 Bulan / 31 Hari !!!");
		driver.switchTo().alert().accept();
		extentTest.log(LogStatus.PASS, "Admin validate wrong input date");
	}

	@When("Admin select position null")
	public void Admin_select_position_null() {
		System.out.println("Skip karna null");
		HooksTMSAdmin.delay(2);
		extentTest.log(LogStatus.PASS, "Admin select position null");
	}

	@When("Admin select position call center")
	public void Admin_select_position_callcenter() {
		formAbsen.ClickSelectPosition();
		formAbsen.InputSelect("call center");
		HooksTMSAdmin.delay(2);
		extentTest.log(LogStatus.PASS, "Admin select position call center");
	}

	@When("Admin select position admin credit")
	public void Admin_select_position_admin_credit() {
		formAbsen.ClickSelectPosition();
		formAbsen.InputSelect("admin credit");
		HooksTMSAdmin.delay(2);
		extentTest.log(LogStatus.PASS, "Admin select admin credit");
	}

	@When("Admin select position spg")
	public void Admin_select_position_rentcar() {
		formAbsen.ClickSelectPosition();
		formAbsen.InputSelect("spg");
		HooksTMSAdmin.delay(2);
		extentTest.log(LogStatus.PASS, "Admin select position spg");
	}

	@And("Admin select branch null")
	public void Admin_branch_null() {
		System.out.println("Skip branch karna null");
		HooksTMSAdmin.delay(2);
		extentTest.log(LogStatus.PASS, "Admin select branch null");
	}

	@And("Admin select branch bandung")
	public void Admin_branch_bandung() {
		formAbsen.ClickSelectBranch();
		formAbsen.InputSelect("bandung");
		HooksTMSAdmin.delay(2);
		extentTest.log(LogStatus.PASS, "Admin select branch bandung");
	}

	@And("Admin select branch jakarta")
	public void Admin_branch_jakarta() {
		formAbsen.ClickSelectBranch();
		formAbsen.InputSelect("jakarta");
		HooksTMSAdmin.delay(2);
		extentTest.log(LogStatus.PASS, "Admin select branch jakarta");
	}

	@And("Admin select branch surabaya")
	public void Admin_branch_surabaya() {
		formAbsen.ClickSelectBranch();
		formAbsen.InputSelect("surabaya");
		HooksTMSAdmin.delay(2);
		extentTest.log(LogStatus.PASS, "Admin select branch surabaya");
	}

	@And("Refresh page")
	public void refresh_page() {
		driver.navigate().refresh();
		HooksTMSAdmin.delay(3);
	}

	@When("Admin select unit airasia")
	public void Admin_select_unit_airasia() {
		formAbsen.ClickSelectUnit();
		formAbsen.InputSelect("airasia");
		HooksTMSAdmin.delay(2);
		extentTest.log(LogStatus.PASS, "Admin select unit airasia");
	}

	@When("Admin select unit bca api")
	public void Admin_select_unit_bcaapi() {
		formAbsen.ClickSelectUnit();
		formAbsen.InputSelect("bca api");
		HooksTMSAdmin.delay(2);
		extentTest.log(LogStatus.PASS, "Admin select unit bca api");
	}

	@When("Admin select unit it programmer")
	public void Admin_select_unit_itprogrammer() {
		formAbsen.ClickSelectUnit();
		formAbsen.InputSelect("it programmer");
		HooksTMSAdmin.delay(2);
		extentTest.log(LogStatus.PASS, "Admin select unit it programmer");
	}

	@When("Admin select unit null")
	public void Admin_select_unit_null() {
		System.out.println("Skip unit karna null");
		HooksTMSAdmin.delay(2);
		extentTest.log(LogStatus.PASS, "Admin select unit null");
	}

	@And("Admin input start date lebih dari 1bulan and end date true")
	public void Admin_input_start_date_lebih_dari_satubulan_and_end_date_true() {
		formAbsen.InputDateStart("2022-09-22");
		formAbsen.InputDateEnd("2022-08-10");
		extentTest.log(LogStatus.PASS, "Admin input start date lebih dari 1bulan and end date true");
	}

	@And("Admin input start date lebih tinggi dari end date")
	public void Admin_input_start_date_lebih_tinggi_dari_end_date() {
		formAbsen.InputDateStart("2022-09-13");
		formAbsen.InputDateEnd("2022-09-10");
		extentTest.log(LogStatus.PASS, "Admin input start date lebih tinggi dari end date");
	}

	@And("Admin input end date lebih dari 1bulan and start date true")
	public void Admin_input_end_date_lebih_dari_satubulan_and_start_date_true() {
		formAbsen.InputDateStart("2022-08-01");
		formAbsen.InputDateEnd("2022-09-22");
		extentTest.log(LogStatus.PASS, "Admin input end date lebih dari 1bulan and start date true");
	}

	@And("Admin input end date lebih rendah dari start date")
	public void Admin_input_end_date_lebih_rendah_dari_start_date() {
		formAbsen.InputDateStart("2022-09-13");
		formAbsen.InputDateEnd("2022-09-2");
		extentTest.log(LogStatus.PASS, "Admin input end date lebih rendah dari start date");
	}
	
	@When("Admin checking exist file")
	public void Admin_checking_exist_file() {
		HooksTMSAdmin.delay(3);
		formAbsen.validFile();
		assertTrue(formAbsen.validFile());
		System.out.println("Test Barhasil");
		extentTest.log(LogStatus.PASS, "Admin checking exist file");
	}
}