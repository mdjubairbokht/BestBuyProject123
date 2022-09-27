package bb.bestbuy.stepDef;

import bb.bestbuy.pageAction.BestBuyCartDropDownActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BestBuyCartDropDownSteps {
	
	BestBuyCartDropDownActions BestBuyCartDropDownActionsObj = new BestBuyCartDropDownActions();
	
	
	@When("^Select Series$")
	public void select_Series() throws Throwable {
//		BestBuyCartDropDownActionsObj.switchNewWindow();
		BestBuyCartDropDownActionsObj.selectSeriesTypeDD();
	   
	}

	@When("^Select Screen Size Class$")
	public void select_Screen_Size_Class() throws Throwable {
		BestBuyCartDropDownActionsObj.SelectScreenSizeClassDD();
	}

	@When("^Select Resolution$")
	public void select_Resolution() throws Throwable {
		BestBuyCartDropDownActionsObj.SelectResolutionDD();
	}

	@Then("^Add to Shopping Cart$")
	public void add_to_Shopping_Cart() throws Throwable {
		BestBuyCartDropDownActionsObj.addToCart();
		
	}
}
