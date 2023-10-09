@timesheets
Feature: This feature is to get pending timesheet
Scenario Outline: This test is to verify the pending timesheet
	Given The user is on Homepage
	When the user clicks on the time option from the Menu bar
	And the user enters the name as "Jon Snow"
	And clicks the view button
	Then the user should see the message as "<message>"
Examples: 
|message|
|No timesheets found|