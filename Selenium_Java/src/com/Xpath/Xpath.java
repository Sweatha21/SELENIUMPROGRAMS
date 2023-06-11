package com.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
	//webelement after signifies what u found
		username.sendKeys("qwertyuiop@gmail.com");
		WebElement password = driver.findElement(By.xpath("(//input[@aria-label='Password'])"));
		password.sendKeys("1234567890");
		driver.findElement(By.xpath("(//button[@type])[1]")).click(); // for pass showing automatically
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type])[1]")).click();// for hide not to show same step by xpath by index only
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		// shortform instead returntype
		WebElement forgot = driver.findElement(By.linkText("Forgot password?"));
		forgot.click(); // used by linktext locator , by xpath half of text also can be done
		
	}

}
