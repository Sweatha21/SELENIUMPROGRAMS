package com.Webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Webdrivermethods {
	public static void main(String[] args) throws InterruptedException {
		// to go IO exception write these two line // memorise
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		// to launch browser = chromedriver // driver - ref name
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.instagram.com/"); // string so double quotes
		
		driver.manage().window().maximize();// for maximize output screen
	//	String title = driver.getTitle();
		System.out.println(driver.getTitle());// for getting title driver.title then string return type ctrl =2l
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		// for going insta to amazon use navigation methods i.e "to"
		driver.navigate().to("https://www.amazon.jobs/en-gb/search-jobcategory");
		// back to insta use navigate back
		driver.navigate().back();
		//forward to amazon use navigate forward
		driver.navigate().forward();
		// for delaying process time use thread sleep
		Thread.sleep(2000);
		// for refresh i.e last page use navigate.refresh
		driver.navigate().refresh();
	   
		
		//driver.close(); // automatic close driver.close
	}
	
	

}
