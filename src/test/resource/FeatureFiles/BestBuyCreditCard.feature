@regression @smoke @SKYW-15 @E2E
Feature: BestBuy Credit Card Page

	Background: 
		Given Open BestBuy Homepage

	Scenario: Search for Laptops
		Given Open BestBuy Homepage
		When Click on the My Best Buy Credit Card
		Then Navigate to the credit Card page

		
		