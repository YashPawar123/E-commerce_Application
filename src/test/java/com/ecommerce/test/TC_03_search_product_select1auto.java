package com.ecommerce.test;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.ecommerce.source.BaseClass;
import com.ecommerce.source.HomePage;
import com.ecommerce.source.LoginPage;

public class TC_03_search_product_select1auto extends BaseClass {
      @Test 
	public void search1stauto() throws IOException, InterruptedException
	{
    	  LoginPage p1=new LoginPage(driver);
         	
     		p1.username_();
     		p1.continue_button_();
     		p1.pass_();
     		p1.signinbutton_();
     		
     		HomePage h1=new HomePage(driver);
     		h1.linkclick();
     		h1.serachtf("perfume");
     		Thread.sleep(5000);
     		List<WebElement> auto=driver.findElements(By.xpath(" (//div[@class='left-pane-results-container']/div)")); 
	        auto.get(1).click();
	
	}
}
