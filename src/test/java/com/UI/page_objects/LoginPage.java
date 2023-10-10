package com.UI.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(xpath="//input[@name=\"username\"]")
	public static WebElement USERNAME;
	
	@FindBy(xpath="//input[@type=\"password\"]")
	public static WebElement PASSWORD;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	public static WebElement LOGIN_BUTTON;
}
