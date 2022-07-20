package com.lib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;


public class LibGlobal {
	
	public static WebDriver driver;
	
	public String URL="https://www.facebook.com/";
	
	public void browserLauch() {
		
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
}
	
	public void sendKeys(WebElement e, String s1) {
		
		e.sendKeys(s1);
	}
	
	public void Click(WebElement e1) {
		e1.click();
	}
	
	public String getCurrentUrl() {
		
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	
	public String getTitle() {
		
		String title = driver.getTitle();
		return title;

	}
	
	
}