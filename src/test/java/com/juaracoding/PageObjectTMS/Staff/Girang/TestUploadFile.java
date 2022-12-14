package com.juaracoding.PageObjectTMS.Staff.Girang;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.juaracoding.PageObjectTMS.HooksTMS;
//import com.juaracoding.PageObjectTMS.Staff.HooksTMSAStaff;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utils.Constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestUploadFile {

	WebDriver driver;
	private UploadFotoPage uploadFotoPage = new UploadFotoPage();
	private static ExtentTest extentest;

	public TestUploadFile() {
//		driver = HooksTMSAStaff.driver;
//		extentest = HooksTMSAStaff.extentTest;
//	}
		driver = HooksTMS.driver;
		extentest = HooksTMS.extentTest;
	}

	@When("Staff go to web ptdikaD1")
	public void staff_go_to_web_ptdikad1() {
		driver.get(Constants.URL);
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff go to web ptdikaD1");
	}

	@And("Staff enter own nik and passwordD1")
	public void staff_enter_own_nik_and_passwordD1() {
		uploadFotoPage.staffGoLogin("D6200927", "1997-10-23");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff enter own nik and passwordD1");
	}

	@And("Staff click button loginD1")
	public void staff_click_button_loginD1() {
		uploadFotoPage.clickBtnLoginD1();
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff click button loginD1");
	}

	@And("Staff click laporan kegiatanD1")
	public void staff_click_laporan_kegiatand1() {
		uploadFotoPage.clickLaporanKegiatanD1();
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff click laporan kegiatanD1");
	}

	@And("Staff choose and click absen izinD1")
	public void staff_choose_and_click_absen_izinD1() {
		uploadFotoPage.clickAbsenIzinD1();
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff choose and click absen izinD1");
	}

	@And("Staff clik submitD1")
	public void staff_clik_submitd1() {
		uploadFotoPage.clickButtonSubmitD1();
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff clik submitD1");
	}

	@Then("Staff get attributeD1")
	public void staff_get_attributed1() {
		assertEquals(uploadFotoPage.getPleaseSelectFileD1(), "true");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff get attributeD1");
	}

	@When("Staff choose file1")
	public void staff_choose_file1() {
		uploadFotoPage.getFile1("C:\\Users\\girangsnm\\Downloads\\bmp.bmp");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(350,0)", "");
		extentest.log(LogStatus.PASS, "Staff choose file1");
	}

	@Then("image not shown")
	public void image_not_shown() {
		assertEquals(uploadFotoPage.imageNotShown(), "img");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "Staff get attributeD1");
	}

	@When("Staff choose file2")
	public void staff_choose_file2() {
		uploadFotoPage.getFile2("C:\\Users\\girangsnm\\Downloads\\jpg.jpg");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(350,0)", "");
		extentest.log(LogStatus.PASS, "Staff choose file2");
	}
	
	@Then("image preview")
	public void image_preview() {
		assertEquals(uploadFotoPage.imageShown(), "img");
//		HooksTMSAStaff.delay(2);
		HooksTMS.delay(1);
		extentest.log(LogStatus.PASS, "image preview");
	}
	
}