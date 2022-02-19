package com.web365.sas.supermarket.page.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.sas.supermarket.page.base.SasSupermarketBasePage;
import com.web365.sas.supermarket.page.foodcourt.SasSupermarketFoodCourtPage;
import com.web365.sas.supermarket.page.menu.SasSupermarketFavoritesPage;
import com.web365.sas.supermarket.page.menu.SasSupermarketLoginPage;
import com.web365.sas.supermarket.page.menu.SasSupermarketMenuPage;


public class SasSupermarketHomePage extends SasSupermarketBasePage {
	
	public SasSupermarketHomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;		
	}
	
	public static final String LOGO_XPATH="//img[@class='page-header__logo-img']";
	public static final String SHOP_CART_XPATH="//button[@class='page-header__link js-small-basket-toggler']";
    public static final String FOOD_COURT_IMG_XPATH="//a[@href='/food/en/']" ;
    public static final String PARADISE_FLOWERS_XPATH="//a[@href='/en/catalog/paradis_de_fleurs/']";
	public static final String MENU_LINK_XPATH="//button[@class='menu-toggler js-menu-toggler']";
	public static final String LOGIN_LINK_XPATH="//button[@class='page-header__link js-btn-open-modal']";
	public static final String FAVORITES_LINK_XPATH="//a[@href='/en/catalog/favorite/']";
	public static final String BAKERY_GOODS_XPATH="//div[@class='catalog-category__image-wrap']";
			
	
	 @FindBy(xpath=LOGO_XPATH)
	  public WebElement logo;
	
	@FindBy(xpath=SHOP_CART_XPATH)
	public WebElement shopCart;
	
	@FindBy(xpath=FOOD_COURT_IMG_XPATH)
	public WebElement foodCourtImg;
	
	@FindBy(xpath=PARADISE_FLOWERS_XPATH)
	public WebElement paradiseFlowers;
	
	@FindBy(xpath=MENU_LINK_XPATH)
	public WebElement menuLink;
	
	@FindBy(xpath=LOGIN_LINK_XPATH)
	public WebElement loginLink;
	
	@FindBy(xpath=FAVORITES_LINK_XPATH)
	public WebElement favoritesLink;
	
	@FindBy(xpath=BAKERY_GOODS_XPATH)
	public WebElement bakeryGoods;

	
	public SasSupermarketHomePage logoClick() {
	logo.click();
	return new SasSupermarketHomePage(this.driver);}

	
	public SasSupermarketFoodCourtPage goToFoodCourt() throws InterruptedException {
		foodCourtImg.click();
		Thread.sleep(2000);
		return new SasSupermarketFoodCourtPage(this.driver);
		}
	
	public SasSupermarketMenuPage goToMenu() {
		menuLink.click();
		return new SasSupermarketMenuPage(this.driver);
	}
	
	public SasSupermarketLoginPage goToLogin() {
		loginLink.click();
		return new SasSupermarketLoginPage(this.driver);
		}
	
	public SasSupermarketFavoritesPage  goToFavorites() {
		favoritesLink.click();
		return new SasSupermarketFavoritesPage(this.driver);
	}


	}
		
		
	
	
	
	
	
	  
	
	




		
	
	
	
	


