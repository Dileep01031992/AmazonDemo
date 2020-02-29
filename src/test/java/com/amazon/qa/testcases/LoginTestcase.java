package com.amazon.qa.testcases;

import org.testng.Assert;
//import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TsetCasebase;
import com.amazon.qa.pages.Login;

public class LoginTestcase extends TsetCasebase {
	
	Login login;
	public LoginTestcase(){
		super();
	}
	
	@BeforeMethod
	public void setup(){
		initialize();
		Login login = new Login();
	}
	
	@Test()
	public void loginpageTitleTest(){
		String title =login.Validateloginpagetitle();
		Assert.assertEquals(title, "Amazon Sign In");
		
	}
	@Test
	public void Logintest(){
		login.loginsystem();
		
		
	}
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
	

}
