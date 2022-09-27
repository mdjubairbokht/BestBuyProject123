package bb.bestbuy.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BestBuyHomepageLocators {
	
	//Selenium Page Factory
	
		//Search Text Box
		@FindBy(xpath="//*[@id='gh-search-input']")
		public WebElement txtbxSearch;
		
		@FindBy(xpath="//*[@class='header-search-icon']")
		public WebElement btnSearch;
		
		//Credit Card 
		@FindBy (xpath= "//a[contains(text(),'My Best Buy® Credit Card')]")
		public WebElement clickCreditCard1;

		public Object clickCreditCard;

}
