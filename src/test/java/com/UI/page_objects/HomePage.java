package com.UI.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	private static HomePage HomePageInstance;
	
	private HomePage()
	{
		
	}
	
	public static HomePage getInstance()
	{
		if(HomePageInstance==null)
		{
			HomePageInstance = new HomePage();
		}
		return HomePageInstance;
		
	}
	
	@FindBy(xpath="//a[@href=\"/web/index.php/directory/viewDirectory\"]")
	private WebElement DIRECTORY;

//	public WebElement getDIRECTORY() {
//		return DIRECTORY;
//	}

	public void clickDirectory()
	{
		DIRECTORY.click();
	}
	
	
}
