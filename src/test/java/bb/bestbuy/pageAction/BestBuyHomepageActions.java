package bb.bestbuy.pageAction;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import bb.bestbuy.pageElements.BestBuyHomepageLocators;
import bb.utilities.SetupDrivers;

public class BestBuyHomepageActions {
	
	BestBuyHomepageLocators BestBuyHomepageLocatorsObj;
	
	public BestBuyHomepageActions(){
		BestBuyHomepageLocatorsObj = new BestBuyHomepageLocators();
		PageFactory.initElements(SetupDrivers.driver, BestBuyHomepageLocatorsObj);
	}
	
	public void searchLaptops(){
		BestBuyHomepageLocatorsObj.txtbxSearch.sendKeys("Laptops");
		BestBuyHomepageLocatorsObj.btnSearch.click();
	}
	
	public void searchInsigniaSmartTV(){
		BestBuyHomepageLocatorsObj.txtbxSearch.sendKeys("Insignia Smart TV");
		BestBuyHomepageLocatorsObj.btnSearch.click();
	}
	
	public void searchItems(String items) throws InterruptedException{
		BestBuyHomepageLocatorsObj.txtbxSearch.sendKeys(items);
		BestBuyHomepageLocatorsObj.btnSearch.click();
		Thread.sleep(2000);
	}
	
	public void seleniumWaits(){
		System.out.print(SetupDrivers.driver.getTitle());
		SetupDrivers.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(SetupDrivers.driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(BestBuyHomepageLocatorsObj.txtbxSearch));
		
		FluentWait fluentWait = new FluentWait(SetupDrivers.driver);						
		fluentWait.withTimeout(20, TimeUnit.SECONDS);
		fluentWait.pollingEvery(2, TimeUnit.SECONDS);
		fluentWait.ignoring(NoSuchElementException.class);
		fluentWait.withMessage("Time exceeded");
	}

	public void clickCreditCard() {
		BestBuyHomepageLocatorsObj.clickCreditCard.toString();
		
		
		
	}
}
