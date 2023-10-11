package com.UI.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	private static LoginPage LoginPageInstance;
	
	private LoginPage()
	{
		
	}
	
	public static LoginPage getInstance()
	{
		if(LoginPageInstance==null)
		{
			LoginPageInstance = new LoginPage();
		}
		return LoginPageInstance;
	}
	
	@FindBy(xpath="//input[@name=\"username\"]")
	private WebElement USERNAME;
	
	@FindBy(xpath="//input[@type=\"password\"]")
	private WebElement PASSWORD;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	private WebElement LOGIN_BUTTON;

//	public WebElement getUSERNAME() {
//		return USERNAME;
//	}
//
//	public WebElement getPASSWORD() {
//		return PASSWORD;
//	}
//
//	public WebElement getLOGIN_BUTTON() {
//		return LOGIN_BUTTON;
//	}
	
	public void enterUserName(String username)
	{
		USERNAME.sendKeys(username);
	}
	public void enterpassword(String password)
	{
		PASSWORD.sendKeys(password);
	}
	public void clickLoginButton()
	{
		LOGIN_BUTTON.click();
	}
}
