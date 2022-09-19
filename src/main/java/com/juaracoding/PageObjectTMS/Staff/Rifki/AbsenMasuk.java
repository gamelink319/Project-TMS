package com.juaracoding.PageObjectTMS.Staff.Rifki;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.PageObjectTMS.Drivers.DriverSingleton;

	public class AbsenMasuk {
		
		
		private WebDriver driver;

			public AbsenMasuk() {
			
			this.driver = DriverSingleton.getDriver();
			PageFactory.initElements(driver, this);
		}
			//Login
			@FindBy(xpath = "//input[@placeholder='NIK']")
			private WebElement Inputnik;	
			
			@FindBy(xpath = "//input[@placeholder='Password']")
			private WebElement Inputpassword;

			@FindBy(xpath = "//button[@type='submit']")
			private WebElement btnsubmit;

			@FindBy(xpath = "//h1[@class='page-header']")
			private WebElement GetTextdashboard;
			
			//Laporan Kegiatan Absen Masuk
			@FindBy(xpath = "//span[normalize-space()='Laporan Kegiatan']")
			private WebElement btnlaporan;
			
			@FindBy(xpath  = "//a[normalize-space()='Absen Masuk']")
			private WebElement btnmasuk;
			
			@FindBy(xpath = "//input[@id='file']")
			private WebElement btnfile;
			
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

			//Laporan Kegiatan Absen Pulang
			@FindBy(xpath = "//span[normalize-space()='Laporan Kegiatan']")
			private WebElement Inputlaporan;
			
			@FindBy(xpath  = "//a[normalize-space()='Absen Pulang']")
			private WebElement Inputpulang;
			
			@FindBy(xpath = "//input[@id='file']")
			private WebElement Inputfile;
			
			@FindBy(xpath = "//select[@id='divisi']")
			private WebElement Inputdivisi;
			
			@FindBy(xpath = "//select[@id='type_shift']")
			private WebElement Inputshift;
			
			@FindBy(xpath = "//div[@class='filter-option-inner-inner']")
			private WebElement Inputnamashift;

			@FindBy(xpath = "//select[@id='absen_type']")
			private WebElement Inputtipe;
			
			@FindBy(xpath = "//input[@aria-label='Search']")
			private WebElement inputTwo;
			
			@FindBy(xpath = "//textarea[@name='keterangan']")
			private WebElement Inputketerangan;

			@FindBy(xpath = "//input[@value='Submit']")
			private WebElement Inputsubmit;

			@FindBy(xpath="//div[@class='panel-heading ui-sortable-handle']")
			private WebElement Inputalert;

			
			
		//Replace Absen Masuk
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
			public void btnmasuk() {
				btnmasuk.click();
			}
			public void btnfile() {
				btnfile.click();
			}

			public void btnfile1() {
				btnfile.sendKeys("C:\\Users\\Xh\\Downloads\\se.png");
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
//				Select select = new Select(btnnamashift);
//				select.selectByValue(NAMASHIFT);
//				btnnamashift.click();
				namashift.click();
				input.sendKeys("Non Shift");
				input.sendKeys(Keys.ENTER);
			}
			public void btntipe(String TIPESHIFT) {
				Select select = new Select(btntipe);
				select.selectByValue(TIPESHIFT);
				btntipe.click();
			}
			public void keterangan() {
				keterangan.sendKeys("SAYA PALING RAJIN LOHH");
			}
			public void submit() {
				submit.click();
			}
			//Replace Absen Pulang
			public void Inputlaporan() {
				Inputlaporan.click();
			}
			public void btnpulang() {
				Inputpulang.click();
			}
			public void Inputfile() {
				Inputfile.click();
			}

			public void btnfile2() {
				Inputfile.sendKeys("C:\\Users\\HP\\Downloads\\1 (1).jpg");
			}
			public void Inputdivisi(String DIVISI) {
				Select select = new Select(Inputdivisi);
				select.selectByValue(DIVISI);
				Inputdivisi.click();
			}
			public void Inputshift(String SHIFT) {
				Select select = new Select(Inputshift);
				select.selectByValue(SHIFT);
				Inputshift.click();
			}
			public void Inputnamashift() {
//				Select select = new Select(btnnamashift);
//				select.selectByValue(NAMASHIFT);
//				btnnamashift.click();
				Inputnamashift.click();
				inputTwo.sendKeys("Non Shift");
				inputTwo.sendKeys(Keys.ENTER);
			}
			public void Inputtipe(String TIPESHIFT) {
				Select select = new Select(Inputtipe);
				select.selectByValue(TIPESHIFT);
				Inputtipe.click();
			}
			public void Inputketerangan() {
				Inputketerangan.sendKeys("SAYA PALING RAJIN LOHH");
			}
			public void Inputsubmit() {
				Inputsubmit.click();
			}
			public String Inputalert() {
				return Inputalert.getText();
			}
			
		}