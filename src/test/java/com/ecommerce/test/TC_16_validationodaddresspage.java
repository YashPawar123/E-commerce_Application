package com.ecommerce.test;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.ecommerce.source.BaseClass;
import com.ecommerce.source.HomePage;
import com.ecommerce.source.LoginPage;

public class TC_16_validationodaddresspage extends BaseClass {
    
	@Test
	public void validationofaddresspage() throws IOException, InterruptedException
	{
LoginPage p1=new LoginPage(driver);
	   	
		p1.username_();
		p1.continue_button_();
		p1.pass_();
		p1.signinbutton_();
		
		HomePage h1=new HomePage(driver);
		h1.linkclick();
	driver.findElement(By.xpath("(//span[@class='nav-line-1 nav-progressive-content'])[2]")).click();
	    
		driver.findElement(By.xpath("(//span[@class='a-color-secondary'])[4]")).click();
		
		driver.findElement(By.xpath("//div[@id='ya-myab-plus-address-icon']")).click();
	
	   WebElement name=driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressFullName']"));
	   name.sendKeys("Yash Pawar");
	   
	   WebElement mobno=driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressPhoneNumber']"));
	   mobno.sendKeys("9028763084");
	   
	   WebElement pincode=driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressPostalCode']"));
	   pincode.sendKeys("411047");
	  
	  WebElement flatno=driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressLine1']"));
	   flatno.sendKeys("kesnand wagholi taleranwadi-1 ");
	
	 WebElement area=driver.findElement(By.xpath(" //input[@id='address-ui-widgets-enterAddressLine2']"));
	 area.sendKeys("taleranwadi-1");
	
	 WebElement city=driver.findElement(By.xpath(" //input[@id='address-ui-widgets-enterAddressCity']"));
	 city.sendKeys("pune");
	 
	 WebElement drop=driver.findElement(By.xpath(" (//span[@class='a-button-text a-declarative'])[4]"));
	 drop.click();
	 
	 List<WebElement> options=driver.findElements(By.xpath(" //ul[@class='a-nostyle a-list-link']//li"));
	 
	 for (WebElement  option : options) {
		 String opttext=option.getText();
		 
		 if(opttext.equalsIgnoreCase("MAHARASHTRA")) {
			 option.click();
		 }
	}
	 
	 WebElement addadress=driver.findElement(By.xpath("( //input[@class='a-button-input'])[5]"));
	 addadress.click();
	 
	 Thread.sleep(5000);
		captureScreenShot(driver, "TC_16_validationodaddresspage");
	}
}  
