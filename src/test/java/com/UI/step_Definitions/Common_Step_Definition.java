package com.UI.step_Definitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.UI.Utilities.CommonUtils;
import com.UI.constants.Constants;
import com.UI.page_objects.LoginPage;
import com.UI.webdriver_manager.DriverManager;

import io.cucumber.java.Before;
import io.cucumber.messages.types.Scenario;

public class Common_Step_Definition {

//	private static String scenarioname=null;
//	
//	public static String getScenarioname() {
//		return scenarioname;
//	}


	private static final Logger LOGGER = LogManager.getLogger(Common_Step_Definition.class);

	
	@Before
	public void beforescenario()
	{
	LOGGER.info("Execution started");	
		try {
			//scenarioname=scenario.getName();
			LOGGER.info("Instantiation the common utils.");
			LOGGER.info("Loading the properties file");
			CommonUtils.getInstance().loadproperties();
			LOGGER.info("Checking the Driver is NULL or Not");
			if(DriverManager.getDriver()==null)
			{
				LOGGER.info("Driver is NULL.Instantiating it.");
				DriverManager.launchbrowser();	
				CommonUtils.getInstance().initWebElements();
			}
			login();
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}


	private void login() throws InterruptedException {
		// TODO Auto-generated method stub
		DriverManager.getDriver().get(Constants.APP_URL);
		Thread.sleep(2000);
		LoginPage.getInstance().enterUserName(Constants.USERNAME);
		LoginPage.getInstance().enterpassword(Constants.PASSWORD);
		LoginPage.getInstance().clickLoginButton();
		
	}

	}
