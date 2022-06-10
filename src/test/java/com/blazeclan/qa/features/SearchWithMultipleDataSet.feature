Feature: Demo app serach feature with multiple data set

Scenario Outline: Test the search functionality with multiple data set
	
	Given User opens the browser
	When User on homepage check the homepage title 
	Then User search multiple items "<SearchItem>" in search store filed
	And Click on the search button
 	Then Check for page title
 	
	
Examples:
|SearchItem|
|Mobile|
|Tabs|
