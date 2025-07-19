package com.app.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.base.Utility;

public class LoginPage_Locators extends Utility {

	// Pagefactory 
	// 1. Constructor is use to initialize the webdriver -> PageFactory C initElemnnts 
	// this keyword -? to point the current class variables
	//we are using constructor to execute first to initialize the webelemnt 
	// Encapsulation logic is used in the pagefactor to locate the webelement	
	
	public LoginPage_Locators() {
		PageFactory.initElements(driver, this);
	}

	// @FindBy

	@FindBy(id = "username")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id = "login")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

}
