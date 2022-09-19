package com.juaracoding.PageObjectTMS.Staff.Nisa;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.PageObjectTMS.Drivers.DriverSingleton;

public class AbsenSakitStaff {

	private WebDriver driver;

	public AbsenSakitStaff() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='NIK']")
	private WebElement inputnik;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement inputpassword;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement clickBtnLogin;
	
	@FindBy(xpath ="//h1[@class='page-header']")
	private WebElement getTextDashboard;

	@FindBy(xpath = "//span[normalize-space()='Laporan Kegiatan']")
	private WebElement BtnLapKegiatan;

	@FindBy(xpath = "//a[normalize-space()='Absen Sakit']")
	private WebElement BtnAbsenSakit;

	@FindBy(xpath = "//input[@id='file']")
	private WebElement BtnChooseFile;
	
	@FindBy(xpath = "//*[@id=\"divisi\"]/option[3]")
	private WebElement BtnDiv;

	@FindBy(xpath = "//div[@class='filter-option-inner-inner']")
	private WebElement BtnNamaShift;
	
	@FindBy(xpath = "//select[@id='absen_type']")
	private WebElement BtnTipeAbsen;
	
	@FindBy(xpath = "//textarea[@name='keterangan']")
	private WebElement inputketerangan;
	
	@FindBy(xpath = "//input[@value='Submit']")
	private WebElement BtnSubmit;
	
	@FindBy(xpath = "//i[@class='fa fa-power-off']")
	private WebElement Btnlogout;
	
	@FindBy(xpath = "//b[normalize-space()='DIKA']")
	private WebElement getTextDika;
	
	@FindBy(xpath = "//input[@aria-label='Search']")
	private WebElement Input;
	
	@FindBy(xpath="//div[@class='panel-heading ui-sortable-handle']")
	private WebElement alert;

	public void inputnik(String NIK) {
		inputnik.sendKeys(NIK);
	}

	public void inputpassword(String Password) {
		inputpassword.sendKeys(Password);
	}

	public void ButtonLogin() {
		clickBtnLogin.click();
	}
	
	public String GetDashboard() {
		return getTextDashboard.getText();
	}

	public void ClickLaporanKegiatan() {
		BtnLapKegiatan.click();
	}

	public void ClickAbsnSakit() {
		BtnAbsenSakit.click();
	}

	public void ClickChooseFile(String File) {
		BtnChooseFile.sendKeys(File);
	}

	public void ClickTipeDivisi() {
		BtnDiv.click();
	}

	public void ClickNamaShift() {
		BtnNamaShift.click();
		Input.sendKeys("Non Shift");
		Input.sendKeys(Keys.ENTER);
//		Select select = new Select(BtnNamaShift);
//		select.selectByVisibleText("SENIN PAGI (09:00 - 14:00)");
//		BtnTipeAbsen.click();
	}

	public void ClickBtnTipeAbsen(String TIPEABSEN) {
		Select select = new Select(BtnTipeAbsen);
		select.selectByValue(TIPEABSEN);
		BtnTipeAbsen.click();
	}

	public void InputKeterangan(String Keterangan) {
		inputketerangan.sendKeys(Keterangan);
	}
	
	public void submit() {
		BtnSubmit.click();
	}
	
	public String alert() {
		return alert.getText();
	}
	
	public void logout() {
		Btnlogout.click();
	}
	public String gettextdika() {
		return getTextDika.getText();
	}
}