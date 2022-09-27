package bb.bestbuy.stepDef;

import bb.bestbuy.pageAction.BestBuyHomepageActions;
import bb.bestbuy.pageAction.BestBuySearchResultActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BestBuyHomepageSteps {
	
	BestBuyHomepageActions BestBuyHomepageActionsObj = new BestBuyHomepageActions();
	
	@Given("^Open BestBuy Homepage$")
	public void open_BestBuy_Homepage() throws Throwable {
		//to..
	}

	@When("^Search for Laptops$")
	public void search_for_Laptops() throws Throwable {
		BestBuyHomepageActionsObj.searchLaptops();
		
	}
	
	@Given("^Search for \"([^\"]*)\"$")
	public void search_for(String items) throws Throwable {
		BestBuyHomepageActionsObj.searchItems(items);
	} 
	
	@Given("^Search for Insignia Smart TV$")
	public void search_for_Insignia_Smart_TV() throws Throwable {
		BestBuyHomepageActionsObj.searchInsigniaSmartTV();
	
	}
	
	@When("^Click on the My Best Buy Credit Card$")
	public void click_on_the_My_Best_Buy_Credit_Card() throws Throwable {
		BestBuyHomepageActionsObj.clickCreditCard();
		
	}
}
	
	
