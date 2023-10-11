@GetCEOName
Feature: This feature is to get the CEO name from OrangeHRM app
Scenario Outline: This test is to verify the CEO name
	Given The user is logged in successfully and is on Homepage
	When the user clicks on the directory option from the Menu bar
	And the user selects the job title as "Chief Executive Officer" from the drop down
	And clicks the search button
	Then the user should see the CEO name as "John snow"
