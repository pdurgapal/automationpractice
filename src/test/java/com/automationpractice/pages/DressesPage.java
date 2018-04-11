package com.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DressesPage extends BasePage{

	public DressesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	


	@FindBy(linkText="Casual Dresses")
	private WebElement tabCasualDresses;
	
	@FindBy(xpath="//img[@title='Printed Dress']")	
	private WebElement tabPrintedDress;


	public DressesPage clickOnCasualDressestab() {
		tabCasualDresses.click();
		return new DressesPage(getDriver());
	}
	
	public DressesPage clickOnPrintDressetab() {
		tabPrintedDress.click();
		return new DressesPage(getDriver());
	}

}