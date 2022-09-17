package com.juaracoding.PageObjectTMS.Staff;

import org.openqa.selenium.Keys;
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
	
	@FindBy(xpath = "//select[@id='divisi']")
	private WebElement btndivisi;
	
	@FindBy(xpath = "//select[@id='type_shift']")
	private WebElement btnshift;
	
	@FindBy(xpath = "//div[@class='filter-option-inner-inner']")
	private WebElement namashift;

	@FindBy(xpath = "//select[@id='absen_type']")
	private WebElement btntipe;
	
	@FindBy(xpath = "//input[@aria-label='Search']")
	private WebElement input;
	
	@FindBy(xpath = "//textarea[@name='keterangan']")
	private WebElement keterangan;

	@FindBy(xpath = "//input[@value='Submit']")
	private WebElement submit;

	@FindBy(xpath="//div[@class='panel-heading ui-sortable-handle']")
	private WebElement alert;

	@FindBy(xpath = "//i[@class='fa fa-power-off']")
	private WebElement Btnlogout;
	
	@FindBy(xpath = "//b[normalize-space()='DIKA']")
	private WebElement getTextDika;

	
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
	public String alert() {
		return alert.getText();
	}
	public void btnlaporan() {
		btnlaporan.click();
	}
	public void Btnoff() {
		Btnoff.click();
	}

	public void ClickChooseFile(String File) {
		BtnChooseFile.sendKeys(File);
	}
	public void btndivisi(String DIVISI) {
		Select select = new Select(btndivisi);
		select.selectByValue(DIVISI);
		btndivisi.click();
	}
	public void btnshift(String SHIFT) {
		Select select = new Select(btnshift);
		select.selectByValue(SHIFT);
		btnshift.click();
	}
	public void btnnamashift() {
//		Select select = new Select(namashift);
//		select.selectByVisibleText("D6 (11:00 - 20:00)");
//		namashift.click();
		namashift.click();
		input.sendKeys("Non Shift");
		input.sendKeys(Keys.ENTER);
	}
	public void btntipe(String TIPEABSEN) {
		Select select = new Select(btntipe);
		select.selectByValue(TIPEABSEN);
		btntipe.click();
	}
	public void keterangan() {
		keterangan.sendKeys("Saya off hari ini");
	}
	public void submit() {
		submit.click();
	}

	public void logout() {
		Btnlogout.click();
	}
	public String gettextdika() {
		return getTextDika.getText();
	}
}