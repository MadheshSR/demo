package Stepdefinition;

import org.junit.runner.RunWith;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageobject.HomePage;
import pageobject.SearchResultPage;
import reusablecComponent.openchrome;
import runner.AmezonApp;

@RunWith(Cucumber.class)
public class StepDefinition extends AmezonApp{
	
	@Given("^Initiaize browser with chrome$")
public void initiaize_browser_with_chrome() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
		url = prop.getUrl();
		path = prop.getDriverPath();
		openchrome op = new openchrome();
		driver = op.openBrowser(driver, path, url);
}


	@When("^user enters \"([^\"]*)\" and enter$")
	public void user_enters_and_enter(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	HomePage h = new HomePage(driver);
	h.enterItem(arg1);
	h.clickSearch();
}

@Then("^searchresult page opened$")
public void searchresult_page_opened() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	SearchResultPage sc = new SearchResultPage(driver);
	Assert.assertFalse(sc.revieww());
	driver.close();
}
}
