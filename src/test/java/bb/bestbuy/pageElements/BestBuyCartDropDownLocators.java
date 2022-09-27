package bb.bestbuy.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BestBuyCartDropDownLocators {
	
	// Insignia Smart TV Series type
		@FindBy (xpath="//*[@id='Home_Video_Series']")
		public WebElement ddSeriesType;
		
	// Insignia Smart TV Screen Size Class
		@FindBy (xpath="//*[@id='Televisions_Screen_Size_Class']")
		public WebElement ddScreenSizeClass;
		
	// Insignia Smart TV Resolution
	  @FindBy (xpath="//*[@id='Televisions_Resolution']")
	  public WebElement ddResolation;
	  
	// Add to Cart
		@FindBy (xpath="//*[@data-button-state='ADD_TO_CART']")
		public WebElement btnAddCart;
		

}
