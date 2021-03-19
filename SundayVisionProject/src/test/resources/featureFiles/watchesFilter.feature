@regression
Feature: Filter items from ebay.com
@tarek
	Scenario: As a user I should be able to filter for watches
		Given home page of ebay
		When search for watch
		Then Displayed watch products only
