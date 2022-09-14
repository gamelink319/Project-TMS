package com.juaracoding.PageObjectTMS.Staff;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.PageObjectTMS.Drivers.DriverSingleton;

public class AbsenIzinPage {
	
	private WebDriver driver;

	public AbsenIzinPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@placeholder='NIK']")
	private WebElement inputNIK;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement inputPassword;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement clickLogin;
	
	@FindBy(xpath = "//span[normalize-space()='Laporan Kegiatan']")
	private WebElement clickLapKegiatan;
	
	@FindBy(xpath = "//a[normalize-space()='Absen Izin']")
	private WebElement chooseAbsenIzin;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div/div[1]/div/h1")
	private WebElement getTxtAbsenIzin;
	
	public void staffLogin(String nik, String password) {
		this.inputNIK.sendKeys(nik);
		this.inputPassword.sendKeys(password);
	}
	
	public void clickBtnLogin() {
		clickLogin.click();
	}
	
	public void clickLaporanKegiatan() {
		clickLapKegiatan.click();
	}
	
	public void clickAbsenIzin() {
		chooseAbsenIzin.click();
	}
	
	public String getFormAbsenIzin() {
		return getTxtAbsenIzin.getText();
	}
	

}
