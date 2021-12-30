package reusablecComponent;

import org.openqa.selenium.WebDriver;

public class closechrome {

	
	public static void close(WebDriver driver) {
		driver.switchTo().defaultContent();
		driver.close();
		driver.quit();
	}
}

