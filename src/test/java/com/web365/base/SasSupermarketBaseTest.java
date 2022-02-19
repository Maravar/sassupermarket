package com.web365.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



public class SasSupermarketBaseTest {
	
	protected WebDriver driver;
	
	@BeforeClass
	public void openSasSupermarket() {
	 driver=new ChromeDriver();
	 driver.get("https://www.sas.am/en/");

}
	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}