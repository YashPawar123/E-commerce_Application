package com.ecommerce.source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement search ;
	
	@FindBy(xpath=" //div[@id='nav-cart-text-container']")
	WebElement addtocart;
	
	@FindBy(xpath=" //a[@id='nav-global-location-popover-link']")
	WebElement address;
	
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
	WebElement info;
	
	@FindBy(xpath=" //a[@id='nav-logo-sprites']")
	WebElement link;
	 
	public void linkclick() {
		link.click();
	}
	public void serachtf(String product)
	{
		search.sendKeys(product);
		search.sendKeys(Keys.ENTER);
	}
	
	public void addtocartclick()
	{
		addtocart.click();
	}
	
	public void addressdetails() {
		address.click();
	}
	public void infodetails() {
		 info.click();
	}
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements (driver,this);
	}
	
}
