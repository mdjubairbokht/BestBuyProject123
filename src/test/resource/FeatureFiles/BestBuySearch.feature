@regression @smoke @SKYW-15 @E2E
Feature: BestBuy Search Functionality

	Scenario: Search for Laptops
		Given Open BestBuy Homepage
		When Search for Laptops
		Then Item list should have only laptops related products

		
		