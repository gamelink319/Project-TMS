package com.juaracoding.PageObjectTMS.Staff;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.PageObjectTMS.Drivers.DriverSingleton;

public class UploadFotoPage {
	
	private WebDriver driver;

	public UploadFotoPage() {
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
	
	@FindBy(xpath = "//input[@value='Submit']")
	private WebElement clicksubmit;
	
	@FindBy(xpath = "//input[@id='file']")
	private WebElement getUploadRequired;
	
	@FindBy(xpath = "//input[@id='file']")
	private WebElement upload1;
	
	@FindBy(xpath = "//*[@id=\"previewing\"]")
	private WebElement imgNotShown;
	
	@FindBy(xpath = "//input[@id='file']")
	private WebElement upload2;
	
	@FindBy(xpath = "//*[@id=\"previewing\"]")
	private WebElement imgShown;
	
	public void staffGoLogin(String nik, String password) {
		this.inputNIK.sendKeys(nik);
		this.inputPassword.sendKeys(password);
	}
	
	public void clickBtnLoginD1() {
		clickLogin.click();
	}
	
	public void clickLaporanKegiatanD1() {
		clickLapKegiatan.click();
	}
	
	public void clickAbsenIzinD1() {
		chooseAbsenIzin.click();
	}
	
	public void clickButtonSubmitD1() {
		clicksubmit.click();
	}
	
	public String getPleaseSelectFileD1() {
		return getUploadRequired.getAttribute("required");
	}
	
	public void getFile1(String img) {
		this.upload1.sendKeys(img);		
	}
	
	public String imageNotShown() {
		return imgNotShown.getTagName();
	}
	
	public void getFile2(String img) {
		this.upload2.sendKeys(img);
	}
	
	public String imageShown() {
		return imgShown.getTagName();
	}
}
