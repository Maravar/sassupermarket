package com.web365.sas.supermarket.page.menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.sas.supermarket.page.home.SasSupermarketHomePage;
import com.web365.sas.supermarket.page.products.SasSupermarketProductsPage;

public class SasSupermarketMenuPage extends SasSupermarketHomePage {

	public SasSupermarketMenuPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	public static final String SAS_PRODUCTS_XPATH="//a[@href='/en/catalog/prodovolstvennyy_sektor/']";
	public static final String SAS_HOME_XPATH="//span[@class='main-menu__link-level-1-text']";
	public static final String SAS_EXCLUSIVE_XPATH="//span[@class='main-menu__link-level-1-text']";
	
	
	@FindBy(xpath=SAS_PRODUCTS_XPATH)
	public WebElement products;
	
	@FindBy(xpath=SAS_HOME_XPATH)
	public WebElement SasHome;
	
	@FindBy(xpath=SAS_EXCLUSIVE_XPATH)
	public WebElement SasExclusive;
	
	SasSupermarketProductsPage goToProducts() {
		products.click();
	return new SasSupermarketProductsPage(this.driver);
	
	}
	}
	
	
	
	
	
	
	
	


