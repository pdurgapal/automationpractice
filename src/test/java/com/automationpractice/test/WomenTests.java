package com.automationpractice.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.WomenPage;
import com.automationpractice.utils.TestBase;

public class WomenTests extends TestBase {
	
		
		HomePage homePage;
		WomenPage womenPage;
		WebDriver driver; 
	
		
		@Test(priority=1)
		public void verify_WomenPage() throws InterruptedException{
			womenPage=homePage.clickOnWomentab();
			womenPage.topsClick();
			womenPage.FedalsleeveTopClick();
			womenPage.AddToCartClick();
			Thread.sleep(10000);
			System.out.println("test method 1");
			}
		
	
		

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



