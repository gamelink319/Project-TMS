package com.juaracoding.PageObjectTMS.Admin;

import java.io.File;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.PageObjectTMS.Drivers.DriverSingleton;

public class FormAdminReportAbsen {
	private WebDriver driver;

	public FormAdminReportAbsen() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[contains(text(),'-- Position --')]")
	private WebElement BtnPosition;

	@FindBy(xpath = "//div[contains(text(),'-- Branch --')]")
	private WebElement BtnBranch;

	@FindBy(xpath = "//div[contains(text(),'-- Unit --')]")
	private WebElement BtnUnit;

	@FindBy(xpath = "//div[@class='dropdown-menu show']//input[@aria-label='Search']")
	private WebElement InputData;

	@FindBy(xpath = "//input[@id='datepicker']")
	private WebElement InputDateStart;

	@FindBy(xpath = "//input[@id='datepicker2']")
	private WebElement InputDateEnd;

	@FindBy(xpath = "//input[@name='submit']")
	private WebElement BtnExportData;

	public void ClickSelectPosition() {
		BtnPosition.click();
	}

	public void ClickSelectBranch() {
		BtnBranch.click();
	}

	public void ClickSelectUnit() {
		BtnUnit.click();
	}

	public void InputSelect(String IsiForm) {
		InputData.sendKeys(IsiForm);
		InputData.sendKeys(Keys.ENTER);
	}

	public void InputDateStart(String DateStart) {
		InputDateStart.sendKeys(DateStart);
	}

	public void InputDateEnd(String DateEnd) {
		InputDateEnd.sendKeys(DateEnd);
	}

	public void ClickBtnExport() {
		BtnExportData.click();
	}
	
	public void ClickBtnExportNoData() {
		BtnExportData.click();
	}
	
	public Boolean CheckFile() {
		File fileLocation = new File("C:\\Users\\Xh\\Downloads");
		File[] totalfiles = fileLocation.listFiles();

		for (File file : totalfiles) {
			if (file.getName().contains("absen")) {
				System.out.println(file.getName() + " file sudah di cek");
				return true;
			}
		}
		return CheckFile();
	}	
}