package com.automationpractice.test;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automationpractice.pages.HomePage;
import com.automationpractice.utils.TestBase;

public class HomeTests extends TestBase {
	HomePage homePage;
	
	
	@Test
	public void validate_Page() throws InterruptedException{
		System.out.println("simple Test 1");
		
	}


	
	@BeforeClass
	public void setup() {
		homePage = new HomePage(getDriver());
		
	}

}
