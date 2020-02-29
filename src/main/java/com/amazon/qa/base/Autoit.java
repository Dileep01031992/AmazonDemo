package com.amazon.qa.base;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autoit {

	public static void main(String[] args) throws IOException, Throwable {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","H:\\Selenium 2019\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("‪H:\\Selenium 2019\\HTML\\uploadnew.html");
		driver.findElement(By.xpath("//input[@name='resumeupload']")).click();
		Runtime.getRuntime().exec("H:\\Selenium 2019\\AUTOITpractice\\fileuploadnew.exe");
		Thread.sleep(3000);
		//driver.quit();
		
		
		
		

	}

}
