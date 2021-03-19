@regression 
Feature: ebay brand outline 
@tarek
Scenario Outline: Search for items with brands 
	Given Open Ebay Website 
	When search for "<item>" 
	And filter by "<brand>" 
	Then Displayed products by "<brand>" 
	Examples: 
		|item |brand         |
		|shirt|Tommy Hilfiger|
		|watch|Casio         |
		|pant |DOCKERS       |