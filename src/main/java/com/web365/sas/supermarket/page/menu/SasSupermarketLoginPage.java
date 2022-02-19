package com.web365.sas.supermarket.page.menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.sas.supermarket.page.home.SasSupermarketHomePage;

public class SasSupermarketLoginPage extends SasSupermarketHomePage{

	public SasSupermarketLoginPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	 
	public static final String LOGIN_LINK_LOGIN_XPATH="//input[@class='btn btn--primary btn--wide btn--lg']";
	public static final String LOGIN_LINK_EMAIL_XPATH="//label[@class='text-input form-error_']";
	
	
	@FindBy(xpath=LOGIN_LINK_LOGIN_XPATH)
	public WebElement login;
	
	@FindBy(xpath=LOGIN_LINK_EMAIL_XPATH)
	public WebElement email;

}
