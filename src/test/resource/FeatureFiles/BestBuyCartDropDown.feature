@regression @smoke @us-248
Feature: BestBuy Cart Functionality

Description: User should able to checkout using cart

	Background: 
		Given Open BestBuy Homepage
	
	Scenario: BestBuy Checkout functionality 
		Given Search for Insignia Smart TV
		When Select the first Insignia Smart TV on item list
		And Select Series
		And Select Screen Size Class
		And Select Resolution
		Then Add to Shopping Cart