package com.app.pageexe;

import com.app.base.Utility;
import com.app.locators.SearchHotel_Locators;

public class SearchHotelPageExe extends LoginPageExe{

//	public static void location() {
//		Utility.inputText(new SearchHotel_Locators().getLocation(), Utility.excelreuse(1, 0));
//	}
	
	public static void location() {
		Utility.inputText(new SearchHotel_Locators().getLocation(), "Melbourne");
	}
}
