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

public class TC_13_Removingproduvtfromcart extends BaseClass {
 
	@Test
	public void removerproductcart() throws IOException, InterruptedException
	{
		LoginPage p1=new LoginPage(driver);
	   	
		p1.username_();
		p1.continue_button_();
		p1.pass_();
		p1.signinbutton_();
		
		HomePage h1=new HomePage(driver);
		h1.linkclick();
		h1.addtocartclick();
	     Thread.sleep(5000);

		WebElement delete1=driver.findElement(By.xpath("//input[@name='submit.delete.049c1b75-f97e-4a9c-bb8e-19ba4b1a53d0']"));
	    captureScreenShot(driver, "TC_13_Removingproduvtfromcart ");

	}
}
