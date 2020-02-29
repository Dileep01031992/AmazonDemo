package com.amazon.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TsetCasebase;

public class Login extends TsetCasebase{
	
	
	
	// page factory
	
		@FindBy(name="email")
		WebDriver username;
		
		@FindBy(id = "continue")
		WebDriver contnue;
		
		@FindBy(name = "password")
		WebDriver password;
		
		@FindBy(xpath="//input[@id='signInSubmit']")
		WebDriver signin;
		
		
		// creating the contructor OR initializing the page object
		public Login(){
		
			PageFactory.initElements(driver,this);
		}
		
		//Action 
		public String  Validateloginpagetitle(){
			return driver.getTitle();
		}
		
		public void loginsystem(){
		 driver.findElement(By.name("email")).sendKeys("8754450659");
		 driver.findElement(By.id("continue")).click();
		 
		 driver.findElement(By.name("password")).sendKeys("Welcome08@");
		 
		 
			
		}
		
		


}
