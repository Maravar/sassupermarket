package com.web365.sas.supermarket.page.CoffeandTea;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.web365.sas.supermarket.page.base.SasSupermarketBasePage;
import com.web365.sas.supermarket.page.menu.SasSupermarketMenuPage;
import com.web365.sas.supermarket.page.products.SasSupermarketProductsPage;

public class SasSupermarketNescafePage extends SasSupermarketBasePage {

	public SasSupermarketNescafePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public static final String MENU_XPATH = "//button[@class='menu-toggler js-menu-toggler']";
	public static final String PRODUCTS_XPATH = "//img[@src='/upload/iblock/299/Products.png']";
	public static final String COFFEE_AND_TEA_XPATH = "//img[@src='/upload/iblock/ee3/image 51.png']";
	public static final String COFFEE_XPATH = "//img[@src='/upload/iblock/b91/6.png']";
	public static final String NESCAFE_XPATH = "//img[@src='/upload/Sh/imageCache/337/675/6752704247681586.jpg.webp']";

	@FindBy(xpath = MENU_XPATH)
	public WebElement menu;

	@FindBy(xpath = PRODUCTS_XPATH)
	public WebElement products;

	@FindBy(xpath = COFFEE_AND_TEA_XPATH)
	public WebElement coffeeAndTea;

	@FindBy(xpath = COFFEE_XPATH)
	public WebElement coffee;

	@FindBy(xpath = NESCAFE_XPATH)
	public WebElement nescafe;

	public SasSupermarketNescafePage goToMenu() {
		Actions action = new Actions(driver);

		action.moveToElement(menu).click();
//	menu.click();
		return new SasSupermarketNescafePage(this.driver);
	}

	public SasSupermarketNescafePage productsClick() {
		Actions action = new Actions(driver);

		action.moveToElement(products).click();
		return new SasSupermarketNescafePage(this.driver);
	}

	public SasSupermarketNescafePage goToCoffeeAndTea() {
		coffeeAndTea.click();
		return new SasSupermarketNescafePage(this.driver);
	}

	public SasSupermarketNescafePage coffeeClick() {
		coffee.click();
		return new SasSupermarketNescafePage(this.driver);

	}

}
