package com.web365.login;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.web365.base.SasSupermarketBaseTest;
import com.web365.sas.supermarket.page.foodcourt.SasSupermarketFoodCourtPage;
import com.web365.sas.supermarket.page.home.SasSupermarketHomePage;
import com.web365.sas.supermarket.page.menu.SasSupermarketFavoritesPage;
import com.web365.sas.supermarket.page.menu.SasSupermarketLoginPage;
import com.web365.sas.supermarket.page.menu.SasSupermarketMenuPage;



public class SasSupermarketLoginTest extends SasSupermarketBaseTest {
	
	@Test
	public void testLoginWithCorrectCred() throws InterruptedException {
		//navigate to sas.am 
		//click on logo
		
	SasSupermarketHomePage home = new SasSupermarketHomePage(driver);
	home = home.logoClick();
	Assert.assertTrue(home.shopCart.isDisplayed());
	
	SasSupermarketFoodCourtPage foodcourt= home.goToFoodCourt();
	Assert.assertTrue(foodcourt.foodTnakan.isDisplayed());
	
	
	home=foodcourt.logoClick();
	Assert.assertTrue(home.paradiseFlowers.isDisplayed());
		
	home=home.logoClick();
	Assert.assertTrue(home.menuLink.isDisplayed());
	
	home=home.logoClick();
	Assert.assertTrue(home.loginLink.isDisplayed());
	
	home=home.logoClick();
	Assert.assertTrue(home.favoritesLink.isDisplayed());
	
	
	SasSupermarketMenuPage menu=home.goToMenu();
	Assert.assertTrue(menu.products.isDisplayed());
	
	SasSupermarketMenuPage menuLink=home.goToMenu();
	Assert.assertTrue(menuLink.SasHome.isDisplayed());
	
	SasSupermarketMenuPage menuLink1=home.goToMenu();
	Assert.assertTrue(menuLink1.SasExclusive.isDisplayed());
	
	SasSupermarketLoginPage loginLink=home.goToLogin();
	Assert.assertTrue(loginLink.login.isDisplayed());
	
	SasSupermarketLoginPage loginLink1=home.goToLogin();
	Assert.assertTrue(loginLink1.email.isDisplayed());
	
	SasSupermarketFavoritesPage favoritesLink=home.goToFavorites();
	Assert.assertTrue(favoritesLink.section.isDisplayed());

	

}

	
}
	
