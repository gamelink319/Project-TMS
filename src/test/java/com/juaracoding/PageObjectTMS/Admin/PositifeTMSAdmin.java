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

public class PositifeTMSAdmin {

	WebDriver driver;
	private LoginAdmin login = new LoginAdmin();
	private AdminReportAbsen reportAbsen = new AdminReportAbsen();
	private FormAdminReportAbsen formAbsen = new FormAdminReportAbsen();
	private static ExtentTest extentTest;

	public PositifeTMSAdmin() {
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
		reportAbsen.GetAbsenMasuk();
		assertEquals(reportAbsen.GetAbsenMasuk(), "Report Masuk!!!");
		extentTest.log(LogStatus.PASS, "Admin go to absen masuk");
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

	@When("Admin select unit all")
	public void Admin_select_unit_all() {
		formAbsen.ClickSelectUnit();
		formAbsen.InputSelect("all");
		HooksTMSAdmin.delay(2);
		extentTest.log(LogStatus.PASS, "Admin select unit all");
	}

	@And("Admin input start date true and end date")
	public void Admin_input_start_date_and_end_date() {
		formAbsen.InputDateStart("2022-09-01");
		formAbsen.InputDateEnd("2022-09-10");
		extentTest.log(LogStatus.PASS, "Admin input start date true and end date");
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
		HooksTMSAdmin.delay(3);
		formAbsen.ClickBtnExportNoData();
		String TxtAlert = driver.switchTo().alert().getText();
		System.out.println(TxtAlert);
		driver.switchTo().alert().accept();
		extentTest.log(LogStatus.PASS, "Admin validate No Data");
	}
	
	@When("Admin select position null")
	public void Admin_select_position_null() {
//		formAbsen.ClickSelectPosition();
//		formAbsen.InputSelect("");
		HooksTMSAdmin.delay(2);
//		extentTest.log(LogStatus.PASS, "Admin select position null");
	}
}