package com.UI.step_Definitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Verify_Pending_Timesheets_Step_Def {

	private static final Logger LOGGER = LogManager.getLogger(Verify_Pending_Timesheets_Step_Def.class);
	@Given("The user is on Homepage")
	public void the_user_is_on_homepage() {
	   System.out.println("The user is on Homepage");
	}

	@When("the user clicks on the time option from the Menu bar")
	public void the_user_clicks_on_the_time_option_from_the_menu_bar() {
		 System.out.println("the user clicks on the time option from the Menu bar");
	}

	@When("the user enters the name as {string}")
	public void the_user_enters_the_name_as(String string) {
		 System.out.println("the user enters the name as Jon Smith");
	}

	@When("clicks the view button")
	public void clicks_the_view_button() {
		 System.out.println("clicks the view button");
	}

	@Then("the user should see the message as {string}")
	public void the_user_should_see_the_message_as(String string) {
		 System.out.println("the user should see the message as {string}");
	}

}
