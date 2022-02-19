package com.web365.sas.supermarket.page.products;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static com.web365.sas.supermarket.page.products.SasSupermarketProductsPageConstants.*;

import com.web365.sas.supermarket.page.home.SasSupermarketHomePage;

public class SasSupermarketProductsPage extends SasSupermarketHomePage {

	public SasSupermarketProductsPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}  
	

	
	@FindBy(xpath=COFFE_TEA_XPATH)
	 public WebElement CoffeTea;

	
	
	SasSupermarketCoffeandTea1Page goToCoffeTea() {
		CoffeTea.click();
		return new SasSupermarketCoffeandTea1Page(this.driver);
		
		
	}
	

} 
