package com.automationpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(xpath="//a[@title='Women']")
	private WebElement tabWomen;
	
	@FindBy(linkText="DRESSES")
	private WebElement tabDresses;
	
	@FindBy(linkText="T-SHIRTS")
	private WebElement tabTshirts;
	
	@FindBy(id="search_query_top")
	private WebElement tabSearch;
	
	
	@FindBy(name="submit_search")
	private WebElement tabSearchBox;
	

	
	
	
	

	public WomenPage clickOnWomentab() {
		tabWomen.click();
		return new WomenPage(getDriver());
	}
	
		
	public DressesPage clickOnDressestab(){
		tabDresses.click();
		return new DressesPage(getDriver());
		
	}
	public TshirtPage clickOnTshirttab(){
		tabTshirts.click();
		return new TshirtPage(getDriver());
		
	}
	
	public SearchPage clickOnSearchtab(){
		tabSearch.sendKeys("summerdress");
	    tabSearch.click();
		return new SearchPage(getDriver());
		
	}

	
	public SearchPage clickOnSearchtabBox(){
	   tabSearchBox.click();
		return new SearchPage(getDriver());
		
	}
	
	
	

		
		
	}
	
	
	
	
