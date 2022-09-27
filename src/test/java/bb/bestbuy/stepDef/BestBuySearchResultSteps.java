package bb.bestbuy.stepDef;

import bb.bestbuy.pageAction.BestBuySearchResultActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BestBuySearchResultSteps {
	
	BestBuySearchResultActions BestBuySearchResultActionsObj = new BestBuySearchResultActions();
	
	@Then("^Item list should have only laptops related products$")
	public void item_list_should_have_only_laptops_related_products() throws Throwable {
		BestBuySearchResultActionsObj.verifyLaptopsItems();
	}
	@When("^Filter by \"([^\"]*)\"$")
	public void filter_by(String brand) throws Throwable {
		BestBuySearchResultActionsObj.filterBrand(brand);
	}
	@Then("^Item list should have products of \"([^\"]*)\"$")
	public void item_list_should_have_products_of(String brand) throws Throwable {
		BestBuySearchResultActionsObj.verifyBrandItems(brand);
	}
	@When("^Select the first Insignia Smart TV on item list$")
	public void select_the_first_Insignia_Smart_TV_on_item_list() throws Throwable {
		BestBuySearchResultActionsObj.selectSmartTV();
		
	}
	
	@Then("^Navigate to the credit Card page$")
	public void navigate_to_the_credit_Card_page() throws Throwable {
		BestBuySearchResultActionsObj.selectCreditcard();
	}
}
