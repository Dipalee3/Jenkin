package com.qa.tests;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.base.BaseClass;
import com.qa.pages.HomePage;

public class BaseTestClass {
	WebDriver driver;
	Properties prop;
	BaseClass bc;
	HomePage homePage;
		@BeforeTest()
		public void setUp() 
		{
			bc =new BaseClass();
			driver = bc.init_driver(prop);
			prop= bc.init_prop();
			homePage = new HomePage(driver);
		}
		
		@AfterTest()
		public void tearDown()
		{
			driver.quit();
		}
}
