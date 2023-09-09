package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GetUrl	 extends BaseTest{
	
	
  @Test
  public void currentUrl() {
	  
	  
	    test=extent.createTest("URL", "current url");
		System.setProperty("webdriver.gecko.driver", "/Users/sourav/eclipse-workspace/AUTOMATIONS/src/main/resources/driver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		
  }
}
