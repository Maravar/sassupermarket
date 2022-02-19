package com.web365.sas.supermarket.page.products;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.sas.supermarket.page.home.SasSupermarketHomePage;
import static com.web365.sas.supermarket.page.products.SasSupermarketProductsPageConstants.*;


public class SasSupermarketCoffeandTea1Page extends SasSupermarketHomePage {

	public SasSupermarketCoffeandTea1Page(WebDriver driver) {
		super(driver);
		this.driver=driver;
	} 
	

	
			@FindBy(xpath=ICE_COFFEE_LANDESSA_XPATH)
	        public WebElement IcecoffeeLandessa;
 
}
