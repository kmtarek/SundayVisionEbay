@regression
Feature: Ebay Cart Functionality
@tarek
Scenario: Add product to cart
	Given Open Ebay Website
	When Search for shirts
	And Select a shirt from list
	And Select color on shirt
	And Select size on shirt
	And Select qty on shirt
	And add to cart
	Then Validate item is in the cart

