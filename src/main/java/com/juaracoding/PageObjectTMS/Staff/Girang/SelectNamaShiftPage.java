package com.juaracoding.PageObjectTMS.Staff.Girang;

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
	private WebElement clickNameShift1;
	
	@FindBy(xpath = "//span[normalize-space()='Non Shift']")
	private WebElement clickNonShift;
	
	@FindBy(xpath = "//*[@id=\"uploadimage\"]/div[4]/div/div/div[2]/ul/li[2]/a")
	private WebElement viewNonShift;	
	
	@FindBy(xpath = "//*[@id=\"uploadimage\"]/div[4]/div/button/div/div")
	private WebElement clickNameShift2;
	
	@FindBy(xpath = "//span[normalize-space()='D1 (10:00 - 18:00)']")
	private WebElement clickD1;
	
	@FindBy(xpath = "//*[@id=\"uploadimage\"]/div[4]/div/button/div/div/div")
	private WebElement viewD1;	

	@FindBy(xpath = "//*[@id=\"uploadimage\"]/div[4]/div/button/div/div")
	private WebElement clickNameShift3;
	
	@FindBy(xpath = "//span[normalize-space()='D2 (12:00 - 20:00)']")
	private WebElement clickD2;
	
	@FindBy(xpath = "//*[@id=\"uploadimage\"]/div[4]/div/button/div/div/div")
	private WebElement viewD2;
	
	@FindBy(xpath = "//*[@id=\"uploadimage\"]/div[4]/div/button/div/div")
	private WebElement clickNameShift4;
	
	@FindBy(xpath = "//span[normalize-space()='D3 (13:00 - 21:00)']")
	private WebElement clickD3;
	
	@FindBy(xpath = "//*[@id=\"uploadimage\"]/div[4]/div/button/div/div/div")
	private WebElement viewD3;
	
	@FindBy(xpath = "//*[@id=\"uploadimage\"]/div[4]/div/button/div/div")
	private WebElement clickNameShift5;
	
	@FindBy(xpath = "//span[normalize-space()='SENIN PAGI (09:00 - 14:00)']")
	private WebElement clickSeninPagi;
	
	@FindBy(xpath = "//*[@id=\"uploadimage\"]/div[4]/div/button/div/div/div")
	private WebElement viewSeninPagi;
	
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
	
	public void clickButtonNameShift1() {
		clickNameShift1.click();
	}
	
	public void selectNamaShift1() {
		clickNonShift.click();
	}
	
	public String getNonShift1() {
		return viewNonShift.getTagName();
	}
	
	public void clickButtonNameShift2() {
		clickNameShift2.click();
	}
	
	public void selectNamaShift2() {
		clickD1.click();
	}
	
	public String getNonShift2() {
		return viewD1.getTagName();
	}
	
	public void clickButtonNameShift3() {
		clickNameShift3.click();
	}
	
	public void selectNamaShift3() {
		clickD2.click();
	}
	
	public String getNonShift3() {
		return viewD2.getTagName();
	}
	
	public void clickButtonNameShift4() {
		clickNameShift4.click();
	}
	
	public void selectNamaShift4() {
		clickD3.click();
	}
	
	public String getNonShift4() {
		return viewD3.getTagName();
	}
	
	public void clickButtonNameShift5() {
		clickNameShift5.click();
	}
	
	public void selectNamaShift5() {
		clickSeninPagi.click();
	}
	
	public String getNonShift5() {
		return viewSeninPagi.getTagName();
	}
	

}