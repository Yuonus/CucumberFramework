Feature: Amazon Search
					As a user I should be able to earch item
					and the searched item should be relevant to the search
		
	@amazonSearch @SmokeTests				
	Scenario Outline: User is able to search multiple data set
	Given I am on the amazon home page
	When I search item "<items>" 
	And I click search button
	Then Searched item "<items>" should be displayed in the search bar
	
	Examples: items
	|items|
	|Coffee mug|
	|Pretty coffee mug|
	|Cool coffee mug|
	|Cute coffee mug|
	|ugly coffee mug|
	
	
	