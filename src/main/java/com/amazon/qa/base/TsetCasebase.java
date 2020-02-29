package com.amazon.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.amazon.qa.utility.Testutil;

public class TsetCasebase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TsetCasebase(){
		
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("H:\\Selenium 2019\\workspace\\Amazononlile\\src\\main"
					+ "\\java\\com\\amazon\\qa\\config\\config.properties");
			try {
				prop.load(ip);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void initialize(){
		
		String browsername =prop.getProperty("browser");
		if(browsername.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","H:\\Selenium 2019\\chromedriver_win32 (2)\\chromedriver.exe");

			driver = new ChromeDriver();
		}
		else if (browsername.equals("firefox"))
		{
			
			System.setProperty("webdriver.gecko.driver","H:/Selenium 2019/geckodriver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
		driver.get(prop.getProperty("url"));
		
	}
	
	
	
	
	

}
