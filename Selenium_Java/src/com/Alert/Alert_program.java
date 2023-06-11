package com.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert_program {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node0mm9ggehhfuuz1ezyqy8z43n05231029.node0");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement show = driver.findElement(By.xpath("(//button[@role='button'])[2]"));
		show.click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("(//button[@role='button'])[6]")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Swe");
		String text = alert.getText();
		System.out.println(text);
		alert.accept();

	
	
	
	
	}

}
