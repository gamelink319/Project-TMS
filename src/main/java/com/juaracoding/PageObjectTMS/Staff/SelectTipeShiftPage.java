package com.juaracoding.PageObjectTMS.Staff;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.PageObjectTMS.Drivers.DriverSingleton;

public class SelectTipeShiftPage {
	
	private WebDriver driver;

	public SelectTipeShiftPage() {
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
	
	@FindBy(xpath = "//input[@id='file']")
	private WebElement upload;
		
	@FindBy(xpath = "//*[@id=\"divisi\"]")
	private WebElement chooseCallCenter;
	
	@FindBy(xpath = "//input[@value='Submit']")
	private WebElement clicksubmit;
	
	@FindBy(xpath = "//*[@id=\"type_shift\"]")
	private WebElement tipeShiftRequired;
	
	@FindBy(xpath = "//*[@id=\"type_shift\"]")
	private WebElement chooseCalCenter1;
	
	@FindBy(xpath = "//*[@id=\"type_shift\"]/option[2]")
	private WebElement showCalCenter1;
	
	@FindBy(xpath = "//*[@id=\"type_shift\"]")
	private WebElement chooseCalCenter2;
	
	@FindBy(xpath = "//*[@id=\"type_shift\"]/option[3]")
	private WebElement showCalCenter2;
	
	public void staffGoLogin(String nik, String password) {
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
	
	public void getFile(String img) {
		this.upload.sendKeys(img);
	}
	
	public void selectTipeShift() {
		Select select = new Select(chooseCallCenter);
		select.selectByValue("Call Center");
	}
	
	public void clickButtonSubmit1() {
		clicksubmit.click();
	}
	
	public String getRequiredTipeShift() {
		return tipeShiftRequired.getAttribute("required");
	}
	
	public void selectTipeShift1() {
		Select select = new Select(chooseCalCenter1);
		select.selectByValue("Call Center 1");
	}
	
	public String viewCallCenter1() {
		return showCalCenter1.getTagName();
	}
	
	public void selectTipeShift2() {
		Select select = new Select(chooseCalCenter2);
		select.selectByValue("Call Center 2");
	}
	
	public String viewCallCenter2() {
		return showCalCenter2.getTagName();
	}
}
