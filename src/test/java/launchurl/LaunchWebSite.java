package launchurl;		

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;	

public class LaunchWebSite {		
	    private WebDriver driver;	
	    
		@Test				
		public void testEasy() {	
			driver.get("https://www.google.co.in/"); 
			String title = driver.getTitle();	
			System.out.println("The website tile is " + title);
			System.out.println("Execution Completed Successfully !!!");
						
		}	
		@BeforeTest
		public void beforeTest() {	
			
			String chromeDriver = "E:\\JARs_Drivers\\Browser_Drivers\\Chrome\\2.41\\chromedriver_win32\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", chromeDriver);
		    driver = new ChromeDriver();
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();
		}		
}
