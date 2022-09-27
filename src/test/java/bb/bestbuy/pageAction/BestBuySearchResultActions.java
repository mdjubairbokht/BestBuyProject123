package bb.bestbuy.pageAction;

import org.openqa.selenium.support.PageFactory;

import bb.bestbuy.pageElements.BestBuySearchResultLocators;
import bb.utilities.SetupDrivers;
import junit.framework.Assert;

public class BestBuySearchResultActions {
	
	BestBuySearchResultLocators BestBuySearchResultLocatorsObj;
	
	public BestBuySearchResultActions(){
		BestBuySearchResultLocatorsObj = new BestBuySearchResultLocators();
		PageFactory.initElements(SetupDrivers.driver, BestBuySearchResultLocatorsObj);
	}
	public void verifyLaptopsItems(){
		//1
		BestBuySearchResultLocatorsObj.txtLaptops.isDisplayed();
		//2
		// Assert.assertEquals("laptops", BestBuySearchResultLocatorsObj.txtLaptops.getText());
		//3
		//Assert.assertTrue(BestBuySearchResultLocatorsObj.txtLaptops.isDisplayed());
	}
	
	public void filterBrand(String brand){
		if (brand.equals("Microsoft")){
			BestBuySearchResultLocatorsObj.cbxBrandMicrosoft.click();
		} else if (brand.equals("Apple")){
			BestBuySearchResultLocatorsObj.cbxBrandApple.click();
	    } else if (brand.equals("Dell")){
			BestBuySearchResultLocatorsObj.cbxBrandDell.click();
	    } else {
	    	System.out.println("Brand Not Found, Please implement");
	    }
	}
	public void verifyBrandItems(String brand){
		if (brand.equals("Microsoft")){
			BestBuySearchResultLocatorsObj.txtLaptops.isDisplayed();
		} else if (brand.equals("Apple")){
			BestBuySearchResultLocatorsObj.txtKeyboard.isDisplayed();
	    } else if (brand.equals("Dell")){
			BestBuySearchResultLocatorsObj.txtMouse.isDisplayed();
	    } else {
	    	System.out.println("Brand Not Found, Please implement");
	    }
	}
	
	public void selectSmartTV(){
		BestBuySearchResultLocatorsObj.cbxBrandInsigniaSmartTV.click();
		
	}
	
	public void selectCreditcard(){
		BestBuySearchResultLocatorsObj.clickCreditCard.click();
	}
	
}
