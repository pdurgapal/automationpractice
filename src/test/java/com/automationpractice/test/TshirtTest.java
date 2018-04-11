package com.automationpractice.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.TshirtPage;
import com.automationpractice.pages.WomenPage;
import com.automationpractice.utils.TestBase;


public class TshirtTest extends TestBase {
	
	
	HomePage homePage;
	TshirtPage tshirtPage;
	WebDriver driver; 

	
	@Test
	public void verify_TshirtPage() throws InterruptedException{
		tshirtPage=homePage.clickOnTshirttab();
		tshirtPage.clickOnTshirtstab();
		tshirtPage.clickOnTshirtFedalsleeveTop();
		//womenPage.AddToCartClick();
		Thread.sleep(10000);
		}
	
	//@Test
	
	//public void verify_WomenTopPage() throws InterruptedException{
	//	womenPage.FedalsleeveTopClick();
	//}
	

	

	@BeforeClass
	public void setup(){
		homePage= new HomePage(getDriver());
		System.out.println("before class");
		
	}
	
	@BeforeMethod
	public void beforeallmethod() {
		System.out.println("before method");
	}
	
}
