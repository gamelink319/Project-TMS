package com.juaracoding.PageObjectTMS.Staff;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.PageObjectTMS.Drivers.DriverSingleton;

public class LogOutStaffTMSPage {

	private WebDriver driver;

	public LogOutStaffTMSPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='NIK']")
	private WebElement inputNIK1;

	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement inputPassword1;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement clickLogin1;

	@FindBy(xpath = "//span[normalize-space()='Logout']")
	private WebElement clickNavLogout;

	@FindBy(xpath = "//*[@id=\"page-container\"]/div/div[1]/div[1]/b")
	private WebElement getTxtDIKA1;

	@FindBy(xpath = "//input[@placeholder='NIK']")
	private WebElement inputNIK2;

	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement inputPassword2;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement clickLogin2;

	@FindBy(xpath = "//*[@id=\"header\"]/ul/li/a/span")
	private WebElement clickProfil;

	@FindBy(xpath = "//a[@class='dropdown-item']")
	private WebElement clickProfillLogout;

	@FindBy(xpath = "//*[@id=\"page-container\"]/div/div[1]/div[1]/b")
	private WebElement getTxtDIKA2;

	public void goLogin1(String nik, String password) {
		this.inputNIK1.sendKeys(nik);
		this.inputPassword1.sendKeys(password);
	}

	public void clickBtnLogin1() {
		clickLogin1.click();
	}

	public void clickBtnNavLogout() {
		clickNavLogout.click();
	}

	public String getPageSign1() {
		return getTxtDIKA1.getText();
	}

	public void goLogin2(String nik, String password) {
		this.inputNIK2.sendKeys(nik);
		this.inputPassword2.sendKeys(password);
	}

	public void clickBtnLogin2() {
		clickLogin2.click();
	}

	public void cekProfill() {
		clickProfil.click();
	}

	public void clickBtnLogoutProfill() {
		clickProfillLogout.click();
	}

	public String getPageSign2() {
		return getTxtDIKA2.getText();
	}
}
