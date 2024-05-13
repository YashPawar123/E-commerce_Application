package com.ecommerce.test;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.ecommerce.source.BaseClass;
import com.ecommerce.source.HomePage;
import com.ecommerce.source.LoginPage;

public class TC_07_Validationofpaymentoption extends BaseClass {
     @Test
	public void paymentoption() throws IOException
	{
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
//   		WebElement addtocart=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
// 	    addtocart.click();
// 	    WebElement gotocart=driver.findElement(By.linkText("Go to Cart"));
// 	    gotocart.click();

  		WebElement proceedtobuy=driver.findElement(By.xpath("(//input[@class='a-button-input'])[2]"));
  		proceedtobuy.click();
	    captureScreenShot(driver, "TC_07_Validationofpaymentoption");

	}
}
