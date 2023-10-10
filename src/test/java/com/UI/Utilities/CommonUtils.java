package com.UI.Utilities;

import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import com.UI.constants.Constants;
import com.UI.page_objects.DirectoryPage;
import com.UI.page_objects.HomePage;
import com.UI.page_objects.LoginPage;
import com.UI.webdriver_manager.DriverManager;

public class CommonUtils {

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
	PageFactory.initElements(DriverManager.getDriver(),LoginPage.class);
	PageFactory.initElements(DriverManager.getDriver(),HomePage.class);
	PageFactory.initElements(DriverManager.getDriver(),DirectoryPage.class);
}
	
}
