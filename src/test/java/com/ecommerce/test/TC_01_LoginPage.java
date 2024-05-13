package com.ecommerce.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ecommerce.source.BaseClass;
import com.ecommerce.source.LoginPage;

import Testcases.gettingScreenshot;
import amazon_testcases.launchQuit;
import amz_source.amz_login_page1;

public class TC_01_LoginPage extends BaseClass{
    @Test 
	public void validationofsignin_1() throws IOException {
       
    	LoginPage p1=new LoginPage(driver);
    	
		p1.username_();
		p1.continue_button_();
		p1.pass_();
		p1.signinbutton_();
//	   captureScreenShot(driver, "TC_01_LoginPage");	
	}
}
