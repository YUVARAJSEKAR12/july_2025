package com.app.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchHotel_Locators extends LoginPage_Locators {

	
	@FindBy(id ="location")
	private WebElement location;

	public WebElement getLocation() {
		return location;
	}
}
