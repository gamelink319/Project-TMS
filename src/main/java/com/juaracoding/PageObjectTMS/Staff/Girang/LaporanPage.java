package com.juaracoding.PageObjectTMS.Staff.Girang;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.PageObjectTMS.Drivers.DriverSingleton;

public class LaporanPage {

	private WebDriver driver;

	public LaporanPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement clickBtnLogin1;

	@FindBy(xpath = "//input[@placeholder='NIK']")
	private WebElement nikRequired;

	@FindBy(xpath = "//input[@placeholder='NIK']")
	private WebElement nik;

	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement passwordRequired;

	@FindBy(xpath = "//input[@placeholder='NIK']")
	private WebElement nikInvalid;

	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement passwordInvalid;

	@FindBy(xpath = "//*[@id=\"page-container\"]/div/div[1]")
	private WebElement getWrongUsernameOrPassword;

	@FindBy(xpath = "//input[@placeholder='NIK']")
	private WebElement nikValid;

	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement passwordValid;

	@FindBy(xpath = "//h1[@class='page-header']")
	private WebElement getTxtDashboard;

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

	@FindBy(xpath = "//*[@id=\"type_shift\"]")
	private WebElement tipeShiftRequired;

	@FindBy(xpath = "//*[@id=\"type_shift\"]")
	private WebElement chooseCalCenter1;

	@FindBy(xpath = "//*[@id=\"type_shift\"]/option[2]")
	private WebElement showCalCenter1;

	@FindBy(xpath = "//*[@id=\"type_shift\"]")
	private WebElement chooseCalCenter2;

	@FindBy(xpath = "//*[@id=\"type_shift\"]/option[3]")
	private WebElement showCalCenter2;

	@FindBy(xpath = "//div[@class='filter-option-inner-inner']")
	private WebElement nameShiftRequired;

	@FindBy(xpath = "//*[@id=\"uploadimage\"]/div[4]/div/button/div/div")
	private WebElement clickNameShift1;

	@FindBy(xpath = "//span[normalize-space()='Non Shift']")
	private WebElement clickNonShift;

	@FindBy(xpath = "//*[@id=\"uploadimage\"]/div[4]/div/div/div[2]/ul/li[2]/a")
	private WebElement viewNonShift;

	@FindBy(xpath = "//span[normalize-space()='D1 (10:00 - 18:00)']")
	private WebElement clickD1;

	@FindBy(xpath = "//*[@id=\"uploadimage\"]/div[4]/div/button/div/div/div")
	private WebElement viewD1;

	@FindBy(xpath = "//span[normalize-space()='D2 (12:00 - 20:00)']")
	private WebElement clickD2;

	@FindBy(xpath = "//*[@id=\"uploadimage\"]/div[4]/div/button/div/div/div")
	private WebElement viewD2;

	@FindBy(xpath = "//span[normalize-space()='D3 (13:00 - 21:00)']")
	private WebElement clickD3;

	@FindBy(xpath = "//*[@id=\"uploadimage\"]/div[4]/div/button/div/div/div")
	private WebElement viewD3;

	@FindBy(xpath = "//span[normalize-space()='SENIN PAGI (09:00 - 14:00)']")
	private WebElement clickSeninPagi;

	@FindBy(xpath = "//*[@id=\"uploadimage\"]/div[4]/div/button/div/div/div")
	private WebElement viewSeninPagi;

	@FindBy(xpath = "//span[normalize-space()='SENIN MIDDLE (12:00 - 17:00)']")
	private WebElement clickSeninMiddle;

	@FindBy(xpath = "//*[@id=\"uploadimage\"]/div[4]/div/button/div/div/div")
	private WebElement viewSeninMiddle;

	@FindBy(xpath = "//span[normalize-space()='SENIN SIANG (16:00 - 21:00)']")
	private WebElement clickSeninSiang;

	@FindBy(xpath = "//*[@id=\"uploadimage\"]/div[4]/div/button/div/div/div")
	private WebElement viewSeninSiang;

	@FindBy(xpath = "//select[@id='absen_type']")
	private WebElement getAlertTipeAbsen;

	@FindBy(xpath = "//*[@id=\"absen_type\"]")
	private WebElement chooseWFH;

	@FindBy(xpath = "//*[@id=\"absen_type\"]/option[2]")
	private WebElement getTxtWFH;

	@FindBy(xpath = "//*[@id=\"absen_type\"]")
	private WebElement chooseWFO;

	@FindBy(xpath = "//*[@id=\"absen_type\"]/option[3]")
	private WebElement getTxtWFO;

	@FindBy(xpath = "//*[@id=\"uploadimage\"]/div[6]/textarea")
	private WebElement getAlertTextArea;

