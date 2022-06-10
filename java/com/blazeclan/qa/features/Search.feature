Feature: Demo app serach feature 

Scenario: Test the search functionality on Demo website 
	Given User on Demo home page 
	When User enters search item in search store filed
	And User clicks on search button
	Then Searched item should be displayed
	
	