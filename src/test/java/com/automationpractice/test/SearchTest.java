
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
import com.automationpractice.pages.SearchPage;
import com.automationpractice.pages.WomenPage;
import com.automationpractice.utils.TestBase;

public class SearchTest extends TestBase {
	
		
		HomePage homePage;
		SearchPage searchPage;
		WebDriver driver; 
	
		
		@Test
		public void verify_SearchPage() throws InterruptedException{
			searchPage=homePage.clickOnSearchtab();
			searchPage=homePage.clickOnSearchtabBox();
			searchPage.printSummerDressClick();
			
			
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

