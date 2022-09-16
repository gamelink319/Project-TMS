package com.juaracoding.PageObjectTMS.Staff;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.PageObjectTMS.Drivers.DriverSingleton;

public class SelectDivisiPage {
	
	private WebDriver driver;

	public SelectDivisiPage() {
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
	private WebElement upload2;
	
	@FindBy(xpath = "//input[@value='Submit']")
	private WebElement clicksubmit1;
	
	@FindBy(xpath = "//*[@id=\"divisi\"]")
	private WebElement divisiRequired;
	
	@FindBy(xpath = "//*[@id=\"divisi\"]")
	private WebElement chooseAttraction;
	
	@FindBy(xpath = "//*[@id=\"divisi\"]/option[3]")
	private WebElement doneAttraction;
	
	@FindBy(xpath = "//*[@id=\"divisi\"]")
	private WebElement chooseRentCar;
	
	@FindBy(xpath = "//*[@id=\"divisi\"]/option[3]")
	private WebElement doneRentCar;
	
	@FindBy(xpath = "//*[@id=\"divisi\"]")
	private WebElement chooseCallCenter;
	
	@FindBy(xpath = "//*[@id=\"div-type-shift\"]/label")
	private WebElement showTipeShift;
	
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
		this.upload2.sendKeys(img);
	}
	
	public void clickButtonSubmit1() {
		clicksubmit1.click();
	}
	
	public String getTxtRequired() {
		return divisiRequired.getAttribute("required");
	}
	
	public void selectDivisi1() {
		Select select = new Select(chooseAttraction);
		select.selectByValue("Attraction");
	}
	
	public String viewAttraction() {
		return doneAttraction.getTagName();
	}
	
	public void selectDivisi2() {
		Select select = new Select(chooseRentCar);
		select.selectByValue("Rent Car");
	}
	
	public String viewRentCar() {
		return doneRentCar.getTagName();
	}
	
	public void selectDivisi3() {
		Select select = new Select(chooseCallCenter);
		select.selectByValue("Call Center");
	}
	
	public String viewTipeShift() {
		return showTipeShift.getText();
	}
	
			
}
