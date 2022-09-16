package com.juaracoding.PageObjectTMS.Staff;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.PageObjectTMS.Drivers.DriverSingleton;

public class SelectNamaShiftPage {
	
	private WebDriver driver;

	public SelectNamaShiftPage() {
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
	private WebElement chooseAttraction;
	
	@FindBy(xpath = "//input[@value='Submit']")
	private WebElement clicksubmit;
	
	@FindBy(xpath = "//div[@class='filter-option-inner-inner']")
	private WebElement nameShiftRequired;
	
	@FindBy(xpath = "//*[@id=\"uploadimage\"]/div[4]/div/button/div/div")
	private WebElement clickNameShift;
	
	@FindBy(xpath = "//span[normalize-space()='Non Shift']")
	private WebElement clicNonShift;
	
	@FindBy(xpath = "//*[@id=\"uploadimage\"]/div[4]/div/div/div[2]/ul/li[2]/a")
	private WebElement viewNonShift;	
	
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
		Select select = new Select(chooseAttraction);
		select.selectByValue("Attraction");
	}
	
	public void clickButtonSubmit1() {
		clicksubmit.click();
	}
	
	public String getRequiredNamaShift() {
		return nameShiftRequired.getTagName();
	}
	
	public void clickButtonNameShiftNamaShift() {
		clickNameShift.click();
	}
	
	public void selectNamaShift() {
		clicNonShift.click();
	}
	
	public String getNonShift() {
		return viewNonShift.getTagName();
	}

}
