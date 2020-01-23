Feature: Practical Test
	In order to test the AUT
	As a registered user
	I want to run the following tests

Background:
# AUT URL: https://patientbooking.co.uk/brl/referral/
# Absence Overview page: Navbar > Other > MI Reports > Absence Overview
# Absence Management page: Navbar > Employee Management > Absence Management
# Logged-In-User's Profile page: Avatar > My Account
#
# NOTES:
#   The preferred language is C#, but please use the one you are most comfortable with.
#   Write your code as though it was for a real project: make it efficient, add comments, don't take shortcuts, follow the instructions, and provide asserts to prove your code works.
#   There are no trick steps, there may however be bugs in the application under test.
#   Please email me at vlad@meddbase.com if you are unclear on any of the steps; in the real world, colleagues will be available to support you and you'll be able to ask questions, so don't feel like this situation is any different.

@practical1
Scenario: Assert management information report results
Given I have navigated to the AUT
And I log in with valid credentials
| EMAIL            | PASSWORD                         |
| njF83mf@jN7p.z7B | 3K4Mq*S%1ejqV0iu^glcK&o$m4q^D157 |
When I navigate to the Absence Overview page
And I set the time window
| START DATE | END DATE   |
| 30/04/2019 | 30/10/2019 |
And I update the data
Then The employee surnames on the first 5 pages should include "Streater", "Acland" and "De la Yglesia", but not "Graddon" or "Shoobridge"
And Print the number of occurrences to the browser console



	@practical2
Scenario: Compare absence data with local file
Given I have navigated to the AUT
And I log in with valid credentials
| EMAIL            | PASSWORD                         |
| njF83mf@jN7p.z7B | 3K4Mq*S%1ejqV0iu^glcK&o$m4q^D157 |
When I navigate to the Absence Management page
And I use "Y" as the search criteria
And I perform the search
And I generate the CSV containing the search results
When I download the spreadsheet to a predefined directory on the local machine
Then The data in the spreadsheet should be consistent with the data displayed on screen *


@practical3
Scenario: Update the logged-in-user's details
Given I have navigated to the AUT
And I log in with valid credentials
| EMAIL            | PASSWORD                         |
| njF83mf@jN7p.z7B | 3K4Mq*S%1ejqV0iu^glcK&o$m4q^D157 |
When I navigate to the Logged-In-User's Profile page
And I update the work address details
And I update the contact options
And I confirm that an error occurs upon attempting to save without populating the required fields
And I save the changes
Then My changes should have successfully applied
