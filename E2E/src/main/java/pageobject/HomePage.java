package pageobject;

import org.openqa.selenium.WebDriver;

import uistore.AppUI;
import utilities.Log;



public class HomePage {
	WebDriver driver;
	AppUI a =new AppUI();
	
	
	public HomePage(WebDriver driver) {
		Log.info("HomePage opened");
		this.driver=driver;
	}
	
	public  void enterItem(String string) {
		driver.findElement(a.searchbox).sendKeys(string);
		Log.info("Entered item name in search box");
	}
	
	public void clickSearch() {
		driver.findElement(a.searchButton).click();
		Log.info("Search button clicked");
	}


	
}
