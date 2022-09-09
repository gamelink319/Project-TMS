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
	private WebElement clickBtnLogin;
	
	public void login1(String password) {
		this.password.sendKeys(password);
	}
	
	public void clickLogin() {
		clickBtnLogin.click();
		
	}

}
