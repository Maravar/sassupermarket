package com.web365.products;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.SasSupermarketBaseTest;
import com.web365.sas.supermarket.page.CoffeandTea.SasSupermarketNescafePage;

public class SasSupermarketNescafeTest extends SasSupermarketBaseTest {
	
	@Test
	public void testNescafe() throws InterruptedException {
		
		
		/**
		 * SaasSupermarketHomePage home = new SaasSupermarkerHomePage(driver);
		 * 
		 * SaasSupermarketHomeMenuPage menu = home.goToMenu();
		 * SasProductsPage products = menu.clickOnProduct();
		 * SasTeaAndCoffePage teaAndCoffe = products.goToTeaAndCoffe();
		 * teaAndCoffe = teaAndCoffe.clickOnNescafe();
		 * 
		 *  Assert.assertTrue(teaAndCoffe.escafeIcon.isDisplayed());
		 */
		
		SasSupermarketNescafePage nescafe= new SasSupermarketNescafePage(driver);
		nescafe = nescafe.goToMenu();
		Thread.sleep(2000);
		nescafe = nescafe.productsClick();
		nescafe = nescafe.goToCoffeeAndTea();
		nescafe = nescafe.coffeeClick();
		Assert.assertTrue(nescafe.nescafe.isDisplayed());
		
		
				
		
	}
	

}
