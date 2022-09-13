package com.juaracoding.PageObjectTMS.Staff;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.PageObjectTMS.Drivers.DriverSingleton;

public class TestLoginStaffTMS {

	private WebDriver driver;

	public TestLoginStaffTMS() {
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

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement clickBtnLogin2;

	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement passwordRequired;

	@FindBy(xpath = "//input[@placeholder='NIK']")
	private WebElement nikInvalid;

	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement passwordInvalid;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement clickBtnLogin3;

	@FindBy(xpath = "//*[@id=\"page-container\"]/div/div[1]")
	private WebElement getWrongUsernameOrPassword;

	@FindBy(xpath = "//input[@placeholder='NIK']")
	private WebElement nikValid;

	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement passwordValid;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement clickBtnLogin4;
	
	@FindBy(xpath = "//h1[@class='page-header']")
	private WebElement getTxtDashboard;

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
	
	public void clickLogin2() {
		clickBtnLogin2.click();
	}
	
	public String getPasswordRequired() {
		return passwordRequired.getAttribute("required");
	}
	
	public void login3(String nik, String password) {
		this.nikInvalid.sendKeys(nik);
		this.passwordInvalid.sendKeys(password);
	}
	
	public void clickLogin3() {
		clickBtnLogin3.click();
	}
	
	public String getWrongMsg() {
		return getWrongUsernameOrPassword.getText();
	}
	
	public void login4(String nik, String password) {
		this.nikValid.sendKeys(nik);
		this.passwordValid.sendKeys(password);
	}
	
	public void clickLogin4() {
		clickBtnLogin4.click();
	}
	
	public String getDashboard() {
		return getTxtDashboard.getText();
	}

}
