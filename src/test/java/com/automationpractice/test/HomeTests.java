package com.automationpractice.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automationpractice.pages.HomePage;
import com.automationpractice.utils.TestBase;

public class HomeTests extends TestBase {
	HomePage homePage;
	public static final Logger console=LogManager.getLogger(HomeTests.class);
	
	
	@Test
	public void validate_Page() throws InterruptedException{
		console.info("test case started");
		System.out.println("simple Test 1");
		
	}


	
	@BeforeClass
	public void setup() {
		homePage = new HomePage(getDriver());
		
	}

}
