package com.juaracoding.PageObjectTMS.Staff;

//import org.openqa.selenium.Keys;
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
	
	@FindBy(xpath = "//input[@id='file']")
	private WebElement BtnChooseFile2;
	
	@FindBy(xpath = "//*[@id=\"divisi\"]/option[3]")
	private WebElement BtnDiv;

	@FindBy(xpath = "//*[@id=\"divisi\"]")
	private WebElement getAlertDiv;
	
	@FindBy(xpath = "//div[@class='filter-option-inner']")
	private WebElement BtnNamaShift;
	
	@FindBy(xpath="//span[normalize-space()='D3 (13:00 - 21:00)']")
	private WebElement nameshift;
	
	@FindBy(xpath = "//div[@class='filter-option-inner-inner']")
	private WebElement nameShiftRequired;
	
	@FindBy(xpath = "//select[@id='absen_type']")
	private WebElement BtnTipeAbsen;
	
	@FindBy(xpath = "//select[@id='absen_type']")
	private WebElement getTipeAbsen;
	
	@FindBy(xpath = "//textarea[@name='keterangan']")
	private WebElement inputketerangan;
	
	@FindBy(xpath = "//textarea[@name='keterangan']")
	private WebElement getketerangan;
	
	@FindBy(xpath = "//input[@value='Submit']")
	private WebElement BtnSubmit;
	
	@FindBy(xpath = "//i[@class='fa fa-power-off']")
	private WebElement Btnlogout;
	
	@FindBy(xpath = "//b[normalize-space()='DIKA']")
	private WebElement getTextDika;
	
//	@FindBy(xpath = "//input[@aria-label='Search']")
//	private WebElement Input;
	
	@FindBy(xpath = "//input[@id='file']")
	private WebElement getUploadRequired;
	
	@FindBy(xpath = "//*[@id=\"previewing\"]")
	private WebElement imgNotShown;
	
	@FindBy(xpath ="//*[@id=\"page-wrapper\"]/div/div[1]/div/h1")
	private WebElement alert;
	
	@FindBy(xpath = "/html/body/p")
	private WebElement dataFail;

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
	
	public String getPleaseSelectFileD1() {
		return getUploadRequired.getAttribute("required");
	}

	public void ClickChooseFile2(String File) {
		BtnChooseFile2.sendKeys(File);
	}
	
	public String imageNotShown() {
	return imgNotShown.getTagName();
	}
	
	public void ClickChooseFile(String File) {
		BtnChooseFile.sendKeys(File);
	}

	public String DivNotChoose() {
		return getAlertDiv.getAttribute("required");
	}
	public void ClickTipeDivisi() {
		BtnDiv.click();
	}

	public String ShiftNotChoose() {
		return nameShiftRequired.getTagName();
	}
	public void namaShift() {
		nameshift.click();
	}
	
	public void ClickNamaShift() {
		BtnNamaShift.click();

	}
	public String TipeAbsenNotChoose() {
		return getTipeAbsen.getAttribute("");
	}
	public void ClickBtnTipeAbsen(String TIPEABSEN) {
		Select select = new Select(BtnTipeAbsen);
		select.selectByValue(TIPEABSEN);
		BtnTipeAbsen.click();
	}
	public String KeteranganKosong() {
		return getketerangan.getAttribute("required");
	}
	public void InputKeterangan(String Keterangan) {
		inputketerangan.sendKeys(Keterangan);
	}

	public String dataFailedTosend() {
		return dataFail.getText();
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
