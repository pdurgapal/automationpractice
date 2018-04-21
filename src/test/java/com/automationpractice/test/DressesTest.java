package com.automationpractice.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationpractice.pages.DressesPage;
import com.automationpractice.pages.HomePage;
import com.automationpractice.utils.TestBase;


	
public class DressesTest extends TestBase {
	
		
		HomePage homePage;
		DressesPage dressespage;
		WebDriver driver; 
	
		
		@Test(priority=1)
		public void verify_DressesPage() throws InterruptedException{
			dressespage=homePage.clickOnDressestab();
			dressespage.clickOnCasualDressestab();
			dressespage.clickOnPrintDressetab();
			Thread.sleep(10000);
			System.out.println("test method 2");
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
