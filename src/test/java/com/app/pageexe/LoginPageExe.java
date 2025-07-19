package com.app.pageexe;

import com.app.base.Utility;
import com.app.locators.LoginPage_Locators;
import com.app.locators.SelectHotelPageLocators;

public class LoginPageExe extends SelectHotelPageLocators{
	
	public static void username() {
		Utility.inputText(new LoginPage_Locators().getUsername(), "nishanthvijaykumar6");
	}
	
	public static void password() {
		Utility.inputText(new LoginPage_Locators().getPassword(), "Nishanth@123");
	}
	
	public static void loginButton() {
		Utility.click_value(new LoginPage_Locators().getLogin());
	}

}
