package com.ecommerce.source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class launchquit2 {
  
	public WebDriver driver;
	@BeforeClass
	public void lauch2() {
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/v3/index.php");
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void quit2()
	{
		driver.close();
	}
}
