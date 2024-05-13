package com.ecommerce.test;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.ecommerce.source.BaseClass;
import com.ecommerce.source.HomePage;
import com.ecommerce.source.LoginPage;

public class TC_11_validationofcarttowishlist extends BaseClass {

	@Test
	public void carttoeishlist() throws InterruptedException, IOException
	{
LoginPage p1=new LoginPage(driver);
       	
   		p1.username_();
   		p1.continue_button_();
   		p1.pass_();
   		p1.signinbutton_();
   		
   		HomePage h1=new HomePage(driver);
   		h1.linkclick();
   		driver.findElement(By.xpath("(//span[@class='nav-line-2'])[3]")).click();
  		driver.findElement(By.xpath("(//input[@class='a-color-link'])[2]")).click();
  		driver.findElement(By.xpath("( //span[@class='a-size-mini a-color-secondary cldd-list-privacy'])[2]")).click();
  		Thread.sleep(5000);
	    captureScreenShot(driver, "TC_10_validationofaddingtowishlist ");
	}
}
