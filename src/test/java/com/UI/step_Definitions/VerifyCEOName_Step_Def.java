package com.UI.step_Definitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.UI.constants.Constants;
import com.UI.page_objects.HomePage;
import com.UI.page_objects.LoginPage;
import com.UI.webdriver_manager.DriverManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyCEOName_Step_Def {


private static final Logger LOGGER = LogManager.getLogger(VerifyCEOName_Step_Def.class);
	
@Given("The user is logged in successfully and is on Homepage")
public void the_user_is_logged_in_successfully_and_is_on_homepage() throws InterruptedException {

DriverManager.getDriver().get(Constants.APP_URL);
Thread.sleep(2000);
LoginPage.USERNAME.sendKeys(Constants.USERNAME);
LoginPage.PASSWORD.sendKeys(Constants.PASSWORD);
LoginPage.LOGIN_BUTTON.click();

String url = DriverManager.getDriver().getCurrentUrl();
if(url.contains("dashboard"))
{
	LOGGER.info("The user is logged in successfully and is on Homepage");
}
  
}

@When("the user clicks on the directory option from the Menu bar")
public void the_user_clicks_on_the_directory_option_from_the_menu_bar() {
   
	HomePage.DIRECTORY.click();
  LOGGER.info("the user clicks on the directory option from the Menu bar");
}

@When("the user selects the job title as {string} from the drop down")
public void the_user_selects_the_job_title_as_from_the_drop_down(String string) {
    // Write code here that turns the phrase above into concrete actions
 System.out.println("the user selects the job title as {string} from the drop down");
}

@When("clicks the search button")
public void clicks_the_search_button() {
    // Write code here that turns the phrase above into concrete actions
System.out.println("clicks the search button");
}

@Then("the user should see the CEO name as {string}")
public void the_user_should_see_the_ceo_name_as(String string) {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("the user should see the CEO name as <message>");
}

	
}