	@FindBy(xpath = "//textarea[@name='keterangan']")
	private WebElement inputText;

	@FindBy(xpath = "//textarea[@name='keterangan']")
	private WebElement viewText;

	@FindBy(xpath = "/html/body/p")
	private WebElement dataFail;

	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div/div[1]/div/h1")
	private WebElement getTxtSuccesInput;

	@FindBy(xpath = "//span[normalize-space()='Logout']")
	private WebElement clickNavLogout;

	@FindBy(xpath = "//*[@id=\"page-container\"]/div/div[1]/div[1]/b")
	private WebElement getTxtDIKA1;

	@FindBy(xpath = "//*[@id=\"header\"]/ul/li/a/span")
	private WebElement clickProfil;

	@FindBy(xpath = "//a[@class='dropdown-item']")
	private WebElement clickProfillLogout;

	public void login1(String password) {
		this.password.sendKeys(password);
	}

	public void clickLogin1() {
		clickBtnLogin1.click();
	}

	public String getNIKRequired() {
		return nikRequired.getAttribute("required");
	}

	public void login2(String nik) {
		this.nik.sendKeys(nik);
	}

	public String getPasswordRequired() {
		return passwordRequired.getAttribute("required");
	}

	public void login3(String nik, String password) {
		this.nikInvalid.sendKeys(nik);
		this.passwordInvalid.sendKeys(password);
	}

	public String getWrongMsg() {
		return getWrongUsernameOrPassword.getText();
	}

	public void login4(String nik, String password) {
		this.nikValid.sendKeys(nik);
		this.passwordValid.sendKeys(password);
	}

	public String getDashboard() {
		return getTxtDashboard.getText();
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
		return getBtnSubmit.getTagName();
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

	public void clickButtonSubmit() {
		clicksubmit1.click();
	}

	public String getTxtRequiredFromDivisi() {
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

	public String getRequiredFromTipeShift() {
		return tipeShiftRequired.getAttribute("required");
	}

	public void selectTipeShift1() {
		Select select = new Select(chooseCalCenter1);
		select.selectByValue("Call Center 1");
	}

	public String viewCallCenter1() {
		return showCalCenter1.getTagName();
	}

	public void selectTipeShift2() {
		Select select = new Select(chooseCalCenter2);
		select.selectByValue("Call Center 2");
	}

	public String viewCallCenter2() {
		return showCalCenter2.getTagName();
	}

	public String getRequiredFromNamaShift() {
		return nameShiftRequired.getTagName();
	}

	public void clickButtonNameShift1() {
		clickNameShift1.click();
	}

	public void selectNamaShift() {
		clickNonShift.click();
	}

	public String getNonShift() {
		return viewNonShift.getTagName();
	}

	public void selectD1() {
		clickD1.click();
	}

	public String getD1() {
		return viewD1.getTagName();
	}

	public void selectD2() {
		clickD2.click();
	}

	public String getD2() {
		return viewD2.getTagName();
	}

	public void selectD3() {
		clickD3.click();
	}

	public String getD3() {
		return viewD3.getTagName();
	}

	public void selectSeninPagi() {
		clickSeninPagi.click();
	}

	public String getSeninPagi() {
		return viewSeninPagi.getTagName();
	}

	public void selectSeninMiddle() {
		clickSeninMiddle.click();
	}

	public String getSeninMiddle() {
		return viewSeninMiddle.getTagName();
	}

	public void selectSeninSiang() {
		clickSeninSiang.click();
	}

	public String getSeninSiang() {
		return viewSeninSiang.getTagName();
	}

	public String getRequiredTxtPleaseSelect() {
		return getAlertTipeAbsen.getAttribute("required");
	}

	public void selectTipeWFH() {
		Select select = new Select(chooseWFH);
		select.selectByValue("WFH");
	}

	public String viewWFH() {
		return getTxtWFH.getTagName();
	}

	public void selectTipeWFO() {
		Select select = new Select(chooseWFO);
		select.selectByValue("WFO");
	}

	public String viewWFO() {
		return getTxtWFO.getTagName();
	}

	public String getTxtPleaseFillOut() {
		return getAlertTextArea.getAttribute("required");
	}

	public void inputTextArea(String ket) {
		this.inputText.sendKeys(ket);
	}

	public String viewTextHasFilled() {
		return viewText.getTagName();
	}

	public String dataFailedTosend() {
		return dataFail.getText();
	}

	public String succesInputAbsen() {
		return getTxtSuccesInput.getText();
	}

	public void clickBtnNavLogout() {
		clickNavLogout.click();
	}

	public String getPageSign1() {
		return getTxtDIKA1.getText();
	}

	public void cekProfill() {
		clickProfil.click();
	}

	public void clickBtnLogoutProfill() {
		clickProfillLogout.click();
	}
}