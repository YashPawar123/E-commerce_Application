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

public class TC_10_validationofaddingtowishlist extends BaseClass{
    
	@Test
	public void validationaddtowishlis() throws InterruptedException, IOException {
       
		LoginPage p1=new LoginPage(driver);
       	
   		p1.username_();
   		p1.continue_button_();
   		p1.pass_();
   		p1.signinbutton_();
   		
   		HomePage h1=new HomePage(driver);
   		h1.linkclick();
   		h1.serachtf("perfume");
   		List<WebElement> productlink=driver.findElements(By.xpath("  (//span[@class='a-size-base-plus a-color-base a-text-normal']) "));
 	    productlink.get(6).click();
 	    Set<String> pc=driver.getWindowHandles();
 	    Iterator<String> pc1=pc.iterator();
 	    String parentid=pc1.next();
 	    String childid= pc1.next();
 	    driver.switchTo().window(childid);
 		String xpath = "//a[@id='nav-link-accountList']/span[2]";
  		
  		WebElement addtowish=driver.findElement(By.xpath("//input[@id='add-to-wishlist-button-submit']"));
  		addtowish.sendKeys(Keys.ENTER);
  		
  		
  		
  		WebElement viewlist=driver.findElement(By.linkText("View Your List"));
  		viewlist.click();
  		
  		driver.findElement(By.linkText("Add to Cart")).click();
  		Thread.sleep(5000);
	    captureScreenShot(driver, "TC_10_validationofaddingtowishlist ");
	}
}
