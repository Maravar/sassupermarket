package com.web365.sas.supermarket.page.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SasSupermarketBasePage {

	
	protected WebDriver driver;
	
	public SasSupermarketBasePage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	
	}
}
