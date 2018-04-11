package com.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WomenPage extends BasePage{

	public WomenPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void topsClick() {
		driver.findElement(By.linkText("Tops")).click();	
	}
	
	public void FedalsleeveTopClick() {
		//driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']")).click();
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"))).click();;
		
	}
	
	public void AddToCartClick() {
		//driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
		//driver.findElement(By.xpath("//p[@id='add_to_cart']/button")).click();
		//WebDriverWait wait = new WebDriverWait(driver,20);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='add_to_cart']/button/span")));
		//driver.findElement(By.xpath("//*[@id='add_to_cart']/button/span")).click();
		WebElement fr = driver.findElement(By.id("add_to_cart"));

		driver.switchTo().frame(fr);
}
}