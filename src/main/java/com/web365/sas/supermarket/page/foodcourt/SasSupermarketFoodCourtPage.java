package com.web365.sas.supermarket.page.foodcourt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//import com.web365.sas.supermarket.page.base.SasSupermarketBasePage;
import com.web365.sas.supermarket.page.home.SasSupermarketHomePage;

public class SasSupermarketFoodCourtPage extends SasSupermarketHomePage {

	public SasSupermarketFoodCourtPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public static final String FOOD_TNAKAN_XPATH="//img[@src='/upload/iblock/aee/Tnakan_icon_menu.png']";
	@FindBy(xpath=FOOD_TNAKAN_XPATH)
	public WebElement foodTnakan;

}
