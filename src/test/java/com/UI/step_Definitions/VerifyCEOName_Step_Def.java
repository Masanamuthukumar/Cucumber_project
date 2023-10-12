package com.UI.step_Definitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.UI.Utilities.CommonUtils;
import com.UI.constants.Constants;
import com.UI.page_objects.DirectoryPage;
import com.UI.page_objects.HomePage;
import com.UI.page_objects.LoginPage;
import com.UI.webdriver_manager.DriverManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyCEOName_Step_Def {


	private static final Logger LOGGER = LogManager.getLogger(VerifyCEOName_Step_Def.class);

	@Given("The user is logged in successfully and is on Homepage")
	public void the_user_is_logged_in_successfully_and_is_on_homepage() throws InterruptedException {

		try {

			String url = DriverManager.getDriver().getCurrentUrl();
			if(url.contains("dashboard"))
			{
				LOGGER.info("The user is logged in successfully and is on Homepage");
			}

		}catch(Exception e) 
		{
			LOGGER.error(e);
			CommonUtils.getInstance().takeScreenshot();
		}
	}
	@When("the user clicks on the directory option from the Menu bar")
	public void the_user_clicks_on_the_directory_option_from_the_menu_bar() throws InterruptedException {

		try {
			Thread.sleep(2000);
			HomePage.getInstance().clickDirectory();
			Thread.sleep(2000);
			LOGGER.info("the user clicks on the directory option from the Menu bar");
		}
		catch (Exception e) {
			LOGGER.error(e);
			CommonUtils.getInstance().takeScreenshot();
		}
	}
	@When("the user selects the job title as {string} from the drop down")
	public void the_user_selects_the_job_title_as_from_the_drop_down(String jobTitle) {

		try {
			DirectoryPage.getInstance().selectJobTitle();
			LOGGER.info("the user selects the job title as {Cheif Executive Officer} from the drop down");
		}
		catch (Exception e) {
			LOGGER.error(e);
			CommonUtils.getInstance().takeScreenshot();
		}}

	@When("clicks the search button")
	public void clicks_the_search_button() {
		// Write code here that turns the phrase above into concrete actions
		try {
			DirectoryPage.getInstance().clicksearch();
			LOGGER.info("clicks the search button");
		}catch (Exception e) {
			LOGGER.error(e);
			CommonUtils.getInstance().takeScreenshot();
		}
	}

	@Then("the user should see the CEO name as {string}")
	public void the_user_should_see_the_ceo_name_as(String expectedName) throws InterruptedException {
		try {
			Thread.sleep(2000);
			String actualname = DirectoryPage.getInstance().getPersonName();
			if(actualname.equalsIgnoreCase(expectedName))
			{
				LOGGER.info("the user should see the CEO name as <John Smith>");
			}
		}catch (Exception e) {
			LOGGER.error(e);
			CommonUtils.getInstance().takeScreenshot();
			
		}
	}


}
