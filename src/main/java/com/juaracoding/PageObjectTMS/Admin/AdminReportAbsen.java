package com.juaracoding.PageObjectTMS.Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.PageObjectTMS.Drivers.DriverSingleton;

public class AdminReportAbsen {
	private WebDriver driver;

	public AdminReportAbsen() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[normalize-space()='Report Absen']")
	private WebElement BtnListAbsen;

	@FindBy(xpath = "//a[normalize-space()='Absen Masuk']")
	private WebElement BtnAbsenMasuk;

	@FindBy(xpath = "//a[normalize-space()='Absen Pulang']")
	private WebElement BtnAbsenPulang;

	@FindBy(xpath = "//a[normalize-space()='Absen Sakit']")
	private WebElement BtnAbsenSakit;

	@FindBy(xpath = "//a[normalize-space()='Absen Off']")
	private WebElement BtnAbsenOff;

	@FindBy(xpath = "//a[normalize-space()='Absen Shifting']")
	private WebElement BtnAbsenShifting;

	@FindBy(xpath = "//a[normalize-space()='Absen Non Shifting']")
	private WebElement BtnAbsenNonShifting;

	public void ClickListAbsen() {
		BtnListAbsen.click();
	}

	public void ClickAbsenMasuk() {
		BtnAbsenMasuk.click();
	}

	public void ClickAbsenPulang() {
		BtnAbsenPulang.click();
	}

	public void ClickAbsenSakit() {
		BtnAbsenSakit.click();
	}

	public void ClickAbsenOff() {
		BtnAbsenOff.click();
	}

	public void ClickAbsenShifting() {
		BtnAbsenShifting.click();
	}

	public void ClickAbsenNonShifting() {
		BtnAbsenNonShifting.click();
	}
}