package com.ecommerce.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ecommerce.source.BaseClass;
import com.ecommerce.source.HomePage;
import com.ecommerce.source.LoginPage;

public class TC_02_validationofSearchproduct extends BaseClass {
       @Test
	public void searchproduct() throws IOException
	{
    	   LoginPage p1=new LoginPage(driver);
       	
   		p1.username_();
   		p1.continue_button_();
   		p1.pass_();
   		p1.signinbutton_();
   		
   		HomePage h1=new HomePage(driver);
   		h1.serachtf("new t shirts for men");
   		
   		captureScreenShot(driver, "TC_02_validationofSearchproduct");
	}
}
