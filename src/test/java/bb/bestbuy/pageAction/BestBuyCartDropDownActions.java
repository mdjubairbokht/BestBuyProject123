package bb.bestbuy.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import bb.bestbuy.pageElements.BestBuyCartDropDownLocators;
import bb.utilities.SetupDrivers;

public class BestBuyCartDropDownActions {
	
	BestBuyCartDropDownLocators BestBuyCartDropDownLocatorsObj;
	
	public BestBuyCartDropDownActions(){
		BestBuyCartDropDownLocatorsObj = new BestBuyCartDropDownLocators();
		PageFactory.initElements(SetupDrivers.driver, BestBuyCartDropDownLocatorsObj);
	}
	
//	public void switchNewWindow(){
//		for (String winhandle : SetupDrivers.driver.getWindowHandles()){
//			SetupDrivers.driver.switchTo().window(winhandle);
//		}	
//	}

	public void selectSeriesTypeDD() throws Exception{
		Select dropDown = new Select(BestBuyCartDropDownLocatorsObj.ddSeriesType);
		dropDown.selectByVisibleText("F50 Series");
		Thread.sleep(2000);
	}
	
	public void SelectScreenSizeClassDD() throws Exception{
		Select dropDown = new Select(BestBuyCartDropDownLocatorsObj.ddScreenSizeClass);
		dropDown.selectByVisibleText("75");
		Thread.sleep(2000);
	}
	
	public void SelectResolutionDD() throws Exception{
		Select dropDown = new Select(BestBuyCartDropDownLocatorsObj.ddResolation);
		dropDown.selectByVisibleText("Full HD (1080p)");
		Thread.sleep(2000);
	}
	
	public void addToCart() throws Exception{
		BestBuyCartDropDownLocatorsObj.btnAddCart.click();
		Thread.sleep(5000);
	}
}
