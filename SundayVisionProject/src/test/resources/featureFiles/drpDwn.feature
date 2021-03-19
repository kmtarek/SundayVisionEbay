@regression
Feature: Select Craft items from drop down menu of eBay
@tarek
	Scenario: As a user I should be able search craft items
		Given home page of ebay
		When search Crafts from drop down 
		Then Displayed all craft items
