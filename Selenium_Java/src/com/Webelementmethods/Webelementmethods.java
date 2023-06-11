package com.Webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Webelementmethods {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//for browser launch
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	//	username inspect find element
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("dyfyufy");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("12345678");
		
		
		
	
	}

}
