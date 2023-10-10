package com.UI.step_Definitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.UI.Utilities.CommonUtils;
import com.UI.constants.Constants;
import com.UI.webdriver_manager.DriverManager;

import io.cucumber.java.Before;

public class Common_Step_Definition {

	
	
	private static final Logger LOGGER = LogManager.getLogger(Common_Step_Definition.class);

	
	@Before
	public void beforescenario()
	{
	LOGGER.info("Execution started");	
		try {
			LOGGER.info("Instantiation the common utils.");
			CommonUtils commonUtils = new CommonUtils();
			LOGGER.info("Loading the properties file");
			commonUtils.loadproperties();
			LOGGER.info("Checking the Driver is NULL or Not");
			if(DriverManager.getDriver()==null)
			{
				LOGGER.info("Driver is NULL.Instantiating it.");
				DriverManager.launchbrowser();	
				commonUtils.initWebElements();
			}

		}
		catch (Exception e){
			e.printStackTrace();
		}
	}

	}
