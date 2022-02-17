@Regression
Feature: As a user, I am able to perform Trade app Add trade functions
I want to add, delete and update trades

	@AddTrade
	Scenario: As a user, I want to add a trade
	Given I am on the Trade App log in page
	When I enter username "Yuonus" password "SuperYuonus123!"
	And I click on Trade login button
	Then I should be on Trade home page
	When I click on Add Trade button
	Then I should be on Add Save Trade page
	When I select "Buy to Open" and I enter symbol "CENN" entryDate "02/15/2022" entryPrice "1.98" exitDate "2/12/2022" exitPrice "2.10" 
	And I click Save button 
	Then The trade is displayed on the trade table
	





