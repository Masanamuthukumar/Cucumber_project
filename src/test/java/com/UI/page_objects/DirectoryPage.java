package com.UI.page_objects;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.UI.webdriver_manager.DriverManager;

public class DirectoryPage {

	private static DirectoryPage DirectoryPageInstance;
	
	private DirectoryPage()
	{
		
	}
	
	public static DirectoryPage getInstance()
	{
		if(DirectoryPageInstance==null)
		{
			DirectoryPageInstance = new DirectoryPage();
		}
		return DirectoryPageInstance;
		
	}
	@FindBy(xpath="(//div[@class=\"oxd-select-wrapper\"])[1]")
	private WebElement JOB_TITLE;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	private WebElement SEARCH;

	@FindBy(xpath="//p[@class=\"oxd-text oxd-text--p orangehrm-directory-card-header --break-words\"]")
	private WebElement NAME;

//	public WebElement getJOB_TITLE() {
//		return JOB_TITLE;
//	}
//
//	public WebElement getSEARCH() {
//		return SEARCH;
//	}
//
//	public WebElement getNAME() {
//		return NAME;
//	}
	
	public void selectJobTitle()
	{
		JOB_TITLE.click();
		Actions obj2 = new Actions(DriverManager.getDriver());
		Action lan = obj2
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ENTER)
				.build();
				lan.perform();
	}
	
	public void clicksearch()
	{
		SEARCH.click();
	}
	public String getPersonName()
	{
		return NAME.getText();
		
	}
	
}
