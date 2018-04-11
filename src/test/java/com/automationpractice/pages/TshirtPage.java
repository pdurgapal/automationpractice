package com.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TshirtPage extends BasePage{

	public TshirtPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	


	@FindBy(linkText="T-SHIRTS")
	private WebElement tabTshirts;
	
	@FindBy(xpath="//img[@title='Faded Short Sleeve T-shirts']")
	private WebElement tabFadedShortSleeveTshirts;
	


	public TshirtPage clickOnTshirtstab() {
		tabTshirts.click();
		return new TshirtPage(getDriver());
	}
	
	public TshirtPage clickOnTshirtFedalsleeveTop() {
		tabFadedShortSleeveTshirts.click();
		return new TshirtPage(getDriver());
	}
	
	
	
}