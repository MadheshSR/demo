package runner;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pageobject.CartPage;
import pageobject.HomePage;
import pageobject.ProductPage;
import pageobject.SearchResultPage;
import reusablecComponent.closechrome;
import reusablecComponent.openchrome;
import utilities.ExcelUtilities;
import utilities.ExtentLogUtilities;
import utilities.GetProperties;
import utilities.Log;

public class AmezonApp {
	public static ArrayList<String> s_search_string = null;
	public static String url = null;
	public static String path = null;
	public static WebDriver driver = null;
	public static ExtentLogUtilities extent = new ExtentLogUtilities();
	public static GetProperties prop = new GetProperties();
	public static ExtentTest test;

	@BeforeTest
	public void Before() throws IOException {
		test= extent.startTest(AmezonApp.class.getSimpleName());
		//s_search_string = prop.getItem();
		s_search_string = ExcelUtilities.getdata();
		url = prop.getUrl();
		path = prop.getDriverPath();
		openchrome op = new openchrome();
		driver = op.openBrowser(driver, path, url);
	}
	
	@Test
	public static void test() throws IOException, InterruptedException {
		try {
			Log log = new Log();
			log.config();
			HomePage h = new HomePage(driver);
			h.enterItem(s_search_string.get(0));
			h.clickSearch();

			SearchResultPage sc = new SearchResultPage(driver);
			sc.revieww();
			sc.clickOnBrand();
			sc.getName(test);
			sc.getPrice(test);
			sc.openProduct();

			ProductPage p = new ProductPage(driver);
			p.switchtoTab();
			p.ValidateProductPage(test);
			p.SelectSize();
			p.addToCart();

			CartPage c = new CartPage(driver);
			c.openCart();
			c.validateCart(test);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@AfterTest
	public void After() {
		closechrome.close(driver);
		test.log(LogStatus.PASS,"browser closed succesfully");
		extent.endTest();
	}
}