@regression
Feature: Read and Reply Messages from ebay.com
@tarek
	Scenario: As a user I should be able to mouseHover to myEbay
		Given home page of ebay
		When move mouse to myEbay and select Messages
		Then Displayed My eBay: Messages
