
package com.automationpractice.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.SearchPage;
import com.automationpractice.pages.WomenPage;
import com.automationpractice.utils.TestBase;

public class SearchTest extends TestBase {
	
		
		HomePage homePage;
		SearchPage searchPage;
		WebDriver driver; 
	
		
		//@Test
		//public void verify_SearchPage() throws InterruptedException{
			//searchPage=homePage.clickOnSearchtab();
			//searchPage=homePage.clickOnSearchtabBox();
			//searchPage.printSummerDressClick();
			//}
		
		
		@Test(dataProvider="getsearchKey")
		public void searchkeyvalue(String searchkey)
		{
			System.out.println(searchkey);
		}
		
		
		@Test
		@Parameters({"searchkey"})
		public void verify_searchpage(String searchkey)
		{
			searchPage=homePage.clickOnSearchtabBox();
			
		
		}
		
		
		@DataProvider
		public static Object[][] getsearchKey()
		{
		Object[][] searchkey = new Object[3][1];

		searchkey[0][0]="tshirt 1";
		searchkey[1][0]="tshirt 2";
		searchkey[2][0]="tshirt 3";
		return searchkey;
		
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

