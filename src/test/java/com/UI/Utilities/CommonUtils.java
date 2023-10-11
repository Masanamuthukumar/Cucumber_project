package com.UI.Utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import com.UI.constants.Constants;
import com.UI.page_objects.DirectoryPage;
import com.UI.page_objects.HomePage;
import com.UI.page_objects.LoginPage;
import com.UI.step_Definitions.Common_Step_Definition;
import com.UI.webdriver_manager.DriverManager;

public class CommonUtils {

	private static CommonUtils CommonUtilsInstance;
	
	private CommonUtils()
	{
		
	}
	
	public static CommonUtils getInstance()
	{
		if(CommonUtilsInstance==null)
		{
			CommonUtilsInstance = new CommonUtils();
		}return CommonUtilsInstance;
	}
	
	public void loadproperties()
	{

		Properties properties = new Properties();

		try {
			properties.load(getClass().getResourceAsStream("/config.properties"));
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		Constants.APP_URL= properties.getProperty("APP_URL");
		Constants.BROWSER= properties.getProperty("BROWSER");
		Constants.USERNAME= properties.getProperty("UserName");
		Constants.PASSWORD= properties.getProperty("Password");
		Constants.CHROME_DRIVER_LOCATION= properties.getProperty("CHROME_DRIVER_LOCATION");
		Constants.FIREFOX_DRIVER_LOCATION= properties.getProperty("FIREFOX_DRIVER_LOCATION");
		Constants.EDGE_DRIVER_LOCATION= properties.getProperty("EDGE_DRIVER_LOCATION");


	}

	public void initWebElements()
	{
		PageFactory.initElements(DriverManager.getDriver(),LoginPage.getInstance());
		PageFactory.initElements(DriverManager.getDriver(),HomePage.getInstance());
		PageFactory.initElements(DriverManager.getDriver(),DirectoryPage.getInstance());
	}

	public void takeScreenshot()
	{
		File screenshot = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.FILE);

		try
		{
			FileUtils.copyFile(screenshot, new File("screenshot.png"));
		}
		catch (IOException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
