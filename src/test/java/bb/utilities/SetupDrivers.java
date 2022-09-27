package bb.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupDrivers {
	
	public static WebDriver driver;
	
	public static void SetupDrive(){
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized"); 
		options.addArguments("--disable-notifications");
//		options.addArguments("--headless");  
		driver = new ChromeDriver(options);
		driver.get("https://www.bestbuy.com/");
		
	}
	
	public static WebDriver getDriver(){
		return driver;
	}
	
	public static void tearDownDriver(){
		driver.close();
		driver.quit();
		
	}
}
