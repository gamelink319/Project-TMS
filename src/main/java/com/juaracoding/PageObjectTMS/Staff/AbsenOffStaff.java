package com.juaracoding.PageObjectTMS.Staff;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.PageObjectTMS.Drivers.DriverSingleton;

public class AbsenOffStaff {

	private WebDriver driver;

	public AbsenOffStaff() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@placeholder='NIK']")
	private WebElement Inputnik;	
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement Inputpassword;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnsubmit;

	@FindBy(xpath = "//h1[@class='page-header']")
	private WebElement GetTextdashboard;
	
	@FindBy(xpath = "//span[normalize-space()='Laporan Kegiatan']")
	private WebElement btnlaporan;
	
	@FindBy(xpath  = "//a[normalize-space()='Absen Off']")
	private WebElement Btnoff;
	
	@FindBy(xpath = "//input[@id='file']")
	private WebElement BtnChooseFile;
	
	@FindBy(xpath = "//input[@id='file']")
	private WebElement BtnFile;
	
	@FindBy(xpath = "//*[@id=\"divisi\"]/option[4]")
	private WebElement btndivisi;
	
	@FindBy(xpath = "//*[@id=\"divisi\"]")
	private WebElement GetAlertDiv;
	
	@FindBy(xpath = "//div[@class='filter-option-inner']")
	private WebElement getshift;
	
	@FindBy(xpath = "//span[normalize-space()='D1 (07:00 - 16:00)']")
	private WebElement namashift;
	
	@FindBy(xpath = "//div[@class='filter-option-inner-inner']")
	private WebElement BtnnamaShift;

	@FindBy(xpath = "//select[@id='absen_type']")
	private WebElement btntipe;
	
	@FindBy(xpath = "//select[@id='absen_type']")
	private WebElement getTipe;
	
	@FindBy(xpath = "//textarea[@name='keterangan']")
	private WebElement keterangan;
	
	@FindBy(xpath = "//textarea[@name='keterangan']")
	private WebElement Getketerangan;

	@FindBy(xpath = "//input[@value='Submit']")
	private WebElement submit;
	
	@FindBy(xpath = "//*[@id=\"previewing\"]")
	private WebElement preview;

	@FindBy(xpath ="//*[@id=\"page-wrapper\"]/div/div[1]/div/h1")
	private WebElement alert1;
	
	@FindBy(xpath = "//input[@id='file']")
	private WebElement getUpload;
	
	@FindBy(xpath = "//i[@class='fa fa-power-off']")
	private WebElement Btnlogout;
	
	@FindBy(xpath = "//b[normalize-space()='DIKA']")
	private WebElement getTextDika;
	
	@FindBy(xpath = "/html/body/p")
	private WebElement datafail;

	
	public void Inputnik(String NIK) {
		Inputnik.sendKeys(NIK);
	}
	public void Inputpassword(String PASSWORD) {
		Inputpassword.sendKeys(PASSWORD);
	}
	public void btnsubmit() {
		btnsubmit.click();
	}
	public String GetDashboard() {
		return GetTextdashboard.getText();
	}
	public void btnlaporan() {
		btnlaporan.click();
	}
	public void Btnoff() {
		Btnoff.click();
	}
	
	public String getSelectFile() {
		return getUpload.getAttribute("required");
	}

	public void ClickChooseFile(String File) {
		BtnChooseFile.sendKeys(File);
	}
	
	public String noimg() {
		return preview.getTagName();
	}
	
	public void FileTrue(String File) {
		BtnFile.sendKeys(File);
	}
	public String NotDiv() {
		return GetAlertDiv.getAttribute("required");
	}
	public void btndivisi(String DIVISI) {
		btndivisi.click();
	}
	public String ShiftNotChoose() {
		return getshift.getTagName();
	}
	public void Namashift() {
		namashift.click();
	}
	public void clickNamaShift() {
		BtnnamaShift.click();
	}
	public String NoTipeAbsen() {
		return getTipe.getAttribute("");
	}
	public void btntipe(String TIPEABSEN) {
		Select select = new Select(btntipe);
		select.selectByValue(TIPEABSEN);
		btntipe.click();
	}
	public String Keterangankosong() {
		return Getketerangan.getAttribute("required");
	}
	public void keterangan(String Keterangan) {
		keterangan.sendKeys(Keterangan);
	}
	public String DataFailed() {
		return datafail.getText();
	}
	public void submit() {
		submit.click();
	}
	public String Alert() {
		return alert1.getText();
	}

	public void logout() {
		Btnlogout.click();
	}
	public String gettextdika() {
		return getTextDika.getText();
	}
}