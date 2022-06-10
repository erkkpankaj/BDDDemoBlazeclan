Feature: Complete test suite 

Scenario: Test the search functionality on Demo application 
	Given User opens the browser
	When User on homepage check the homepage title 
	Then Enter the search item in search store field
	And Click on the search button
 	Then Check for page title

Scenario: Hooks concpets
	Given User opens the browser
	When User on homepage check the homepage title 
	
	
Scenario: Test the search functionality with data parameter
		Given User opens the browser
	When User on homepage check the homepage title 
	Then User enters search item "Mobile" in search store filed
	And Click on the search button
 	Then Check for page title