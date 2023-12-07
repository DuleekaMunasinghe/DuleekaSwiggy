package com.swiggy.actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.swiggy.locators.CheckOutPageLocators;
import com.swiggy.utils.HelperClass;

public class CheckOutPageActions extends HelperClass {
	
	private static WebDriverWait wait;
	
	public CheckOutPageActions(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public static String getMsg() {
		
		wait.until(ExpectedConditions.visibilityOf(CheckOutPageLocators.HeadingMsg(getDriver())));
		String text = CheckOutPageLocators.HeadingMsg(getDriver()).getText();
		return text;
	}

}