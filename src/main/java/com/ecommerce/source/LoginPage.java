package com.ecommerce.source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.utilities.ConfigDataProvider;

public class LoginPage {
    WebDriver driver;
    @FindBy(id="ap_email")
    WebElement username;
    
    @FindBy(id="continue")
    WebElement continue_button;
    
    @FindBy(name="password")
    WebElement pass;
    
    @FindBy(id="signInSubmit")
    WebElement signin_button;
    
    public ConfigDataProvider config =new ConfigDataProvider();
    public void username_() {
    	username.sendKeys(config.getusername());
    }
    public void continue_button_() {
    	continue_button.click();;
    }
    public void pass_() {
    	pass.sendKeys(config.getpassword());
    }
    public void signinbutton_() {
    	signin_button.sendKeys(Keys.ENTER);;
    }
       
    public LoginPage(WebDriver driver) {
    	PageFactory.initElements(driver,this);
    }
	
}
