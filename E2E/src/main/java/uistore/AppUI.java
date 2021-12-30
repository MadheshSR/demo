package uistore;

import org.openqa.selenium.By;

public class AppUI {
	public By cart = By.xpath("//*[@id=\"nav-cart-count\"]");
	public By cart_item = By.xpath("//span[@class='a-truncate-cut']");
	public By Cat = By.xpath("//*[@id=\"p_89/Allen Solly\"]/span/a/div");
	public By Name = By.xpath("(.//div[@class='a-section a-spacing-none a-spacing-top-small s-title-instructions-style'])[1]");
	public By Price = By.xpath("(.//span[@class='a-price-whole'])[1]");
	public By product1 = By.xpath("(.//span[@class='a-price-whole'])[1]");
	public By add = By.xpath("//*[@id=\"add-to-cart-button\"]");
	public By dropdown = By.xpath("//*[@name='dropdown_selected_size_name']");
	public By searchbox = By.id("twotabsearchtextbox");
	public By searchButton = By.id("nav-search-submit-button");
	public By review = By.xpath("//span[contains(text(),'\"winter jackets for men\"')]");
}


