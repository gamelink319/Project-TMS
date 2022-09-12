package com.juaracoding.PageObjectTMS.Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.PageObjectTMS.Drivers.DriverSingleton;

public class LoginAdmin {

	private WebDriver driver;

	public LoginAdmin() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='NIK']")
	private WebElement InputNIK;

	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement InputPassword;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement BtnLogin;
    
	@FindBy(xpath = "//center[normalize-space()='Selamat datang, Admin TMS']")
	private WebElement GetTitleDashboard;
	
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissable']")
	private WebElement AlertFail;
	
	@FindBy(xpath = "//button[@type='button']")
	private WebElement BtnAlert;


	public void InputNIK(String NIK) {
		InputNIK.sendKeys(NIK);
	}
	
	public void InputPassword(String Password) {
		InputPassword.sendKeys(Password);
	}
	
	public void ButtonLogin() {
		BtnLogin.click();
	}
	
	public String GetTextDashboard() {
		return GetTitleDashboard.getText();
	}
	
	public Boolean GetAlert() {
		if(AlertFail.getText().contains("Wrong")) {
			return true;
		}
		return GetAlert();
	}
}