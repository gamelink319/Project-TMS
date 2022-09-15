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
	
	@FindBy(xpath = "//*[@id=\"selectImage\"]/label")
	private WebElement getBtnUploadFile;
	
	@FindBy(xpath = "//label[normalize-space()='Divisi']")
	private WebElement getDivisi;
	
	@FindBy(xpath = "//label[normalize-space()='Nama Shift']")
	private WebElement getNamaShift;
	
	@FindBy(xpath = "//label[normalize-space()='Tipe Absen']")
	private WebElement getTipeAbsen;
	
	@FindBy(xpath = "//label[normalize-space()='Isi Keterangan di bawah ini !']")
	private WebElement getTextArea;
	
	@FindBy(xpath = "//input[@value='Submit']")
	private WebElement getBtnSubmit;
	
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
	
	public String getUploadFile() {
		return getBtnUploadFile.getText();
	}
	
	public String getSelectDivisi() {
		return getDivisi.getText();
	}
	
	public String getSelectNamaShift() {
		return getNamaShift.getText();
	}
	
	public String getSelectAbsen() {
		return getTipeAbsen.getText();
	}
	
	public String getColoumnText() {
		return getTextArea.getText();
	}
	
	public String getButtonSubmit() {
		return getBtnSubmit.getAttribute("btn btn-primary");
	}
	

}
