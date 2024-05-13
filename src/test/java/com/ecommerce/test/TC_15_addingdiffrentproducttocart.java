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

public class TC_15_addingdiffrentproducttocart extends BaseClass {
  
	@Test
	public void addingdiffrentproducttocart() throws InterruptedException, IOException
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
		
		
		WebElement addtocart= driver.findElement(By.xpath(" //input[@id='add-to-cart-button']"));
		     addtocart.click();
		     
		      driver.findElement(By.linkText("Go to Cart")).click();

		    
		    
		    driver.findElement(By.xpath("//span[@class='a-dropdown-label']")).click();
		   
		   List<WebElement> quantity=driver.findElements(By.xpath("//ul[@class='a-nostyle a-list-link']//li"));
		   
		   for (WebElement option : quantity)
		   {
				String opttext=option.getText();
			    System.out.println(opttext);
			    if(opttext.equalsIgnoreCase("7"))
			    {
			    	option.click();
			    }
			}
		   
		      driver.navigate().back();
		     WebElement search2= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		     search2.sendKeys("books");
		     search2.sendKeys(Keys.ENTER);
		     
		     WebElement book=driver.findElement(By.xpath(" (//span[@class='a-size-medium a-color-base a-text-normal'])[3]"));
		     book.click();
		     
		     Thread.sleep(3000);
		     /*Set<String> pc1=driver.getWindowHandles();
		     Iterator<String> p1=pc1.iterator();
		     String id11=p.next();
		     String id22= p.next();
		     System.out.println(id11);
		     System.out.println(id22);
		     driver.switchTo().window(id22);
		      * 
		 */  String id3=pc1.next();
		     System.out.println(id3);

		     driver.switchTo().window(id3);

		     WebElement addcart2=driver.findElement(By.xpath("//button[@id='add-to-ebooks-cart-button']"));
		     addcart2.click();
		     
		    WebElement goto2= driver.findElement(By.xpath("a-button-text"));
		    goto2.click();
		    captureScreenShot(driver, "TC_15_addingdiffrentproducttocart");
	}
}  
