package com.web365.sas.supermarket.page.menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.sas.supermarket.page.home.SasSupermarketHomePage;

public class SasSupermarketFavoritesPage extends SasSupermarketHomePage {

	public SasSupermarketFavoritesPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	public static final String FAVORITES_SECTION_XPATH="//h2[@class='empty-box__title']";
	
	@FindBy(xpath=FAVORITES_SECTION_XPATH)
	public WebElement section;
	

}
