package bb.bestbuy.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BestBuySearchResultLocators {
	
	//Validate Laptops Result
	@FindBy(xpath="//*[contains(text(),'laptops')]")
	public WebElement txtLaptops;
	
	//Validate Keyboard Result
	@FindBy(xpath="//*[contains(text(),'keyboards')]")
	public WebElement txtKeyboard;
	
	//Validate Mouse Result
	@FindBy(xpath="//*[contains(text(),'mouses')]")
	public WebElement txtMouse;
	
	// Brand Microsoft
	@FindBy (xpath="//input[@aria-label='Microsoft, 117 results']")
	public WebElement cbxBrandMicrosoft;
	
	// Brand Apple
	@FindBy (xpath="//input[@aria-label='Apple, 218 results']")
	public WebElement cbxBrandApple;
		
	// Brand Dell
	@FindBy (xpath="//input[@aria-label='Dell, 2 results']")
	public WebElement cbxBrandDell;
	
	// Insignia Smart TV link ***
	@FindBy (xpath= "//*[@id='shop-sku-list-item-96757665']/div/div/div[1]/h4/a")
	public WebElement cbxBrandInsigniaSmartTV;
	
	//Credit Card 
	@FindBy (xpath= "//h1[contains(text(),'My Best Buy® Credit Cards')]")
	public WebElement clickCreditCard;
	

}
